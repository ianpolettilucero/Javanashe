public class Cliente extends Persona {
    private int cbu;

    public Cliente(){
        super();
        this.cbu = 0;
    }
    public Cliente(String nombre,int dni,int cbu){
        super(nombre,dni);
        this.cbu = cbu;
    }
    /* SETTERS Y GETTERS */

    /* SETTERS */
    public void setCbu(int cbu){ this.cbu = cbu; }

    /* GETTERS */
    public int getCbu(){ return this.cbu; }
}
