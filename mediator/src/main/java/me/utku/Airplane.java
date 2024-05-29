package me.utku;

public interface Airplane {
    void requestTakeOff();
    void requestLanding();
    void notifyAirTrafficControl(String message);
}
