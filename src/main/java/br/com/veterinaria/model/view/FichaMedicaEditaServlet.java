package br.com.veterinaria.model.view;

import java.io.IOException;

import br.com.veterinaria.model.controller.FichaAtendimentoController;
import br.com.veterinaria.model.entidade.FichaAtendimento;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FichaMedicaEditaServlet
 */
public class FichaMedicaEditaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FichaMedicaEditaServlet() {
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
		
		String strIdFicha = request.getParameter("idFicha");
		String diagnostico = request.getParameter("diagnostico");
		String tratamento = request.getParameter("tratamento");
		String prescricao = request.getParameter("prescricao");
		String observacoes = request.getParameter("observacoes");
		
		long idFicha = Long.parseLong(strIdFicha);
		
		
		
		
		
		FichaAtendimentoController controller = new FichaAtendimentoController();
		FichaAtendimento f = new FichaAtendimento();
		
		f.setIdFicha(idFicha);
		f.setDiagnostico(diagnostico);
		f.setTratamento(tratamento);
		f.setPrescricao(prescricao);
		f.setObservacoes(observacoes);
		
		controller.alterar(f);
		
		response.sendRedirect("./Veterinaria/lista.consultas.jsp");
		
		
		
		
		
		
		
		
		
		
	}

}
