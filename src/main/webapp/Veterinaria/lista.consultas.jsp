<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <!DOCTYPE html>
    <html lang="pt-br">
    
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Painel de Controle | Veterinária</title>
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
        <button class="btn btn-primary" formaction="./lista.consultas.jsp">Veterinário</button>
        </form>

        <button class="navbar-toggler bg-light" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button><span class="ms-5"></span>

        <div class="collapse navbar-collapse" id="navbarSupportedContent">
            <ul class="navbar-nav me-auto mb-2 mb-lg-0">


                <li class="nav-item ms-3">
                    <a class="nav-link active text-black" aria-current="page" href="./lista.consultas.jsp"><i class="fa-solid fa-file-medical"></i>Ficha Clínica</a>
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
                    <div class="cabecalho__main">
                        <div class="container__title">
                            <h1 id="title">Consultas</h1>
                        </div>
                        <div>
                        </div>
                    </div>
                    <div class="main-table">
                        <div class="table-pacient">
                            <form action="./redirect.veterinario.listar.consulta.php" class="searchbar" method="get">
                                <input type="text" class="search__input" name="buscar">
                                <button type="submit" class="btn-search"><i class="fa-solid fa-magnifying-glass"></i></button>
                            </form>
                            <div class="infinit__table">
    
                                <table class="table">
                                    <thead id="thead">
                                        <tr>
                                            <th>ID Ficha</th>
                                            <th>especie</th>
                                            <th>Nome</th>
                                            <th>Veterinário</th>
                                            <th>Dono</th>
                                            <th>Motivo</th>
                                            <th>Data</th>
                                            <th> Atendimento/Edição<i class="fa-solid fa-plus"></i></th>
                                        </tr>
                                    </thead>
                                    <tbody>
                                        <!--FOREACH CONSULTA BUSCA-->
                                            <tr>
                                                <td>id_ficha</td>
                                                <td>especie</td>
                                                <td>nome_animal</td>
                                                <td>Veterinario</td>
                                                <td>nome_dono</td>
                                                <td>motivo_visita</td>
                                                <td>data_visita</td>
                                                <td>
                                                    <a href="redirect.action.atualizar.ficha.php?idFicha=       &nomeanimal=    &Veterinario=       "><i class="fa-solid fa-pen-to-square"></i></a>
                                                    
                                                </td>
                                            </tr>
                              
                                    </tbody>
                                </table>
                            </div>
                        </div>
                    </div>
                </div>
            </main>
        </div>
    </body>
    
    </html>