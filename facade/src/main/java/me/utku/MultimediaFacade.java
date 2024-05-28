package me.utku;

public class MultimediaFacade {
    private AudioPlayer audioPlayer;
    private Projector projector;
    private VideoPlayer videoPlayer;

    public MultimediaFacade(AudioPlayer audioPlayer, Projector projector, VideoPlayer videoPlayer) {
        this.audioPlayer = audioPlayer;
        this.projector = projector;
        this.videoPlayer = videoPlayer;
    }

    public void play() {
        projector.turnOn();
        videoPlayer.play();
        audioPlayer.play();
    }

    public void pause() {
        audioPlayer.pause();
        videoPlayer.pause();
    }

    public void stop() {
        audioPlayer.stop();
        videoPlayer.stop();
        projector.turnOff();
    }

    public void mute() {
        audioPlayer.stop();
    }
}
