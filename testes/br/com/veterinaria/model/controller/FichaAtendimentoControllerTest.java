package br.com.veterinaria.model.controller;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;


import br.com.veterinaria.model.entidade.Animal;
import br.com.veterinaria.model.entidade.FichaAtendimento;
import br.com.veterinaria.model.entidade.Veterinario;

class FichaAtendimentoControllerTest {

@Test
	
	void cadastro() {
		FichaAtendimentoController controller = new FichaAtendimentoController(); 
		
		FichaAtendimento f = new FichaAtendimento();
		Veterinario v = new Veterinario();
		Animal a = new Animal();
		
		a.setId_animal(2);
		v.setIdVet(1);
		f.setMotivoVisita("Mancando");
		
		f.setVeterinario(v);
		f.setAnimal(a);
		
		assertEquals("sucesso",controller.incluir(f));
		
	}
	
	
	@Test
	void listagem() {
		FichaAtendimentoController controller = new FichaAtendimentoController(); 
		
		ArrayList<FichaAtendimento> lista = new ArrayList<FichaAtendimento>();
		
		lista = controller.listar("");
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
	
	@Test
	void buscaId() {
		FichaAtendimento f = new FichaAtendimento();
		FichaAtendimentoController controller = new FichaAtendimentoController();
		
		
		f = controller.buscaPorId(2);
		System.out.println("\n");
		System.out.print(" - Ficha: "+f.getIdFicha()+"\n - Data Visita: "+
		f.getData()+"\n - Motivo: "+
		f.getMotivoVisita()+"\n - Diagnostico: "+
		f.getDiagnostico()+"\n - Tratamento: "+
		f.getTratamento()+"\n - Prescricao: "+
		f.getPrescricao()+"\n - Observacoes: "+
		f.getObservacoes()+"\n - Veterinario:"+
		f.getVeterinario().getNome()+"\n - Animal: "+
		f.getAnimal().getNome());
		System.out.println("\n");
	}
	
	@Test
	void atualiza() {
		FichaAtendimento f = new FichaAtendimento();
		FichaAtendimentoController controller = new FichaAtendimentoController();
		
		f.setDiagnostico("Pata Quebrada -");
		f.setTratamento("Tipoia -");
		f.setPrescricao("Dipirona -");
		f.setObservacoes("Manter Repouso -");
		f.setIdFicha(2);
		
		controller.alterar(f);
	}

}
