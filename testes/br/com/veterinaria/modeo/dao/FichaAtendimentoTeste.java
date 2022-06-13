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
	
	@Test
	void buscaId() {
		FichaAtendimento f = new FichaAtendimento();
		FichaAtendimentoDao dao = new FichaAtendimentoDao();
		
		
		f = dao.buscaPorId(2);
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
		FichaAtendimentoDao dao = new FichaAtendimentoDao();
		
		f.setDiagnostico("Pata Quebrada -");
		f.setTratamento("Tipoia -");
		f.setPrescricao("Dipirona -");
		f.setObservacoes("Manter Repouso -");
		f.setIdFicha(2);
		
		dao.alterar(f);
	}
	
	

}
