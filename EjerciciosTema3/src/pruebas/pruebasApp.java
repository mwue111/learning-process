package pruebas;

import java.util.Scanner;

public class pruebasApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PruebaSwitch entrada = new PruebaSwitch();
		
		System.out.println("Escribe un número, pulsa 0 para terminar: ");
		int valor = sc.nextInt();
		entrada.semana(valor);
		
		entrada.mientras();
		entrada.hacerMientras();
		entrada.buclePara();
		entrada.multiplicar(valor);
		entrada.suma(valor);
			
		sc.close();
	}
}
