<?php 

	$usuario= null;
	$senha= null;
	$btnlogin= null;
		
	session_start();
	require_once('../bd/conexao.php');
	$conexao = conexaoMysql();
	require_once('../login/login.php');	
?>

<!DOCTYPE html>
<html lang="pt">
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta http-equiv="X-UA-Compatible" content="ie=edge">
        <link href="css/style.css" rel="stylesheet" id="bootstrap-css">
        <title>Login - Hack</title>
    </head>
    <body>
        <div class="principal">
            <div id="form">
                <div id="titulo-form">
                    HACKATHON 
                </div>                
                <!-- Login -->
                <form name="frmlogin" method="post" action="index.php">
                    <label class="label-login">Usuário</label><br>
                    <input type="text" class="txtForm"  name="user" placeholder="Digite seu usuário"><bR>
                    <label class="label-login">Senha</label><br>
                    <input type="password" class="txtForm"  name="password" placeholder="Digite sua senha"><br>

                    <input type="submit" class="btn-login" value="Entrar" name="btnEntrar">

                    <a href="cadastro.php"><button type="button" class="btn-login">Cadastrar</button></a>
                </form>
            </div>
        </div>
    </body>
</html>