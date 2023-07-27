public class Main {
    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();

        // Se llama a los métodos para simular la interacción con el reproductor de audio
        // en diferentes estados

        audioPlayer.pressPlay(); // El reproductor inicia en el estado "StoppedState".
        audioPlayer.pressPause(); // Se cambia al estado "PausedState".
        audioPlayer.pressPlay(); // Se cambia al estado "PlayingState".
        audioPlayer.pressStop(); // Se cambia al estado "StoppedState".
        audioPlayer.pressPause(); // Se cambia al estado "PausedState".
        audioPlayer.pressStop(); // Se mantiene en el estado "PausedState".
        audioPlayer.pressPlay(); // Se cambia al estado "PlayingState".
        audioPlayer.pressPause(); // Se cambia al estado "PausedState".
        audioPlayer.pressStop(); // Se cambia al estado "StoppedState".
    }
}
