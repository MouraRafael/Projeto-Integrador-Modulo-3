package br.com.veterinaria.model.dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.veterinaria.model.entidade.FichaAtendimento;

public class FichaAtendimentoDao extends Conexao {
	
	public String incluir(FichaAtendimento f) {
		String mensagem = "";
		
		String sql = "INSERT INTO ficha_medica(id_animal,vet_id,motivo_visita) VALUES(?,?,?)";

		try {
			PreparedStatement ps = getConexao().prepareStatement(sql);

			ps.setLong(1, f.getAnimal().getId_animal());
			ps.setLong(2, f.getVeterinario().getIdVet());
			ps.setString(3, f.getMotivoVisita());

			int cadastro = ps.executeUpdate();

			if(cadastro>0){
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
}
