package me.utku;

public class AirportControlTower implements AirTrafficControlTower{

    public void requestTakeOff(Airplane airplane){
        airplane.notifyAirTrafficControl("Requesting take off");
    }

    public void requestLanding(Airplane airplane){
        airplane.notifyAirTrafficControl("Requesting landing");
    }
}
