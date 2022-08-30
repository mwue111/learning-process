package ejercicio9;

import java.util.Scanner;

public class ParesApp {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Pares entrada = new Pares();
		
		System.out.println("Pulse 1 para iniciar el programa: ");
		int menu = sc.nextInt();
		
		while(menu == 1) {
			System.out.println("Introduzca dos números:");
			int valor1 = sc.nextInt();
			int valor2 = sc.nextInt();
			
			entrada.validacion(valor1, valor2);
			entrada.sumaPares(valor1, valor2);
			
			System.out.println("Pulse 1 para continuar, 2 para salir. ");
			menu = sc.nextInt();
		}
		
		System.out.println("Programa finalizado.");
		
		sc.close();
	}
	
	
}
