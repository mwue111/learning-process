package introduccion;

import java.util.Arrays;
import java.util.Scanner;

public class arraysIntroduccion {
	
	public static void main(String[] args) {
		
			//Array unidimensional = vector
			//Array est�tico: se define su tama�o al inicializarse y no se puede cambiar despu�s.
		
		//DECLARACI�N del array:
		
		int array1[]; 
			//int[] array1;
		
			//se declaran como objetos:
		array1 = new int[5];
		
			//puede ser en una l�nea o en dos, si se hacen en dos:
			//int[] array1 = new int[5]; <-- crea el array con el TIPO.
		
			//array1 ahora tiene 5 n�meros enteros (no sabemos cu�les).
		
		//ACCESO a los n�meros del array determin�ndolos a mano (asignar valores):
		
			//array1[0] = ?;
			//array1[1] = ?;
		array1[2] = 20;						//posici�n 3 
		array1[3] = 15;						//posici�n 4
		array1[4] = array1[2] + array1[3];	//posici�n 5
		
		System.out.println("El cuarto elemento del array es " + array1[4]);
		
		//OPERACIONES con arrays unidimensionales
		
			//**en arrays unidimensionales no se pueden modificar todos los elementos a la vez**
			//asignaci�n de valores al declarar el array:
		
		int[] array2 = {20, 5, 80, 6, 78, 52};
		
		System.out.println("El tercer elemento del array2 es " + array2[3]);
		
			//asignar valores a los �ndices por teclado:
		
		Scanner sc = new Scanner(System.in);
		int[] array3 = new int[7];
		System.out.println("Escribe un n�mero para establecer el primer elemento del array: ");
		int entrada = sc.nextInt(); 
				
		array3[0] = entrada;
		array3[1] = array3[0] + 15;
		System.out.println("El elemento en la segunda posici�n del array3 es " + array3[1]);
		
			//recorrido de un array:
		
		int[] array4 = new int[10];
		
			//inicializar todos los valores con un for:
		for (int i = 0; i <= 9; i++) { //o i = 1; i < 10; i++
			array4[i] = 5;
			System.out.println(array4[i]);
		}
		
			//inicializar valores introduciendo por teclado:
		int[] array5 = new int[4];
		
		for (int j = 0; j <= 3; j++) {
			System.out.println("Escriba un n�mero: ");
			array5[j] = sc.nextInt();	
		}
		System.out.println("el elemento 3 es " + array5[2]);
		
			//mostrar todos los elementos en pantalla:
		double[] array6 = {1.0, 2.0, 3.0};
		
		for (int k = 0; k <= 2; k++) {
			System.out.println(array6[k]);
		}
		
			//sumar todos los elementos del array:
		int suma = 0;
		for (int l = 0; l <= 9; l++) {
			suma += array4[l];
		}
		System.out.println("La suma de los n�meros en el array4 es " + suma);
		
	//***************M�TODOS DE ORDENACI�N Y B�SQUEDA: SIGUE FUERA DE MAIN (ABAJO)***************
		
			//pasar arrays como par�metros:
			//el m�todo llamado "metodo" no existe. 
		int[] serie = new int[15];
		
		metodo(serie);
		
			//m�todos
			//equals(): ejemplo con dos atributos. Para comparar.
			//Por si hay que sobreescribir equals y clone:
		
			/*public boolean equals(arraysIntroduccion nuevo){
			 	boolean result;
			 	result = getNom().equals(nuevo.getNom()) && getEdad() == nuevo.getEdad();
			 	return result;			 
			 }*/
		
			//clone(): sobreescrito. Para duplicar. En unidimensionales crea un objeto nuevo.
			/*public arraysIntroduccion clon(){
			 	arraysIntroduccion clon = new arraysIntroduccion();
			 	return clon;			 
			 }*/
		
		arraysIntroduccion ejemplo = new arraysIntroduccion();
		
		byte[] v1 = {100, 67, 3};
		byte[] v2 = (byte[]) v1.clone();
		byte[] v3 = v1;
		
		System.out.println(v1.equals(v2));		//v1 y v2 no son iguales: son dos objetos distintos.
		System.out.println(v1.equals(v3));		//v1 y v3 apuntan a la misma zona de memoria: son el mismo objeto.
		System.out.println("El equals de Array compara v1 y su clon y da: " + Arrays.equals(v1, v2));
		Arrays.sort(v1);
		ejemplo.mostrarV1(v1);
			//length: para devolver el n�mero de elementos del array. Atributo.
			//sort(): para ordenar el array. Puede ser por partes.
			//fill(): para rellenar de valores el array.
			//binarySearch(): para hacer b�squeda binaria.
		
		
		int[] nuevo= new int[8];
		
		/*for (int i = 0; i < 8; i++) {
			nuevo[i] = -1;
			System.out.println(nuevo[i]);
		}*/
		
		Arrays.fill(nuevo, -1);
		System.out.println(nuevo[7]);
		
		sc.close();
		}
	

//*******************************************************************************************************************	
	
