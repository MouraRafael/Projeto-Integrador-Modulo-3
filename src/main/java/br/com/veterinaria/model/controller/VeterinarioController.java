package br.com.veterinaria.model.controller;

import java.util.ArrayList;

import br.com.veterinaria.model.dao.VeterinarioDao;
import br.com.veterinaria.model.entidade.Veterinario;

public class VeterinarioController {
		public String incluir (Veterinario v) {
			VeterinarioDao dao = new VeterinarioDao();
			
			return dao.incluir(v);
		}
		
		public ArrayList<Veterinario> listarAtendimento(){
			VeterinarioDao dao = new VeterinarioDao();
			
			return dao.listarParaAtendimento();
		}
		public ArrayList<Veterinario> listar(String nomeBusca){
			VeterinarioDao dao = new VeterinarioDao();
			
			return dao.listar(nomeBusca);
		}
}


