package br.com.veterinaria.model.controller;

import java.util.ArrayList;

import br.com.veterinaria.model.dao.ServicoDao;
import br.com.veterinaria.model.entidade.Servico;

public class ServicoController {
	public ArrayList<Servico> listarServicos(){
		 ServicoDao dao = new ServicoDao();
		 
		 return dao.listarServicos();
	}
	
	public ArrayList<Servico> listarServicosPrestados(long num){
		ServicoDao dao = new ServicoDao();
		
		return dao.listarServicosPrestados(num);
	}
	
	public String excluir (Servico s){
		ServicoDao dao = new ServicoDao();
		
		return dao.excluir(s);
	}
}
