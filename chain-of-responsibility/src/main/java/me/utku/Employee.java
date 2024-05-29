package me.utku;

public abstract class Employee {
    protected Employee nextApprover;

    public void setNextApprover(Employee nextApprover) {
        this.nextApprover = nextApprover;
    }

    public abstract void processRequest(MoneyWithdraw request);
}
