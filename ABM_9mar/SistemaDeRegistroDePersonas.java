package src;
import java.util.ArrayList;

public class SistemaDeRegistroDePersonas {

    private ArrayList<Persona> Personas;

    public SistemaDeRegistroDePersonas(){
        Personas = new ArrayList<>();
    }

    public void registrarP(){
        Persona aux = new Persona();
        Personas.add(aux);
    }

    public void expropiar(int dni){
        //Personas.get();
        for (int i = 0; i < Personas.size() ; i++) {
            if (dni == Personas.get(i).getdni()){
                Personas.remove(i);
            }
        }
    }

    public void cambiardatos(String nombre, int dni, int telefono, int edad, String direccion){
        for (int i = 0; i < Personas.size(); i++) {
            if (dni == Personas.get(i).getdni()){
                Personas.get(i).setnombre(nombre);
                Personas.get(i).setedad(edad);
                Personas.get(i).setdireccion(direccion);
                Personas.get(i).settelefono(telefono);
            }
        }
    }

    public void agarramelasiesmayor(){
        for (int i = 0; i < Personas.size(); i++) {
            if (Personas.get(i).getedad() > 18){
                System.out.println(Personas.get(i).getnombre());
            }
        }
    }

    public void todasputas(){
        for (int i = 0; i < Personas.size(); i++) {
            System.out.println(Personas.get(i).getnombre());
        }
    }
    /*
    personas.add();
    .remove(posicion);
    .get(posicion);
    */
}