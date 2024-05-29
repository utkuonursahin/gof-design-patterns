package me.utku;

public abstract class Employee {
    protected Employee nextAprrover;

    public void setNextAprrover(Employee nextAprrover) {
        this.nextAprrover = nextAprrover;
    }

    public abstract void processRequest(MoneyWithdraw request);
}
