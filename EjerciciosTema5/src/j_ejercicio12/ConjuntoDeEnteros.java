package j_ejercicio12;

import java.util.Arrays;

/*
 * El usuario tecleará un número y el programa, utilizando los conjuntos, dirá si el número tecleado es par o impar.
 * 
 * */

public class ConjuntoDeEnteros implements Conjunto {
	private int[] elementos;					//se declara un array llamado elementos.
	private int size = 0;						//se declara el tamaño iniciándolo a 0
	private int pos;							//para decir en qué posición está el elemento	
	
	//se define en el constructor que los objetos de esta clase tendrán 10 elementos:
	public ConjuntoDeEnteros() {
		elementos = new int[5];
	}
	
	public void elementos() {
		System.out.println(Arrays.toString(elementos));
	}
	
	public int getSize() {
		return size;
	}
	
	//método para aumentar el tamaño del conjunto
	//tiene que haber un entero tamaño que esté declarado a 0 y que vaya aymentando al llamar a este método con un elemento e
	@Override
	public void insertarElemento(int e) {
		elementos[size] = e;					//el array elemento[tamaño] es igual al elemento que se introduce
		if(e % 2 == 00) {
			System.out.println("Has introducido un número par.");
		}
		else if (e % 2 != 0){
			System.out.println("Has introducido un número impar.");
		}
		else {
			System.out.println("¿Qué has introducido?");
		}
		size++;									//el tamaño aumenta a uno, refiriéndose a la cantidad de elementos que hay dentro (hasta 10, que es el tope)
	}

	@Override
	public void borrarElemento(int e) {
		/*elementos[size] = e;					//con esto no se está borrando el elemento seleccionado, se está reduciendo el tamaño del array (a saber qué elemento se está borrando, seguramente el último introducido)
		size--;*/
		if(esta(e) == 1) {											//si el elemento está en el array
			for (int i = pos; i < elementos.length - 1; i++) {		//empezando en la posición en la que se encuentra e
				elementos[i] = elementos[i + 1];					//a ese elemento en esa posición se le asigna el elemento de la posición siguiente
			}
		//	elementos[elementos.length - 1] = 0;
			size--;
		}
	}

	@Override
	public void vaciarConjunto() {
		Arrays.fill(elementos, 0);
		size = 0;
	}

	@Override
	public int esta(int e) {
		int contiene = 0;
	
		for (int i = 0; i < elementos.length; i++) {
			if(elementos[i] == e) {
				contiene = 1;
				pos = i;
			}
		}
		
		/* código de manolo con el while: 
		 * 
		while(i < elementos.length && contiene == 0) {
			if (elementos[i] == e) {
				contiene = 1;
				pos = i;	//pos es una variable declarada en la clase que indica la posición del elemento
			}
		}
		*/
		System.out.println(contiene);
		return contiene;
	}
	
	public static void main(String[] args) {
		ConjuntoDeEnteros i = new ConjuntoDeEnteros();
		//i.elementos();
		i.insertarElemento(2);
		i.insertarElemento(4);
		i.insertarElemento(3);
		i.elementos();
		i.esta(4);
		i.esta(8);
		i.borrarElemento(4);
		i.elementos();
		i.borrarElemento(2);
		i.elementos();
	}

}
