package ejercicio10;

import java.util.Scanner;

public class ImparesApp {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Impares entrada = new Impares();
		
		System.out.println("Introduce <a> para iniciar el programa: ");
		String menu = sc.next();
		
		while(menu.equals("a")) {
			System.out.println("Introduce dos números: ");
			int valor1 = sc.nextInt();
			int valor2 = sc.nextInt();
			
			
			System.out.println
			("Los números impares entre " + valor1 + " y " + valor2 + " son ");
			entrada.impar(valor1, valor2);
			
			System.out.println("Pulsa <a> para continuar y <b> para salir.");
			menu = sc.next();
		}
		System.out.println("Programa finalizado.");		
		sc.close();
	}
}
