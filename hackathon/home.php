<?php

    session_start();


?>
<!DOCTYPE html>
<html lang="pt-BR">
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta http-equiv="X-UA-Compatible" content="ie=edge">   
        <link href="css/style.css" rel="stylesheet" id="bootstrap-css">
        <title>Professor</title>
        <link href="css/bootstrap.css" rel="stylesheet">
    </head>
    <body>
        <header id="caixa-header" class="center">
            <div id="title">
                HACKATHON
            </div>
            <div id="menu">
                <?php
                    if($_SESSION['nivel'] == 1){
                        require_once('menus/menuI.php');
                    }else if($_SESSION['nivel'] == 2){
                        require_once('menus/menuP.php');
                    }else if($_SESSION['nivel'] == 3){
                        require_once('menus/menuA.php');
                    }
                    
                ?>
            </div>
        </header>
        <div id="corpo"class="center">
            <?php
            
            ?>
        </div>
    </body>
</html>