package model;

import java.util.Date;

public class Budget {

     String month;
     double profit;
     double repairAmount;
     double rentalAmount;
     double inventoryExpenses;
     double empPayments;

    public Budget(double repairAmount) {
    }

    public Budget(String month, Double repairAmount, double rentalAmount, double inventoryExpenses, double empPayments) {
        this.month = month;
        this.repairAmount = repairAmount;
        this.rentalAmount = rentalAmount;
        this.inventoryExpenses = inventoryExpenses;
        this.empPayments = empPayments;
    }

    public Budget(double repairAmount, double rentalAmount, double inventoryExpenses, double empPayments) {
        this.repairAmount = repairAmount;
        this.rentalAmount = rentalAmount;
        this.inventoryExpenses = inventoryExpenses;
        this.empPayments = empPayments;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month= month;
    }

    public double getProfit() {
        return profit;
    }

    public void setProfit(double profit) {
        this.profit = profit;
    }

    public  double getRepairAmount() {
        return repairAmount;
    }

    public void setRepairAmount(double repairAmount) {
        this.repairAmount = repairAmount;
    }

    public double getRentalAmount() {
        return rentalAmount;
    }

    public void setRentalAmount(double rentalAmount) {
        this.rentalAmount = rentalAmount;
    }

    public double getInventoryExpenses() {
        return inventoryExpenses;
    }

    public void setInventoryExpenses(Double inventoryExpenses) {
        this.inventoryExpenses = inventoryExpenses;
    }

    public double getEmpPayments() {
        return empPayments;
    }

    public void setEmpPayments(double empPayments) {
        this.empPayments = empPayments;
    }
}
