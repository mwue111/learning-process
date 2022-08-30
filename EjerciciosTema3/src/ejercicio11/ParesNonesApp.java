package ejercicio11;

import java.util.Scanner;

public class ParesNonesApp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ParesNones entrada = new ParesNones();
		
		System.out.println("Escribe dos números: ");
		int valor1 = sc.nextInt();
		int valor2 = sc.nextInt();
		
		//entrada.pares(valor1, valor2);
		//entrada.impares(valor1, valor2);
		
		System.out.println("¿Quieres ver los números pares o los impares?" + "\nEscribe PAR para pares e IMPAR para impares.");
		String eleccion = sc.next();
		entrada.paresNones(eleccion.toUpperCase(), valor1, valor2);
		
		sc.close();
	}
}
