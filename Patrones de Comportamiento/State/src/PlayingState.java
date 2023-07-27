public class PlayingState implements State {
    // Implementación concreta del estado "Reproduciendo"
    @Override
    public void pressPlay(AudioPlayer audioPlayer) {
        System.out.println("El reproductor ya se está reproduciendo");
    }

    @Override
    public void pressPause(AudioPlayer audioPlayer) {
        System.out.println("Pausando el reproductor");
        audioPlayer.changeState(new PausedState()); // Cambia el estado a PausedState.
    }

    @Override
    public void pressStop(AudioPlayer audioPlayer) {
        System.out.println("Deteniendo el reproductor");
        audioPlayer.changeState(new StoppedState()); // Cambia el estado a StoppedState.
    }
}
