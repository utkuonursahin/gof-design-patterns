package me.utku;

public class Proxy implements Subject {
    private RealSubject realSubject;

    public Proxy(RealSubject realSubject){
        this.realSubject = realSubject;
    }

    public void request(String username, String password){
        if(login(username,password)){
            realSubject.request(username, password);
            logAccess();
        } else {
            System.out.println("Proxy: Access denied!");
        }
    }

    public boolean login(String username, String password){
        System.out.println("Checking username and password...");
        return true;
    }

    public void logAccess(){
        System.out.println("Logging access...");
    }
}
