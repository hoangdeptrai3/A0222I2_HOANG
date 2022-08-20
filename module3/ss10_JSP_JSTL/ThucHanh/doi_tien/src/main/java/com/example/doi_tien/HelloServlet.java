package com.example.doi_tien;

import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/converter.jsp")
public class HelloServlet extends HttpServlet {
//    private String message;
//
//    public void init() {
//        message = "Hello World!";
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
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String numRate = req.getParameter("rate");
        String numUSD = req.getParameter("usd");
        double rate = Double.parseDouble(numRate);
        double usd = Double.parseDouble(numUSD);
        double result = rate * usd;
        req.setAttribute("rs",result);
        req.getRequestDispatcher("index.jsp").forward(req,resp);
    }

    public void destroy() {
    }
}