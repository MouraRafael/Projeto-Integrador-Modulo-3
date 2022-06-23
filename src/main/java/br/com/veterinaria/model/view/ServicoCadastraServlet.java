package br.com.veterinaria.model.view;

import java.io.IOException;

import br.com.veterinaria.model.controller.ServicoController;
import br.com.veterinaria.model.entidade.Servico;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServicoCadastraServlet
 */
public class ServicoCadastraServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServicoCadastraServlet() {
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
		
		String strIdServico = request.getParameter("servico");
		String strIdFicha 	= request.getParameter("idficha");
		
		long idServico 	= 0;
		long idFicha 	= 0;
		
		try {
		idServico 	= Long.parseLong(strIdServico);
		idFicha 	= Long.parseLong(strIdFicha);
		}catch(Exception e) {}
		
		ServicoController controller = new ServicoController();
		Servico s = new Servico();
		
		s.setIdFicha(idFicha);
		s.setIdServico(idServico);
		
		controller.incluir(s);
		
		response.sendRedirect("./Atendente/listar.consulta.jsp");
		
	}

}
