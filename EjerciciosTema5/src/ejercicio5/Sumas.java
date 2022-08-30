package ejercicio5;

import java.util.Arrays;
import java.util.Scanner;

//Programa que pida al usuario 10 números reales: positivos y negativos.
//Que sume todos los positivos por un lado
//Que sume todos los negativos por otro lado
//que muestre el resultado de ambos

public class Sumas {
	Scanner sc = new Scanner(System.in);
	int[] sumas = new int[10];
	
	public Sumas() {
		asignaNumeros();
	}
	
	private void asignaNumeros() {
		int i;
		System.out.println("Introduce 10 números, pueden ser positivos y negativos: ");
		for (i = 0; i < sumas.length; i++) {
			boolean error = true;
			do {
				try {
					sumas[i] = Integer.parseInt(sc.next());
					error = false;
				}
				catch(Exception e) {
					System.out.println("Debe introducir un número.");
				}	
			}
			while (error == true);
			
		}
	}
	
	//método que sume los números positivos
	private void sumaPositivos() {
		int i;
		int sumaPositiva = 0;
		int sumaNegativos = 0;
		for(i = 0; i < sumas.length; i++) {
			if (sumas[i] >= 0) {
				sumaPositiva += sumas[i];
			}
			else {
				sumaNegativos += sumas[i];
			}
		}
		System.out.println("La suma de los positivos es " + sumaPositiva);
		System.out.println("La suma de los negativos es " + sumaNegativos);
	}
	
	private void mostrar() {
		System.out.println("El array es " + Arrays.toString(sumas));
	}
	
//*************************************************************************************************************************************
	public static void main(String[] args) {
		
		Sumas entrada = new Sumas();
		entrada.mostrar();
		entrada.sumaPositivos();
	}
}
