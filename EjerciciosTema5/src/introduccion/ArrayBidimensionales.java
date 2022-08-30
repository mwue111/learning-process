package introduccion;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.StringTokenizer;

public class ArrayBidimensionales {
	//matrices.
	
	public static void main(String[] args) {
		//DECLARACIÓN de arrays bidimensionales o matrices
			//1º fila, 2º columna
		int[][] matriz = new int[4][4];
												// 0  1  2  3
		matriz[0][0] = 3;						//|3 |  |  |  |0
		matriz[1][0] = 2;						//|2 |  |  |  |1
		matriz[3][2] = 1;						//|  |  |  |  |2
												//|  |  |1 |  |3
		
		System.out.println(matriz.length);		//número de filas de la matriz
		System.out.println(matriz[0].length);	//la fila 0 de la matriz tiene cuatro celdas
		
		//INICIALIZAR matriz
		int[][] m = new int[5][4];
		int i;									//filas
		int j;									//columnas
		
		for (i = 0; i < 5; i++) {				//un bucle recorre desde 0 a 5 todas las filas
			for(j = 0; j < 4; j++) {			//un bucle recorre desde 0 a 4 todas las columnas
				m[i][j] = 0;						//rellenan con 0 todos los valores
				System.out.println(m[i][j]);	//los muestra
			}
		}
		
		//COLECCIONES Y LISTAS
			//ArrayList: arrays dinámicos
			//no usa corchetes, para obtener los valores se usa get(i) en lugar de [i].
		ArrayList nuevoArray = new ArrayList();
		
		System.out.println("El tamaño del array es " + nuevoArray.size());			//no tiene nada, así que es 0
		nuevoArray.add("¡Hola!");
		nuevoArray.add(235);
		nuevoArray.add(2.7);
		nuevoArray.add('a');
		System.out.println("El nuevo tamaño del array es " + nuevoArray.size());	//ahora tiene cuatro elementos
		
		System.out.println(nuevoArray);
		
			//para especificar un tipo y que no se puedan mezclar:
		ArrayList<Integer> listaNumeros = new ArrayList<Integer>();
		listaNumeros.add(4);
		listaNumeros.add(45);
		listaNumeros.add(7654);
		listaNumeros.add(243);
		
		System.out.println(listaNumeros);
		
		ArrayList<Integer> listaNumeros2 = new ArrayList<Integer>();
		listaNumeros2.add(4);
		listaNumeros2.add(45);
		listaNumeros2.add(0, 7654);				//cambia a la posición 0 el número y desplaza a las demás
		listaNumeros2.add(243);
		
		System.out.println(listaNumeros2);
		
		System.out.println(listaNumeros2.get(3));						//devuelve el número en la posición 3
		System.out.println(listaNumeros2.remove(1));					//elimina el número en la posición 1 (el syso lo muestra)
		listaNumeros2.remove((Integer)7654);							//elimina el NUMERO 7654
		System.out.println("he borrado un numero" + listaNumeros2);		//muestra la lista sin el número en la posición 1
		
		//Para borrar todos los elementos de un array:
		
		/*
		 * public static void removeAll(Arraylist a, Integer e){
			 * while(a.contains(e)){
			 * 		a.remove(e);
			 * }
		 * }
		 * Se puede hacer con un bucle for también combinándolo con size() y con get(posicion).equals(e) y remove.
		 * */
		
			//para rellenar con valores random:
		ArrayList<Integer> otroArray = new ArrayList<Integer>();
		
		for(int k = 0; k < 10; k ++) {
			otroArray.add((int)(Math.random() * 500));
		}
		System.out.println(otroArray);
		
			//muestra el contenido del array
		for (int h = 0; h < 10; h ++) {
			System.out.println(otroArray.get(h));
		}
		
			//iteradores
		ArrayList<Integer> miArray = new ArrayList<Integer>();
		
		for (int rell = 0; rell <= 5; rell++) {
			miArray.add((int)(Math.random() * 10 + 1));
		}
		
		Iterator ejemploIt = miArray.iterator();
		while(ejemploIt.hasNext()) {
			System.out.println("Iterador: " + ejemploIt.next());
		}
		
		for (Integer elemento:miArray) {
			System.out.println("probando el for este raro de los dos puntos: " + elemento);
		}
		
		//CADENAS/STRINGS
			//arrays unidimensionales de caracteres
			//declaración
		char cadena[] = new char[11];
		
			//insertar valores:
		cadena[0] = 'H';
		cadena[1] = 'o';
		cadena[2] = 'l';
		cadena[3] = 'a';
		cadena[4] = ' ';
		cadena[5] = 'm';
		cadena[6] = 'u';
		cadena[7] = 'n';
		cadena[8] = 'd';
		cadena[9] = 'o';
		cadena[10] = '\0';

		System.out.println(cadena);
		
			//clase String
		String cad1 = "Hola";
		String cad2 = new String("Mundo");
		String cad3 = new String(cad2);				//inicializando con otro String
		
		System.out.println(cad1);
		System.out.println(cad2);
		System.out.println(cad3);
		System.out.println("compareTo: " + cad1.compareTo(cad3));
		
		System.out.println(cad1.toUpperCase());
		
		System.out.println(cad2.charAt(2));
		
			//StringBuffer
			//Métodos destructivos: los métodos actúan sobre el propio String y lo modifican.
			//StringTokenizer
		StringTokenizer str;
		str = new StringTokenizer("Frase no demasiado larga de ejemplo.");
		System.out.println("La cadena str tiene " + str.countTokens() + " elementos, y son: ");
		while (str.hasMoreTokens()) {
			System.out.println(str.nextToken());
		}		
	}
	
//********************************************************************************************************************
	
}
