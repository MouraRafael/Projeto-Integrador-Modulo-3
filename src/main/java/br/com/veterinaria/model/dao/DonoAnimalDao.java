package br.com.veterinaria.model.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import br.com.veterinaria.model.entidade.DonoAnimal;

public class DonoAnimalDao extends Conexao {
	
	
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
	
	
	
	public String incluir(DonoAnimal dono) {
		String mensagem ="";
		
		String sql = "Insert into ";
		
		
		
		return null;
	}
}
