package br.com.veterinaria.model.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import br.com.veterinaria.model.entidade.Raca;

public class RacaDao extends Conexao {
	public ArrayList<Raca> listar(long num){
		ArrayList<Raca> lista = new ArrayList<Raca>();
		String sql = "SELECT id_raca, nome_raca  FROM raca WHERE id_especie = ?";

		try {

			PreparedStatement ps = getConexao().prepareStatement(sql);

			ps.setLong(1, num);
			ResultSet rs = ps.executeQuery();

			Raca r = null;

			while(rs.next()){
				r = new Raca();

				r.setIdRaca(rs.getLong(1));
				r.setNomeRaca(rs.getString(2));

				lista.add(r);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return lista;
	}
}
