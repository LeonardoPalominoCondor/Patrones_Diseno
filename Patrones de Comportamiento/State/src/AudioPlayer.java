class AudioPlayer {
    // Clase AudioPlayer que utiliza los diferentes estados
    private State state;

    public AudioPlayer() {
        state = new StoppedState(); // El reproductor comienza en el estado StoppedState.
    }

    // Método para cambiar el estado actual del reproductor.
    public void changeState(State state) {
        this.state = state;
    }

    public void pressPlay() {
        state.pressPlay(this); // Se llama al método pressPlay del estado actual.
    }

    public void pressPause() {
        state.pressPause(this); // Se llama al método pressPause del estado actual.
    }

    public void pressStop() {
        state.pressStop(this); // Se llama al método pressStop del estado actual.
    }
}

