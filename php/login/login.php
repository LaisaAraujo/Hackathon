<?php 

	if(isset($_POST['btnEntrar'])){

			$usuario = $_POST['user'];
			$senha = $_POST['password'];
			$senha_crip = md5($senha);
			$btnlogin = $_POST['btnEntrar'];

			$sql = "SELECT usuario.* from usuario where nome_usuario = '".$usuario."' and senha_usuario='".$senha."'";

			$select = mysqli_query($conexao, $sql);

			if(mysqli_num_rows($select)){
				$login = mysqli_fetch_array($select);
				$_SESSION['nome'] = $login['nome_usuario'];    
				$_SESSION['nivel'] = $login['id_tipoUsuario'];
				$_SESSION['nickname'] = $login['nickname'];

				if($_SESSION['nivel'] == 1){

					header('location: cadastros/cadastrarQuestao.php');
				}else if($_SESSION['nivel'] == 2){
					
					header('location: ../hackathon/cadastros/cadastrarQuestao.php');
				}else if($_SESSION['nivel'] == 3){
				
					header('location: ../hackathon/cadastros/cadastrarQuestao.php');
				}
			}
		}
?>