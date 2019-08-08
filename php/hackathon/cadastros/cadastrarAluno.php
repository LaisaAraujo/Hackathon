
<?php

session_start();


?>
<!DOCTYPE html>
<html lang="pt-BR">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">   
    <link href="../css/style.css" rel="stylesheet" id="bootstrap-css">
    <title>Professor</title>
    <link href="css/bootstrap.css" rel="stylesheet">
</head>
<body>
    <header id="caixa-header" class="center">
        <div id="title">
            HACKATHON
        </div>
        <div id="menu">
        </div>
    </header>
    <div id="corpo"class="center">
    <div id="form">
    <div id="titulo-form">
        HACKATHON - CADASTRAR ALUNO
    </div>
    
    <!-- Login -->
    <form name="frmlogin" method="post" action="cadastrarProfessor.php">
        <label class="label-login">Aluno</label><br>
        <input type="text" class="txtForm"  name="login" placeholder="Digite o nome do Aluno"><br>
        <label class="label-login">Senha</label><br>
        <input type="text" class="txtForm"  name="login" placeholder="Digite sua senha"><br>
        <input type="submit" name="btn-registrar" class="btn-login" value="Confirmar Cadastro">
    </form>
    <a href="../home.php"><button class="btn-login">Cancelar</button></a>
    <!-- Cadastro -->
    </div>
    </div>
</body>
</html>
