package com.example.demo3;

import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "helloServlet", urlPatterns = "/hello-servlet")
public class HelloServlet extends HttpServlet {
//    private String message;

//    public void init() {
//
//    }

//    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
//        response.setContentType("text/html");
//
//        // Hello
//        PrintWriter out = response.getWriter();
//        out.println("<html><body>");
//        out.println("<h1>" + message + "</h1>");
//        out.println("</body></html>");
//    }

    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String numbera = request.getParameter("a");
        String numberb = request.getParameter("b");
        String operator = request.getParameter("operator");
        double a = Double.parseDouble(numbera);
        double b = Double.parseDouble(numberb);
        double result = 0;
        if (operator.equals("+")){
            result = a + b;
            request.setAttribute("add","selected");
        }else if(operator.equals("-")){
            result = a - b;
            request.setAttribute("sub","selected");
        }else if(operator.equals("*")){
            result = a * b;
            request.setAttribute("multi","selected");
        }else {
            result = a / b;
            request.setAttribute("divv","selected");
        }
        request.setAttribute("rs",result);
        request.setAttribute("aa",numbera);
        request.setAttribute("bb",numberb);
        request.getRequestDispatcher("index.jsp").forward(request,response);
    }

//    public void destroy() {
//    }
}