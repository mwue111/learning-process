package j_ejercicio27;

import java.util.Scanner;

//Programa que separe las palabras de una frase y cuente cuántas palabras contiene ésta.

public class SeparaPalabras {
	Scanner sc = new Scanner(System.in);
	
	public void inicio() {
		String entrada = "";
		
		System.out.println("Escribe una frase: ");
		entrada = sc.nextLine();
		int largo = entrada.length();
		
		separaPalabras(entrada, largo);
	}
	
	public void separaPalabras(String entrada, int largo) {
		String[] palabras = new String[largo]; 
		
		for (int i = 0; i < entrada.length(); i++) {
			palabras = entrada.split(" ");
		}
		
		muestraPalabras(palabras);
	}
	
	public void muestraPalabras(String[] palabras) {
		for (int i = 0; i < palabras.length; i++) {
			System.out.println("Palabra " + (i + 1) + " - " + palabras[i]);
		}
		System.out.println("Total: " + palabras.length + " palabras.");
	}

	public static void main(String[] args) {
		SeparaPalabras p = new SeparaPalabras();
		p.inicio();
	}

}
