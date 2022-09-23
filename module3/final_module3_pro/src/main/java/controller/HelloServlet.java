package controller;

import model.LoaiMatBang;
import model.MatBang;
import repository.impl.MatBangRepository;
import service.impl.LoaiMatBangService;
import service.impl.MatBangService;

import java.io.*;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/mat_bang")
public class HelloServlet extends HttpServlet {
    MatBangService matBangService = new MatBangService();
    LoaiMatBangService loaiMatBangService = new LoaiMatBangService();

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "create":
//               showFormCreate(request, response);
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
        if (action == null){
            action = "";
        }
        switch (action){
            case "create":
//                create(request,response);
                break;
            case "edit":
                break;
            case "delete":
                break;
            case "search":
                break;
        }
    }
//    private void create(HttpServletRequest request, HttpServletResponse response) {
//        String maMb= request.getParameter("maMB");
//        String trangThai= request.getParameter("trangThai");
//        double dienTich = Double.parseDouble(request.getParameter("dienTich"));
//        int tang = Integer.parseInt(request.getParameter("tang"));
//        String moTaChitiet= request.getParameter("mo_ta_chi_tiet");
//        int giaChoThue = Integer.parseInt(request.getParameter("gia_cho_thue"));
//        String ngayBatDau = request.getParameter("ngay_bat_dau");
//        int loaiVP = Integer.parseInt(request.getParameter("idloaiVP"));
//        MatBang mb = new MatBang(maMb, trangThai, dienTich, tang,loaiVP,moTaChitiet,giaChoThue,ngayBatDau);
//        matBangService.create(mb);
//        String mess = "them moi  thanh cong";
//        request.setAttribute("mess", mess);
//        RequestDispatcher requestDispatcher = request.getRequestDispatcher("view/create.jsp");
//        try {
//            requestDispatcher.forward(request, response);
//        } catch (ServletException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//    }

//    private void showFormCreate(HttpServletRequest request, HttpServletResponse response) {
//        List<LoaiMatBang> loaimbList = loaiMatBangService.findAll();
//        request.setAttribute("loaimbList", loaimbList);
//        RequestDispatcher requestDispatcher = request.getRequestDispatcher("view/create.jsp");
//
//        try {
//            requestDispatcher.forward(request, response);
//        } catch (ServletException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
    private void showFormList(HttpServletRequest request, HttpServletResponse response) {
        List<MatBang> mbList = matBangService.findAll();
        List<LoaiMatBang> loaiMatBangList = loaiMatBangService.findAll();
        request.setAttribute("listMatBang",mbList );
        request.setAttribute("loaimbList",loaiMatBangList);
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("view/list.jsp");
        try {
            requestDispatcher.forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}