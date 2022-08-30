package j_ejercicio16;

import java.util.Arrays;
import java.util.Scanner;

//Definir matriz de 3x5
//pedir al usuario que introduzca los valores
//permutar el contenido de la fila 3 por el de la fila 1 y mostrar el contenido

/*
 * i: filas
 * j: columnas
 * 
 * [][][][][]		matriz[i].length = 5 (i = 0)
 * [][][][][]		matriz[i].length = 5 (i = 1)
 * [][][][][]		matriz[i].length = 5 (i = 2)
 * 
 * La estructura real es:
 * 
 * [[][][][][]]//[[][][][][]]//[[][][][][]]
 *  
 * Cambiar la 0 por la 2
 */

public class Permuta {
	private int[][] matriz = new int[3][5];
	private int[][] aux = new int[3][5];
	static Scanner sc = new Scanner(System.in);
	
	public void muestra() {
		for (int i = 0; i < matriz.length; i++) {
			System.out.println(Arrays.toString(matriz[i]));
		}
		
	}
	
	private void asignaNumero() {
		System.out.println("Introduce los números de la matriz: ");
		int cont = 0;
		
		while(cont != 15){
			for (int i = 0; i < matriz.length; i++) {				//matriz.length recorre hasta 3 (i = 3)
				for (int j = 0; j < matriz[i].length; j++) {		//matriz[i].length hace que j recorra las tres filas hasta 5, que es su longitud
					matriz[i][j] = sc.nextInt();
					cont++;
				}
			}
		}
		
		//para mostrar la matriz en cuadrícula: 
		for (int i = 0; i < matriz.length; i++) {					//este for recorre i (3)
			System.out.println(Arrays.toString(matriz[i]));			//muestra cada elemento que está en i (5 elementos)
		}															//como es printLN hace cada fila en una línea
		permuta();
	}
	
	private void permuta() {
		//tengo que coger la fila 0 y guardarla en la fila 2 de aux
		for (int i = 0; i < aux.length; i++) {
			for (int j = 0; j < aux[i].length; j++) {
				aux[2][j] = matriz[0][j];
				aux[1][j] = matriz[1][j];
				aux[0][j] = matriz[2][j];
			}
		}
		System.out.println("permuta final: ");
		for (int i = 0; i < aux.length; i++) {
			System.out.println(Arrays.toString(aux[i]));
		}
	}
	
	public static void main(String[] args) {
		Permuta n = new Permuta();
		
		n.asignaNumero();

	}
}
