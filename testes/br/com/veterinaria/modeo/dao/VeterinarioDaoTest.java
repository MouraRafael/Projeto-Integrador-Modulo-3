package br.com.veterinaria.modeo.dao;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import br.com.veterinaria.model.dao.VeterinarioDao;
import br.com.veterinaria.model.entidade.Veterinario;

class VeterinarioDaoTest {
	VeterinarioDao dao = new VeterinarioDao();

	@Test
	@Disabled
	void cadastro() {
		Veterinario v = new Veterinario();
		
		v.setNome("Mariano Santos");
		v.setCpf("45615678935");
		v.setEmail("mario@vetpetmania");
		v.setTelefone("(21) 2532-6465");
		v.setCidade("Rio de Janeiro");
		v.setBairro("Riachuelo");
		v.setLogradouro("Rocha");
		v.setNumero(50);
		v.setCep(20965030);
		
		assertEquals("sucesso",dao.incluir(v));
	}
	
	@Test
	@Disabled
	void listaA() {
		ArrayList<Veterinario> lista = new ArrayList<Veterinario>();
		lista = dao.listarParaAtendimento();
		
		for(Veterinario v : lista) {
			System.out.print("\n - Id: "+v.getIdVet()+" - Nome:"+v.getNome());
		}
	}
	
	
	@Test
	void listaB() {
		ArrayList<Veterinario> lista = new ArrayList<Veterinario>();
		lista = dao.listar("2");
		
		for(Veterinario v : lista) {
			System.out.print("\n - Id: "+v.getIdVet()+" - Nome:"+v.getNome()+" - Telefone:"+v.getTelefone()+" - Email:"+v.getEmail());
		}
	}

}
