<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Kiểm tra tam giác</title>
</head>
<body>

    <h2>Kiểm tra 3 số có phải là 3 cạnh tam giác</h2>

    <form action="tamgiac" method="post">

        <label>Nhập a:</label>
        <input type="number" name="a" required>
        <br><br>

        <label>Nhập b:</label>
        <input type="number" name="b" required>
        <br><br>

        <label>Nhập c:</label>
        <input type="number" name="c" required>
        <br><br>

        <input type="submit" value="Kiểm tra">

    </form>

</body>
</html>