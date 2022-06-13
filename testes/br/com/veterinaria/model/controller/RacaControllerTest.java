package br.com.veterinaria.model.controller;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import br.com.veterinaria.model.dao.RacaDao;
import br.com.veterinaria.model.entidade.Raca;

class RacaControllerTest {

	@Test
	void test() {
		
		RacaController controller = new RacaController();
		ArrayList<Raca> lista = new ArrayList<Raca>();
		
		lista = controller.listar(2);
		
		for(Raca r : lista) {
			System.out.println(r.getIdRaca()+" - "+r.getNomeRaca());
		}
		
		
	}

}
