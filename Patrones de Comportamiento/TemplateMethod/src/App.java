import java.lang.System;


public class App {
    public static void main(String[] args) {
        // Pedido Físico
        ProcesarOrden physicalProductOrder = new ProductoFisico();
        System.out.println("******************************************************************************+");
        physicalProductOrder.OrdenProcesar();

        System.out.println("******************************************************************************+");
        // Pedido digital
        ProcesarOrden digitalDownloadOrder = new DescargaDigital();
        digitalDownloadOrder.OrdenProcesar();

        System.out.println("******************************************************************************+");
        // Pedido de subscripción
        ProcesarOrden subscriptionOrder = new Suscripcion();
        subscriptionOrder.OrdenProcesar();

        System.out.println("******************************************************************************+");
    }


}
