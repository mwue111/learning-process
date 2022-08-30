package j_ejercicio18;

import java.util.Arrays;
import java.util.Scanner;

//programa que utilice una matriz de 5x5 para:
//pedir por teclado el valor de sus elementos
//imprimir por pantalla la diagonal principal
//calcular la media de la triangular superior 

/*	0  1  2  3  4
 * [ ][x][x][x][x]	0 - 0,1-4
 * [ ][ ][x][x][x]	1 - 1,2-4
 * [ ][ ][ ][x][x]	2 - 2,3-4
 * [ ][ ][ ][ ][x]	3 - 3,3
 * [ ][ ][ ][ ][ ]	4
 * 
 * 
 * */

public class Geometria {
	private int[][] m = new int[5][5];
	//private int[][] aux = new int[5][5];
	private double res = 0.0;
	
	
	static Scanner sc = new Scanner(System.in);
	
	public void muestra() {
		System.out.println("La matriz generada es: ");
		for (int i = 0; i < m.length; i++) {
			System.out.println(Arrays.toString(m[i]));
		}
	}
	
	private void asignaNumero() {
		System.out.println("Introduce los números de la matriz: ");
		int cont = 0;
		
		while(cont != 25) {
			for (int i = 0; i < m.length; i++) {
				for (int j = 0; j < m[i].length; j++) {
					m[i][j] = sc.nextInt();
					cont++;
				}
			}
		}
		muestra();
		System.out.println("La media de la diagonal es: "); // he contado cuando i == j porque si no diagonal no me sale (sale a 0), se soluciona con un array auxiliar.
		mediaD();
		System.out.println("La diagonal es: ");
		diagonal();
	}
	
	private void diagonal() {
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				if(i != j) {
					for (int j2 = 0; j2 < m.length; j2++) {
						m[i][j] = 0;
					}
				}
			}
		}
		
		for (int i = 0; i < m.length; i++) {
			System.out.println(Arrays.toString(m[i]));
		}
	}
	
	private void mediaD() {
		double media = 0;
		
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				if(i > j) {
					m[i][j] = 0;
				}
				else {
					res += m[i][j];
					media = res / 15;
				}
				
				//sumar las posiciones y dividirlas entre el total de las posiciones
				/*
				 * m[0][1]
				 * m[0][2]
				 * m[0][3]
				 * m[0][4]
				 * 
				 * m[1][2] = m[0][1] + 1
				 * m[1][3] = m[0][2] + 1
				 * m[1][4] = m[0][3] + 1
				 * 
				 * m[2][3] = m[1][2] + 1
				 * m[2][4] = m[1][3] + 1
				 * 
				 * m[3][3] = m[][] + 1
				 * 
				 * 10 posiciones  
				 * 
				 * 	 0	  1    2    3    4
				 * [0,0][x,x][x,x][x,x][x,x]	0 - 0,1-4
				 * [1,0][1,1][x,x][x,x][x,x]	1 - 1,2-4
				 * [2,0][2,1][2,2][x,x][x,x]	2 - 2,3-4
				 * [3,0][3,1][3,2][3,3][x,x]	3 - 3,3
				 * [4,0][4,1][4,2][4,3][4,4]	4
				 * 
				 * 
				 */
				
			}
			
		}
		
		for (int i = 0; i < m.length; i++) {
			System.out.println(Arrays.toString(m[i]));
		}
		System.out.println("La media de la esquina superior derecha es " + media);
	}
	
	public static void main(String[] args) {
		Geometria n = new Geometria();
		
		n.asignaNumero();
	}
}
