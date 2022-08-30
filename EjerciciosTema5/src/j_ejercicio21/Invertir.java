package j_ejercicio21;

import java.util.Scanner;

//programa que lea una cadena por teclado y la devuelva por pantalla al revés.

public class Invertir {
	static Scanner sc = new Scanner(System.in);
	String cad;
	String salida = "";
	
	private void invierte() {
		System.out.println("¡Escribe algo!");
		cad = sc.nextLine();
		
		for (int i = cad.length() - 1; i >= 0; i--) {
			System.out.print(cad.charAt(i));
			//salida += cad.charAt(i);
		}
		
		//System.out.println(salida);
	
	}
	
	public static void main(String[] args) {
		Invertir n = new Invertir();
		int menu = 0;
		n.invierte();
	}

}
