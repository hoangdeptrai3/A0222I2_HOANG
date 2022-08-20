package com.example.List_customer_p;

import model.Customer;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "helloServlet", urlPatterns = {"/customer"})
public class HelloServlet extends HttpServlet {
    private static List<Customer> listCustomer = new ArrayList<>();
    static {
        listCustomer.add(new Customer("hoang","20-01-2001","DH",
                "https://allimages.sgp1.digitaloceanspaces.com/tipeduvn/2022/01/1643616980_253_Hinh-anh-avatar-dep-cho-con-gai-cute-da-phong.jpg")) ;
        listCustomer.add(new Customer("hoang","20-01-2001","DH", "https://cdnmedia.baotintuc.vn/Upload/EqV5H9rWgvy9oNikwkHLXA/files/2021/COVID-19/06082021Messi2.jpg")) ;
        listCustomer.add(new Customer("hoang","20-01-2001","DH", "https://cdnmedia.baotintuc.vn/Upload/EqV5H9rWgvy9oNikwkHLXA/files/2021/COVID-19/06082021Messi2.jpg")) ;
        listCustomer.add(new Customer("hoang","20-01-2001","DH", "https://cdnmedia.baotintuc.vn/Upload/EqV5H9rWgvy9oNikwkHLXA/files/2021/COVID-19/06082021Messi2.jpg")) ;

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        response.setContentType("text/html");
        request.setAttribute("listCustomer",listCustomer );
       request.getRequestDispatcher("customer/List.jsp").forward(request,response);

    }

    public void destroy() {
    }
}