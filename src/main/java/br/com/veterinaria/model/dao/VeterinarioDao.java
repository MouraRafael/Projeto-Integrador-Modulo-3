package br.com.veterinaria.model.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import br.com.veterinaria.model.entidade.Veterinario;


public class VeterinarioDao extends Conexao{
	
	public String incluir(Veterinario v) {
		String mensagem = "";
		String sql = "INSERT INTO endereco(cidade,bairro,logradouro, numero, CEP) VALUES(?,?,?,?,?)";
		
		try {

			PreparedStatement ps = getConexao().prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

			ps.setString(1, v.getCidade());
			ps.setString(2, v.getBairro());
			ps.setString(3, v.getLogradouro());
			ps.setLong(4, v.getNumero());
			ps.setLong(5, v.getCep());

			ps.executeUpdate();

			ResultSet rs = ps.getGeneratedKeys();

			rs.next();
			int pkEndereco = rs.getInt(1);

			sql = "INSERT INTO veterinario(nome_vet, "
					+ "cpf, "
					+ "CRMV, "
					+ "email, "
					+ "telefone, "
					+ "endereco) VALUES(?,?,?,?,?,?)";

			ps = getConexao().prepareStatement(sql);

			ps.setString(1, v.getNome());
			ps.setString(2, v.getCpf());
			ps.setLong(3, v.getCrmv());
			ps.setString(4, v.getEmail());
			ps.setString(5, v.getTelefone());
			ps.setLong(6, pkEndereco);

			int incluido = ps.executeUpdate();

			if(incluido>0){
				mensagem = "sucesso";
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
			mensagem = "falha";
		}finally{
			fecharConexao();
		}
		
		
		
		return mensagem;
	}
	
	
	public ArrayList<Veterinario> listarParaAtendimento(){
		ArrayList<Veterinario> lista = new ArrayList<Veterinario>();
		Veterinario vet = null;
			String stmt = "SELECT id_vet, nome_vet FROM veterinario ORDER BY nome_vet";

			try {
				PreparedStatement ps = getConexao().prepareStatement(stmt);

				ResultSet rs = ps.executeQuery();

				while(rs.next()){
					vet = new Veterinario();
					
					vet.setIdVet(rs.getLong("id_vet"));
					vet.setNome(rs.getString(2));

					lista.add(vet);
				}
				
			} catch (SQLException e) {
				e.printStackTrace();
			}finally{
				fecharConexao();
			}
			
			
		return lista;
	}
	
	public ArrayList<Veterinario> listar(String nomeBusca){
		ArrayList<Veterinario> lista = new ArrayList<Veterinario>();
		
		String sql = "SELECT "
				+ "id_vet,"
				+ " nome_vet, "
				+ "telefone, "
				+ "email "
				+ "FROM veterinario "
				+ "WHERE nome_vet LIKE ? "
				+ "OR id_vet = ? "
				+ "ORDER BY nome_vet";
		
		
		try {
			PreparedStatement ps = getConexao().prepareStatement(sql);
			ps.setString(1, "%"+nomeBusca+"%");
			ps.setString(2, nomeBusca);
			
			ResultSet rs = ps.executeQuery();
			
			Veterinario v = null;
			
			while(rs.next()){
				v = new Veterinario();
				
				v.setIdVet(rs.getLong(1));
				v.setNome(rs.getString(2));
				v.setTelefone(rs.getString(3));
				v.setEmail(rs.getString(4));
				
				lista.add(v);
			}
			
		}catch (SQLException e) {
			e.printStackTrace();
		}finally{
			fecharConexao();
		}
		
		
		
		return lista;
	}
	
	
}
