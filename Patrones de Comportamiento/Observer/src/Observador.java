public abstract class Observador {
    protected String name;
    protected Subject sujeto;

    // Métodos abstractos que deben ser implementados por las subclases.
    public abstract double actualizar();
    public abstract String moneda();
}
