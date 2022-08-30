package ejercicio5;

import java.util.Scanner;

public class DecimalApp {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Decimal entrada = new Decimal();
		
		System.out.println("Escribe 1 para iniciar el programa.");
		int menu = sc.nextInt();
		
		while(menu == 1) {
			System.out.println("Escribe un número para ver si es decimal o no: ");
			double valor = sc.nextDouble();
			entrada.setNum(valor);
			entrada.esDecimal(valor);
			
			System.out.println("El número " + entrada.getNum() + " es decimal: " + entrada.esDecimal(valor));
			
			System.out.println("Pulsa 1 para continuar y 2 para finalizar.");
			menu = sc.nextInt();
		}
		
		System.out.println("Programa finalizado.");
				
		sc.close();	
	}
}
