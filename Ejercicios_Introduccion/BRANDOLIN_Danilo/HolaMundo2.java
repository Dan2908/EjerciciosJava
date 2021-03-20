import java.util.Scanner; // importamos paquete que contiene la clase Scanner

public class HolaMundo2{
	public static void main(String[] args){
			//Creamos objeto de la clase Scanner
		Scanner sc = new Scanner(System.in);
			//print(): salida sin salto de linea
		System.out.print("Ingresa tu nombre: ");
			//Leer entrada (String)
		String nombre = sc.nextLine();
			//printf(); salida formateada
		System.out.printf("Tu nombre es %s", nombre);
	}
}