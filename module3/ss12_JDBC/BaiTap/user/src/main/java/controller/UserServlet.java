package controller;

import Service.IUserService;
import Service.impl.UserService;
import model.User;

import java.io.*;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "helloUser", value = "/user")
public class UserServlet extends HttpServlet {
    IUserService userService = new UserService();

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
                userEdit(req, resp);
                break;
            case "delete":
                delete(req,resp);
                break;
            case "search":
                userSearch(req,resp);
                break;
        }
    }
    private void userEdit(HttpServletRequest request, HttpServletResponse response) {
        int id = Integer.parseInt(request.getParameter("userId"));
        String name = request.getParameter("userName");
        String email = request.getParameter("userEmail");
        String country = request.getParameter("userCountry");
        User user = new User(id, name, email, country);
        try {
            userService.edit(user);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        try {
            response.sendRedirect("user");
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
    private void userSearch(HttpServletRequest request, HttpServletResponse response) {
        String name = request.getParameter("nameSearch");
        String email = request.getParameter("emailSearch");
        String country = request.getParameter("countrySearch");
        List<User> listUser = userService.selectUser(name, email, country);
        request.setAttribute("listUser", listUser);
        request.setAttribute("nameSearch", name);
        request.setAttribute("emailSearch", email);
        request.setAttribute("countrySearch", country);
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("view/user/list.jsp");
        try {
            requestDispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void create(HttpServletRequest request, HttpServletResponse response) {
//        int id = Integer.parseInt(request.getParameter("id"));
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String country = request.getParameter("country");
        User user = new User(name,email,country);
        userService.create(user);
        String mess = "them moi  thanh cong";
        request.setAttribute("mess", mess);
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("view/user/create.jsp");
        try {
            requestDispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    private void delete(HttpServletRequest request, HttpServletResponse response) {
        int idDelete = Integer.parseInt(request.getParameter("deleteId"));
        boolean check = userService.delete(idDelete);
        String mess = "xoa thành công";
        if (!check) {
            mess = " xoá không thành công";
        }
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("view/user/list.jsp");
        request.setAttribute("listUser", this.userService.findAll());
        try {
            requestDispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException,  IOException {
        String action = request.getParameter("action");
        if (action == null){
            action = "";
        }
        switch (action){
            case "create":
                showFormCreate(request,response);
                break;
            case "edit" :
                break;
            case "delete":
                break;
            case "search"  :
                break;
            default:
                showFormList(request,response);
                break;
        }
    }

    public void showFormList(HttpServletRequest request,HttpServletResponse response){
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("view/user/list.jsp");
        request.setAttribute("listUser", this.userService.findAll());
        try {
            requestDispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private void showFormCreate(HttpServletRequest request, HttpServletResponse response) {
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("view/user/create.jsp");

        try {
            requestDispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}