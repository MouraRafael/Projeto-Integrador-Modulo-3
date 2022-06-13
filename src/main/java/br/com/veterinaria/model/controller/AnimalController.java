package br.com.veterinaria.model.controller;

import java.util.ArrayList;

import br.com.veterinaria.model.dao.AnimalDao;
import br.com.veterinaria.model.entidade.Animal;
import br.com.veterinaria.model.entidade.DonoAnimal;

public class AnimalController {
	public String incluir(Animal a) {
		AnimalDao dao = new AnimalDao();
		
		return dao.incluir(a);
	}
	
	public ArrayList<Animal> listar(String busca){
		AnimalDao dao = new AnimalDao();
		
		return dao.listar(busca);
	}
	
	public Animal buscaPorId(long num){
		AnimalDao dao = new AnimalDao();
		
		return dao.buscaPorId(num);
	}
	
	public String alterar(Animal a) {
		AnimalDao dao = new AnimalDao();
		
		return dao.alterar(a);
	}
	
	public String excluir(long i){
		AnimalDao dao = new AnimalDao();
		
		return dao.excluir(i);
	}
}
