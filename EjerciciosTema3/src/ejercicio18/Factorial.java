package ejercicio18;

//Calcular el factorial de un n�mero entero N.
//factorial: producto de ese n�mero por todos los enteros menores que �l.
import java.util.Scanner;

public class Factorial {
	private double factorial;
	
	public Factorial() {
	}
	
	public double getFactorial() {
		return factorial;
	}
	
	public void factorial(int num) {
		/*factorial = num;
		for(int i = num; i >= 1 ; i--) { //i es igual al n�mero que entra, hasta que sea mayor estricto de 1, restando uno
			factorial *= i ; //1x5, 5x2, ...				
		}
		
		System.out.println(factorial);*/
		
		factorial = num;
		for(int i = 1; i <= num ;i++) {
			factorial *= i;
		}
		System.out.println(factorial);
	}
	
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	Factorial entrada = new Factorial();
	int valor;
	
	System.out.println("Introduce 1 para empezar: ");
	int menu = sc.nextInt();
	
	while(menu == 1) {
		System.out.println("Introduce un n�mero para averiguar su factorial: ");
		//int valor = sc.nextInt();
		
		try {
			valor = sc.nextInt();
			if (valor < 0) {
				System.out.println("Debe introducir un n�mero positivo.");
			}
		}
		catch (Exception e) {
				System.out.println("Debe introducir un n�mero.");
				System.out.println("Introduzca un n�mero:");
				valor = sc.nextInt();
			}
		
		entrada.factorial(valor);
		System.out.println("El factorial de " + valor + " es " + entrada.getFactorial());
		System.out.println("Pulsa 1 para continuar, 0 para finalizar.");
		menu = sc.nextInt();
		
		}	
	System.out.println("Programa finalizado.");
	sc.close();
	}
}	



/*
 * 
 * se mete un n�mero entero por teclado
 * se multiplica por n-1, n-2, ... n-n
 * for (int i = 1; i == num; i++){
 * 		para el entero i que es igual a 1
 * 		y hasta que sea exactamente igual que el n�mero introducido por teclado
 * 		sumando uno en cada iteraci�n
 * 
 * 		i = num * (num-1)
 * 		  
 * }
 * se introduce un n�mero
 * se multiplica por el n�mero de vueltas (num *= i) 
 * se guarda num *= i en un acumulador
 * pero sin sobreescribir num porque si no no sale del bucle
 * se inicia acum a 1 porque es multiplicaci�n
 * acumulador = acumulador * (num * i);
 * 
 * 
 * */
