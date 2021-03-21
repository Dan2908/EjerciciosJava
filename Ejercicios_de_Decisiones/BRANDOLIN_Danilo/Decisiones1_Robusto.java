/*
Escribir una función que, dados cuatro números, devuelva el mayor producto de dos de ellos.
Por ejemplo, si recibe los números 1, 5, -2, -4 debe devolver 8, que es el producto más grande
que se puede obtener entre ellos (8 = −2 × −4).
*/
import java.util.Scanner; //importamos clase Scanner

public class Decisiones1_Robusto{
	
	//Función para controlar que la entrada sea un entero
	static int controlador(Scanner sc){
		while(!sc.hasNextInt()){
			System.out.println("Ingresar un entero válido");
			sc.next();
			}
		return sc.nextInt();
	}
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in); //instancia de Scanner
		int[] enteros = new int[4];
		int resultado = 0;
		//Bucle para tomar 4 numeros y guardarlos en el arreglo
		for(int i = 0; i < 4; i++){
			System.out.printf("Ingresa el entero numero %d:", i + 1);
			enteros[i] = controlador(sc);
		}
		//Bucle para multiplicar y comparar los resultados
		for(int i = 0; i < 4; i++){
			for(int j = i+1; j < 4; j++){
				if(enteros[i]*enteros[j] > resultado) 
					resultado = enteros[i]*enteros[j];
			}
		}
		
		System.out.println("El mayor producto es: " + resultado);
	}
}