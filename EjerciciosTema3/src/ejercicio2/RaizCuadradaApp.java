package ejercicio2;

import java.util.Scanner;

public class RaizCuadradaApp {
	
	public static void main(String[] aargs) {
		Scanner sc = new Scanner(System.in);
		RaizCuadrada entrada = new RaizCuadrada();
		
		System.out.println("Introduzca un n�mero para calcular su ra�z cuadrada:");
		int valor = sc.nextInt();
		entrada.raizCuadrada(valor);
		
		System.out.println("La ra�z cuadrada de " + valor + " es " + entrada.getNum() + ".");
		
	
		sc.close();
	}
		
}

//**mejora**try-catch aqu