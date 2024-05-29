package me.utku;

public class Main {
    public static void main(String[] args) {
        AirTrafficControlTower controlTower = new AirportControlTower();
        Airplane airplane = new CommercialAirplane(controlTower);

        airplane.requestTakeOff();
        airplane.requestLanding();
    }
}