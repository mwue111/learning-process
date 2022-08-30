package ejercicio7;

import java.util.Scanner;

public class CuentaCifrasApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		CuentaCifras entrada = new CuentaCifras();
		
		System.out.println("Introduce 1 para iniciar el programa: ");
		int menu = sc.nextInt();
		
		while(menu == 1) {
			System.out.println("Introduce un número: ");
			int valor = sc.nextInt();
			
			entrada.setValor(valor);
			entrada.cuentaCifras(valor);
			
			System.out.println("El número " + entrada.getValor() + " tiene " + entrada.getCont() + " cifras." );
			entrada.setCont(valor);
			System.out.println("Pulsa 1 para continuar y 2 para finalizar el programa.");
			menu = sc.nextInt();
		}
		
		System.out.println("Programa finalizado.");
	
		sc.close();
	}
	
	
}
