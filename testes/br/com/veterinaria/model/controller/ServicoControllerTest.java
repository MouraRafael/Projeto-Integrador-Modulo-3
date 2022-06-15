package br.com.veterinaria.model.controller;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import br.com.veterinaria.model.entidade.Servico;

class ServicoControllerTest {
	ServicoController controller = new ServicoController();
	@Test
	//@Disabled
	void listarservico() {
		
		ArrayList<Servico> lista = new ArrayList<Servico>();
		
		
		lista = controller.listarServicos();
		System.out.println("\n;");
		for(Servico s : lista) {
			System.out.println(s.getIdServico()+" - "+s.getServico());
		}
		
		assertTrue(lista.size()>0);
	}
	
	@Test
	void listarservicoPrestado() {
		
		ArrayList<Servico> listao = new ArrayList<Servico>();
		
		
		listao = controller.listarServicosPrestados(1);
		System.out.println("\n");
		
		for(Servico s : listao) {
			System.out.println(s.getIdFicha()+" - "+s.getIdServico()+" - "+s.getServico());
		}
		
		assertTrue(listao.size()>0);
	}
	
	@Test
	//@Disabled
	void excluirServico() {
		Servico s = new Servico();
		
		s.setIdFicha(1);
		s.setIdServico(3);
		
		
		assertEquals("sucesso",controller.excluir(s));
	}

}
