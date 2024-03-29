<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="utf-8"%>
<%@ page import="java.util.ArrayList" %>
<%@ page import="br.com.veterinaria.model.entidade.Servico" %>
<%@ page import="br.com.veterinaria.model.controller.ServicoController" %>
<%@ page import ="br.com.veterinaria.model.entidade.Usuario" %>

    <!DOCTYPE html>
    <html lang="pt-br">
    
        <head>
            <meta charset="UTF-8">
            <meta name="viewport" content="width=device-width, initial-scale=1.0">
            <title>Painel de Controle | Atendente</title>
            <link rel="stylesheet" href="../assets/css/root.css">
            <link rel="stylesheet" href="../assets/css/container.css">
            <link rel="apple-touch-icon" sizes="180x180" href="../assets/img/favicon/apple-touch-icon.png">
            <link rel="icon" type="image/png" sizes="32x32" href="../assets/img/favicon/favicon-32x32.png">
            <link rel="icon" type="image/png" sizes="16x16" href="../assets/img/favicon/favicon-16x16.png">
            <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-0evHe/X+R7YkIZDRvuzKMRqM+OrBnVFBL6DOitfPri4tjfHxaWutUpFmBp4vmVor" crossorigin="anonymous">
            <script src="https://kit.fontawesome.com/33abab1032.js" crossorigin="anonymous"></script>
        </head>
        
        <body id="body">
        <%
if(session.getAttribute("UsuarioLogado") == null){
	
	response.sendRedirect("../login.jsp");
	
}else if(session.getAttribute("UsuarioLogado") != null){
	Usuario u = (Usuario) session.getAttribute("UsuarioLogado");

	if(u.getIdCargo()!=2){
		session.invalidate();
		response.sendRedirect("../index.jsp");
	}
}
%>
        
        <!-- NAVBAR-->
        <nav class="navbar navbar-expand-md navbar-light" style="background-color: #e3f2fd;">
        
            <div class="container-fluid">
                <a class="navbar-brand" href="../index.jsp"><img src="../assets/img/logo/petmania-black-153.png" alt="..." height="100px"></a>
        
                <form class="d-flex ms-5">
                    <button class="btn btn-success" formaction="./listar.cliente.jsp">Atendente</button>
                </form>
        
                <button class="navbar-toggler bg-light" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                    <span class="navbar-toggler-icon"></span>
                </button><span class="ms-5"></span>
        
                <div class="collapse navbar-collapse" id="navbarSupportedContent">
                    <ul class="navbar-nav me-auto mb-2 mb-lg-0">
        
                        <li class="nav-item ms-3">
                            <a class="nav-link active text-black" aria-current="page" href="./listar.cliente.jsp"><i
                                class="fa-solid fa-user-pen"></i>Clientes</a>
                        </li>
        
                        <li class="nav-item ms-3">
                            <a class="nav-link active text-black" aria-current="page" href="./listar.animal.jsp"><i
                                class="fa-solid fa-paw"></i>Animais</a>
                        </li>
        
                        <li class="nav-item ms-3">
                            <a class="nav-link active text-black" aria-current="page" href="./listar.consulta.jsp"><i
                                class="fa-solid fa-notes-medical"></i>Consultas</a>
                        </li>
        
                    </ul>
        
                    <form class="d-flex me-4">
                        <button class="btn btn-danger" formaction="../UsuarioLogoffServlet" type="submit">Deslogar</button>
                    </form>
                </div>
            </div>
        </nav>
        <!-- script navbar -->
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
        
        <!-- FIM DO NAVBAR -->
    
    
    <br>
    <div class="container80">
        <div class="conform">
            <h2 id="title">Serviços</h2>      
            <form class="row g-3" action="../ServicoCadastraServlet" method="post" id="cadservico">
        
        <div class="col-md-6">
            <label for="servico" class="label">Serviço para atendimento de id <%= request.getParameter("idficha") %> ao paciente <%= request.getParameter("nomeanimal") %> :</label>
            <select name="servico" id="select" autofocus>
                <option value="" selected disabled>Selecione o Serviço</option>
                    <%
                    ServicoController controller = new ServicoController();
                    
                    ArrayList<Servico> lista = controller.listarServicos();
                    
                    for(Servico s : lista){
                    
                    %>
                        <option value="<%= s.getIdServico() %>"> <%= s.getServico() %> </option>
                    <% } %>
            </select>
        </div>
        
        <div class="col-md-6">
            <button form="cadservico" type="submit" class="btn btn-primary" name="idficha" value="<%= request.getParameter("idficha") %>">Cadastrar Serviço</button>
        </div>
                             
        
        
        </form>
        <br>
                                    
            
                    <table class="table">
                        <thead id="thead">
                            <tr>
                                <th>ID Servico</th>
                                <th>Servico</th>
                                <th>Remover</th>
                            </tr>
                        </thead>
                        <tbody>
                            <%
                            String strIdFicha = request.getParameter("idficha");
                            long	idFicha = Long.parseLong(strIdFicha); 
                            
                            ArrayList<Servico> listaPrestados = controller.listarServicosPrestados(idFicha);
                            
                            for(Servico serv : listaPrestados){
                            
                            %>
                                <tr>
                                    <td><%= serv.getIdServico() %></td>
                                    <td><%= serv.getServico() %> </td>
                                    <td>
                                        <a href="../ServicoDeletaServlet?idservico=<%= serv.getIdServico() %>&idficha=<%= serv.getIdFicha() %>" onclick="return confirm('Deseja realmente deletar o serviço?')"><i class="fa-solid fa-eraser"></i></a>
                                    </td>
                                </tr>
                            <% } %>
                        </tbody>
                    </table>
                
                    
        
            </div>
        
        </div>
    
    </html>