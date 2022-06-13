package br.com.veterinaria.modeo.dao;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import br.com.veterinaria.model.dao.FichaAtendimentoDao;
import br.com.veterinaria.model.entidade.Animal;
import br.com.veterinaria.model.entidade.FichaAtendimento;
import br.com.veterinaria.model.entidade.Veterinario;

class FichaAtendimentoTeste {

	@Test
	@Disabled
	void cadastro() {
		FichaAtendimentoDao dao = new FichaAtendimentoDao(); 
		FichaAtendimento f = new FichaAtendimento();
		Veterinario v = new Veterinario();
		Animal a = new Animal();
		
		a.setId_animal(2);
		v.setIdVet(1);
		f.setMotivoVisita("Mancando");
		
		f.setVeterinario(v);
		f.setAnimal(a);
		
		assertEquals("sucesso",dao.incluir(f));
		
	}
	
	
	@Test
	void listagem() {
		FichaAtendimentoDao dao = new FichaAtendimentoDao(); 
		
		ArrayList<FichaAtendimento> lista = new ArrayList<FichaAtendimento>();
		
		lista = dao.listar("");
		System.out.println("\n");
		for(FichaAtendimento f : lista) {
			System.out.println(
			f.getIdFicha() + " - "+
			f.getData() + " - "+
			f.getAnimal().getRaca().getNomeEspecie()+" - "+
			f.getAnimal().getNome()+" - "+
			f.getVeterinario().getNome()+" - "+
			f.getDono().getNome()+" - "+
			f.getMotivoVisita()
					);
		}
	}

}