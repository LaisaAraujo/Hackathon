<?    
	require_once('registro/validarCNPJ.php');

?>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Document</title>
</head>
<body>
    <input id="txtCNPJ" type="text">

    <button onclick="validaCNPJ();">Verificar</button>

<script src="registro/validarCNPJ.js">
</script>
</body>
</html>