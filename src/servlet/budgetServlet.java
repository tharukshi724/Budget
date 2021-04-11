package servlet;

import model.Budget;
import service.budgetService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

@WebServlet("/budgetServlet")
public class budgetServlet extends HttpServlet {
    budgetService budgetservice;
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String month = request.getParameter("month");


        budgetservice.AllMethods(month);
        response.sendRedirect("budget.jsp");


    }
}
