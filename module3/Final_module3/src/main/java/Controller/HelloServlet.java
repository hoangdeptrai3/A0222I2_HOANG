package Controller;

import Model.Color;
import Model.Phone;
import Service.impl.ColorService;
import Service.impl.PhoneService;

import java.io.*;
import java.sql.SQLException;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/phone")
public class HelloServlet extends HttpServlet {
    PhoneService phoneService = new PhoneService();
    ColorService colorService = new ColorService();

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException ,ServletException{
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
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "create":
               create(request,response);
                break;
            case "edit":
                break;
            case "delete":
                delete(request,response);
                break;
            case "search":
                search(request,response);
                break;
        }
    }
    private void create(HttpServletRequest request, HttpServletResponse response) {
//        int id = Integer.parseInt(request.getParameter("id"));
        String name = request.getParameter("name");
        int price = Integer.parseInt(request.getParameter("price"));
        int id_color = Integer.parseInt(request.getParameter("id_color"));
        Phone phone = new Phone(name,price,id_color);
        phoneService.create(phone);
        String mess = "them moi  thanh cong";
        request.setAttribute("mess", mess);
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("View/phone/create.jsp");
        try {
            requestDispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
//    private void edit(HttpServletRequest request, HttpServletResponse response) {
//        int id = Integer.parseInt(request.getParameter("productId"));
//        String name = request.getParameter("productName");
//        int price = Integer.parseInt(request.getParameter("productPrice"));
//        int quantity = Integer.parseInt(request.getParameter("productQuantity"));
//        String color = request.getParameter("productColor");
//        int idCategory = Integer.parseInt(request.getParameter("idCategory"));
//        Product product = new Product(id, name, price, quantity,color,idCategory);
//        try {
//            productService.edit(product);
//        } catch (SQLException throwables) {
//            throwables.printStackTrace();
//        }
//
//        try {
//            response.sendRedirect("product");
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//
//    }


    private void delete(HttpServletRequest request, HttpServletResponse response) {
        int idDelete = Integer.parseInt(request.getParameter("idDelete"));
        boolean check = phoneService.delete(idDelete);
        request.setAttribute("listPhone", this.phoneService.findAll());
        request.setAttribute("colorList", this.colorService.findAll());
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("View/phone/list.jsp");
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
        request.setAttribute("listPhone", this.phoneService.search(name));
        request.setAttribute("colorList", colorService.findAll());
        request.setAttribute("nameSearch", name);

        RequestDispatcher requestDispatcher = request.getRequestDispatcher("View/phone/list.jsp");
        try {
            requestDispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void showFormList(HttpServletRequest request, HttpServletResponse response) {
        List<Phone> phoneList = phoneService.findAll();
        List<Color> colorList = colorService.findAll();
        request.setAttribute("listPhone",phoneList );
        request.setAttribute("colorList",colorList);
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("View/phone/list.jsp");
        try {
            requestDispatcher.forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void showFormCreate(HttpServletRequest request, HttpServletResponse response) {
        List<Color> colorList = colorService.findAll();
        request.setAttribute("colorList", colorList);
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("View/phone/create.jsp");

        try {
            requestDispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


