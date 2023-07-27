public class MotorComun extends Motor{

    // En esta parte implmenta las respuestas de motor comun que deberia mostrar al ejecutarlo
    public MotorComun(){
        super();
        System.out.println("Creando el motor comun");
    }
    @Override
    public void encender(){
        System.out.println("Encendiendo motor comun");
    }
    @Override
    public void acelerar(){
        System.out.println("Acelerando el motor común");
    }
    @Override
    public void apagar(){
        System.out.println("Apagando motor común");
    }
}
