package src;
//import java.util.ArrayList;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

	int eleccion;
	boolean a = true;

	SistemaDeRegistroDePersonas ana = new SistemaDeRegistroDePersonas();

		while(a){
			System.out.println("1 para añadir persona");
			System.out.println("2 para erradicar persona");
			System.out.println("3 para cambiar dato de persona");
			System.out.println("4 para lista de mayores de edad");
			System.out.println("5 para mostrar a todos");
			System.out.println("6 para salir");
			
			Scanner peruvianscanner = new Scanner(System.in);
			eleccion = peruvianscanner.nextInt();	
			
			switch(eleccion){
			case 1: ana.registrarP(); break;
			case 2:
			System.out.println("inserte dni de la persona que quiere erradicar"); 
			Scanner sobar = new Scanner(System.in);
			int dni = sobar.nextInt(); ana.expropiar(dni); 
			break;
			case 3: 
			Scanner nombrenashe = new Scanner(System.in);
			String nombre = nombrenashe.nextLine();
			Scanner telefonashe = new Scanner(System.in);
			int telefono = telefonashe.nextInt();
			Scanner edadnashe = new Scanner(System.in);
			int edad = edadnashe.nextInt();
			Scanner direccionashe = new Scanner(System.in);
			String direccion = direccionashe.nextLine();
			Scanner dninashe = new Scanner(System.in);
			int dni2 = dninashe.nextInt();

			ana.cambiardatos(nombre, dni2, telefono, edad, direccion); 
			break;
			case 4: ana.agarramelasiesmayor(); break;
			case 5: ana.todasputas(); break;
			case 6: a = false; break;
			default: System.out.println(" valor incorrecto"); break;
		}
	}
  }
}