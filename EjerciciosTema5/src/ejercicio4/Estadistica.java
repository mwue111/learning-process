package ejercicio4;

import java.util.Arrays;
import java.util.Scanner;

//programa que:
//1. pida al usuario 10 n�meros y:
//2. calcule el valor medio de esos diez n�meros
//3. muestre en pantalla los n�meros que est�n por enciam de la media y los que est�n por debajo.

public class Estadistica {
	int[] numeros = new int[5];
	Scanner sc = new Scanner(System.in);
	
	//constructor: llama al m�todo que asigna los n�meros.
	public Estadistica() {
		asignaNumeros();
	}
	
	//m�todo que asigna los n�meros por teclado.
	private void asignaNumeros() {
		int i;
		System.out.println("Escribe 10 n�meros para introducir en el array: ");
		for(i = 0; i < numeros.length; i++) {
			boolean error = true;
			int cont = 0;
			do {
				try {
					numeros[i] = Integer.parseInt(sc.next());
					error = false;
				}
				catch(Exception e) {										//tambi�n val�a poner numeros[i] = Integer.parseInt(sc.next());, pero el do while + 																			boolean error es para controlar a�n m�s los errores (por si sigue metiendo letras el 																			usuario)
					System.out.println("Debe introducir un n�mero.");
					cont++;
					if (cont == 3) {
						System.out.println("Que pongas un n�mero.");
					}
				}	
			}while(error == true);
		}
	}
	
	//m�todo que suma todos los n�meros:
	private int suma() {
		int suma = 0;
		int i;
		//esto suma todos los valores del array y los guarda en la variable "suma":
		for(i = 0; i < numeros.length; i++) {
			suma += numeros[i];
		}
		//System.out.println("La suma de los n�meros es: " + suma);	//por si quisiera mostrar por pantalla la suma.
		return suma;
		
	/*
	 * P:�Este m�todo debe tener par�metros formales (de entrada)?
	 * R: No, coge los par�metros de la misma clase. No necesita recibir nada desde el main.
	 */
	}
	
	//m�todo que calcule la media de los n�meros introducidos por teclado
	private int media() {
		int media = suma()/numeros.length;										//para poder hacer esto, suma() tiene que devolver algo, no puedo usarlo si es void.
		return media;
		
	/* El m�todo media debe coger todos los valores del array (numeros[i]), sumarlos y dividirlos entre su .length (o 10 o 5, porque sabemos cu�ntos n�meros hay).*/
	}
	
	//m�todo que muestre los que est�n por encima de la media
	private void muestraMayor() {
		int i;
		int valorMayor = 0;
		//int valorMenor = 0;
		for(i = 0; i < numeros.length; i++) {
			if (numeros[i] >= media()) {
				valorMayor = numeros[i];
				System.out.println(valorMayor);
			}
			/*else {
				valorMenor = numeros[i];
				System.out.println("menores: " + valorMenor);
			}*/
		}
	/*Si los valores est�n por encima de media(), mostrarlos con un Syso.*/
	}
	
	//m�todo que muestre los n�meros que est�n por debajo de la media
	
	private void muestraMenor() {
		int i;
		int valorMenor = 0;
		for(i = 0; i < numeros.length; i++) {
			if(numeros[i] < media()) {
					valorMenor = numeros[i];
					System.out.println(valorMenor);
			}
		}
	}
		
	//m�todo mostrar:
	private void mostrar() {
		System.out.println("Tu array es: " + Arrays.toString(numeros));
		sc.close();
	}
//****************************************************************************************
	public static void main(String[] args) {
		//Scanner sc = new Scanner(System.in);						//ya lo declaro en la clase porque la entrada por teclado se gestiona desde all� (en un m�todo)
		Estadistica entrada = new Estadistica();
		entrada.mostrar();
		//entrada.suma(); 											//como no hay Syso en este m�todo no devuelve nada en el main.
		System.out.println("La media de este array es: " + entrada.media());
		System.out.println("Los n�meros mayores que la media son: ");
		entrada.muestraMayor();
		System.out.println("Los n�meros menores que la media son: ");
		entrada.muestraMenor();
	}
}

/****
 * P: �d�nde declaro el array si los valores que van dentro los va a decidir el usuario? �En la clase o en el main?
 * R: Puedo declararlo en el main o hacerlo en el constructor. Si lo declaro en el main, all� tendre tanto la interacci�n con el usuario como un bucle for, y si lo hago en el constructor tendr� ah� dentro los Syso y el bucle. Haci�ndolo de esta manera, en el main luego bastar� con crear un objeto y llamar al constructor para que pida los n�meros por teclado y los muestre.
 ****
 *
 * 
 * */
