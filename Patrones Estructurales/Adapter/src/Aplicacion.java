public class Aplicacion {
    public static void main(String[] args) {

        //Main del codigo para dar los diferente motores con sus metodos para aplicarlos directamente
        Aplicacion miAplicacion = new Aplicacion();
        System.out.println("\n******************Motor Comun*********************");
        miAplicacion.usarMotorComun();
        System.out.println("**************************************************\n");
        System.out.println("*****************Motor Economico******************");
        miAplicacion.usarMotorEconomico();
        System.out.println("**************************************************\n");
        System.out.println("*****************Motor Electrico******************");
        miAplicacion.usarMotorElectrico();
        System.out.println("**************************************************\n");

    }

        //Metodo con una instancia y enceder(), acelerar() y apagar() en UsarMotorComun()
    private void usarMotorComun() {
        Motor motor = new MotorEconomico();
        motor = new MotorComun();
        motor.encender();
        motor.acelerar();
        motor.apagar();
    }

    //Metodo con una instancia y enceder(), acelerar() y apagar() en UsarMotorElectrico()

    private void usarMotorElectrico() {
        Motor motor = new MotorElectricoAdapter() ;
        motor.encender();
        motor.acelerar();
        motor.apagar();
    }

    //Metodo con una instancia y enceder(), acelerar() y apagar() en UsarMotorEconomico()
    private void usarMotorEconomico() {
        Motor motor = new MotorEconomico();
        motor.encender();
        motor.acelerar();
        motor.apagar();
    }
}
