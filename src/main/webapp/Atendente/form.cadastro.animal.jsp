<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.ArrayList" %>
<%@ page import="br.com.veterinaria.model.entidade.Raca" %>    
<%@ page import="br.com.veterinaria.model.controller.RacaController" %>    
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

	<!-- Cadastro Animal -->>
    <br>
    <div class="container80">
     <div class="conform">
        <h2 id="title">Cadastrar Animal</h2>
        <form class="row g-3" action="../AnimalCadastraServlet" method="post">
            <div class="col-md-6">
                <label for="nome_animal" class="label">Nome Animal:</label>
                <input type="text" class="form-control" id="nome" name="nome_animal" placeholder="Nome do Animal">
            </div>
            <div class="col-md-6">
                <label for="data_nasc" class="label">Data de Nascimento:</label>
                <input type="date" class="form-control" id="dateanimal" name="data_nasc">
            </div>
            <div class="col-md-6">
                <label for="sexo_animal" class="label">Sexo:</label>
                <div class="box-check">
                    <div>
                        <input type="radio" id="macho" name="sexo_animal" value="M">
                            <label class="m">Macho</label>
    
                        <input type="radio" id="femea" name="sexo_animal" value="F">
                            <label class="f">Fêmea</label>
                    </div>
                </div>
            </div>
            <div class="col-md-6">
                <label for="raca_animal" class="label">Raça:</label>
                <select name="raca_animal" id="select" autofocus>
                    <option value="" selected disabled>Selecione a Raça</option>
                     <%
                        RacaController controller = new RacaController();
                     	long especieId = Long.parseLong(request.getParameter("idEspecie"));
                        ArrayList<Raca> lista = controller.listar(especieId);
                        
                        
                     	for(Raca r : lista){
                     %>
                    <option value="<%= r.getIdRaca() %>"><%= r.getNomeRaca() %></option>
                        <% } %>
                </select>
            </div>
    
    
            <div class="col-12">
                <label for="observacoes" class="label">Observações</label>
                <input type="text" class="form-control" id="observacoes" name="observacoes" placeholder="observações">
            </div>
    
            <div class="col-12">
                <button type="submit" class="btn btn-primary" name="btn_id_dono" value="<%= request.getParameter("idDono") %>">Cadastrar Animal</button>
            </div>
        </form>
      </div>
    </div>


</body>

</html>