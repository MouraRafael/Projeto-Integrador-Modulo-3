<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ page import="br.com.veterinaria.model.controller.VeterinarioController" %>
<%@ page import="br.com.veterinaria.model.entidade.Veterinario" %>
<%@ page import ="br.com.veterinaria.model.entidade.Usuario" %>


<%@ page import="java.util.ArrayList" %>


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

	if(u.getIdCargo()!=1){
		session.invalidate();
		response.sendRedirect("../index.jsp");
	}
}
%>
<%
String nomeBusca = request.getParameter("buscar");

if(nomeBusca == null){
	nomeBusca = "";
}



%>


<!-- NAVBAR-->
<nav class="navbar navbar-expand-md navbar-light" style="background-color: #e3f2fd;">

    <div class="container-fluid">
        <a class="navbar-brand" href="../index.jsp"><img src="../assets/img/logo/petmania-black-153.png" alt="..." height="100px"></a>

        <form class="d-flex ms-5">
            <button class="btn btn-success" formaction="./listar.veterinario.jsp">Gerente</button>
        </form>

        <button class="navbar-toggler bg-light" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button><span class="ms-5"></span>

        <div class="collapse navbar-collapse" id="navbarSupportedContent">
            <ul class="navbar-nav me-auto mb-2 mb-lg-0">

                <li class="nav-item ms-3">
                    <a class="nav-link active text-black" aria-current="page" href="./listar.veterinario.jsp"><i
                        class="fa-solid fa-user-pen"></i>Veterinarios</a>
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
        <h2 id="title">Lista de Veterinarios</h2>
        <a href="./form.cadastro.veterinario.jsp" class="btn__lista cliente">Cadastrar Veterinario</a>
        <form action="listar.veterinario.jsp" class="searchbar" method="get">
            <input type="text" class="search__input" name="buscar">
            <button type="submit" class="btn-search"><i class="fa-solid fa-magnifying-glass"></i></button>
        </form>
        <table class="table">
            <thead>
                <tr>
                    <th scope="col">ID</th>
                    <th scope="col">Nome</th>
                    <th scope="col">Telefone</th>
                    <th scope="col">Email</th>
                   <!--  <th><i class="fa-solid fa-plus"></i></th>--> 
                </tr>
            </thead>
            <tbody class="table-group-divider">
                   <%
				VeterinarioController controller = new VeterinarioController();
				ArrayList<Veterinario> lista = controller.listar(nomeBusca);
		
				for (Veterinario d : lista) {
					%>
                    <tr>
                    <td><%= d.getIdVet() %></td>
                                            <td><%= d.getNome() %></td>
                                            <td><%= d.getTelefone() %></td>
                                            <td><%= d.getEmail() %></td>

                                            <!-- <td>
                                                
                                                
                                                <a href="./form.edit.veterinario.jsp?idvet=<%= d.getIdVet() %>"><i class="fa-solid fa-pen-to-square"></i></a>
                                            </td>--> 
                    </tr>
                <% }

					%>
            </tbody>
        </table>
    </div>
</div>



</body>

</html>