	//ORDENAR arrays unidimensionales
	
		//m�todo de burbuja

	int[] burbuja = {3, 2, 1, 6, 10};
	public void ordenaArray(int v[]){
		int i;
		int j; 
		int elem;
		
		for (i = 1; i < 5; i++) {		//recorre el array desde 1 a 5
			for (j = 4; j >= i; j--) {	//recorre el array desde el �ltimo elemento al primero
				if(v[j - i] > v[j]) {	//si la resta del �ltimo elemento con el primero es mayor que el �ltimo elemento
					elem = v[j - i];	//se guarda ese �ltimo elemento en elem
					v[j - i] = v[j];	//se guarda el �ltimo elemento (el que est� m�s a la derecha) en j - i
					v[j] = elem;		//se guarda elem en la �ltima posici�n
				//(10 - 3) > 5 --> 7 > 5
				//elem = 7
				//7 = 10 (ahora [j-i] vale 10)
				//10 = elem
				}
			}
		}
	}
	
		/*es con for anidados porque necesitamos que un bucle recorra desde la primera posici�n
		 * hasta la �ltima y, al mismo tiempo, otro bucle recorra desde la �ltima posici�n
		 * hasta la primera para ir comparando los n�meros que est�n en cada una de ellas
		 * y as� ir orden�ndolos.*/
	
		//selecci�n directa
	
	int[] seleccionDirecta = {8, 5, 7 , 6 ,1};
	
	public void ordenaArray2(int v[]) {
		int i; 
		int j; 
		int minimo;
		int posicionMinimo;
		
		for(i = 0; i <= 4; i++) {
			minimo = v[i];				//se asigna a minimo el valor actual de i (0, 1, 2...): empezar� por 0.
			posicionMinimo = i;			//en posici�nMinimo se guarda la posici�n en la que estamos (0, 1, 2...)
			for(j = i + 1; j <= 4; j++) {//empezando por 1 hasta 4 se busca el n�mero m�s peque�o
				if (v[j] < minimo) {	//si el n�mero en la posici�n j es menor que el n�mero actual (v[i])
					minimo = v[j];		//se sustituye i por j
					posicionMinimo = j;	//se guarda ese n�mero en posicionMinimo, es decir, en la posici�n actual					
				}
		
			}
		v[posicionMinimo] = v[i];		//se guarda en posicionMinimo el valor de i
		v[i] = minimo;					//se sustituye v por el m�nimo
		
		/*for(i = 0; i <= 4; i++){
		 minimo = 8;
		 *posicionMinimo = 0;
		 *	 *for (j = 1; j <= 4; j++){
		 *		if (5 < 8){
		 *		minimo = 5;
		 *		posicionMinimo = 0;
		 *	}
		 *}
		 *v[0] = 5;
		 *5 = minimo; 
		 *}*/
		}
	}
	
		/*Se necesitan dos bucles for para que uno vaya guardando el primer elemento que encuentra y que el otro
		 * compare el segundo elemento con ese primer elemento y lo sistituya si es menor.*/
	
		//Quicksort
	
	int[] quicksort = {2, 8, 6, 7, 21};
	
