package j_ejercicio15;

import java.util.Arrays;
import java.util.Scanner;

//Definir una matriz de 3x3 int
//que pida al usuario que introduzca los valores de cada elemento
//el programa debe sumar los tres números de cada fila y de cada columna, mostrando dos resultados.
//he entendido que el programa debe sumar los números de la fila 0, los números de la fila 1 y los números de la fila 2 y dar el resultado total
//lo mismo con las columnas: al final siempre van a dar el mismo resultado (?)

public class Suma {
	private int[][] matriz = new int[3][3];
	private int fila;
	private int col;
	static Scanner sc = new Scanner(System.in);
	
	public void muestra() {
		asignaNumero();
		sumaNumeros();
		System.out.println("La suma de las filas es " + fila);
		System.out.println("La suma de las columnas es " + col);
	}
	
	private void asignaNumero() {
		System.out.println("Introduce los números de la matriz:");
	
		int cont = 0;
		
		while(cont != 9){
			for (int i = 0; i < matriz.length; i++) {
				for(int j = 0; j < matriz.length; j++) {
					matriz[i][j] = sc.nextInt();
					cont++;
				}				
			}
		}
		System.out.println("Tu matriz es " + Arrays.deepToString(matriz));
	}
	
	public void sumaNumeros() {
		//i: fila
		//j: columna
		for (int i = 0; i < matriz.length - 1; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				fila = matriz[0][0] + matriz[0][1] + matriz[0][2];
				fila += matriz[1][0] +  matriz[1][1] +  matriz[1][2];
				fila += matriz[2][0] +  matriz[2][1] +  matriz[2][2];
				
				col = matriz[0][0] +  matriz[1][0] +  matriz[2][0];
				col += matriz[0][1] +  matriz[1][1] +  matriz[2][1];
				col += matriz[0][2] +  matriz[1][2] +  matriz[2][2];
			}
		}
	}
	
	public static void main(String[] args) {
		Suma n = new Suma();
		n.muestra();
	}
}
