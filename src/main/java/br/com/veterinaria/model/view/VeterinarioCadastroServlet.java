package br.com.veterinaria.model.view;

import java.io.IOException;

import br.com.veterinaria.model.controller.VeterinarioController;
import br.com.veterinaria.model.entidade.Veterinario;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class VeterinarioCadastroServlet
 */
public class VeterinarioCadastroServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public VeterinarioCadastroServlet() {
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
		String nome 		= request.getParameter("nome_vet");
		String cpf 			= request.getParameter("cpf");
		String strCrmv 		= request.getParameter("crmv");
		String email 		= request.getParameter("email");
		String telefone 	= request.getParameter("telefone");
		String cidade 		= request.getParameter("cidade");
		String bairro 		= request.getParameter("bairro");
		String logradouro 	= request.getParameter("logradouro");
		String strcep 		= request.getParameter("cep");
		String strnumero 	= request.getParameter("numero");
		
		long cep 			= 0;
		long numero 		= 0;
		long crmv 			= 0;
		
		try {
			cep 			= Long.parseLong(strcep);
			numero 			= Long.parseLong(strnumero);
			crmv 			= Long.parseLong(strCrmv);
			

			} catch(Exception e) {}
		
		Veterinario v = new Veterinario();
		VeterinarioController controller = new VeterinarioController();
		
		
		v.setNome(nome);
		v.setCpf(cpf);
		v.setCrmv(crmv);
		v.setEmail(email);
		v.setTelefone(telefone);
		v.setCidade(cidade);
		v.setBairro(bairro);
		v.setLogradouro(logradouro);
		v.setCep(cep);
		v.setNumero(numero);
		
		controller.incluir(v);
		
		response.sendRedirect("./admin/listar.veterinario.jsp");
		
		
		
	}

}
