import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Banco {
    private String nombre;
    /*arraylist visitantes de banco*/
    private ArrayList<Cliente> Clientes_que_ingresaron_al_banco;
    public Banco(){
        this.nombre = "mariano";
        this.Clientes_que_ingresaron_al_banco = new ArrayList<>();
    }
    public HashSet<Integer> cbusDeClientesVisitantes(){
        HashSet<Integer> hash_aux = new HashSet<>();
        //for (Cliente i : Clientes_que_ingresaron_al_banco) {
        //    hash_aux.add(Clientes_que_ingresaron_al_banco.get);
        //}
        for (int i = 0; i < Clientes_que_ingresaron_al_banco.size(); i++) {
            hash_aux.add(Clientes_que_ingresaron_al_banco.get(i).getCbu());
        }
        return hash_aux;
    }

    public void coutHashset(HashSet<Integer> hash_aux){
        System.out.println(hash_aux);
    }

    public HashMap<Integer,Integer> cant_de_visitas_por_cliente(){
        HashMap<Integer,Integer> aux = new HashMap<Integer,Integer>();
        for (int i = 0; i < Clientes_que_ingresaron_al_banco.size(); i++) {
            int visitas = 0;
            for (int j = 0; j < Clientes_que_ingresaron_al_banco.size(); j++) {
                if(Clientes_que_ingresaron_al_banco.get(i).getCbu() == Clientes_que_ingresaron_al_banco.get(j).getCbu()){
                    visitas++;
                }
            aux.put(Clientes_que_ingresaron_al_banco.get(i).getCbu(),visitas);
            }
        }
    return aux;
    }

    public void mostrar_hash(HashMap<Integer,Integer> aux){
        for (Integer i : aux.keySet()) {
            System.out.println("cbu: "+ aux.values()+" |valor: "+aux.keySet());
        }
    }
    /*
    public valor_q_returnea nombre_funcion(cosas q recibe){
        
        return variable_del_tipo_valor_q_returnea;
    }
    */
}
