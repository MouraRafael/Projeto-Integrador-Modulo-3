package br.com.veterinaria.model.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import br.com.veterinaria.model.entidade.Servico;

public class ServicoDao extends Conexao {
	/**
	 * @return
	 */
	public ArrayList<Servico> listarServicos(){
		ArrayList<Servico> lista = new ArrayList<Servico>();
		Servico s = null;
		
		String sql = "SELECT*FROM servico;";

		try {
			PreparedStatement ps = getConexao().prepareStatement(sql);

			ResultSet rs = ps.executeQuery();

			while(rs.next()){
				s = new Servico();

				s.setIdServico(rs.getLong(1));
				s.setServico(rs.getString(2));

				lista.add(s);

			}



		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			fecharConexao();
		}
		
		
		
		return lista;
	}

	public ArrayList<Servico> listarServicosPrestados(long num){
		ArrayList<Servico> lista = new ArrayList<Servico>();
		Servico s = null;
		String sql = "SELECT id_ficha_medica, id_servico, nome_servico FROM liga_fichamedica WHERE id_ficha_medica = ?;";

		
		
		try {
			PreparedStatement ps = getConexao().prepareStatement(sql);
			ps.setLong(1, num);
			
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()){
				s = new Servico();
				
				s.setIdFicha(rs.getLong("id_ficha_medica"));
				s.setIdServico(rs.getLong("id_servico"));
				s.setServico(rs.getString("nome_servico"));

				lista.add(s);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			fecharConexao();
		}

		return lista;
	}


	public String excluir (Servico s){
		String mensagem = "";
		String sql = "DELETE FROM fichaM_Servicos WHERE id_ficha_medica = ? AND id_servico = ?";

		try {
			PreparedStatement ps = getConexao().prepareStatement(sql);
			ps.setLong(1, s.getIdFicha());
			ps.setLong(2, s.getIdServico());

			int deleta = ps.executeUpdate();
			
			if(deleta>0) {
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
