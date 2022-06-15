<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <!DOCTYPE html>
    <html lang="pt-br">
    
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Painel de Controle | Veterinária</title>
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
    
<br>
<div class="container80">
    <div class="conform">
        <h2 id="title">Consultas</h2>
        <form action="./redirect.veterinario.listar.consulta.php" class="searchbar" method="get">
            <input type="text" class="search__input" name="buscar">
            <button type="submit" class="btn-search"><i class="fa-solid fa-magnifying-glass"></i></button>
        </form>
        <table class="table">
            <thead>
                <tr>
                    <th scope="col">ID Ficha</th>
                    <th scope="col">Espécie</th>
                    <th scope="col">Nome</th>
                    <th scope="col">Veterinário</th>
                    <th scope="col">Dono</th>
                    <th scope="col">Motivo</th>
                    <th scope="col">Data</th>
                    <th scope="col">Atendimento/Edição<i class="fa-solid fa-plus"></i></th>
                </tr>
            </thead>
            <tbody class="table-group-divider">
                    <?php foreach ($_SESSION['consulta'] as $busca) : ?>
                        <tr>
                                            <td><?= $busca->id_ficha ?></td>
                                            <td><?= $busca->especie ?></td>
                                            <td><?= $busca->nome_animal ?></td>
                                            <td><?= $busca->Veterinario ?></td>
                                            <td><?= $busca->nome_dono ?></td>
                                            <td><?= $busca->motivo_visita ?></td>
                                            <td><?= $busca->data_visita ?></td>
                                            <td>
                                            <a href="redirect.action.atualizar.ficha.php?idFicha=<?= $busca->id_ficha ?>&nomeanimal=<?= $busca->nome_animal ?>&Veterinario=<?= $busca->Veterinario ?>"><i class="fa-solid fa-pen-to-square"></i></a>
                                                
                                            </td>
                                        </tr>
                                    <?php endforeach; ?>
            </tbody>
        </table>
    </div>
</div>


    </body>
    
    </html>