<?php 

	if(isset($_POST['btEnviar'])){

            $codigo = $_POST['codigo_quiz'];
            $questao = $_POST['questao'];
            $alternativaA = $_POST['alternativa1'];
            $alternativaB = $_POST['alternativa2'];
            $alternativaC = $_POST['alternativa3'];
            $alternativaD = $_POST['alternativa4'];
			$btnlogin = $_POST['btEnviar'];

            //$sql = "SELECT usuario.* from usuario where nome_usuario = '".$usuario."' and senha_usuario='".$senha."'";
            //$sql = "SELECT questoes.* from questoes where questao = '".$questao."' and resposta='".$alternativaA."' and codigo_quiz ='".$codigo."' and  aternativa_1='".$alternativaB."' and  aternativa_2='".$alternativaC."' and  aternativa_3='".$alternativaD."'";
            
            $sql = "INSERT INTO questoes(questao, resposta, codigo_quiz, aternativa_1, aternativa_2, aternativa_3) values('".$questao."', '".$alternativaA."','".$codigo."', '".$alternativaB."', '".$alternativaC."', '".$alternativaD."')";
            
			mysqli_query($conexao, $sql);

		}
?>

<?php
/*
    session_start();
		
	require_once('../../bd/conexao.php');
	$conexao = conexaoMysql();
	require_once('enviarQuestoes.php');	
*/
?>