package br.com.veterinaria.modeo.dao;

import static org.junit.Assert.assertEquals;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import br.com.veterinaria.model.dao.AnimalDao;
import br.com.veterinaria.model.entidade.Animal;
import br.com.veterinaria.model.entidade.DonoAnimal;
import br.com.veterinaria.model.entidade.Raca;

class AnimalDaoTest {
	
	@Test
	@Disabled
	@DisplayName("Teste Cadastro")
	void testeincluir() {
		Animal a = new Animal();
		AnimalDao dao = new AnimalDao();
		Raca r = new Raca();
		DonoAnimal d = new DonoAnimal();
		
				
		a.setId_dono(1);
		a.setNome("Pochi");
		a.setSexo("F");

				
		a.setObservacoes("nada a declarar");
		
		r.setIdRaca(30);
		a.setNascimento("2022-10-10");
		a.setRaca(r);
		
		
		dao.incluir(a);
		
	}

	@Test
	//@Disabled
	@DisplayName("Teste lista")
	void test() {
		Animal a = new Animal();
		AnimalDao dao = new AnimalDao();
		ArrayList<Animal> lista = new ArrayList<Animal>();
		
		lista = dao.listar("");
		
		for(Animal animal : lista) {
			System.out.println(
			animal.getId_animal()+" - "+
			animal.getNome()+" - "+
			animal.getSexo()+" - "+
			animal.getNascimento()+" - "+
			animal.getObservacoes()+" - "+
			animal.getRaca().getIdRaca()+" - "+
			animal.getRaca().getNomeRaca()+ " - "+
			animal.getRaca().getNomeEspecie()+" - "+
			animal.getRaca().getIdEspecie()+" - "+
			animal.getDono().getNome()+" - "+
			animal.getId_dono()+" - "+
			animal.getDono().getId_dono()
			);
		}
		
		
	}
	
	@Test
	@DisplayName("Busca por id")
	void testeBuscaId() {
		Animal a = new Animal();
		AnimalDao dao = new AnimalDao();
		
		a = dao.buscaPorId((long) 3);
		System.out.println(a.getId_animal());
		System.out.println(a.getId_dono());
		System.out.println(a.getNome());
		System.out.println(a.getSexo());
		System.out.println(a.getNascimento());
		System.out.println(a.getRaca().getIdRaca());
		System.out.println(a.getObservacoes());
		
		
	}
	
	@Test
	@Disabled
	@DisplayName("atualiza")
	void testeAtualiza() {
		
		Animal a = new Animal();
		AnimalDao dao = new AnimalDao();
		Raca r = new Raca();
		DonoAnimal d = new DonoAnimal();
		
		a.setId_animal(3);
		a.setId_dono(1);
		a.setNome("Pochiena");
		a.setSexo("M");

				
		a.setObservacoes("nada a declarar.");
		
		r.setIdRaca(31);
		a.setNascimento("2022-10-15");
		a.setRaca(r);
		
		assertEquals("sucesso",dao.alterar(a));
	}
	
	@Test
	@DisplayName("Teste Deleta")
	void testeDeleta(){
		AnimalDao dao = new AnimalDao();
		assertEquals("sucesso",dao.excluir(4));
	}
	
	

}
