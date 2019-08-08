<?php 

function conexaoMysql(){
    $conexao = null;
    $server = "esn509vmysql";
    $user = "aluno";
    $password = "Senai1234";
    $database = "hackathon_grupo6";

    $conexao = mysqli_connect($server, $user, $password, $database);
    
    return $conexao;

}

?>