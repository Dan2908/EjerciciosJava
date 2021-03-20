//3) Mostrar en pantalla las tablas de multiplicar
public class Simple3{
	public static void main(String[] args){
		//Dos ciclos anidados de 1 a 9
		for(int a = 1; a < 10; a++){
			for(int b = 1; b < 10; b++){
				System.out.println(a + " x " + b + " = " + a*b); //Se imprime a x b = c
			}
		}
	}
}