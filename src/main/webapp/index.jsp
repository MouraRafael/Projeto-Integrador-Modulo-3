<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import ="br.com.veterinaria.model.entidade.Usuario" %>
    <!DOCTYPE html>
    <html lang="pt-br">
    
    <head>
    	<!-- Redirecionamento -->
    	<%
    	
    	
    	if(session.getAttribute("UsuarioLogado") == null){
    		RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
    		rd.forward(request, response);
    	}
    	
    	Usuario u = (Usuario) session.getAttribute("UsuarioLogado");
    	
    	if(u.getIdCargo() == 1){
    		response.sendRedirect("./admin/listar.veterinario.jsp");
    	}
    	if(u.getIdCargo() == 2){
    		response.sendRedirect("./Atendente/listar.consulta.jsp");
    	}
    	if(u.getIdCargo() == 3){
    		response.sendRedirect("./Veterinaria/lista.consultas.jsp");
    	}
    	
    	
    	
    	%>
    	
    
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Painel de Controle | Atendente</title>
        <link rel="stylesheet" href="./assets/css/root.css">
        <link rel="stylesheet" href="./assets/css/attendantpanel.css">
        <link rel="apple-touch-icon" sizes="180x180" href="../webapp/assets/img/favicon/apple-touch-icon.png">
        <link rel="icon" type="image/png" sizes="32x32" href="./webapp/assets/img/favicon/favicon-32x32.png">
        <link rel="icon" type="image/png" sizes="16x16" href="./webapp/assets/img/favicon/favicon-16x16.png">
        <script src="https://kit.fontawesome.com/33abab1032.js" crossorigin="anonymous"></script>
    </head>
    
    <body id="body">
        <div class="container">
            <aside class="sidebar">
                <div class="sidebar-container">
                    <div>
                        <img src="./assets/img/logo/petmania-black-153.png" alt="Logomarca PetMania" height="105">
                        <h1>Indentifique-se<br><span></span></h1>
                    </div>
                    <div class="sidebar-content">
                        <a href="./Atendente/listar.cliente.jsp">
                        <button class="sidebar__button btn-client" role="button" type="button"><i
                                    class="fa-solid fa-user-pen"></i>
                                 Atendente</button>
                        </a>
                        <a href="./Veterinaria/lista.consultas.jsp">
                            <button class="sidebar__button btn-client btn-animal" role="button" type="button"><i class="fa-solid fa-paw"></i>
                                 Veterinario</button>
                        </a>
                        
                    </div>
                </div>
        </aside>
            
        </div>
    </body>
    
    </html>