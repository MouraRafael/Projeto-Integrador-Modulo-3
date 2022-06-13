package br.com.veterinaria.modeo.dao;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import br.com.veterinaria.model.dao.RacaDao;
import br.com.veterinaria.model.entidade.Raca;

class RacaDaoTest {

	@Test
	void test() {
		
		RacaDao dao = new RacaDao();
		ArrayList<Raca> lista = new ArrayList<Raca>();
		
		lista = dao.listar(2);
		
		for(Raca r : lista) {
			System.out.println(r.getIdRaca()+" - "+r.getNomeRaca());
		}
		
		
	}

}
