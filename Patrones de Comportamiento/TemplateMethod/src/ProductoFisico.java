public class ProductoFisico extends ProcesarOrden {

    @Override
    protected void validarOrden() {
        System.out.println("Validando el pedido de producto físico...");
    }

    @Override
    protected void prepararOrden() {
        System.out.println("Preparando el pedido de producto físico...");
    }

    @Override
    protected void pasosAdicionales() {
        System.out.println("Empaquetando el producto físico...");
    }

}
