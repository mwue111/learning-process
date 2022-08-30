package ejercicio18;

//Calcular el factorial de un número entero N.
//factorial: producto de ese número por todos los enteros menores que él.
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
		for(int i = num; i >= 1 ; i--) { //i es igual al número que entra, hasta que sea mayor estricto de 1, restando uno
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
		System.out.println("Introduce un número para averiguar su factorial: ");
		//int valor = sc.nextInt();
		
		try {
			valor = sc.nextInt();
			if (valor < 0) {
				System.out.println("Debe introducir un número positivo.");
			}
		}
		catch (Exception e) {
				System.out.println("Debe introducir un número.");
				System.out.println("Introduzca un número:");
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
 * se mete un número entero por teclado
 * se multiplica por n-1, n-2, ... n-n
 * for (int i = 1; i == num; i++){
 * 		para el entero i que es igual a 1
 * 		y hasta que sea exactamente igual que el número introducido por teclado
 * 		sumando uno en cada iteración
 * 
 * 		i = num * (num-1)
 * 		  
 * }
 * se introduce un número
 * se multiplica por el número de vueltas (num *= i) 
 * se guarda num *= i en un acumulador
 * pero sin sobreescribir num porque si no no sale del bucle
 * se inicia acum a 1 porque es multiplicación
 * acumulador = acumulador * (num * i);
 * 
 * 
 * */
