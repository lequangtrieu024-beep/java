package com.example.helloworld;

import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/PhuongTrinhServlet")
public class PhuongTrinhServlet extends HttpServlet {

    @Override
    protected void doPost(
            HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {

        // Lấy dữ liệu từ JSP
        double a = Double.parseDouble(request.getParameter("a"));
        double b = Double.parseDouble(request.getParameter("b"));
        double c = Double.parseDouble(request.getParameter("c"));

        String ketQua;

        // Tính delta
        double delta = b * b - 4 * a * c;

        if (a == 0) {

            ketQua = "Đây không phải phương trình bậc 2";

        } else if (delta < 0) {

            ketQua = "Phương trình vô nghiệm";

        } else if (delta == 0) {

            double x = -b / (2 * a);

            ketQua = "Phương trình có nghiệm kép: x = " + x;

        } else {

            double x1 =
                    (-b + Math.sqrt(delta)) / (2 * a);

            double x2 =
                    (-b - Math.sqrt(delta)) / (2 * a);

            ketQua =
                    "Phương trình có 2 nghiệm: "
                    + "x1 = " + x1
                    + ", x2 = " + x2;
        }

        // Gửi kết quả sang JSP
        request.setAttribute("ketQua", ketQua);

        request.getRequestDispatcher("ketqua.jsp")
                .forward(request, response);
    }
}