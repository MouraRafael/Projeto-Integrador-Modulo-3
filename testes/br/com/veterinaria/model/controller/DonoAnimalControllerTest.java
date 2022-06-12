package br.com.veterinaria.model.controller;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import br.com.veterinaria.model.entidade.DonoAnimal;

class DonoAnimalControllerTest {
	DonoAnimalController controller = new DonoAnimalController();

	@Test
	@Disabled
	@DisplayName("Controller Busca ID")
	void buscaId() {
		DonoAnimal d = new DonoAnimal();
		
		d = controller.buscaPorId(1);
		System.out.println(d.getCpf());
		System.out.println(d.getNome());
		System.out.println(d.getTelefone());
		System.out.println(d.getEmail());
		System.out.println(d.getIdEndereco());
		System.out.println(d.getCidade());
		System.out.println(d.getBairro());
		System.out.println(d.getLogradouro());
		System.out.println(d.getNumero());
		System.out.println(d.getCep());
	}
	/*------------------------------*/
	@Test
	@DisplayName("Controller Listagem")
	void testeListagem() {
		DonoAnimal d = new DonoAnimal();
		
		ArrayList<DonoAnimal> listaAnimal = new ArrayList<DonoAnimal>();
		listaAnimal = controller.listar("");
		
		for(DonoAnimal dono : listaAnimal) {
			System.out.println(dono.getBairro()+" - "+ dono.getNome());
		}
		
	}
	
	@Test
	@Disabled
	@DisplayName("Controller Cadastro")
	void testeCadastro() {
		DonoAnimal d = new DonoAnimal();

		d.setCidade("Saquarema");
		d.setBairro("Engenho Novo");
		d.setLogradouro("15");
		d.setNumero(123);
		d.setCep(20890090);
		d.setCpf(987654321);
		d.setNome("Joaquim");
		d.setEmail("joaquin@gmail");
		d.setTelefone("(22) 2256-6261");
		
		
		assertEquals("sucesso", controller.incluir(d));
	}
	
	
	@Test
	@DisplayName("Controller Alteração")
	void testeAltera() {
		DonoAnimal d = new DonoAnimal();

		d.setId_dono(13);
		d.setIdEndereco(20);
		d.setCidade("Saquarema");
		d.setBairro("Saquitá");
		d.setLogradouro("15");
		d.setNumero(123);
		d.setCep(20890090);
		d.setCpf(987654321);
		d.setNome("Joaquim");
		d.setEmail("joaquin@gmail.com");
		d.setTelefone("(22) 2256-6261");
		
		
		assertEquals("sucesso", controller.alterar(d));
	}
	
	@Test
	@Disabled
	@DisplayName("Controller exclusão")
	void testeDeleta() {
		DonoAnimal d = new DonoAnimal();
		
		d.setId_dono(13);
		d.setIdEndereco(20);
		
		assertEquals("sucesso",controller.excluir(d));
	}

}
