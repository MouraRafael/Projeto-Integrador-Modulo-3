<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="br.com.veterinaria.model.entidade.Animal" %>
	<%@ page import="br.com.veterinaria.model.controller.AnimalController" %>
	<%@ page import="br.com.veterinaria.model.entidade.Raca" %>    
	<%@ page import="br.com.veterinaria.model.controller.RacaController" %>  
	<%@ page import="java.util.ArrayList" %>
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
    <%
    long idAnimal = Long.parseLong(request.getParameter("id"));
    long idEspecie = Long.parseLong(request.getParameter("id_especie"));
    
    
    
    RacaController controllerRaca = new RacaController();
    ArrayList<Raca> lista = controllerRaca.listar(idEspecie);
    
    
    AnimalController controllerAnimal = new AnimalController();
    Animal a = controllerAnimal.buscaPorId(idAnimal);
    
    
    Animal male = new Animal();
    Animal female = new Animal();
    male.setSexo("M");
    
    female.setSexo("F");
    
    
    
    %>
    <!-- NAVBAR-->
    <nav class="navbar navbar-expand-md navbar-light" style="background-color: #e3f2fd;">
    
        <div class="container-fluid">
            <a class="navbar-brand" href="index.jsp"><img src="../assets/img/logo/petmania-black-153.png" alt="..." height="100px"></a>
    
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
        <h2 id="title">Editar Animal</h2>
        <form class="row g-3" action="../AnimalEditarServlet" method="post">
            <div class="col-md-6">
                <label for="nome_animal" class="label">Nome Animal:</label>
                <input type="text" class="form-control" id="nome" name="nomeAnimal" placeholder="Nome do Animal" value="<%= a.getNome() %>">
            </div>
            <div class="col-md-6">
                <label for="data_nasc" class="label">Data de Nascimento:</label>
                <input type="date" class="form-control" id="dateanimal" name="dataNascimento" value="<%= a.getNascimento() %>">
            </div>
            <div class="col-md-6">
                <label for="sexo_animal" class="label">Sexo:</label>
                <div class="box-check">
                    <div> 
                        <input type="radio" id="macho" name="sexo" value="M" 
                        <%= (a.getSexo().equals("M")) ? "checked": "" %> > 
                            <label class="m">Macho</label>
    					<% //--Comentario 
    					/* == compara o endereço na memória, o .equals() compara o valor, basicamente
 */ %>
                        <input type="radio" id="femea" name="sexo" value="F" 
                        <%= (a.getSexo().equals("F")) ? "checked": "" %>>
                            <label class="f">Fêmea</label>
                    </div>
                </div>
            </div>
            <div class="col-md-6">
                <label for="select" class="label">Raça:</label>
                <select name="select" id="select" autofocus>
                    <option disabled>Selecione a Raça</option>
                    
                    <% 
                    for(Raca r : lista){
                    
                    %>
                    
                    <option value="<%= r.getIdRaca() %>"
                    <%= (a.getRaca().getIdRaca() == r.getIdRaca())? "selected" : "" %>
                    ><%= r.getNomeRaca() %></option>
                            
                        <% } %>
                </select>
            </div>
    
    
            <div class="col-12">
                <label for="observacoes" class="label">Observações</label>
                <input type="text" class="form-control" id="observacoes" name="observacoes" value="<%= a.getObservacoes() %>">
            
    
            </div>
    
            <div class="col-12">
                <button type="submit" class="btn btn-primary" name="idanimal" value="<%= idAnimal %>">Editar Animal</button>
            </div>
        </form>
      </div>
    </div>

</body>

</html>