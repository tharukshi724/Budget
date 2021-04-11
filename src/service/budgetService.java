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
        double repairAmount = Double.parseDouble(null);
        try{
            connection = DBConnection.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement("SELECT SUM(cash) FROM testbudget.payment WHERE month=?");

            preparedStatement.setString(1, month);

            ResultSet resultSet = preparedStatement.executeQuery();

            while(resultSet.next()){
               repairAmount = resultSet.getDouble("repairAmount");

            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return repairAmount;

    }

    public double calInventoryExpenses(String month){
      double inventoryExpenses = Double.parseDouble(null);
        try{
            connection = DBConnection.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement("SELECT SUM (qty*unitprice) FROM inven WHERE month=?");

            preparedStatement.setString(1,month);

            ResultSet resultSet = preparedStatement.executeQuery();

            while(resultSet.next()){
                inventoryExpenses = resultSet.getDouble("inventoryExpenses");

            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        return inventoryExpenses;


    }

    public double calRentals(String month){
        double rentalAmount = Double.parseDouble(null);

        try{
            connection = DBConnection.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement("SELECT SUM (rentalPrice) FROM rent WHERE month=?");

            preparedStatement.setString(1, month);

            ResultSet resultSet = preparedStatement.executeQuery();

            while(resultSet.next()){
               rentalAmount = resultSet.getDouble("rentalAmount");

            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        return rentalAmount;

    }

    public double calEmpPayments(String month){
        double empPayments = Double.parseDouble(null);
        try{
            connection = DBConnection.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement("SELECT SUM(amount) FROM salary WHERE month=?");

            preparedStatement.setString(1,month);

            ResultSet resultSet = preparedStatement.executeQuery();

            while(resultSet.next()){
                empPayments = resultSet.getDouble("empPayments");

            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        return empPayments;
    }

    public Budget AllMethods(String month){


       Budget bd = new Budget(CalRepairAmount(month),  calInventoryExpenses(month), calRentals(month), calEmpPayments(month));


        return bd;



    }
}
