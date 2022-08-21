package com.example.demo101;

import model.Book;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/book")
public class HelloServlet extends HttpServlet {
    private static List<Book> bookList = new ArrayList<>();
    static {
        bookList.add(new Book("doraemon",1000.0,"japan"));
        bookList.add(new Book("doraemon",1000.0,"japan"));
        bookList.add(new Book("doraemon",1000.0,"japan"));
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        request.setAttribute("bookList",bookList);
        request.getRequestDispatcher("book/bookList.jsp").forward(request,response);
    }

    public void destroy() {
    }
}