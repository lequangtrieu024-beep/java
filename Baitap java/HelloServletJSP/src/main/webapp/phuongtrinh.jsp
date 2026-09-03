<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Giải phương trình bậc 2</title>
</head>
<body>

    <h1>GIẢI PHƯƠNG TRÌNH BẬC 2</h1>

    <form action="PhuongTrinhServlet" method="post">

        <label>Nhập a:</label>
        <input type="number" name="a" step="any" required>
        <br><br>

        <label>Nhập b:</label>
        <input type="number" name="b" step="any" required>
        <br><br>

        <label>Nhập c:</label>
        <input type="number" name="c" step="any" required>
        <br><br>

        <button type="submit">Giải phương trình</button>

    </form>

</body>
</html>