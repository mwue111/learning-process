package ejercicio1;

//Scanner: crear un objeto nuevo, llamar al método que necesito y 
//la variable que meto es sc.next*tipo que necesite*()

import java.util.Scanner;

public class PositivoNegativoApp {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PositivoNegativo entrada = new PositivoNegativo();
		
		System.out.println("Pulsa 1 para empezar.");
		int menu = sc.nextInt();
		
		while(menu != 2) {
			System.out.println("Escribe un número: ");
			entrada.leerNumero(sc.nextInt());
			
			//compruebo si me almacena el valor como necesito
			System.out.println("el numero almacenado es: " + entrada.getNumero() );

			//llamo al método que me dice si es positivo o negativo
			entrada.positivoNegativo();
			
			
			//llamada al setter
			//entrada.setNumero();
			//System.out.println("El numero ahora es " + entrada.getNumero());
			System.out.println("¿Quieres continuar? Pulsa 1 para seguir, 2 para terminar.");
			menu = sc.nextInt();
					
		}
		System.out.println("Programa finalizado.");
		sc.close();
	}
}
