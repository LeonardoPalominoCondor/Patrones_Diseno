import java.util.ArrayList;
import java.util.List;

public class Subject {
    private List<Observador> observadores = new ArrayList<>();
    private double estado;

    public double getEstado() {
        return estado;
    }

    public void setEstado(double estado) {
        this.estado = estado;
        notificarObservadores();
    }

    // Método para obtener resultados actualizados de todos los observadores.
    public double[] obtenerResultados(double estado) {
        this.estado = estado;
        double[] resultados = new double[observadores.size()];
        for (int i = 0; i < observadores.size(); i++) {
            Observador observador = observadores.get(i);
            resultados[i] = observador.actualizar();
        }
        return resultados;
    }

    // Método para agregar un observador a la lista.
    public void agregar(Observador observador) {
        observadores.add(observador);
    }

    // Método para eliminar un observador de la lista.
    public void eliminar(Observador observador) {
        observadores.remove(observador);
    }

    // Método para notificar a todos los observadores cuando el estado cambia.
    public void notificarObservadores() {
        for (Observador observador : observadores) {
            observador.actualizar();
        }
    }

    // Método para obtener los nombres de todas las monedas de los observadores.
    public String[] obtenerMoneda() {
        String[] nombres = new String[observadores.size()];
        for (int i = 0; i < observadores.size(); i++) {
            nombres[i] = observadores.get(i).moneda();
        }
        return nombres;
    }

    public List<Observador> getObservadores() {
        return observadores;
    }
}
