package j_ejercicio26;

import java.util.Arrays;
import java.util.Scanner;

//programa que pida al usuario que introduzca una palabra de max. 8 caracteres y luego la oculte en una sopa de letras de 8x8 caracteres generada al azar, que se mostrará por pantalla. La palabra debe aparecer escrita de izquierda a derecha y a una altura al azar.

public class SopaLetras {
	private static Scanner sc = new Scanner(System.in);
	
	public void inicio() {
		String palabra = "";
		
		System.out.println("Escribe una palabra de máximo ocho caracteres: ");
		palabra = sc.nextLine();
		
		compruebaPalabra(palabra);	
	}
	
	public void compruebaPalabra(String palabra) {
		int cont = 0;		
		int largo = palabra.length();
		
		while(palabra.length() <= 1) {
			System.out.println("Eso no es una palabra, prueba otra vez.");
			palabra = sc.nextLine();
			largo = palabra.length();
		}
		
		if(palabra.length() > 1){
			while(palabra.length() > 8) {
				System.out.println("¡Esa palabra es demasiado larga! Piensa otra.");
				palabra = sc.nextLine();
				largo = palabra.length();
				cont++;
				if(cont == 2) {
					System.out.println("... " + palabra + " no es válida, prueba otra.");
					palabra = sc.nextLine();
					largo = palabra.length();
				}
				if(palabra.length() <= 1) {
					compruebaPalabra(palabra);
				}
			}
		}
		//System.out.println("Palabra es " + palabra + " y tiene " + largo + " letras.");
		palabra(palabra, largo);
	}
	
	//Método que genera una matriz de letras aleatorias y sustituye a una altura random las letras generadas por la palabra introducida por el usuario.
	public void meterPalabra(char[] palabra) {
		char[][] sopaLetras = new char[8][8];
		int random = (int)(Math.random() * 8);
		
		for(int i = 0; i < sopaLetras.length; i++) {
			for(int j = 0; j < sopaLetras[i].length; j++) {
				sopaLetras[i][j] = ((char)(Math.random() * (91 - 65) + 65));
				for(int p = 0; p < palabra.length; p++) {
					sopaLetras[random][p] = palabra[p];
				}		
			}
		}
		
		muestra(sopaLetras);
	}
	
	//Método que convierte el string palabra en un char[]
	public void palabra(String palabra, int largo) {
		char[] letras = new char[largo];
		//System.out.println("El largo de la palabra es " + largo);
		palabra = palabra.toUpperCase();
		
		for (int i = 0; i < largo; i++) {
			letras[i] = palabra.charAt(i);
		}

		meterPalabra(letras);
	}
	
	public void muestra(char[][] sopaLetras) {
		for(int i = 0; i < sopaLetras.length; i++) {
			System.out.println(Arrays.toString(sopaLetras[i]));
		}
	}
	public static void main(String[] args) {
		SopaLetras s = new SopaLetras();
		
		s.inicio();

	}

}

/*
 * 
 * //crear una matriz de 8x8 con letras aleatorias
	public void sopaLetras(String palabra) {
		char[][] sopaLetras = new char[8][8];
				
		//rellena de letras aleatorias la matriz
		for(int i = 0; i < sopaLetras.length; i++) {
			for(int j = 0; j < sopaLetras[i].length; j++) {
				//ASCII para mayúsculas: 65 hasta 90 ambos inclusives
				sopaLetras[i][j] = ((char)(Math.random() * (91 - 65) + 65));
			}
		}
		
		muestra(sopaLetras);
	}
 * 
 * 
 * */
