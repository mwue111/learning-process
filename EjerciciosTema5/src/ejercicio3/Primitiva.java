package ejercicio3;

import java.util.Arrays;

//Programa que genera al azar una combinación para la primitiva
//Se necesitan seis números enteros
//los números son entre 1 y 49
//debe comprobar que no se repitan números

public class Primitiva {
	//inicia el array aquí
	int[] primitiva = new int[6];
	
	//constructor
	public Primitiva() {
		asignaNumeros();									//el constructor llama al método que asigna los números al array, es con lo que construye objetos.
	}
	
	//primero un método que comprueba si los números están repetidos:
	private /*OJO: PRIVADO*/ boolean repetido(int valor) {	//no recibe un array, recibe un ¡valor!, que es lo que tenemos que comparar.
		boolean repetido = false;
		for (int i = 0; i < primitiva.length; i++) {
			if(primitiva[i] == valor) {						//si el VALOR de primitiva es igual al valor recibido
				repetido = true;{
					valor = (int)(Math.random() * 49) + 1;	//si el valor es repetido, volver a asignar un número a valor.
				}
			}
		}
		return repetido;
	}
	
	private /*OJO: PÚBLICO*/ void asignaNumeros() {
		int i;
		int valor;											//creo una variable en la que guardar los números generados al azar
		for (i = 0; i < primitiva.length; i++) {
			do {
				valor = (int)(Math.random() * 49) + 1;		//asigno los números al azar a la variable
				System.out.println(valor);					//imprimo ese número, esto se hará hasta llegar al length de primitiva y...
			}
			while(repetido(valor));							//... y mientras que el método repetido no me diga que hay números repetidos
//			if(repetido(valor) == true) {					//esto lo había puesto aquí pero mejor que esté en el método repetido, tiene más sentido.
//				valor = (int)(Math.random() * 49) + 1;	
//				}
			primitiva[i] = valor;							//cuando se cumpla todo eso, guardo en los valores del array el número hasta primitiva.length
		}
	}
	
	//un método para llamar desde el main que muestre el array generado ya ordenado:
	public /*OJO: PÚBLICO*/ void mostrar() {
		Arrays.sort(primitiva);
		System.out.println("El mismo array pero ordenado es: " + Arrays.toString(primitiva));
	}

//***************************************************************************************************
	//PrimitivaApp
	public static void main(String[] args) {
		Primitiva nuevo = new Primitiva();
		nuevo.mostrar();
		
		}
	
}

/*Quiero crear un array auxiliar para ordenarlo y que haga una búsqueda binaria para buscar valores repetidos y sustituirlos por otros valores aleatorios
 ***
 *P: cómo sé que un valor está repetido
 *R: asignándole a ese valor una variable de tipo int. Se hace en un método aparte. Ten en cuenta que no estamos trabajando con arrays al comparar números y ver si se repiten, estamos trabajando con valores independientes, números enteros. Tienen que pasarnos un valor y tenemos que comparar ese valor con los que estamos generando con (int)(Math.random() * 49 + 1).
 *Hay que: crear un método que reciba un entero para comprobar números repetidos. Será un booleano, con una variable repetido inicializada a falsa (asumimos que no hay repetición)
 *En ese método hay que crear un bucle for que recorra la longitud del array QUE HABREMOS DECLARADO EN LA CLASE, no en el main. Declararlo en la clase nos sirve para que todos los objetos que se creen tengan ya esa longitud y para que los bucles for sepan la longitud a recorrer.
 *El for recorrerá los índices del array declarado y comprobará que el valor que nos han pasado se encuentra en alguna posición (primitiva[i]): DENTRO DEL FOR hay que poner un if. Si el valor es igual a primitiva[i], entonces repetido es verdadero. 
 *Listo, eso es lo que hace el método: dice si el valor se encuentra en el array. Return repetido FUERA del bucle for.
 *
 ***
 *
 *P: cómo asigno números al array y quito los repetidos
 *R: El método que generará el array es público para poder llamarlo desde el main. En él tendremos un bucle for que recorrerá todo el array primitiva y declararemos una variable local "valor", por ejemplo, que será la que reciba los números aleatorios. 
 *Declaramos "valor", escribimos el bucle for. DENTRO del for, hacemo un do... while: asignar números aleatorios a "valor" siempre y cuando el método que comprueba que los números no estén repetidos lo permita (repetido = false, o lo que es lo mismo, llamada al método directamente ya que la variable booleana que contiene está inicializada a falso).
 *Dentro del do, asignamos (int(Math.random() * 49 + 1) a "valor". Esto hará que en cada iteración valor tenga un número diferente. En el while se va comprobando que ese número no esté repetido, y si lo está hay que especificar que queremos que se genere otro, con un if a continuación del while();, porque si no tendremos por consola arrays de 8 números si dos de ellos están repetidos (los muestra).
 *A continuación, hecho todo esto, asignamos a primitiva[i] la variable "valor" DENTRO DEL FOR, porque si no no estaríamos guardando los números en el array en ningún momento, sólo estaríamos generando números al azar.
 *
 ***
 *
 *P: el método mostrar()
 *R: un método con un Syso. Este, además, tiene un Arrays.sort(primitiva) para ordenar el array de menor a mayor, sirve para que desde el main llamemos a este método y au. Ahorra código.
 ***
  */
