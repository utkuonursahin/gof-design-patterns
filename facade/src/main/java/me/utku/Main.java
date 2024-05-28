package me.utku;

public class Main {
    public static void main(String[] args) {
        MultimediaFacade multimediaFacade = new MultimediaFacade(
                new AudioPlayer(),
                new Projector(),
                new VideoPlayer()
        );

        multimediaFacade.play();
        multimediaFacade.pause();
        multimediaFacade.stop();
    }
}