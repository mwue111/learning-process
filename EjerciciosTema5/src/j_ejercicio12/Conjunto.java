package j_ejercicio12;

/*conjunto: tipo de dato complejo como array pero sin ordenar. La posición que ocupa cada dato en la estructira no es importante, sólo importa saber si un dato está o no en la estructura.
 * 
 * Con los datos de tipo conjunto sólo se pueden hacer cuatro operaciones:
 * 1. insertarElemento(e): añade un nuevo elemento e al conjunto.
 * 2. borrarElemento(e): saca el elemento e del conjunto.
 * 3. vaciarConjunto(): borra todos los elementos del conjunto.
 * 4. esta(e): comprueba si el elemento e está en el conjunto. Devuelve 1 si sí, 0 si no.
 * 
 * a). Escribir una *interfaz* conjunto con estos cuatro métodos. Implementarlo luego en dos clases: ConjuntoDeCaracteres y ConjuntoDeEnteros.
 * 
 * b). Escribir un programa que demuestre que el conunto funciona. 
 * Construir dos conjuntos, uno con las letras minúsculas del alfabeto y otro con las mayúsculas incluyendo la ñ. 
 * El usuario tecleará una letra y el progama, utilizando los conjuntos, dirá si la letra tecleada es minúscula o amyúscula. 
 * Construir dos conjuntos, uno con números pares y otro con números impares.
 * El usuario tecleará un número y el programa, utilizando los conjuntos, dirá si el número tecleado es par o impar.
 * 
 * */

//en clase se ha hecho con int, ¿es distinto a hacerlo con char o daría lo mismo (porque se puede parsear luego)?
//se parsea a char y funciona igual.
public interface Conjunto {
	
	//método que añade un nuevo elemento e al conjunto
	public void insertarElemento(int e);
	
	//método que saca un elemento del conjunto
	public void borrarElemento(int e);
	
	//método que borra todos los elementos del conjunto
	public void vaciarConjunto();
	
	//método que comprueba si el elemento está o no en el conjunto
	//¿No es boolean? no da true o false, da 0 o 1. Ateniendonos al enunciado, no es boolean (pero podría)
	public int esta(int e);

}
