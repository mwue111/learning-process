package ejercicio6;

import java.util.Arrays;

//programa que defina un array de un millón de números enteros aleatorios entre 0 y 2000000.
//que ordene los elementos del array de menor a mayor.
//sin sort

public class Ordena {
	public int[] grande = new int[10];
	
	public Ordena() {
		asignaNumeros();		//muestra el array sin ordenar
		mostrar();				//muestra el array ordenado
	}
	
	public int[] getArray() {
		return grande;
	}
	
	private void asignaNumeros() {
		int i;
		for(i = 0; i < grande.length; i++) {
			grande[i] = (int)(Math.random() * 2000 + 1);
		}
	}
	
	public void ordenaNumeros() {
		int mayor = Integer.MIN_VALUE;	//20
		int menor = Integer.MAX_VALUE;
		int posicionMenor = 0;
		int[] aux = new int[10];
		int i;
		int j;
		//int pos = 0;										//PROFESOR: para guardar de manera sucesiva en aux, crear una variable posición que inicie en 0. En cada iteración será uno más. ¿Para qué tengo un i en for entonces?
			for(i = 0; i < aux.length; i++) {				//Este bucle recorre el array auxiliar, que está vacío.
					for(j = 0; j < grande.length; j++) {	//Este bucle recorre el array generado con números aleatorios
						//System.out.println("menor: " + menor);
						if(grande[j] < menor) {				//si en el array grande el valor que se encuentra en la posición j es menor que la variable menor, se 														guarda en la variable. De esta manera nos quedamos con el número más pequeño. Guardamos también su índice.
							menor = grande[j];
							posicionMenor = j;		
							//System.out.println("menor es " + menor);
							//System.out.println("j (y posicionMenor) son " + j);
							
						}//acaba if dentro del for grande	
					
					}//acaba for grande[j]
			grande[posicionMenor] = Integer.MAX_VALUE;//pone el mayor valor posible en la posición j de grande
			//System.out.println(Arrays.toString(grande));
			aux[i] = menor;
			menor = Integer.MAX_VALUE;
			//aux[pos] = menor;
			//pos++;
			}//acaba for aux
			
		/*Qué ocurre:
		 * el for de aux tiene que recorrer el array grande, guardar el valor más pequeño, sustituirlo por el valor más grande y repetir con el siguiente valor más pequeño. 
		 * En este momento, está recorriendo el array grande, guardando el valor más pequeño, lo está sustituyendo por el valro más grande y está asignando a cada elemento del array aux el valor más pequeño sin continuar la ejecución. No está descartando el valor grande para seguir, está recorriendo el bucle sólo una vez.

		 * Tengo que:
		 * guardar grande[j] en el array aux en la posición aux[0].
		 * sustituir el valor grande[j] en la posición j por integer.max_value para descartarlo  
		 * 
		 * RESPUESTA:
		 * Lo que estaba pasando era que no estaba reseteando la variable menor con lo cual al entrar al bucle for de nuevo estaba comparando continuamente con el menor número que había en el array, ergo no había otro menor, ergo no cabía más cambio que el que ya había hecho. 
		 * Solución:
		 * Asignar a menor el valor máximo otra ves una vez hayamos asignado esa variable a cada posición de aux. Así, al entrar al bucle, volverá a comparar con el número más grande.
		 * */		
			//System.out.println("El array grande es " + Arrays.toString(grande));
			System.out.println("El array ya ordenado es " + Arrays.toString(aux));
		
		
	}
	
	private void mostrar() {
		System.out.println("El array es " + Arrays.toString(grande));
	}
//*********************************************************************************************************************
	public static void main(String[] args) {
		Ordena entrada = new Ordena();
		entrada.ordenaNumeros();
	}
}


/*int i;
int izq = grande[0];
int der = grande[9];
int medio = grande[4];
System.out.println("izq es " + izq);
System.out.println("der es " + der);
System.out.println("el valor medio es " + medio);
 * 
 * for (i = 0; i < grande.length; i++) {
	if(izq < medio) {
		izq = grande[1];
		System.out.println("grande[1] es " + izq);
	}
}

*O con un do while: 
*for (i = 0; i < grande.length; i++) {
	do {
		izq = grande[i];
		System.out.println("izq dentro del do es " + izq);
	}while(izq < medio);	
	System.out.println("izq dentro del for es " + izq);
	
}
*/
