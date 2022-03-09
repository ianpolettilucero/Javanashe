import java.util.Scanner;
import java.util.Vector;

public class Main {
	public static void main(String[] args) {
	  
		Producto p1 = new Producto("Choclo"      ,200);
		Producto p2 = new Producto("Arvejas"     ,300);
		Producto p3 = new Producto("Champiniones",400);
		Producto p4 = new Producto("Pollo"       ,500);
		Producto p5 = new Producto();

		boolean menu1=true;
		boolean menu2=true;
		while(menu1){
			System.out.println("1. Insertar producto. ");
			System.out.println("2. Iniciar registro. ");
			System.out.println("3. Salir. ");
			Scanner eleccionInput = new Scanner(System.in);
			int eleccion = eleccionInput.nextInt();

			switch(eleccion){
				case 1:
					System.out.println("Insertar nombre: ");
					Scanner inputName = new Scanner(System.in);
					String name = inputName.nextLine();
					p5.setNombre(name);

					System.out.println("Insertar precio: ");
					Scanner inputPrecio = new Scanner(System.in);
					float   precio = inputPrecio.nextFloat();
					p5.setPrecio(precio);
				break;
				case 2:
					float total=0;
					while(menu2){
						System.out.println("Productos: ");
						System.out.println("1. " + p1.getNombre() + " " + p1.getPrecio());
						System.out.println("2. " + p2.getNombre() + " " + p2.getPrecio());
						System.out.println("3. " + p3.getNombre() + " " + p3.getPrecio());
						System.out.println("4. " + p4.getNombre() + " " + p4.getPrecio());
						System.out.println("5. " + p5.getNombre() + " " + p5.getPrecio());
						System.out.println("6. Terminar registro ");
						System.out.println("Total: " + total);


						Scanner productInput  = new Scanner(System.in);
						int     productChosen = productInput.nextInt();

						switch(productChosen){
							case 1:
								total+=p1.getPrecio();
							break;
							case 2:
								total+=p2.getPrecio();
							break;
							case 3:
								total+=p3.getPrecio();
							break;
							case 4:
								total+=p4.getPrecio();
							break;
							case 5:
								total+=p5.getPrecio();
							break;
							case 6:
								menu2=false;
							break;
							default:
								System.out.println("valor invalido :(((.");
							break;
						}

					}
					System.out.println("Total: " + total);
				break;
				case 3:
					menu1=false;
				break;
				default:
					System.out.println("Valor invalido :(. ");
				break;

			}


		}




		
	}
	
}