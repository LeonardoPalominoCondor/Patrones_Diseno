public class PausedState implements State {
    // Implementación concreta del estado "En pausa"
    @Override
    public void pressPlay(AudioPlayer audioPlayer) {
        System.out.println("Reanudando la reproducción");
        audioPlayer.changeState(new PlayingState()); // Cambia el estado a PlayingState.
    }

    @Override
    public void pressPause(AudioPlayer audioPlayer) {
        System.out.println("El reproductor ya se está en pausa");
    }

    @Override
    public void pressStop(AudioPlayer audioPlayer) {
        System.out.println("Deteniendo la reproducción");
        audioPlayer.changeState(new StoppedState()); // Cambia el estado a StoppedState.
    }
}
