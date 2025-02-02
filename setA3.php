<?php
session_start();
$_SESSION['name']=$_POST['name'];
$_SESSION['class']=$_POST['class'];
$_SESSION['add']=$_POST['add'];
?>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <form action="setA33.php" method="post">
        <pre>
            Hindi Marks : <input type="text" name="hin">
            English Marks : <input type="text" name="eng">
            Marathi Marks : <input type="text" name="mar">
            Maths Marks : <input type="text" name="math">
            Science Marks : <input type="text" name="sci">
            Chemistry Marks : <input type="text" name="che">
        </pre>
        <input type="submit" value="submit">
    </form>
</body>
</html>