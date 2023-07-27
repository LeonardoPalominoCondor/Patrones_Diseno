import java.util.HashMap;

public class SalonDeChat implements ISalonDeChat {
    private HashMap<String, Usuario> participantes = new HashMap<>();

    @Override
    public void registra(Usuario user) {
        participantes.put(user.getNombre(), user); // Se registra un usuario en el chat.
    }

    @Override
    public void enviar(String de, String a, String mensaje) {
        if (participantes.containsKey(de) && participantes.containsKey(a)) {
            Usuario receptor = participantes.get(a);
            receptor.recibe(de, mensaje); // Se envía el mensaje al usuario destinatario.
        } else {
            System.out.println("No existe el usuario");
        }
    }
}
