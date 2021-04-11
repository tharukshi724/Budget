package service;

import model.Budget;
import util.DBConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class budgetService {

    static Connection connection;
    private double rentalAmount;
    private double repairAmount;
    private double inventoryExpenses;
    private double empPaymets;

    public double CalRepairAmount(String month){
        double repairAmount = 0;
        double totalAmount = 0;
        try{
            connection = DBConnection.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement("SELECT cash FROM payment WHERE month=?");

            preparedStatement.setString(1, month);

            ResultSet resultSet = preparedStatement.executeQuery();

            while(resultSet.next()){
               repairAmount = resultSet.getDouble(1);
               totalAmount = totalAmount +repairAmount;

            }


        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return totalAmount;

    }
    public Budget AllMethods(String month){
       System.out.println(month);
       Double CalRepairAmount = CalRepairAmount(month);
       Budget bd = new Budget(CalRepairAmount);
       return bd;

    }
}
