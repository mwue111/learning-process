package j_ejercicio12;

/*conjunto: tipo de dato complejo como array pero sin ordenar. La posici�n que ocupa cada dato en la estructira no es importante, s�lo importa saber si un dato est� o no en la estructura.
 * 
 * Con los datos de tipo conjunto s�lo se pueden hacer cuatro operaciones:
 * 1. insertarElemento(e): a�ade un nuevo elemento e al conjunto.
 * 2. borrarElemento(e): saca el elemento e del conjunto.
 * 3. vaciarConjunto(): borra todos los elementos del conjunto.
 * 4. esta(e): comprueba si el elemento e est� en el conjunto. Devuelve 1 si s�, 0 si no.
 * 
 * a). Escribir una *interfaz* conjunto con estos cuatro m�todos. Implementarlo luego en dos clases: ConjuntoDeCaracteres y ConjuntoDeEnteros.
 * 
 * b). Escribir un programa que demuestre que el conunto funciona. 
 * Construir dos conjuntos, uno con las letras min�sculas del alfabeto y otro con las may�sculas incluyendo la �. 
 * El usuario teclear� una letra y el progama, utilizando los conjuntos, dir� si la letra tecleada es min�scula o amy�scula. 
 * Construir dos conjuntos, uno con n�meros pares y otro con n�meros impares.
 * El usuario teclear� un n�mero y el programa, utilizando los conjuntos, dir� si el n�mero tecleado es par o impar.
 * 
 * */

//en clase se ha hecho con int, �es distinto a hacerlo con char o dar�a lo mismo (porque se puede parsear luego)?
//se parsea a char y funciona igual.
public interface Conjunto {
	
	//m�todo que a�ade un nuevo elemento e al conjunto
	public void insertarElemento(int e);
	
	//m�todo que saca un elemento del conjunto
	public void borrarElemento(int e);
	
	//m�todo que borra todos los elementos del conjunto
	public void vaciarConjunto();
	
	//m�todo que comprueba si el elemento est� o no en el conjunto
	//�No es boolean? no da true o false, da 0 o 1. Ateniendonos al enunciado, no es boolean (pero podr�a)
	public int esta(int e);

}
