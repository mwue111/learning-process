package i_ejercicio10_11;

import java.util.Arrays;

//clase que pueda sumar dos números enteros gigantes (de 1000 digitos, por ejemplo).

/*Lo que he hecho es al revés de lo que se ha hecho en clase: en lugar de transformar un String introducido a array para operar con él, he declarado un array y pretendo convertirlo en un número para poder operar. ¿Es posible hacerlo?
 * 
 * Si fuera pasar de caracteres a int podríamos usar parseInt() y valueOf(), pero en este caso es pasar de array int[] a int sin más.
 * 
 * 
 * 
 * */ 

public class EnteroGigante {
	private int[] num1 = new int[5];		//números de 100 dígitos, puesto a 5 para que sea más fácil de ver 
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
	
	//método que asigne un número random a cada posición del array y eso, en conjunto, es el número grande.
	public void asignaDigito() {
		for (int i = 0; i < num1.length; i++) {
			num1[i] = (int)(Math.random() * 10);
			num2[i] = (int)(Math.random() * 10);
		}
		System.out.println("El número 1 es " + Arrays.toString(num1).replaceAll("\\[|\\]|,\\ ", ""));
		System.out.println("El número 2 es " + Arrays.toString(num2).replaceAll("\\[|\\]|,\\ ", ""));
	}
	
	//si la suma da 10 o más, que se sume uno al número en la posición anterior.
	public void sumaDigitos() {

		for (int i = aux.length - 1; i >= 0; i--) {		//las sumas se hacen de derecha a izquierda para que el módulo de 10 lo haga bien
			aux[i] += num1[i] + num2[i];
			
			if(i != 0) {
					if (aux[i] >= 10) {
					aux[i] = aux[i] % 10;
					aux[i - 1] += 1;
				}
			}
		}
		
		System.out.println("La suma entre ambos números gigantes es " + Arrays.toString(aux).replaceAll("\\[|\\]|,\\ ", ""));
	}
	
	//método para restar los números gigantes
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
		System.out.println("La resta de los números gigantes es " + Arrays.toString(aux).replaceAll("\\[|\\]|,\\ ", ""));
	}
	
	//método para multiplicar los números gigantes
	//mal entendido: en este método simplement multiplico posición a posición y no es lo que pide el ejercicio
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
		System.out.println("La multiplicación de los números gigantes es " + Arrays.toString(aux).replaceAll("\\[|\\]|,\\ ", ""));
	}
	
	//método para multiplicar ** en base a suma **
	//se trata de sumar el número más grande tantas veces como indique el número más pequeño.
	public int[] multiplicaDigitos2() {
			//quiero sumar num1[i] unas num2[] veces.
			//entiendo que necesito un for que, tomando la longitud del número más pequeño, sume num1 a sí mismo num2[] veces
		
			//primero ver qué número es más pequeño
		for (int i = 0; i < aux.length; i++) {					//aquí no estoy segura de si tengo que recorrer el array auxiliar o alguno de los números gigantes.
			if (num1[0] > num2[0]) {
				//System.out.println("El número 1 es mayor.");
				for (int j = num2.length - 1; j >= 0; j--) {	//empezando desde el final del número más pequeño
					//no puedo llamar a sumaDigitos() porque lo que hace sumaDigitos es sumar num1[i] + num2[i].
					aux[i] = num1[i];
				}
			}
			else {
				//System.out.println("El número 2 es mayor.");
			}
		}
			
			System.out.println("La multiplicación de los arrays es " + Arrays.toString(aux).replaceAll("\\[|\\]|,\\ ", ""));
			return aux;
		}
	
	
	
	//pendientes de hacer:
	
	//método para dividir los números gigantes
	public void divideDigitos() {
		for (int i = 0; i < aux.length; i++) {
			
		}
	}
	
	//método para calcular la raíz cuadrada
	//método para calcular la potencia 
	
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

/*Pista: se pueden almacenar los números en arrays poniendo un dígito en cada posición
 * 
 * Luego programar un método suma que coja los arrays y los sume dígito a dígito
 * 
 * 
 * primer intento del método multiplicadigitos2:
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
			
//multiplicaDigitos multiplica número a número, entiendo que debería multiplicar num1 entero por el último digito de num2, luego el penúltimo dígito de num2, y así hasta i = 0 y luego sumarlo todo para dar el resultado.
	public void multiplicaDigitos2() {
		int resto;
		int num = 0;
		for (int i = num1.length - 1; i >= 0; i--) {
			if(i == 4) {
				//si el índice es 4, tiene que multiplicar ese número por todos los índices anteriores
				
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
		System.out.println("La multiplicación real de los números es " + Arrays.toString(aux).replaceAll("\\[|\\]|\\,\\ ", ""));
	}
 */
