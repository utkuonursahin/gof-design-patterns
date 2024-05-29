package me.utku;

public class Main {
    public static void main(String[] args) {
        MoneyWithdraw moneyWithdraw = new MoneyWithdraw("12345678901", 750000, 500);
        Employee cashier = new Cashier();
        Employee executive = new Executive();
        Employee manager = new Manager();
        Employee regionManager = new RegionManager();

        cashier.setNextAprrover(executive);
        executive.setNextAprrover(manager);
        manager.setNextAprrover(regionManager);

        cashier.processRequest(moneyWithdraw);
    }
}