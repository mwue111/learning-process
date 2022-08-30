package introduccion;

import java.util.Scanner;

//para llamar desde main tienen que ser static

public class EjemploEstadistica {
	static Scanner sc = new Scanner(System.in);

	private static void leerValores(float v[]) {
		int i;
		for (i = 0; i < 5; i++) {
			System.out.println("Introduzca el valor nº " + i);
			v[i] = Float.parseFloat(sc.next()); //en los apuntes: v = Integer.parseInt(sc.next()); porque es por consola		
		}
	}
	
	private static float calcularSuma(float n[]) {
		int i;
		float suma;
		suma = 0;
		for (i = 0; i < 5; i++) {
			suma += n[i];
		}
		return suma;
	}
	
	private static float calcularMedia(float n[], float suma) {
		int i;
		float media;
		media = suma / 5;
		return media;
	}
	/*
	private static float calcularDesviacion(float n[], float media) {
		int i;
		float diferencias;
		diferencias = 0;
		for (i = 0; i < 5; i++) {
			diferencias += abs(N[i] - media);
			diferencias /= 5;
			return diferencias;
		}
		*/
	

//********************************************************************************************************************
	//esto sería EjemploEstadisticaApp
	
	public static void main(String[] args) {
		
		//Ejemplo: programa que lee 50 númmeros por teclado y calcula suma, media y desviación típica.
		float valores[] = new float[5];
		float suma;
		float media;
		float desviacion;
		
		leerValores(valores);
		
		//for (float e: valores); esto es igual que un for
		
		
		suma = calcularSuma(valores);
		media = calcularMedia(valores, suma);
		//desviacion = calcularDesviacion(valores, media);
		System.out.println("La suma es " + suma);
		System.out.println("\nLa media es " + media);
		//System.out.println("\nLa desviación típica es " + desviacion);
	}
	
}
