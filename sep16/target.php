<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Target</title>
</head>
<body>
    <?php
    $lname = $_GET["lname"];
    $fname = $_GET["fname"];

    echo $lname.",".$fname;
    ?>
    <p>Thank For Registering!</p>
</body>
</html>