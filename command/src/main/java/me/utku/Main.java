package me.utku;

public class Main {
    public static void main(String[] args) {
        TV tv = new TV();
        Stereo stereo = new Stereo();

        Command turnOnCommand = new TurnOnCommand(tv);
        Command turnOffCommand = new TurnOffCommand(tv);
        Command changeChannelCommand = new ChangeChannelCommand(tv);
        Command adjustVolumeCommand = new AdjustVolumeCommand(stereo);

        RemoteControl remoteControl = new RemoteControl();
        remoteControl.setCommand(turnOnCommand);
        remoteControl.pressButton();

        remoteControl.setCommand(adjustVolumeCommand);
        remoteControl.pressButton();
    }
}