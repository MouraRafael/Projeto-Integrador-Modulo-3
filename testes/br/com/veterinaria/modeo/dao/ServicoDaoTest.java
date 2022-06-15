package br.com.veterinaria.modeo.dao;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import br.com.veterinaria.model.dao.ServicoDao;
import br.com.veterinaria.model.entidade.Servico;

class ServicoDaoTest {
	ServicoDao dao = new ServicoDao();

	@Test
	//@Disabled
	void listarservico() {
		
		ArrayList<Servico> lista = new ArrayList<Servico>();
		
		
		lista = dao.listarServicos();
		System.out.println("\n;");
		for(Servico s : lista) {
			System.out.println(s.getIdServico()+" - "+s.getServico());
		}
		
		assertTrue(lista.size()>0);
	}
	
	@Test
	void listarservicoPrestado() {
		
		ArrayList<Servico> listao = new ArrayList<Servico>();
		
		
		listao = dao.listarServicosPrestados(2);
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
		
		s.setIdFicha(2);
		s.setIdServico(3);
		
		
		assertEquals("sucesso",dao.excluir(s));
	}

}
