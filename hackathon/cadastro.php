<?php

    require_once('../bd/conexao.php');
    $conexao = conexaoMysql();
    $msg = "";
    session_start();
    if(isset($_POST['btn-registrar'])){
        
        $cnpj = $_POST['cnpj'];
        $senha = $_POST['senha'];
        $instituicao = $_POST['txtInstituicao'];

        //$sql = "SELECT usuario.* from usuario where nome_usuario = '".$usuario."' and senha_usuario='".$senha."'";

        $sql = "INSERT INTO usuario(nome_usuario,id_tipoUsuario, nickname, senha_usuario) values('".$cnpj."', 1, '".$instituicao."','".$senha."')";
        
        require_once('../registro/validarCNPJ.php');
        if(validar_cnpj($cnpj)==true){
            mysqli_query($conexao, $sql); 
        }else{
            $msg = "CNPJ Inválido.";
        }
    }
?>

<!DOCTYPE html>
<html lang="pt">
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta http-equiv="X-UA-Compatible" content="ie=edge">
        <link href="css/style.css" rel="stylesheet" id="bootstrap-css">
        <title>Cadastro - Hack</title>
    </head>
    <body>
        <div class="principal">
            <div id="form">
                <div id="titulo-form">
                    HACKATHON - CADASTRAR
                </div>
                
                <!-- Login -->
                <form name="frmlogin" method="post" action="cadastro.php">
                    <label class="label-login">CNPJ</label><br>
                    <input type="text" class="txtForm" id="txtCNPJ" name="cnpj" placeholder="Digite o CNPJ da instituição" ><br>
                    <label class="label-login3">Nome da instituição</label><br>
                    <input type="text" class="txtForm" name="txtInstituicao" placeholder="Digite o nome da Instituição" ><br>
                    <label class="label-login">Senha</label><br>
                    <input type="password" class="txtForm"  name="senha" placeholder="Digite sua senha"><br>
                    <label style="color:red; margin-left: 200px; font-weight: bold;"><?php echo($msg) ?></label><br>
                    <button type="submit" name="btn-registrar" class="btn-login" >Confirmar Cadastro</button>
                </form>
                    <a href="index.php"><button class="btn-login">Cancelar</button></a>
                <!-- Cadastro -->
            </div>             
    </body>
</html> 
    