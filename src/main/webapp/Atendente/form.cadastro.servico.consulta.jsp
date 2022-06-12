<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="utf-8"%>
    <!--<?php session_start();
    $_SESSION['servicos'];
    $_SESSION['todosservicos'];
    ?>-->
    <!DOCTYPE html>
    <html lang="pt-br">
    
        <head>
            <meta charset="UTF-8">
            <meta name="viewport" content="width=device-width, initial-scale=1.0">
            <title>Painel de Controle | Atendente</title>
            <link rel="stylesheet" href="../assets/css/root.css">
            <link rel="stylesheet" href="../assets/css/attendantpanel.css">
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
    
    
            <main class="main-container">
                <div class="main-content">
                    <div class="container__title">
                        <h1 id="title">Serviços</h1>
                    </div>
                    <div class="main-table">
                        <!--Rafael: tentativa de fazer a listagem de serviços-->    
                        <div class="main-table" style="position:relative; top:500px; height: 20px; z-index: 5;">
                            <div class="table-pacient" >
                                
                                <div class="infinit__table" style="position:relative; top:10px;">
        
                                    <table class="table">
                                        <thead id="thead">
                                            <tr>
                                                <th>ID Servico</th>
                                                <th>Servico</th>
                                                
        
                                                <th>Remover</th>
                                            </tr>
                                        </thead>
                                        <tbody>
                                            <!--foreach servicos-->
                                                <tr>
                                                    <td>id_servico</td>
                                                    <td>nome_servico</td>
                                                    
                                                    <td>
                                                        <a href="./redirect.deletar.servico.php?idservico=      &idficha=       " onclick="return confirm('Deseja realmente deletar o serviço?')"><i class="fa-solid fa-eraser"></i></a>
                                                        
                                                    </td>
                                                </tr>
                                         
                                        </tbody>
                                    </table>
                                </div>
                            </div>
                        </div>
                        <!--FIM da tentativa do Rafael-->
                        <div class="form-servico" style="z-index: 4;">
                            <form action="action.adicionar.servico.php" method="post" id="cadservico">
                                <div class="form-container">
                                <div class="box">    
                                </div>                            
                                <div class="box">
                                <div class="ipt">
                                            <label for="servico" class="label">Serviço para atendimento de id- <!--idficha --> ao paciente <!--nomeanimal-->:</label>
                                            <select name="servico" id="select" autofocus>
                                                <option value="" selected disabled>Selecione o Serviço</option>
                                                <!--foreach alterar-->
                                                <option value="">   </option>
                                                
                                            </select>
                                            
                                        </div>                                  
                                    </div>
                                    <div class="box">    
                                        </div>                                
                                    </div>
                                </form>
                            </div>
                        </div>
                    </div>
                </main>
                <button form="cadservico" style="z-index: 10;" type="submit" class="cad-servico btn" name="idficha" value="">Cadastrar Serviço</button>
        </div>
    </body>
    
    </html>