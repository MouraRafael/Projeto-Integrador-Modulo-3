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
        <h2 id="title">Editar Consulta</h2>

        <div class="col-md-12">
            <button form="cadservico" type="submit" class="btn btn-primary" name="idFicha" value="<?= $_SESSION['atualiza_ficha']->id_ficha ?>" form="formedita">Atualizar Ficha</button>
        </div>

        <form class="row g-3" action="./action.atualizar.ficha.php" method="post" id="cadservico">

        <div class="col-md-6">
            <label for="idFicha" class="label">Ficha:</label>
            <input type="text" class="form-control" id="idFicha" value="<?= $_SESSION['atualiza_ficha']->id_ficha ?>" disabled>
        </div>
        <div class="col-md-6">
            <label for="dataAgendada" class="label">Data:</label>
            <input type="text" class="form-control" id="dataAgendada" value="<?= $_SESSION['atualiza_ficha']->data_visita ?>" disabled>
        </div>

        <div class="col-md-6">
            <label for="idAnimal" class="label">Animal:</label>
            <input type="text" class="form-control" id="idAnimal" value="<?= $_GET['nomeanimal'] ?>" disabled>
        </div>
        <div class="col-md-6">
            <label for="select" class="label">Veterinario:</label>
            <input type="text" class="form-control" id="animal" value="<?= $_GET['Veterinario'] ?>" disabled>
        </div>

        <div class="container__area">
            <label for="motivo" class="label">Motivo:</label>
            <textarea name="motivo" id="motivo" cols="30" rows="10" class="ficha__textarea" maxlength="300" class=""><?= $_SESSION['atualiza_ficha']->motivo_visita ?></textarea>
            <label for="diagnostico" class="label">Diagnostico:</label>
            <textarea name="diagnostico" id="" cols="30" rows="10" class="ficha__textarea" maxlength="300" class=""><?= $_SESSION['atualiza_ficha']->diagnostico ?></textarea>
            <label for="tratamento" class="label">Tratamento:</label>
            <textarea name="tratamento" id="" cols="30" rows="10" class="ficha__textarea" maxlength="300" class=""><?= $_SESSION['atualiza_ficha']->tratamento ?></textarea>
            <label for="prescricao" class="label">Prescrição:</label>
            <textarea name="prescricao" id="" cols="30" rows="10" class="ficha__textarea" maxlength="300" class=""><?= $_SESSION['atualiza_ficha']->prescricao ?></textarea>
            <label for="observacoes" class="label">Observações:</label>
            <textarea name="observacoes" id="" cols="30" rows="10" class="ficha__textarea" maxlength="300" class=""><?= $_SESSION['atualiza_ficha']->observacoes ?></textarea>
        </div>

        </form>
</div>
</div>


    </body>
    
    </html>