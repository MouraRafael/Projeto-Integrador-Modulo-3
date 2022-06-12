package br.com.veterinaria.model.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import br.com.veterinaria.model.entidade.DonoAnimal;



public class DonoAnimalDao extends Conexao {
	
	//Metodo de listagem
	public ArrayList<DonoAnimal> listar(String nomeBusca){
		ArrayList<DonoAnimal> lista = new ArrayList<DonoAnimal>();
		
		String sql = "SELECT * "
				+ "FROM dados_cliente_id "
				+ "WHERE Nome LIKE ? "
				+ "ORDER BY id_dono";
		
		try {
			PreparedStatement ps = getConexao().prepareStatement(sql);
			ps.setString(1, "%"+nomeBusca+"%");
			
			ResultSet rs = ps.executeQuery();
			
			DonoAnimal d = null;
			
			while(rs.next()) {
				d = new DonoAnimal();
				d.setId_dono(rs.getLong("id_dono"));
				d.setCpf(rs.getLong("cpf"));
				d.setNome(rs.getString("Nome"));
				d.setTelefone(rs.getString("telefone"));
				d.setEmail(rs.getString("email"));
				d.setIdEndereco(rs.getLong("id_end"));
				d.setCidade(rs.getString("cidade"));
				d.setBairro(rs.getString("bairro"));
				d.setLogradouro(rs.getString("logradouro"));
				d.setNumero(rs.getLong("numero"));
				d.setCep(rs.getLong("CEP"));
				
				System.out.println(d.getBairro());
				lista.add(d);
			}
			
			
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			fecharConexao();
		}
		
		
		
		
		
		return lista;
	}
	
	
	
	
	
	
	
	//Metodo de cadastro
	public String incluir(DonoAnimal dono) {
		String mensagem ="";
		
		String sql = "INSERT INTO endereco(cidade,bairro,logradouro, numero, CEP) VALUES(?,?,?,?,?)";
		try {
			PreparedStatement ps = getConexao().prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
			
			ps.setString(1, dono.getCidade());
			ps.setString(2, dono.getBairro());
			ps.setString(3, dono.getLogradouro());
			ps.setLong(4, dono.getNumero());
			ps.setLong(5, dono.getCep());
			
			ps.executeUpdate();
			
				
			//Fim primeira inserção
			
			//recuperando last_inser_id()
			ResultSet rs = ps.getGeneratedKeys();
			rs.next();
			int idEndereco = rs.getInt(1);
			
			
			
			//Segunda Inserção
			sql = "INSERT INTO dono(cpf, Nome, email, endereco, telefone) VALUES(?,?,?,?,?)";
			
			ps = getConexao().prepareStatement(sql);
			ps.setLong(1, dono.getCpf());
			ps.setString(2, dono.getNome());
			ps.setString(3, dono.getEmail());
			ps.setInt(4, idEndereco);
			ps.setString(5, dono.getTelefone());
			
			if(ps.executeUpdate()>0) {
				
			}
			
			
			
			
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			fecharConexao();
		}
		
		
		
		
		return mensagem;
	}
}
