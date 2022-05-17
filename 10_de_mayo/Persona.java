public class Persona{
    private String nombre;
    private int dni;

    public Persona(){
        this.nombre = "sech";
        this.dni = 0;
    }
    public Persona(String nombre,int dni){
        this.nombre = nombre;
        this.dni = dni;
    }
    /* SETTERS Y GETTERS */

    /* SETTERS */
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setDni(int dni){
        this.dni = dni;
    }

    /* GETTERS */
    public String getNombre(){
        return this.nombre;
    }
    public int getDni(){
        return this.dni;
    }
}