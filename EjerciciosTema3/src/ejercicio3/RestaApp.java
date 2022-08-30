package ejercicio3;

import java.util.Scanner;

public class RestaApp {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Resta entrada = new Resta();
		
		System.out.println("Escribe dos números para restarlos: ");
		int resta = sc.nextInt();
		int resta2 = sc.nextInt();
		
		entrada.resta(resta, resta2);
		System.out.println("La resta de " + resta + " menos " + resta2 + ", una vez ordenados para restar el mayor al menor, es " + entrada.getResultado());
		
		sc.close();
	}
}
