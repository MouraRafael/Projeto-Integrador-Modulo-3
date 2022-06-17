package br.com.veterinaria.model.view;

import java.io.IOException;

import br.com.veterinaria.model.controller.AnimalController;
import br.com.veterinaria.model.entidade.Animal;
import br.com.veterinaria.model.entidade.Raca;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AnimalCadastraServlet
 */
public class AnimalCadastraServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AnimalCadastraServlet() {
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
		String strIdDono 	= request.getParameter("btn_id_dono");
		String nome 		= request.getParameter("nome_animal");
		String sexo 		= request.getParameter("sexo_animal");
		String dataNasc 	= request.getParameter("data_nasc");
		String strRaca 		= request.getParameter("raca_animal");
		String obs 			= request.getParameter("observacoes");
		
		long idDono = 0;
		long raca = 0;
		
		try {
			idDono 	= Long.parseLong(strIdDono);
			raca 	= Long.parseLong(strRaca);
			
		}catch(Exception e) {}
		
		AnimalController controller = new AnimalController();
		
		Animal a = new Animal();
		Raca r = new Raca();
		r.setIdRaca(raca);
		
		a.setId_dono(idDono);
		a.setNome(nome);
		a.setSexo(sexo);
		a.setNascimento(dataNasc);
		a.setRaca(r);
		a.setObservacoes(obs);
		
		System.out.println("\n");
		System.out.println("\n");
		System.out.println(a.getSexo());
		controller.incluir(a);
		
		/*
		RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
		rd.forward(request,response);
		*/
		response.sendRedirect("./Atendente/listar.animal.jsp");
		
		
		
	}

}
