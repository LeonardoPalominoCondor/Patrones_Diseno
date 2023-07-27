public class Usuario implements IUsuarioChat {
    private String nombre;
    private SalonDeChat salon;

    public Usuario(SalonDeChat salon) {
        this.salon = salon;
    }

    @Override
    public void recibe(String de, String mensaje) {
        String mensajeRecibido = "El usuario " + de + " te dice: " + mensaje;
        System.out.println(nombre + ": " + mensajeRecibido); // El usuario recibe el mensaje.
    }

    @Override
    public void envia(String a, String mensaje) {
        salon.enviar(nombre, a, mensaje); // El usuario envía un mensaje a otro usuario a través del mediador (SalonDeChat).

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public SalonDeChat getSalon() {
        return salon;
    }

    public void setSalon(SalonDeChat salon) {
        this.salon = salon;
    }
}

