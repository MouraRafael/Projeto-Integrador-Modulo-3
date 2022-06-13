package br.com.veterinaria.model.dao;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import br.com.veterinaria.model.entidade.Animal;
import br.com.veterinaria.model.entidade.DonoAnimal;
import br.com.veterinaria.model.entidade.Raca;

public class AnimalDao extends Conexao {
	
	//Cadastro
	public String incluir(Animal a){
		String mensagem = "";
		
		String sql = "INSERT INTO animal(id_dono, nome, sexo, data_nasc, raca, observacoes) VALUES(?,?,?,?,?,?)";

		try {
			PreparedStatement ps = getConexao().prepareStatement(sql);
			ps.setLong(1, a.getId_dono());
			ps.setString(2, a.getNome());
			ps.setString(3, String.valueOf(a.getSexo()));
			ps.setString(4, a.getNascimento());
			ps.setLong(5, a.getRaca().getIdRaca());
			ps.setString(6, a.getObservacoes());


			int foiOuNao = ps.executeUpdate();

			if(foiOuNao>0){
				mensagem = "sucesso";
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
			mensagem = "falhou";
		}



		return mensagem;

	}
	
	
	
	

	//Listagem
	public ArrayList<Animal> listar(String busca){
		ArrayList<Animal> lista = new ArrayList<Animal>();

		String sql = "SELECT * FROM tudo_animal "
				+ "WHERE Nome LIKE ? "
				+ "OR Dono LIKE ? "
				+ "OR id  = ? "
				+ "ORDER BY id";

		try {
			PreparedStatement ps = getConexao().prepareStatement(sql);
			ps.setString(1, "%"+busca+"%");
			ps.setString(2, "%"+busca+"%");
			ps.setString(3, busca);

			ResultSet rs = ps.executeQuery();

			Animal a = null;
			DonoAnimal d = null;
			Raca r = null;
			while(rs.next()){
				a = new Animal();
				r = new Raca();
				d = new DonoAnimal();
						
				a.setId_animal(rs.getLong("id"));
				a.setId_dono(rs.getLong("id_dono"));
				a.setNome(rs.getString("Nome"));
				a.setSexo(rs.getString("Sexo"));
				a.setNascimento(rs.getString("Data_Nascimento"));
				a.setObservacoes(rs.getString("observacoes"));

				r.setIdRaca(rs.getLong("id_raca"));
				r.setNomeRaca(rs.getString("Raca"));
				r.setNomeEspecie(rs.getString("especie"));
				r.setIdEspecie(rs.getLong("id_especie"));
				a.setRaca(r);

				d.setNome(rs.getString("Dono"));
				d.setId_dono(rs.getLong("id_dono"));
				a.setDono(d);

				lista.add(a);

			}


			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			fecharConexao();
		}

		return lista;
	}
	
	
	
	
}