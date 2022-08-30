package ejercicio4;

import java.util.Scanner;

public class AñoBisiestoApp {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		AñoBisiesto entrada = new AñoBisiesto();
		
		System.out.println("Pulsa 1 para empezar.");
		int menu = sc.nextInt();
		
		while(menu == 1) {
			System.out.println("Introduce un año para comprobar si es o no bisisesto: ");
			int valor = sc.nextInt();
			entrada.setValor(valor);
			
			System.out.println("El año " + valor + " es bisiesto: " + entrada.esBisiesto());
			System.out.println("Pulsa 2 para finalizar.");
			menu = sc.nextInt();
		}
		
		System.out.println("Programa finalizado.");
		
		sc.close();
		
	}
}

/*int menu = 2010;
 * for(int menu = 2010; menu <= 2021; menu++){
 * 	System.out.println("Los años bisiestos desde 2010 son: " + entrada.esBisiesto());
 * }
 */
