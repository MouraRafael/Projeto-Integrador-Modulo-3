package br.com.veterinaria.model.controller;

import java.util.ArrayList;

import br.com.veterinaria.model.dao.DonoAnimalDao;
import br.com.veterinaria.model.entidade.DonoAnimal;


public class DonoAnimalController {
	public ArrayList<DonoAnimal> listar(String nomeBusca){
		DonoAnimalDao dao = new DonoAnimalDao();
		
		return dao.listar(nomeBusca);
	}
	
	public DonoAnimal buscaPorId(long num) {
		DonoAnimalDao dao = new DonoAnimalDao();
		
		return dao.buscaPorId(num);
		
	}
	
	public String incluir(DonoAnimal dono) {
		DonoAnimalDao dao = new DonoAnimalDao();
		return dao.incluir(dono);
	}
	
	public String alterar(DonoAnimal d) {
		DonoAnimalDao dao = new DonoAnimalDao();
		return dao.alterar(d);
	}
	
	public String excluir(DonoAnimal d) {
		DonoAnimalDao dao = new DonoAnimalDao();
		
		return dao.excluir(d);
	}
}
