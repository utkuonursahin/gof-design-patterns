package me.utku;

public class CommercialAirplane implements Airplane {
    private AirTrafficControlTower mediator;

    public CommercialAirplane(AirTrafficControlTower mediator){
        this.mediator = mediator;
    }

    public void requestTakeOff(){
        mediator.requestTakeOff(this);
    }

    public void requestLanding(){
        mediator.requestLanding(this);
    }

    public void notifyAirTrafficControl(String message){
        System.out.println("Commercial airplane: " + message);
    }
}
