package j_ejercicio13;

import java.util.Arrays;

//inicializar una matriz simple. Definir una matriz de 10x10 int, inicializarlos todos a -1.

public class Inicializar {
	private int[][] matriz = new int[10][10];
	
	public void muestra() {
		asignaNumero();
	}
	
	private void asignaNumero() {
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				matriz[i][j] = -1;
			}
		}
		System.out.println(Arrays.deepToString(matriz)); //con esto se imprime pero en una sola línea, para imprimirlo formateado usar un for-each.
		
	}
	
	public static void main(String[] args) {
		Inicializar n = new Inicializar();
		n.muestra();
	}

}
