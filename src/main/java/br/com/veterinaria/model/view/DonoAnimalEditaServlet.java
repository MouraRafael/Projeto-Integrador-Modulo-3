package br.com.veterinaria.model.view;

import java.io.IOException;

import br.com.veterinaria.model.controller.DonoAnimalController;
import br.com.veterinaria.model.entidade.DonoAnimal;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DonoAnimalEditaServlet
 */
public class DonoAnimalEditaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DonoAnimalEditaServlet() {
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
		
		
		String nome 			= request.getParameter("nome_cliente");
		String cpf 				= request.getParameter("cpf");
		String email 			= request.getParameter("email");
		String telefone 		= request.getParameter("telefone");
		String cidade 			= request.getParameter("cidade");
		String bairro 			= request.getParameter("bairro");
		String logradouro 		= request.getParameter("logradouro");
		String strcep 			= request.getParameter("cep");
		String strnumero 		= request.getParameter("numero");
		String strIdEndereco 	= request.getParameter("id_end");
		String strIdDono 		= request.getParameter("id_cliente");
		
		long cep 				= 0;
		long numero 			= 0;
		long idEndereco 		= 0;
		long idDono 			= 0;
		
		
		
		try {
		cep 					= Long.parseLong(strcep);
		numero 					= Long.parseLong(strnumero);
		idEndereco 				= Long.parseLong(strIdEndereco);
		idDono 					= Long.parseLong(strIdDono);
		}catch(Exception e) {}
		
		
		DonoAnimalController controller = new DonoAnimalController();
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
		d.setIdEndereco(idEndereco);
		d.setId_dono(idDono);
		
			
		
		
		System.out.println(controller.alterar(d));
		
		
		
		
		
		response.sendRedirect("./Atendente/listar.cliente.jsp");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
