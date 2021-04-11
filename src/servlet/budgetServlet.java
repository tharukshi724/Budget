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
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String month = request.getParameter("month");
        budgetService budgetservice = new budgetService();
        Budget b =budgetservice.AllMethods(month);
        System.out.println(b.getRepairAmount());
        request.setAttribute("Ramount",b.getRepairAmount());
        request.getRequestDispatcher("budget.jsp").forward(request,response);


    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {



    }
}
