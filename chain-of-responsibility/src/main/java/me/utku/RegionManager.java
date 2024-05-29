package me.utku;

public class RegionManager extends Employee {
    public void processRequest(MoneyWithdraw req){
        if(req.amount <= 800000){
            System.out.println(STR."\{req.amount} withdraw confirmed by \{this.getClass().getSimpleName()}");
        } else if(nextAprrover != null){
            System.out.println(STR."\{req.amount} withdraw request forwarded to \{nextAprrover.getClass().getSimpleName()}");
            nextAprrover.processRequest(req);
        }
    }
}
