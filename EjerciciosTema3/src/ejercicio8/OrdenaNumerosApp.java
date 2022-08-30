package ejercicio8;

import java.util.Scanner;

public class OrdenaNumerosApp {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		OrdenaNumeros entrada = new OrdenaNumeros();
		
		System.out.println("Escribe 1 para empezar");
		int menu = sc.nextInt();
		
		while(menu == 1){
			System.out.println("Escribe tres números: ");
			int valor1 = sc.nextInt();
			int valor2 = sc.nextInt();
			int valor3 = sc.nextInt();
			
			entrada.setNum(valor1, valor2, valor3);
			
			System.out.println("De los números " + entrada.getNum1() + ", " + entrada.getNum2() + " y " + entrada.getNum3() + ": ");
			entrada.ordenaNumeros(valor1, valor2, valor3);
			
			System.out.println("Pulsa 1 para continuar y 2 para salir.");
			menu = sc.nextInt();
		}
		
		System.out.println("Programa finalizado.");
		sc.close();
	}
}
