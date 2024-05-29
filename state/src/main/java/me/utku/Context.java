package me.utku;

public class Context {
    private LampState lampState;

    public Context() {
        this.lampState = new LampCloseState();
    }

    public void setLampState(LampState lampState) {
        this.lampState = lampState;
    }

    public LampState getLampState() {
        return lampState;
    }

    public void onOpen(){
        lampState.onOpen();
        if(lampState instanceof LampCloseState){
            setLampState(new LampOpenState());
            System.out.println("Lamp is opened");
        }
    }

    public void onClose(){
        lampState.onClose();
        if(lampState instanceof LampOpenState){
            setLampState(new LampCloseState());
            System.out.println("Lamp is closed");
        }
    }

    public String toString(){
        return "Current state is: "+ lampState.getClass().getSimpleName();
    }
}
