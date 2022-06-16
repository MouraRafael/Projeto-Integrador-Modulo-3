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
 * Servlet implementation class AnimalEditarServlet
 */
public class AnimalEditarServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AnimalEditarServlet() {
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
		
		String strIdAnimal 	= request.getParameter("idanimal");
		String nome 		= request.getParameter("nomeAnimal");
		String sexo 		= request.getParameter("sexo");
		String dataNasc 	= request.getParameter("dataNascimento");
		String strRaca 		= request.getParameter("select");
		String obs 			= request.getParameter("observacoes");
		
		long idAnimal = 0;
		long idRaca = 0;
		
		try {
			idAnimal 	= Long.parseLong(strIdAnimal);
			idRaca		= Long.parseLong(strRaca);
		}catch(Exception e) {}
		
		AnimalController controller = new AnimalController();
		Animal a = new Animal();
		Raca r = new Raca();
		
		r.setIdRaca(idRaca);
		
		a.setId_animal(idAnimal);
		a.setNome(nome);
		a.setSexo(sexo);
		a.setNascimento(dataNasc);
		a.setRaca(r);
		a.setObservacoes(obs);
		
		
		controller.alterar(a);
		
		RequestDispatcher rd = request.getRequestDispatcher("/Atendente/listar.animal.jsp");
		rd.forward(request, response);
		
		
		
		
		
		
		
	}

}
