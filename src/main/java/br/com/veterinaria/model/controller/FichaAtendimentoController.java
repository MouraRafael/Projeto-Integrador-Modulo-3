package br.com.veterinaria.model.controller;

import java.util.ArrayList;

import br.com.veterinaria.model.dao.FichaAtendimentoDao;
import br.com.veterinaria.model.entidade.FichaAtendimento;

public class FichaAtendimentoController {
	public String incluir(FichaAtendimento f) {
		FichaAtendimentoDao dao = new FichaAtendimentoDao();
		
		return dao.incluir(f);
	}
	
	public ArrayList<FichaAtendimento> listar (String nomeBusca){
		FichaAtendimentoDao dao = new FichaAtendimentoDao();
		
		return dao.listar(nomeBusca);
		
	}
	
	public FichaAtendimento buscaPorId(long num) {
		FichaAtendimentoDao dao = new FichaAtendimentoDao();
		
		return dao.buscaPorId(num);
	}
	
	public String alterar(FichaAtendimento f) {
		FichaAtendimentoDao dao = new FichaAtendimentoDao();
		
		return dao.alterar(f);
	}
	
	
	
	
}