	public void ordenaArray3(int izq, int der) {
		int i;
		int j; 
		int x; 
		int w;								//variable auxiliar
		
		i = izq;							//i ser� la izquierda
		j = der;							//j ser� la derecha
		x = quicksort[(izq + der) / 2];		//x ser� la posici�n media del array
		
		do {
			while (quicksort[i] < x) {		//mientras que la posici�n actual izquierda del array sea menor que la media
				i++;						//se suma uno a i (izquierda)
			}
			while (x < quicksort[j]) {		//mientras que la media sea menor que la posici�n derecha del array
				j++;						//se suma uno a j (derecha)
			}
			
			if (i <= j) {					//si izquierda es menor o igual que derecha: si se cruzan los extremos
				w = quicksort[i];			//se guarda en w (aux) la posici�n izquierda actual del array 
				quicksort[i] = quicksort[j];//se machaca la posici�n izquierda actual y se cambia por la derecha
				quicksort[j] = w;			//se guarda en esa posici�n derecha el valor de x
				i++;						//se suma una posici�n a la variable izquierda
				j++;						//se suma una posici�n a la variable derecha
			}
		}
		while(i <= j);						//todo esto se hace mientras no se crucen los extremos
		
		w = quicksort[i];
		quicksort[i] = quicksort[der];
		quicksort[der] = w;
		
		//llamada recursiva: se llama al mismo m�todo.
		if(izq < j) ordenaArray3(izq, j);	//si izquierda es menor que el puntero derecho es que el puntero derecho no ha alcanzado el extremo izquierdo.
											//se repite todo el proceso con el trozo comprendido entre el extremo izquierdo y el puntero derecho.
		if(i < der) ordenaArray3(i, der);	//si el puntero izquierdo no ha alcanzado el extremo derecho igual:
											//se reptire el proceso con el trozo comprendido entre el extremo derecho y el puntero izquierdo.
	
	}
	
	//B�SQUEDAS en arrays unidimensionales
	
		//b�squeda secuencial
		//recorrer el array desde el primer elemento al �ltimo.

	int[] array7 = {13, 28, 86, 35, 71};
	public int buscar(int array[], int dato) {
		int i = 0;
		int x = -1;
		
		while ((i < 5) && (x == -1)) {		//hasta 5 y siempre que x sea -1:
			if (array7[i] == dato)			//si en el array est� el dato introducido
				x = i;						//guardarlo en x (dejar�a de ser -1)
				i++;						//sumar uno a i (una posici�n)
		}									//si no se encuentra, sigue hasta que se localice.
		
		return x;							//devuelve el dato.
	}
	
		//b�squeda binaria
		//requiere que el array est� ordenado.
	
	int[] array8 = {20, 30, 50, 90, 800};
	public void buscaBinario(int v[], int busca) {
		int izq;
		int der;
		int mitad;
		int encontrado;
		
		encontrado = 0;						//no hay dato encontrado
		izq = 0;							//la primera posici�n
		der = 5 - 1;						//porque la longitud del array es 5, y empieza en 0: lo m�s a la derecha es la posici�n 4.
		
		while ((izq < der - 1) && (encontrado == 0)) {
			mitad = izq + ((der - izq) / 2);//esto calcula la media conforme se va moviendo de posiciones
			if (v[mitad] == busca) {		//si el valor que est� en la posici�n de mitad es igual al dato que se busca
				encontrado = 1;
			}
			if (v[mitad] < busca) {			//si el valor en la mitad es MENOR que el dato
				izq = mitad;				//se asigna a la variable izq el valor de la mitad (se cambia)
			}
			if (v[mitad] > busca) {			//si el valor en la mitad es MAYOR que el dato
				der = mitad;				//se asigna a la variable der el valor de la mitad
			}
			
			if (encontrado == 1) {			//si sale del bucle (primer if), imprimir el valor mitad.
				System.out.println(mitad);
			}
			else							//si no se encuentra, devolver un -1.
				System.out.println(-1);
		}
	}
	
	public static void metodo(int v[]) {
		System.out.println("Hola, soy un m�todo.");
	}
	
	public void mostrarV1(byte[] n) {
		for (int it = 0; it <3; it++) {
			System.out.println(n[it]);
		}
	}
	
}

