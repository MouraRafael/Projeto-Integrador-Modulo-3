package br.com.veterinaria.model.controller;

import java.util.ArrayList;

import br.com.veterinaria.model.dao.RacaDao;
import br.com.veterinaria.model.entidade.Raca;

public class RacaController {
	public ArrayList<Raca> listar(long num){
		RacaDao dao = new RacaDao();
		
		return dao.listar(num);
	}
}
