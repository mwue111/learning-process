package ejercicio8;

import java.util.Arrays;

// programa que cree un array gigante inicializándolo con números al azar. 
// ordena el array con cada uno de los tres métodos de ordenación de los apuntes. Contabilizar el tiempo que tarda: clase cronónetro.
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
		for (i = 1; i < gigante.length; i++) {			//Por cada recorrido que se haga desde la primera posición hasta el final...
			for(j = gigante.length - 1; j >= i; j--) {	//... recorre con j empezando desde el final hasta el principio. 
				if (gigante[j - 1] > gigante[j]) {		//si la posición j es menor que la posición anterior...
					elem = gigante[j - 1];				//... entonces guardamos en elem la posición mayor
					gigante[j - 1] = gigante[j];		// entonces asignamos la variable menor a la mayor...
					gigante[j] = elem;					//... y asignamos la posición mayor en la que debería ser mayor.
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
			minimo = gigante[i];						//... se guarda en mínimo cada valor del array...
			posicionMinimo = i;							//... se guarda en posicionMinimo cada *posición* del array...
			for (j = i + 1 ; j < gigante.length; j++) {	//... a continuación se recorre desde la posición de i + 1 del array (i = 0, j = 1) 
				if (gigante[j] < minimo) {				//si la posición en este bucle es menor que el valor mínimo que se ha ido guardando...
					minimo = gigante[j];				//... se sustituye el valor guardado por ese nuevo, que es más pequeño que el que estaba recorriendo.
					posicionMinimo = j;					//Y se actualiza la posición mínima a j 
				}
			}
			gigante[posicionMinimo] = gigante[i];		//una vez acaba de recorrer con j, se asigna al valor en la posición mínima el valor que está en i mientras se va recorriendo el array con el for, la posición mínima es j, no i; se ha cambiado en el for de j.
			gigante[i] = minimo;						//
		}
		
		System.out.println("Array ordenado con Selección Directa: " + Arrays.toString(gigante));
	}
	
	private void quicksort(int izq, int der) {	//Duda: cómo llamo a este método si requiere parámetros formales y el array no está iniciado.
												//no pide los números del array, pide las posiciones
		int i;
		int j;
		int x;
		int w;

		i = izq;
		j = der;
		x = gigante[(izq + der) / 2];		//pivote
		
		do {
			while (gigante[i] < x) i++;		//mientras que la posición de la izquierda sea menor que x, avanzar una posición (ir desde el principio hasta el final)
			while (x < gigante[j]) j--;		//mientras que la posición de la derecha sea mayor que x, retroceder una posición (ir del final al principio)
			if(i <= j) {					//si la posición de la izquierda es mayor o igual que la de la derecha: si aún no se han cruzado en x
				w = gigante[i];				//esa posición se guarda en w
				gigante[i] = gigante[j];	//se asigna a la posición de la izquierda el valor de la derecha
				gigante[j] = w;				//se guarda w en la posición de la derecha (w era la posición de la izquierda)
				i++;						//se aumenta una posición de i: se avanza hacia el final
				j--;						//se retrocede una posición de j: se va hacia el principio
			}
		}while(i <= j);						//todo esto mientras que la posición de la izquierda sea menor que la de la derecha: no se han cruzado en el pivote						
		
		w = gigante[i];						//se asigna a w el valor de la izquierda
		gigante[i] = gigante[der];			//se intercambian posiciones: el de la derecha se guarda en la posición de la izquierda
		gigante[der] = w;					//se guarda la posición de la izquierda en la de la derecha
		
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
