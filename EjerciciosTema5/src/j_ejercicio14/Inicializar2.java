package j_ejercicio14;

import java.util.Arrays;

//inicializar matriz compleja: inicializar todas las filas pares a 0 y las impares a -1

public class Inicializar2 {
	private int[][] matriz = new int[10][10];
	
	public void muestra() {
		asignaNumero();
	}
	
	private void asignaNumero() {
		//i: filas
		//j: columnas
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				if(i % 2 == 0) {
					matriz[i][j] = 0;
				}
				else{
					matriz[i][j] = -1;
				}
			}
			
		}
	System.out.println(Arrays.deepToString(matriz));	
	}
	
	public static void main(String[] args) {
		Inicializar2 n = new Inicializar2();
		n.muestra();
	}
}
