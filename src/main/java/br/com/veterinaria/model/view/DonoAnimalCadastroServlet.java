package br.com.veterinaria.model.view;

import java.io.IOException;

import br.com.veterinaria.model.controller.DonoAnimalController;
import br.com.veterinaria.model.entidade.DonoAnimal;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DonoAnimalServlet
 */
public class DonoAnimalCadastroServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DonoAnimalCadastroServlet() {
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
		String nome = request.getParameter("nome");
		String cpf = request.getParameter("cpf");
		String email = request.getParameter("email");
		String telefone = request.getParameter("telefone");
		String cidade = request.getParameter("cidade");
		String bairro = request.getParameter("bairro");
		String logradouro = request.getParameter("logradouro");
		String cep = request.getParameter("cep");
		String numero = request.getParameter("numero");
		

		
		try {

		} catch(Exception e) {
			
		}
		
		System.out.println(nome);
		System.out.println(cpf);
		System.out.println(email);
		System.out.println(telefone);
		System.out.println(cidade);
		System.out.println(bairro);
		System.out.println(logradouro);
		System.out.println(cep);
		System.out.println(numero);
		
		DonoAnimal d = new DonoAnimal();
		d.setNome(nome);
		d.setCpf(cpf);
		d.setEmail(email);
		d.setTelefone(telefone);
		d.setCidade(cidade);
		d.setBairro(bairro);
		d.setLogradouro(logradouro);
		d.setCep(cep);
		d.setNumero(numero);
		
		DonoAnimalController controller = new DonoAnimalController();
		controller.incluir(d);
		
		
		//pagina encaminhada
		RequestDispatcher rd = request.getRequestDispatcher("listarprofessor.jsp");
		rd.forward(request, response);
		
		//doGet(request, response);
	}

}
