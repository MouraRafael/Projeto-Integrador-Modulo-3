<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
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

<body>

    <div class="container80">
        <div class="conform">
           <h2 id="title">Cadastrar Novo Veterinário(a)</h2>
           <form class="row g-3" action="redirect.veterinario.cadastro.php" method="post">
               <div class="col-md-6">
                   <label for="nome_vet" class="label">Nome:</label>
                   <input type="text" class="form-control" id="nome_vet" name="nome_vet">        
               </div>
               <div class="col-md-6">
                   <label for="cpf" class="label">CPF:</label>
                   <input type="text" class="form-control" id="cpf" name="cpf" placeholder="000.000.000-00">
               </div>
       
               <div class="col-md-6">
                   <label for="CRMV" class="label">CRMV:</label>
                   <input type="text" class="form-control" id="CRMV" name="CRMV" placeholder="Digite O CRMV">
               </div>
               <div class="col-md-6">
                   <label for="email" class="label">Email:</label>
                   <input type="text" class="form-control" id="email" name="email">
               </div>
       
               <div class="col-md-6">
                   <label for="telefone" class="label">Telefone:</label>
                   <input type="text" class="form-control" id="telefone" name="telefone" placeholder="(00)00000-0000">
               </div>
               <div class="col-md-6">
                   <label for="endereco" class="label">Endereço:</label>
                   <input type="text" class="form-control" id="endereco" name="endereco" placeholder="Digite o Endereço">
               </div>
       

               <div class="col-12">
                   <button type="submit" class="btn btn-primary">Cadastrar Novo Veterinário(a)</button>
               
               </div>
           </form>
         </div>
       </div>



</body>

</html>