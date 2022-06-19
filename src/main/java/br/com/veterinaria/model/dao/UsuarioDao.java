package br.com.veterinaria.model.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import br.com.veterinaria.model.entidade.Usuario;

public class UsuarioDao extends Conexao {
	public Usuario buscarUsuario(String login, String senha) {
		Usuario u = null;
		
		String sql = "SELECT idcargo,nome FROM usuario WHERE login = ? and senha = ?";
		
		try {
			
			PreparedStatement ps = getConexao().prepareStatement(sql);
			ps.setString(1, login);
			ps.setString(2, senha);
			
			ResultSet rs = ps.executeQuery();
			
			if(rs.next()) {
				u= new Usuario();
				u.setIdCargo(rs.getLong(1));
				u.setNome(rs.getString(2));
			}
			
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			fecharConexao();
		}
		
		
		return u;
	}
}
