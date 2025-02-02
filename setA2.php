<?php

setcookie('style',$_POST['style']);
setcookie('size',$_POST['size']);
setcookie('fcolor',$_POST['fcolor']);
setcookie('bcolor',$_POST['bcolor']);

echo "font style :".$_POST['style'];
echo "font size :".$_POST['size'];
echo "Font Color :".$_POST['fcolor'];
echo "Background color :".$_POST['bcolor'];
?>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <form action="setA22.php" method="post">
        Enter Your Message : <input type="text" name="txt">
        <input type="submit" name="submit" value="submit">
    </form>
</body>
</html>