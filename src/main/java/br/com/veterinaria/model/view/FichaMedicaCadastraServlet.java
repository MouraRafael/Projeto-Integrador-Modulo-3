package br.com.veterinaria.model.view;

import java.io.IOException;

import br.com.veterinaria.model.controller.FichaAtendimentoController;
import br.com.veterinaria.model.entidade.Animal;
import br.com.veterinaria.model.entidade.FichaAtendimento;
import br.com.veterinaria.model.entidade.Veterinario;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FichaMedicaCadastraServlet
 */
public class FichaMedicaCadastraServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FichaMedicaCadastraServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		String strIdAnimal 	= request.getParameter("idAnimal");
		String strIdVet 	= request.getParameter("idVet");
		String motivo 		= request.getParameter("motivo");
		
		long idAnimal = 0;
		long idVet = 0;
		
		try {
		idAnimal 		= Long.parseLong(strIdAnimal);
		idVet 			= Long.parseLong(strIdVet);
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		FichaAtendimentoController controller 	= new FichaAtendimentoController();
		FichaAtendimento f 						= new FichaAtendimento();
		Animal a 								= new Animal();
		Veterinario v 							= new Veterinario();
		
		a.setId_animal(idAnimal);
		v.setIdVet(idVet);
		
		f.setAnimal(a);
		f.setVeterinario(v);
		f.setMotivoVisita(motivo);
		
		controller.incluir(f);
		
		response.sendRedirect("./Atendente/listar.consulta.jsp");
		
		
	}

}
