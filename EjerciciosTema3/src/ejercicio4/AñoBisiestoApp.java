package ejercicio4;

import java.util.Scanner;

public class A�oBisiestoApp {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		A�oBisiesto entrada = new A�oBisiesto();
		
		System.out.println("Pulsa 1 para empezar.");
		int menu = sc.nextInt();
		
		while(menu == 1) {
			System.out.println("Introduce un a�o para comprobar si es o no bisisesto: ");
			int valor = sc.nextInt();
			entrada.setValor(valor);
			
			System.out.println("El a�o " + valor + " es bisiesto: " + entrada.esBisiesto());
			System.out.println("Pulsa 2 para finalizar.");
			menu = sc.nextInt();
		}
		
		System.out.println("Programa finalizado.");
		
		sc.close();
		
	}
}

/*int menu = 2010;
 * for(int menu = 2010; menu <= 2021; menu++){
 * 	System.out.println("Los a�os bisiestos desde 2010 son: " + entrada.esBisiesto());
 * }
 */
