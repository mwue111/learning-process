package i_ejercicio10_11;

import java.util.Arrays;

//clase que pueda sumar dos n�meros enteros gigantes (de 1000 digitos, por ejemplo).

/*Lo que he hecho es al rev�s de lo que se ha hecho en clase: en lugar de transformar un String introducido a array para operar con �l, he declarado un array y pretendo convertirlo en un n�mero para poder operar. �Es posible hacerlo?
 * 
 * Si fuera pasar de caracteres a int podr�amos usar parseInt() y valueOf(), pero en este caso es pasar de array int[] a int sin m�s.
 * 
 * 
 * 
 * */ 

public class EnteroGigante {
	private int[] num1 = new int[5];		//n�meros de 100 d�gitos, puesto a 5 para que sea m�s f�cil de ver 
	private int[] num2 = new int[5];
	private int[] aux = new int[5];
	
	private void asignaNumeros() {
		for (int i = 0; i < num1.length; i++) {
			num1[i] = (int)(Math.random() * 1000000000 + 1);
		}
		for (int j = 0; j < num1.length; j++) {
			num2[j] = (int)(Math.random() * 1000000000 + 1); 
		}
		
		System.out.println("El array num1 es " + Arrays.toString(num1));
		System.out.println("El array num2 es " + Arrays.toString(num2));
	}
	
	private void sumaArrays() {
		int[] resultado = new int[10];
		
		for (int i = 0; i < resultado.length; i++) {
			resultado[i] = num1[i] + num2[i];
	
		}
		System.out.println("El array resultado es " + Arrays.toString(resultado));
	}
	
	//m�todo que asigne un n�mero random a cada posici�n del array y eso, en conjunto, es el n�mero grande.
	public void asignaDigito() {
		for (int i = 0; i < num1.length; i++) {
			num1[i] = (int)(Math.random() * 10);
			num2[i] = (int)(Math.random() * 10);
		}
		System.out.println("El n�mero 1 es " + Arrays.toString(num1).replaceAll("\\[|\\]|,\\ ", ""));
		System.out.println("El n�mero 2 es " + Arrays.toString(num2).replaceAll("\\[|\\]|,\\ ", ""));
	}
	
	//si la suma da 10 o m�s, que se sume uno al n�mero en la posici�n anterior.
	public void sumaDigitos() {

		for (int i = aux.length - 1; i >= 0; i--) {		//las sumas se hacen de derecha a izquierda para que el m�dulo de 10 lo haga bien
			aux[i] += num1[i] + num2[i];
			
			if(i != 0) {
					if (aux[i] >= 10) {
					aux[i] = aux[i] % 10;
					aux[i - 1] += 1;
				}
			}
		}
		
		System.out.println("La suma entre ambos n�meros gigantes es " + Arrays.toString(aux).replaceAll("\\[|\\]|,\\ ", ""));
	}
	
	//m�todo para restar los n�meros gigantes
	public void restaDigitos() {
		for (int i = aux.length - 1; i >= 0; i--) {
			aux[i] += num1[i] - num2[i];
			if(i != 0) {
				if(aux[i] < 0) {
					aux[i - 1] -= 1;
					aux[i] += 10;
				}
			}
			
		}
		System.out.println("La resta de los n�meros gigantes es " + Arrays.toString(aux).replaceAll("\\[|\\]|,\\ ", ""));
	}
	
	//m�todo para multiplicar los n�meros gigantes
	//mal entendido: en este m�todo simplement multiplico posici�n a posici�n y no es lo que pide el ejercicio
	public void multiplicaDigitos() {
		for (int i = aux.length - 1; i >= 0; i--) {
			aux[i] += num1[i] * num2[i];
			
			if(i != 0) {
				if(aux[i] >= 10) {
					int num = aux[i];
					int resto = aux[i] % 10;
					aux[i] = resto;			
					aux[i - 1] = num / 10;		
				}	
			}
		}
		System.out.println("La multiplicaci�n de los n�meros gigantes es " + Arrays.toString(aux).replaceAll("\\[|\\]|,\\ ", ""));
	}
	
	//m�todo para multiplicar ** en base a suma **
	//se trata de sumar el n�mero m�s grande tantas veces como indique el n�mero m�s peque�o.
	public int[] multiplicaDigitos2() {
			//quiero sumar num1[i] unas num2[] veces.
			//entiendo que necesito un for que, tomando la longitud del n�mero m�s peque�o, sume num1 a s� mismo num2[] veces
		
			//primero ver qu� n�mero es m�s peque�o
		for (int i = 0; i < aux.length; i++) {					//aqu� no estoy segura de si tengo que recorrer el array auxiliar o alguno de los n�meros gigantes.
			if (num1[0] > num2[0]) {
				//System.out.println("El n�mero 1 es mayor.");
				for (int j = num2.length - 1; j >= 0; j--) {	//empezando desde el final del n�mero m�s peque�o
					//no puedo llamar a sumaDigitos() porque lo que hace sumaDigitos es sumar num1[i] + num2[i].
					aux[i] = num1[i];
				}
			}
			else {
				//System.out.println("El n�mero 2 es mayor.");
			}
		}
			
			System.out.println("La multiplicaci�n de los arrays es " + Arrays.toString(aux).replaceAll("\\[|\\]|,\\ ", ""));
			return aux;
		}
	
	
	
	//pendientes de hacer:
	
	//m�todo para dividir los n�meros gigantes
	public void divideDigitos() {
		for (int i = 0; i < aux.length; i++) {
			
		}
	}
	
	//m�todo para calcular la ra�z cuadrada
	//m�todo para calcular la potencia 
	
//***********************************************************************************************************
	public static void main(String[] args) {
		EnteroGigante e = new EnteroGigante();
		//e.asignaNumeros();
		//e.sumaArrays();
		e.asignaDigito();
		//e.sumaDigitos();
		//e.restaDigitos();
		//e.multiplicaDigitos();
		e.multiplicaDigitos2();
		
	}

}

/*Pista: se pueden almacenar los n�meros en arrays poniendo un d�gito en cada posici�n
 * 
 * Luego programar un m�todo suma que coja los arrays y los sume d�gito a d�gito
 * 
 * 
 * primer intento del m�todo multiplicadigitos2:
 * num2[4] *= num1[i];
			System.out.println(num2[4]);
 *  if(i != 0) {
				if(i == 4) {
					if(num2[4] >= 10) {			//56
						int resto = num2[4] % 10;
						int num = num2[4];
						num2[4] = resto; 		//6
						num2[3] = num / 10;		//5
						//falta hacer lo mismo con el 3, 2, 1... y luego sumarlo todo
					}
				}
				
			}
			
//multiplicaDigitos multiplica n�mero a n�mero, entiendo que deber�a multiplicar num1 entero por el �ltimo digito de num2, luego el pen�ltimo d�gito de num2, y as� hasta i = 0 y luego sumarlo todo para dar el resultado.
	public void multiplicaDigitos2() {
		int resto;
		int num = 0;
		for (int i = num1.length - 1; i >= 0; i--) {
			if(i == 4) {
				//si el �ndice es 4, tiene que multiplicar ese n�mero por todos los �ndices anteriores
				
				aux[i] = num1[i] * num2[i];
				System.out.println(aux[i]);
				if (aux[i] >= 10) {
					resto = aux[i] % 10;
					num = aux[i] / 10;
					aux[i] = resto;
					aux[i-1] = num;
					System.out.println(aux[i]);
				}
				
			}
					
		} 
		System.out.println("La multiplicaci�n real de los n�meros es " + Arrays.toString(aux).replaceAll("\\[|\\]|\\,\\ ", ""));
	}
 */
