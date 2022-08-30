package ejercicio3;

import java.util.Arrays;

//Programa que genera al azar una combinaci�n para la primitiva
//Se necesitan seis n�meros enteros
//los n�meros son entre 1 y 49
//debe comprobar que no se repitan n�meros

public class Primitiva {
	//inicia el array aqu�
	int[] primitiva = new int[6];
	
	//constructor
	public Primitiva() {
		asignaNumeros();									//el constructor llama al m�todo que asigna los n�meros al array, es con lo que construye objetos.
	}
	
	//primero un m�todo que comprueba si los n�meros est�n repetidos:
	private /*OJO: PRIVADO*/ boolean repetido(int valor) {	//no recibe un array, recibe un �valor!, que es lo que tenemos que comparar.
		boolean repetido = false;
		for (int i = 0; i < primitiva.length; i++) {
			if(primitiva[i] == valor) {						//si el VALOR de primitiva es igual al valor recibido
				repetido = true;{
					valor = (int)(Math.random() * 49) + 1;	//si el valor es repetido, volver a asignar un n�mero a valor.
				}
			}
		}
		return repetido;
	}
	
	private /*OJO: P�BLICO*/ void asignaNumeros() {
		int i;
		int valor;											//creo una variable en la que guardar los n�meros generados al azar
		for (i = 0; i < primitiva.length; i++) {
			do {
				valor = (int)(Math.random() * 49) + 1;		//asigno los n�meros al azar a la variable
				System.out.println(valor);					//imprimo ese n�mero, esto se har� hasta llegar al length de primitiva y...
			}
			while(repetido(valor));							//... y mientras que el m�todo repetido no me diga que hay n�meros repetidos
//			if(repetido(valor) == true) {					//esto lo hab�a puesto aqu� pero mejor que est� en el m�todo repetido, tiene m�s sentido.
//				valor = (int)(Math.random() * 49) + 1;	
//				}
			primitiva[i] = valor;							//cuando se cumpla todo eso, guardo en los valores del array el n�mero hasta primitiva.length
		}
	}
	
	//un m�todo para llamar desde el main que muestre el array generado ya ordenado:
	public /*OJO: P�BLICO*/ void mostrar() {
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

/*Quiero crear un array auxiliar para ordenarlo y que haga una b�squeda binaria para buscar valores repetidos y sustituirlos por otros valores aleatorios
 ***
 *P: c�mo s� que un valor est� repetido
 *R: asign�ndole a ese valor una variable de tipo int. Se hace en un m�todo aparte. Ten en cuenta que no estamos trabajando con arrays al comparar n�meros y ver si se repiten, estamos trabajando con valores independientes, n�meros enteros. Tienen que pasarnos un valor y tenemos que comparar ese valor con los que estamos generando con (int)(Math.random() * 49 + 1).
 *Hay que: crear un m�todo que reciba un entero para comprobar n�meros repetidos. Ser� un booleano, con una variable repetido inicializada a falsa (asumimos que no hay repetici�n)
 *En ese m�todo hay que crear un bucle for que recorra la longitud del array QUE HABREMOS DECLARADO EN LA CLASE, no en el main. Declararlo en la clase nos sirve para que todos los objetos que se creen tengan ya esa longitud y para que los bucles for sepan la longitud a recorrer.
 *El for recorrer� los �ndices del array declarado y comprobar� que el valor que nos han pasado se encuentra en alguna posici�n (primitiva[i]): DENTRO DEL FOR hay que poner un if. Si el valor es igual a primitiva[i], entonces repetido es verdadero. 
 *Listo, eso es lo que hace el m�todo: dice si el valor se encuentra en el array. Return repetido FUERA del bucle for.
 *
 ***
 *
 *P: c�mo asigno n�meros al array y quito los repetidos
 *R: El m�todo que generar� el array es p�blico para poder llamarlo desde el main. En �l tendremos un bucle for que recorrer� todo el array primitiva y declararemos una variable local "valor", por ejemplo, que ser� la que reciba los n�meros aleatorios. 
 *Declaramos "valor", escribimos el bucle for. DENTRO del for, hacemo un do... while: asignar n�meros aleatorios a "valor" siempre y cuando el m�todo que comprueba que los n�meros no est�n repetidos lo permita (repetido = false, o lo que es lo mismo, llamada al m�todo directamente ya que la variable booleana que contiene est� inicializada a falso).
 *Dentro del do, asignamos (int(Math.random() * 49 + 1) a "valor". Esto har� que en cada iteraci�n valor tenga un n�mero diferente. En el while se va comprobando que ese n�mero no est� repetido, y si lo est� hay que especificar que queremos que se genere otro, con un if a continuaci�n del while();, porque si no tendremos por consola arrays de 8 n�meros si dos de ellos est�n repetidos (los muestra).
 *A continuaci�n, hecho todo esto, asignamos a primitiva[i] la variable "valor" DENTRO DEL FOR, porque si no no estar�amos guardando los n�meros en el array en ning�n momento, s�lo estar�amos generando n�meros al azar.
 *
 ***
 *
 *P: el m�todo mostrar()
 *R: un m�todo con un Syso. Este, adem�s, tiene un Arrays.sort(primitiva) para ordenar el array de menor a mayor, sirve para que desde el main llamemos a este m�todo y au. Ahorra c�digo.
 ***
  */
