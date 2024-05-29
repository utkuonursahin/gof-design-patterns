package me.utku;

public class MoneyWithdraw {
    public String customerId;
    public double amount;
    public int accountId;

    public MoneyWithdraw(String customerId, double amount, int accountId) {
        this.customerId = customerId;
        this.amount = amount;
        this.accountId = accountId;
    }
}
