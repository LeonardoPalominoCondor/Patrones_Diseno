public class ObservadorConcreto extends Observador {
    private double valorCambio;
    private String name;

    public ObservadorConcreto(String name, Subject sujeto, double valorCambio) {
        this.name = name;
        this.sujeto = sujeto;
        this.valorCambio = valorCambio;
    }

    // Implementación del método abstracto para calcular el valor actualizado.
    @Override
    public double actualizar() {
        return sujeto.getEstado() * valorCambio;
    }

    // Implementación del método abstracto para obtener el nombre de la moneda.
    @Override
    public String moneda() {
        return name;
    }
}
