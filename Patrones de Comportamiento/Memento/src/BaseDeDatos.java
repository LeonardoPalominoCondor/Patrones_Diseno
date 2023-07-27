import java.util.ArrayList;

public class BaseDeDatos {

    private ArrayList<Registro> listado;
    private Caretaker caretaker;

    public BaseDeDatos() {
        listado = new ArrayList<Registro>();
        caretaker = new Caretaker();
    }

    public void agregarRegistro(String n, int e, boolean a){
        Registro temp = new Registro(n, e, a);
        listado.add(temp);
    }

    public void limpiarBD(){
        listado = null;
    }

    public void mostrarListado(){
        if (listado != null){
            for (Registro temp: listado){
                temp.getRegistro();
            }
        } else {
            System.out.println("´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´");
            System.out.println("La base de datos se encuentra vacía");
        }
    }

    public void generarBackup(){
        caretaker.setBackup(listado); // Se genera un Memento y se guarda en el Caretaker.
    }

    public void getBackup(int i){
        listado = new ArrayList<>();
        for(Registro temp: caretaker.getBackup(i)){
            listado.add(temp); // Se obtiene un Memento del Caretaker y se restaura en la BaseDeDatos.
        }
    }

    public int getTamanioBackup(){
        return caretaker.getSize(); // Se obtiene el número de Mementos almacenados en el Caretaker.
    }
}