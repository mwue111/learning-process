package i_ejercicio10_11;

import java.util.Arrays;

public class EnteroGigantePruebas {
//	private int[] num1 = new int[5];		//números de 100 dígitos, puesto a 5 para que sea más fácil de ver 
//	private int[] num2 = new int[5];
//	private int[] aux = new int[5];
	private static final int TAM = 30;		//en lugar de hacer lo anterior, define el tamaño y luego declara un array con ese tamaño
	private int[] num1 = new int[TAM];
	
	public EnteroGigantePruebas() {
		Arrays.fill(num1, 0);
		System.out.println(Arrays.toString(num1));
	}
	
	public EnteroGigantePruebas(String valor) {
		this.setValor(valor);
	}
	
	private void setValor(String valor) {										//Hace que el número introducido se convierta en un array
		int pos = TAM - 1;														//declara una variable que será la posición, del tamaño establecido menos 1			
		 
		Arrays.fill(num1, 0);													//rellena el array con 0
		for (int i = valor.length() - 1; i >= 0 ; i--) {						//recorre el valor introducido desde el final hasta el principio
			
			/*---------------------------DUDA AQUÍ---------------------------*/
			num1[pos] = valor.charAt(i);										//????		
			num1[pos] = Integer.parseInt(Character.toString(valor.charAt(i)));	//en cada iteración, la posición (tam - 1 = 29 hasta 0) coge la posición del valor con charAt(i), parsea de caracter a string primero y luego a entero (?)
			pos--;																//resta una posición
		}
		System.out.println(Arrays.toString(num1));								//se ve el valor introducido como string convertido a array
		
	}
	
	public static void main(String[] args) {
		EnteroGigantePruebas p = new EnteroGigantePruebas("123456789101112");
	}
}

/*coger todos los elementos del array gigante desde atrás hacia adelante multiplicando cada posición por 10 elevado a su posición:
 * 
 * 0000012578
 * sería 
 * 1 *10^4 + 2 * 10^3 + 5*10^2 + 7*10^1 + 8*10^0
 * 
 * int exponente = 0;
 * int resultado = 0;
 * 
 * for (i = num.length - 1; i >= 0; i--){
 * 	resultado += num[i] * Math.pow(10, exponente);	-- no se pone i porque i empieza desde 0 a 9, necesitamos que vaya a la inversa
 * 	exponente++;									-- en cada iteración se suma uno al exponente así que se van multiplicando por 10^0, 1, 2...
 * }
 * 
 * Syso(resultado);									-- así ya tenemos el array convertido en número con el que operar
 * */
