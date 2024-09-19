package org.example.desafiomicalculadora;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;

@WebServlet(name = "Calculadora", value = "/Calculadora")
public class Calculadora extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String num1Str = request.getParameter("num1");
        String num2Str = request.getParameter("num2");
        String operation = request.getParameter("operation");

        StringBuilder result = new StringBuilder();

        try {
            int num1 = Integer.parseInt(num1Str);
            int num2 = Integer.parseInt(num2Str);

            switch (operation) {
                case "suma":
                    result.append("Suma: ").append(num1 + num2).append("<br>");
                    break;
                case "resta":
                    result.append("Resta: ").append(num1 - num2).append("<br>");
                    break;
                case "multiplicacion":
                    result.append("Multiplicación: ").append(num1 * num2).append("<br>");
                    break;
                case "division":
                    if (num2 != 0) {
                        result.append("División: ").append((double) num1 / num2).append("<br>");
                    } else {
                        result.append("División: No se puede dividir por cero.<br>");
                    }
                    break;
                case "ordenar":
                    if (num1 < num2) {
                        result.append("Ordenados: ").append(num1).append(", ").append(num2).append("<br>");
                    } else {
                        result.append("Ordenados: ").append(num2).append(", ").append(num1).append("<br>");
                    }
                    break;
                case "parimpar":
                    result.append("Número 1 es: ").append(num1 % 2 == 0 ? "Par" : "Impar").append("<br>");
                    result.append("Número 2 es: ").append(num2 % 2 == 0 ? "Par" : "Impar").append("<br>");
                    break;
                default:
                    result.append("Operación no válida.<br>");
                    break;
            }

            // Establecer el resultado en el request
            request.setAttribute("result", result.toString());

            // Redirigir a result.jsp
            request.getRequestDispatcher("result.jsp").forward(request, response);
        } catch (NumberFormatException e) {
            // Redirigir a error.jsp si hay un error de formato
            response.sendRedirect("error.jsp");
        }
    }
}