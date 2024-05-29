package me.utku;

public class Executive extends Employee{
    public void processRequest(MoneyWithdraw req){
        if(req.amount <= 40000){
            System.out.println(STR."\{req.amount} withdraw confirmed by \{this.getClass().getSimpleName()}");
        } else if(nextApprover != null){
            System.out.println(STR."\{req.amount} withdraw request forwarded to \{nextApprover.getClass().getSimpleName()}");
            nextApprover.processRequest(req);
        }
    }
}
