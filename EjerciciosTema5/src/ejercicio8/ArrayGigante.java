package ejercicio8;

import java.util.Arrays;

// programa que cree un array gigante inicializ�ndolo con n�meros al azar. 
// ordena el array con cada uno de los tres m�todos de ordenaci�n de los apuntes. Contabilizar el tiempo que tarda: clase cron�netro.
// Mostrar en pantalla el resultado de las mediciones, ver diferencias. 

public class ArrayGigante {
	private int[] gigante = new int[10];
	
	private void asignaNumeros() {
		int i;
		for (i = 0; i < gigante.length; i++) {
			gigante[i] = (int)(Math.random() * 1000 + 1);
		}
		System.out.println(Arrays.toString(gigante));
	}
	
	private void burbuja() {	//copiado tal cual de los apuntes
		int i;
		int j;
		int elem;
		for (i = 1; i < gigante.length; i++) {			//Por cada recorrido que se haga desde la primera posici�n hasta el final...
			for(j = gigante.length - 1; j >= i; j--) {	//... recorre con j empezando desde el final hasta el principio. 
				if (gigante[j - 1] > gigante[j]) {		//si la posici�n j es menor que la posici�n anterior...
					elem = gigante[j - 1];				//... entonces guardamos en elem la posici�n mayor
					gigante[j - 1] = gigante[j];		// entonces asignamos la variable menor a la mayor...
					gigante[j] = elem;					//... y asignamos la posici�n mayor en la que deber�a ser mayor.
				}		
			}
		}
		System.out.println("Array ordenado con Burbuja: " + Arrays.toString(gigante));
	}
	
	private void seleccionDirecta() {
		int i;
		int j;
		int minimo;
		int posicionMinimo;
		for (i = 0; i < gigante.length; i++) {			//Por cada recorrido que se haga desde 0 hasta el final del array...
			minimo = gigante[i];						//... se guarda en m�nimo cada valor del array...
			posicionMinimo = i;							//... se guarda en posicionMinimo cada *posici�n* del array...
			for (j = i + 1 ; j < gigante.length; j++) {	//... a continuaci�n se recorre desde la posici�n de i + 1 del array (i = 0, j = 1) 
				if (gigante[j] < minimo) {				//si la posici�n en este bucle es menor que el valor m�nimo que se ha ido guardando...
					minimo = gigante[j];				//... se sustituye el valor guardado por ese nuevo, que es m�s peque�o que el que estaba recorriendo.
					posicionMinimo = j;					//Y se actualiza la posici�n m�nima a j 
				}
			}
			gigante[posicionMinimo] = gigante[i];		//una vez acaba de recorrer con j, se asigna al valor en la posici�n m�nima el valor que est� en i mientras se va recorriendo el array con el for, la posici�n m�nima es j, no i; se ha cambiado en el for de j.
			gigante[i] = minimo;						//
		}
		
		System.out.println("Array ordenado con Selecci�n Directa: " + Arrays.toString(gigante));
	}
	
	private void quicksort(int izq, int der) {	//Duda: c�mo llamo a este m�todo si requiere par�metros formales y el array no est� iniciado.
												//no pide los n�meros del array, pide las posiciones
		int i;
		int j;
		int x;
		int w;

		i = izq;
		j = der;
		x = gigante[(izq + der) / 2];		//pivote
		
		do {
			while (gigante[i] < x) i++;		//mientras que la posici�n de la izquierda sea menor que x, avanzar una posici�n (ir desde el principio hasta el final)
			while (x < gigante[j]) j--;		//mientras que la posici�n de la derecha sea mayor que x, retroceder una posici�n (ir del final al principio)
			if(i <= j) {					//si la posici�n de la izquierda es mayor o igual que la de la derecha: si a�n no se han cruzado en x
				w = gigante[i];				//esa posici�n se guarda en w
				gigante[i] = gigante[j];	//se asigna a la posici�n de la izquierda el valor de la derecha
				gigante[j] = w;				//se guarda w en la posici�n de la derecha (w era la posici�n de la izquierda)
				i++;						//se aumenta una posici�n de i: se avanza hacia el final
				j--;						//se retrocede una posici�n de j: se va hacia el principio
			}
		}while(i <= j);						//todo esto mientras que la posici�n de la izquierda sea menor que la de la derecha: no se han cruzado en el pivote						
		
		w = gigante[i];						//se asigna a w el valor de la izquierda
		gigante[i] = gigante[der];			//se intercambian posiciones: el de la derecha se guarda en la posici�n de la izquierda
		gigante[der] = w;					//se guarda la posici�n de la izquierda en la de la derecha
		
		if(izq > j) quicksort(izq, j);		//llamada recursiva
		if(i < der) quicksort(i, der);
		
		System.out.println("Array ordenado con quicksort: " + Arrays.toString(gigante));
	}
	
	
	
//***************************************************************************************************************************
	public static void main(String[] args) {
		ArrayGigante prueba = new ArrayGigante();
		prueba.asignaNumeros();
		prueba.burbuja();
		prueba.seleccionDirecta();
		prueba.quicksort(0, 9);		//pide dos enteros que son las posiciones del array.		
	}

}
