package br.com.veterinaria.model.view;

import java.io.IOException;

import br.com.veterinaria.model.controller.UsuarioController;
import br.com.veterinaria.model.entidade.Usuario;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

/**
 * Servlet implementation class UsuarioLoginServlet
 */
public class UsuarioLoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UsuarioLoginServlet() {
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
		String login = request.getParameter("email_txt");
		String senha = request.getParameter("senha_txt");
		
		UsuarioController controller 	= new UsuarioController();
		Usuario usr 					= controller.logar(login, senha);
		String destino 					= "";
		
		if(usr != null) {
			
				HttpSession sessao = request.getSession();
				sessao.setAttribute("UsuarioLogado", usr);
				destino = "index.jsp";
				
			
			
		}else {
			request.setAttribute("erro", "Login e/ou Senha inexistentes");
			destino = "login.jsp";
			
		}
		
		RequestDispatcher rd = request.getRequestDispatcher(destino);
		rd.forward(request, response);
		
		
		
		
		
		
	}

}
