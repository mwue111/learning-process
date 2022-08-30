package ejercicio6;

import java.util.Scanner;

public class NumerosOrdenadosApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		NumerosOrdenados ordenados = new NumerosOrdenados();
		
		System.out.println("Escribe 1 para iniciar el programa.");
		int menu = sc.nextInt();
		
		while(menu == 1) {
			System.out.println("Escribe tres números: ");
			int valor1 = sc.nextInt();
			int valor2 = sc.nextInt();
			int valor3 = sc.nextInt();
			
			ordenados.setNum(valor1, valor2, valor3);
			
			System.out.println("Los números que has introducido están ordenados: " + ordenados.ordenados(valor1, valor2, valor3) +". ");
			ordenados.consecutivos(valor1, valor2, valor3);
			
			System.out.println("Pulsa 1 para continuar y 2 para finalizar el programa.");
			menu = sc.nextInt();
		}
		
		System.out.println("Programa finalizado.");
		sc.close();
	}
	
}
