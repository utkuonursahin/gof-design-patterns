package me.utku;

public class AdjustVolumeCommand implements Command {
    private Stereo stereo;

    public AdjustVolumeCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    public void execute() {
        stereo.adjustVolume();
    }
}
