package ejercicio2;

import java.util.Scanner;

public class RaizCuadradaApp {
	
	public static void main(String[] aargs) {
		Scanner sc = new Scanner(System.in);
		RaizCuadrada entrada = new RaizCuadrada();
		
		System.out.println("Introduzca un número para calcular su raíz cuadrada:");
		int valor = sc.nextInt();
		entrada.raizCuadrada(valor);
		
		System.out.println("La raíz cuadrada de " + valor + " es " + entrada.getNum() + ".");
		
	
		sc.close();
	}
		
}

//**mejora**try-catch aquí