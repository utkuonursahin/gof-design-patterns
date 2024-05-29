package me.utku;

public class Main {
    public static void main(String[] args) {
        MoneyWithdraw moneyWithdraw = new MoneyWithdraw("12345678901", 750000, 500);
        Employee cashier = new Cashier();
        Employee executive = new Executive();
        Employee manager = new Manager();
        Employee regionManager = new RegionManager();

        cashier.setNextApprover(executive);
        executive.setNextApprover(manager);
        manager.setNextApprover(regionManager);

        cashier.processRequest(moneyWithdraw);
    }
}