import java.util.Scanner; //

public class HolaMundo2{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in); 			//objeto de la clase Scanner
		System.out.print("Ingresa tu nombre: "); 		//print salida sin salto de linea
		String nombre = sc.nextLine();					//Leer entrada (String)
		System.out.printf("Tu nombre es %s", nombre); 	//printf salida formateada
	}
}