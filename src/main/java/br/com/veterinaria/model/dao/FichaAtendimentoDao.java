package br.com.veterinaria.model.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import br.com.veterinaria.model.entidade.Animal;
import br.com.veterinaria.model.entidade.DonoAnimal;
import br.com.veterinaria.model.entidade.FichaAtendimento;
import br.com.veterinaria.model.entidade.Raca;
import br.com.veterinaria.model.entidade.Veterinario;

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


	public ArrayList<FichaAtendimento> listar (String nomeBusca){
		ArrayList<FichaAtendimento> lista = new ArrayList<FichaAtendimento>();
		
		String sql = "SELECT DISTINCT "
				+ "id_ficha, "
				+ "data_visita, "
				+ "especie, "
				+ "nome_animal, "
				+ "Veterinario, "
				+ "nome_dono, "
				+ "motivo_visita "
				+ "FROM tudo_ficha  "
				+ "WHERE nome_animal LIKE ?  "
				+ "OR nome_dono LIKE ? "
				+ "OR id_ficha = ?";

		try {
			PreparedStatement ps = getConexao().prepareStatement(sql);
			ps.setString(1, "%"+nomeBusca+"%");
			ps.setString(2, "%"+nomeBusca+"%");
			ps.setString(3, nomeBusca);

			ResultSet rs = ps.executeQuery();

			FichaAtendimento f = null;
			Veterinario v = null;
			Animal a = null;
			Raca r = null;
			DonoAnimal d = null;

			while(rs.next()){
				r = new Raca();
				a = new Animal();
				d = new DonoAnimal();
				v = new Veterinario();
				f = new FichaAtendimento();
				
				f.setIdFicha(rs.getLong("id_ficha"));
				f.setData(rs.getDate("data_visita"));
				
				r.setNomeEspecie(rs.getString("especie"));
				a.setNome(rs.getString("nome_animal"));
				a.setRaca(r);
				f.setAnimal(a);
				
				v.setNome(rs.getString("Veterinario"));
				f.setVeterinario(v);

				d.setNome(rs.getString("nome_dono"));
				f.setDono(d);
				
				f.setMotivoVisita(rs.getString("motivo_visita"));
				

				lista.add(f);

				

			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			fecharConexao();
		}

		return lista;
	}


	public FichaAtendimento buscaPorId(long num){
		FichaAtendimento f = null;
		Veterinario v = null;
		Animal a = null;

		String sql = "SELECT distinct "
				+ "id_ficha, "
				+ "data_visita, "
				+ "motivo_visita,  "
				+ "diagnostico, "
				+ "tratamento, "
				+ "prescricao, "
				+ "observacoes_ficha, "
				+ "Veterinario, "
				+ "nome_animal "
				+ "FROM tudo_ficha "
				+ "WHERE id_ficha = ?;";

		try {
			PreparedStatement ps = getConexao().prepareStatement(sql);
			ps.setLong(1, num);

			ResultSet rs = ps.executeQuery();
			
			if(rs.next()){
				f = new FichaAtendimento();
				v = new Veterinario();
				a = new Animal();

				f.setIdFicha(rs.getLong(1));
				f.setData(rs.getDate(2));
				f.setMotivoVisita(rs.getString(3));
				f.setDiagnostico(rs.getString(4));
				f.setTratamento(rs.getString(5));
				f.setPrescricao(rs.getString(6));
				f.setObservacoes(rs.getString(7));
				v.setNome(rs.getString(8));
				f.setVeterinario(v);

				a.setNome(rs.getString(9));
				f.setAnimal(a);
			}


		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			fecharConexao();
		}
		return f;
	}


	public String alterar(FichaAtendimento f){
		String mensagem = "";
		
		String stmt = "UPDATE ficha_medica SET "
				+ "diagnostico = ?, "
				+ "tratamento = ?, "
				+ "prescricao = ?, "
				+ "observacoes = ? "
				+ "WHERE id_ficha = ?";

		try {
			PreparedStatement ps = getConexao().prepareStatement(stmt);
			ps.setString(1, f.getDiagnostico());
			ps.setString(2, f.getTratamento());
			ps.setString(3, f.getPrescricao());
			ps.setString(4, f.getObservacoes());
			ps.setLong(5, f.getIdFicha());

			int atualiza = ps.executeUpdate();

			if(atualiza>0){
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
