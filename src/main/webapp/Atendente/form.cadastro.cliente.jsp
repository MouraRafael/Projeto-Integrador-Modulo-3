<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
                        <button class="btn btn-danger" formaction="./cadastro_sair.jsp" type="submit">Deslogar</button>
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
    <h2 id="title">Cadastrar Cliente</h2>
    <form class="row g-3" action="../DonoAnimalCadastroServlet" method="post">
        <div class="col-md-6">
            <label for="cliente" class="label">Nome:</label>
            <input type="text" class="form-control" id="nome" name="nome_cliente" placeholder="Digite Seu Nome">        
        </div>
        <div class="col-md-6">
            <label for="cpf" class="label">CPF:</label>
            <input type="text" class="form-control" id="cpf" name="cpf" placeholder="000.000.000-00">
        </div>

        <div class="col-md-6">
            <label for="email" class="label">Email:</label>
            <input type="text" class="form-control" id="email" name="email" placeholder="Digite Seu Email">
        </div>
        <div class="col-md-6">
            <label for="telefone" class="label">Telefone:</label>
            <input type="text" class="form-control" id="telefone" name="telefone" placeholder="(00) 00000-0000">
        </div>

        <div class="col-md-6">
            <label for="cidade" class="label">Cidade:</label>
            <input type="text" class="form-control" id="cidade" name="cidade" placeholder="Digite o Nome da Sua Cidade">
        </div>
        <div class="col-md-6">
            <label for="bairro" class="label">Bairro:</label>
            <input type="text" class="form-control" id="bairro" name="bairro" placeholder="Digite o Nome do Seu Bairro">
        </div>

        <div class="col-md-12">
            <label for="logradouro" class="label">Logradouro:</label>
            <input type="text" class="form-control" id="logradouro" name="logradouro" placeholder="Digite o Seu Logradouro">
        </div>

        <div class="col-md-6">
            <label for="cep" class="label">CEP:</label>
            <input type="text" class="form-control" id="cep" name="cep" placeholder="00000-000">
        </div>
        <div class="col-md-6">
            <label for="numero" class="label">Número</label>
            <input type="text" class="form-control" id="numero" name="numero" placeholder="Nº">
        </div>


        <div class="col-12">
            <button type="submit" class="btn btn-primary">Cadastrar Cliente</button>
        
        </div>
    </form>
  </div>
</div>


    </body>
    
    </html>