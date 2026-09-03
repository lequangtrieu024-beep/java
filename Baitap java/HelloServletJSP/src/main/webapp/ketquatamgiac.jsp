<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Kết quả kiểm tra tam giác</title>
</head>
<body>

    <h2>Kết quả</h2>

    <p>a = ${a}</p>
    <p>b = ${b}</p>
    <p>c = ${c}</p>

    <%
        Boolean laTamGiac = (Boolean) request.getAttribute("laTamGiac");

        if (laTamGiac != null && laTamGiac) {
    %>

        <h3 style="color: green;">
            3 số này là độ dài 3 cạnh của một tam giác.
        </h3>

    <%
        } else {
    %>

        <h3 style="color: red;">
            3 số này không phải là độ dài 3 cạnh của một tam giác.
        </h3>

    <%
        }
    %>

    <br>

    <a href="tamgiac.jsp">Quay lại</a>

</body>
</html>