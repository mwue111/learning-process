package j_ejercicio17;

import java.util.Arrays;
import java.util.Iterator;

//programa que defina dos matrices de 10x5 de int y las inicalice con números aletorios entre 0 y 255.
//cada elemento de la primera matriz debe ser sumado al elemento correspondiente de la segunda matriz, guardando el resultado en una matriz auxiliar.

public class SumaMatriz {
	private int[][] m1 = new int[10][5];
	private int[][] m2 = new int[10][5];
	private int[][] res = new int[10][5];
	
	public void muestra() {
		System.out.println("La matriz 1 es: ");
		for (int i = 0; i < m1.length; i++) {
			System.out.println(Arrays.toString(m1[i]));
		}
		System.out.println("\nLa matriz 2 es: ");
		for (int i = 0; i < m2.length; i++) {
			System.out.println(Arrays.toString(m2[i]));
		}
		System.out.println("\nLa suma entre ambas matrices es: ");
		for (int i = 0; i < res.length; i++) {
			System.out.println(Arrays.toString(res[i]));
		}
	}
	
	private void asignaNumero() {
		for (int i = 0; i < res.length; i++) {
			for (int j = 0; j < res[i].length; j++) {
				m1[i][j] = (int)(Math.random() * 256);
				m2[i][j] = (int)(Math.random() * 256);
			}		
		}
		suma();
	}
	
	private void suma() {
		for (int i = 0; i < res.length; i++) {
			for (int j = 0; j < res[i].length; j++) {
				res[i][j] = m1[i][j] + m2[i][j]; 
			}	
		}
		muestra();
	}
	
	public static void main(String[] args) {
		SumaMatriz n = new SumaMatriz();
		
		n.asignaNumero();
	}

}
