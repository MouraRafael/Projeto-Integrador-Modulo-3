package br.com.veterinaria.modeo.dao;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import br.com.veterinaria.model.dao.DonoAnimalDao;
import br.com.veterinaria.model.entidade.DonoAnimal;

class DonoAnimalDaoTest {

	@Test
	//@Disabled
	void testListagem() {
		DonoAnimal d = new DonoAnimal();
		DonoAnimalDao dao = new DonoAnimalDao();
		
		dao.listar("");
		
	}
	
	@Test
	@DisplayName("Teste de Cadastro")
	//@Disabled
	void testeCadastro() {
		DonoAnimal d = new DonoAnimal();
		DonoAnimalDao dao = new DonoAnimalDao();
		
		d.setCidade("Rio de Janeiro");
		d.setBairro("Engenho Novo");
		d.setLogradouro("Rua 2");
		d.setNumero(15);
		d.setCep(209875);
		d.setCpf("12345678810");
		d.setNome("Paulo");
		d.setEmail("ass@gmail");
		d.setTelefone("123456");
		
		dao.incluir(d);
		
	}
	
	
	

	@Test
	@DisplayName("Teste de alteracao")
	void testeAltera(){
		DonoAnimal d = new DonoAnimal();
		DonoAnimalDao dao = new DonoAnimalDao();
		
		d.setId_dono(1);
		d.setIdEndereco(1);
		d.setCidade("Rio de Janeiro");
		d.setBairro("Engenho Novo");
		d.setLogradouro("Rua Maria Penha");
		d.setNumero(15);
		d.setCep(209875090);
		d.setCpf("12314567880");
		d.setNome("Paulo");
		d.setEmail("viola@gmail");
		d.setTelefone("(21) 2594-5561");
		
		
		
		
		assertEquals("falha",dao.alterar(d));
	}
	
	
	@Test
	@DisplayName("Busca por id")
	void testeBuscaId() {
		DonoAnimal d = new DonoAnimal();
		DonoAnimalDao dao = new DonoAnimalDao();
		
		d = dao.buscaPorId(1);
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
	
	@Test
	@DisplayName("exclusao")
	void testeDeleta() {
		DonoAnimal d = new DonoAnimal();
		DonoAnimalDao dao = new DonoAnimalDao();
		
		d.setId_dono(4);
		d.setIdEndereco(3);
		
		assertEquals("sucesso",dao.excluir(d));
	}
	
	
	
	

}
