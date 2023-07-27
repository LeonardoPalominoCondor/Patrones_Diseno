public class MainMed {
    public static void main(String[] args) {

        SalonDeChat salon = new SalonDeChat();

        Usuario juan = new Usuario(salon);
        juan.setNombre("Juan");
        salon.registra(juan);

        Usuario paul = new Usuario(salon);
        paul.setNombre("Paul");
        salon.registra(paul);

        Usuario raul = new Usuario(salon);
        raul.setNombre("Raul");
        salon.registra(raul);

        juan.envia("Paul", "Hola, ¿cómo estas?"); // Juan envía un mensaje a Paul a través del mediador (SalonDeChat).
        paul.envia("Juan", "Todo bien ¿y tú?"); // Paul envía un mensaje a Juan a través del mediador (SalonDeChat).
        raul.envia("Paul", "¿Martín está?"); // Raul envía un mensaje a Paul a través del mediador (SalonDeChat).
    }
}
