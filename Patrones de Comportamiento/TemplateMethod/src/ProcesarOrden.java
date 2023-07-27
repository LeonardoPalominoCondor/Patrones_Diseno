public abstract class ProcesarOrden {

    public void OrdenProcesar() {
        // Paso de validación
        validarOrden();

        // Paso común para todos los tipos de pedidos
        prepararOrden();;

        // Paso específico para cada tipo de pedido
        pasosAdicionales();

        enviarOrder();
    }

    protected abstract void validarOrden();
    protected abstract void prepararOrden();
    protected abstract void pasosAdicionales();

    protected void enviarOrder() {
        System.out.println("El pedido ha sido enviado.");
    }

}
