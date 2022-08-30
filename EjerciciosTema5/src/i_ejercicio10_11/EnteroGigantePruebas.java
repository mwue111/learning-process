package i_ejercicio10_11;

import java.util.Arrays;

public class EnteroGigantePruebas {
//	private int[] num1 = new int[5];		//n�meros de 100 d�gitos, puesto a 5 para que sea m�s f�cil de ver 
//	private int[] num2 = new int[5];
//	private int[] aux = new int[5];
	private static final int TAM = 30;		//en lugar de hacer lo anterior, define el tama�o y luego declara un array con ese tama�o
	private int[] num1 = new int[TAM];
	
	public EnteroGigantePruebas() {
		Arrays.fill(num1, 0);
		System.out.println(Arrays.toString(num1));
	}
	
	public EnteroGigantePruebas(String valor) {
		this.setValor(valor);
	}
	
	private void setValor(String valor) {										//Hace que el n�mero introducido se convierta en un array
		int pos = TAM - 1;														//declara una variable que ser� la posici�n, del tama�o establecido menos 1			
		 
		Arrays.fill(num1, 0);													//rellena el array con 0
		for (int i = valor.length() - 1; i >= 0 ; i--) {						//recorre el valor introducido desde el final hasta el principio
			
			/*---------------------------DUDA AQU�---------------------------*/
			num1[pos] = valor.charAt(i);										//????		
			num1[pos] = Integer.parseInt(Character.toString(valor.charAt(i)));	//en cada iteraci�n, la posici�n (tam - 1 = 29 hasta 0) coge la posici�n del valor con charAt(i), parsea de caracter a string primero y luego a entero (?)
			pos--;																//resta una posici�n
		}
		System.out.println(Arrays.toString(num1));								//se ve el valor introducido como string convertido a array
		
	}
	
	public static void main(String[] args) {
		EnteroGigantePruebas p = new EnteroGigantePruebas("123456789101112");
	}
}

/*coger todos los elementos del array gigante desde atr�s hacia adelante multiplicando cada posici�n por 10 elevado a su posici�n:
 * 
 * 0000012578
 * ser�a 
 * 1 *10^4 + 2 * 10^3 + 5*10^2 + 7*10^1 + 8*10^0
 * 
 * int exponente = 0;
 * int resultado = 0;
 * 
 * for (i = num.length - 1; i >= 0; i--){
 * 	resultado += num[i] * Math.pow(10, exponente);	-- no se pone i porque i empieza desde 0 a 9, necesitamos que vaya a la inversa
 * 	exponente++;									-- en cada iteraci�n se suma uno al exponente as� que se van multiplicando por 10^0, 1, 2...
 * }
 * 
 * Syso(resultado);									-- as� ya tenemos el array convertido en n�mero con el que operar
 * */
