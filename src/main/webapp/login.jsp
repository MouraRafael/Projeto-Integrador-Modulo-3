<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="pt-br">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="./assets/css/login.css">
        <link rel="apple-touch-icon" sizes="180x180" href="../assets/img/favicon/apple-touch-icon.png">
        <link rel="icon" type="image/png" sizes="32x32" href="../assets/img/favicon/favicon-32x32.png">
        <link rel="icon" type="image/png" sizes="16x16" href="../assets/img/favicon/favicon-16x16.png">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-0evHe/X+R7YkIZDRvuzKMRqM+OrBnVFBL6DOitfPri4tjfHxaWutUpFmBp4vmVor" crossorigin="anonymous">
        
    <title>Login Clínica</title>
</head>

<body>


<!-- INICIO MEIO DO SITE -->
<section class="backgroundcontainer">
        <div class="background">

            <div class="caixamae">
                <div class="login-page">
                <div class="form">


                    <legend>Login - Clínica Veterinária</legend>

                    <form class="register-form" action="../REDIRECT.php" method="post">
                        

                        <input type="text" name="email_txt" id="usuario_id" placeholder="Digite Seu Email" required>
                        <input  type="password" name="senha_txt" id="senha_id" placeholder="Informe sua Senha" required>
                        <button class="btn btn-dark" type="submit" name="botao_txt">Entrar</button>
                    </form>
                </div>
                </div>
            </div>              <!--FIM FORMULÁRIO DE CADASTRO-->
        </div>
</section>
<!-- FIM MEIO DO SITE -->


    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
</body>
</body>

</html>