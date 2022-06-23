package br.com.veterinaria.model.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import br.com.veterinaria.model.entidade.Veterinario;

class VeterinarioControllerTest {
	VeterinarioController controller = new VeterinarioController();

	@Test
	@Disabled
	void cadastro() {
		Veterinario v = new Veterinario();
		
		v.setNome("João");
		v.setCpf("45612379835");
		v.setEmail("mario@vetpetmania");
		v.setTelefone("(21) 2532-6465");
		v.setCidade("Rio de Janeiro");
		v.setBairro("Riachuelo");
		v.setLogradouro("Rocha");
		v.setNumero(50);
		v.setCep(20965030);
		
		assertEquals("sucesso",controller.incluir(v));
	}
	
	@Test
	@Disabled
	void listaA() {
		ArrayList<Veterinario> lista = new ArrayList<Veterinario>();
		lista = controller.listarAtendimento();
		
		for(Veterinario v : lista) {
			System.out.print("\n - Id: "+v.getIdVet()+" - Nome:"+v.getNome());
		}

	}
	@Test
	void listaB() {
		ArrayList<Veterinario> lista = new ArrayList<Veterinario>();
		lista = controller.listar("");
		
		for(Veterinario v : lista) {
			System.out.print("\n - Id: "+v.getIdVet()+" - Nome:"+v.getNome()+" - Telefone:"+v.getTelefone()+" - Email:"+v.getEmail());
		}
	}
}
