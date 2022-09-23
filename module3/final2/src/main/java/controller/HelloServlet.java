package controller;

import model.Product;
import service.IProductService;
import service.impl.ProductService;

import java.io.*;
import java.sql.SQLException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/product")
public class HelloServlet extends HttpServlet {
    IProductService productService = new ProductService();

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException,ServletException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "create":
                showFormCreate(request, response);
                break;
            case "edit":
                break;
            case "delete":
                break;
            case "search":
                break;
            default:
                showFormList(request, response);
                break;
        }
    }
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String action = req.getParameter("action");
        if (action == null){
            action = "";
        }
        switch (action){
            case "create":
                create(req,resp);
                break;
            case "edit":
                 edit(req, resp);
                break;
            case "delete":
                delete(req,resp);
                break;
            case "search":
                search(req,resp);
                break;
        }
    }

    private void create(HttpServletRequest request, HttpServletResponse response) {
//        int id = Integer.parseInt(request.getParameter("id"));
        String name = request.getParameter("name");
        int price = Integer.parseInt(request.getParameter("price"));
        int quantity = Integer.parseInt(request.getParameter("quantity"));
        String color = request.getParameter("color");
        Product product = new Product(name, price, quantity, color);
        productService.create(product);
        String mess = "them moi  thanh cong";
        request.setAttribute("mess", mess);
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("view/product/create.jsp");
        try {
            requestDispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    private void search(HttpServletRequest request, HttpServletResponse response) {
        String name = request.getParameter("nameSearch");
        request.setAttribute("listProduct", this.productService.search(name));
        request.setAttribute("nameSearch", name);
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("view/product/list.jsp");
        try {
            requestDispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void edit(HttpServletRequest request, HttpServletResponse response) {
        int id = Integer.parseInt(request.getParameter("productId"));
        String name = request.getParameter("productName");
        int price = Integer.parseInt(request.getParameter("productPrice"));
        int quantity = Integer.parseInt(request.getParameter("productQuantity"));
        String color = request.getParameter("productColor");
        Product product = new Product(id, name, price, quantity,color);
        try {
            productService.edit(product);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        try {
            response.sendRedirect("product");
        } catch (IOException e) {
            e.printStackTrace();
        }


    }


    private void delete(HttpServletRequest request, HttpServletResponse response) {
        int idDelete = Integer.parseInt(request.getParameter("idDelete"));
        boolean check = productService.delete(idDelete);
        String mess = "xoa thành công";
        if (!check) {
            mess = " xoá không thành công";
        }

        request.setAttribute("listProduct", this.productService.findAll());
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("view/product/list.jsp");
        try {
            requestDispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    public void showFormList(HttpServletRequest request, HttpServletResponse response) {
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("view/product/list.jsp");
        request.setAttribute("listProduct", this.productService.findAll());
        try {
            requestDispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void showFormCreate(HttpServletRequest request, HttpServletResponse response) {
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("view/product/create.jsp");

        try {
            requestDispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}