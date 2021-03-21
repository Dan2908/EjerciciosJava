/*
Escribir una función que, dados cuatro números, devuelva el mayor producto de dos de ellos.
Por ejemplo, si recibe los números 1, 5, -2, -4 debe devolver 8, que es el producto más grande
que se puede obtener entre ellos (8 = −2 × −4).
*/
import java.util.Scanner; //importamos clase Scanner

public class Decisiones1{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in); //instancia de Scanner
		System.out.println("Ingresa el primer numero:");
		int a = sc.nextInt();
		System.out.println("Ingresa el segundo numero:");
		int b = sc.nextInt();
		System.out.println("Ingresa el tercer numero:");
		int c = sc.nextInt();
		System.out.println("Ingresa el cuarto numero:");
		int d = sc.nextInt();
		int resultado = a*b;
		
		if(a*c > resultado) resultado = a*c;
		if(a*d > resultado) resultado = a*d;
		if(b*c > resultado) resultado = b*c;
		if(b*d > resultado) resultado = b*d;
		if(c*d > resultado) resultado = c*d;
		
		System.out.println("El mayor producto es: " + resultado);
	}
}