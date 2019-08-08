<?php

    session_start();
		
	require_once('../../bd/conexao.php');
	$conexao = conexaoMysql();
    require_once('enviarQuestoes.php');	
    
?>
<!DOCTYPE html>
<html lang="pt-BR">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">   
    <link href="../css/style.css" rel="stylesheet" id="bootstrap-css">
    <title>QUESTÕES</title>
    <link href="css/bootstrap.css" rel="stylesheet">
</head>
<body>
    <header>
        <div class="welcome center">
            <label class="texto">
                BEM-VINDO,
            </label>
        </div>
        <div class="nome-inst center">
            
             <label class="texto">
                <?php echo($_SESSION['nickname'])?> <br><a href="../index.php" class="logout">Logout</a>
            </label>
        </div>
    </header>
        <div class="principal">
            <div id="form2">
                <div id="titulo-form">
                    Questões
                </div>                
                <!-- Login -->
                <form name="frmlogin" method="post" action="cadastrarQuestao.php">
                    
                     <label class="label-login">Cod. Quiz</label><br>
                    <input type="text" class="txtForm"  name="codigo_quiz" placeholder="Digite o codigo do Quiz"><br>
                    <label class="label-login">Questão</label><br>
                    <textarea id="questao" style="resize: none" name="questao"></textarea><br>
                    <label class="label-login">Correta</label><br>
                    <input id="altCorreta" type="text" class="txtForm"  name="alternativa1" placeholder="Digite a alternativa correta"><br>
                    <label class="label-login">Incorreta</label><br>
                    <input id="altIncorreta1" type="text" class="txtForm"  name="alternativa2" placeholder="Digite uma alternativa incorreta"><br>
                    <label class="label-login">Incorreta</label><br>
                    <input id="altIncorreta2"type="text" class="txtForm"  name="alternativa3" placeholder="Digite uma alternativa incorreta"><br>
                    <label class="label-login">Incorreta</label><br>
                    <input id="altIncorreta3" type="text" class="txtForm"  name="alternativa4" placeholder="Digite uma alternativa incorreta"><br>

                    <button type="submit" class="btn-login" name="btEnviar">Registrar Quiz</button>

                    <a href="../index.php"><button type="button" class="btn-login">Sair</button></a>
                </form>
            </div>
        </div>
</body>
</html>
