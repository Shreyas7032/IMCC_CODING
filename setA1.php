<?php

session_start();
$_SESSION['un']=$_POST['Username'];
$_SESSION['pw']=$_POST['Password'];
$_SESSION['start']=time();
?>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <form action="setA11.php" method="post">
        Name : <input type="text" name="name"><br><br>
        Address : <input type="text" name="address"><br><br>
        Phone No :<input type="text" name="phone"><br><br>
        <input type="submit" name="submit" value="submit">
    </form>
</head>
<body>
    
</body>
</html>