public interface IUsuarioChat {
    void recibe(String de, String mensaje); // Método para recibir un mensaje de otro usuario.
    void envia(String a, String mensaje); // Método para enviar un mensaje a otro usuario.
}
