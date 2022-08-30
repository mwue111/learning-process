package ejercicio4;

import java.util.Arrays;
import java.util.Scanner;

//programa que:
//1. pida al usuario 10 números y:
//2. calcule el valor medio de esos diez números
//3. muestre en pantalla los números que están por enciam de la media y los que están por debajo.

public class Estadistica {
	int[] numeros = new int[5];
	Scanner sc = new Scanner(System.in);
	
	//constructor: llama al método que asigna los números.
	public Estadistica() {
		asignaNumeros();
	}
	
	//método que asigna los números por teclado.
	private void asignaNumeros() {
		int i;
		System.out.println("Escribe 10 números para introducir en el array: ");
		for(i = 0; i < numeros.length; i++) {
			boolean error = true;
			int cont = 0;
			do {
				try {
					numeros[i] = Integer.parseInt(sc.next());
					error = false;
				}
				catch(Exception e) {										//también valía poner numeros[i] = Integer.parseInt(sc.next());, pero el do while + 																			boolean error es para controlar aún más los errores (por si sigue metiendo letras el 																			usuario)
					System.out.println("Debe introducir un número.");
					cont++;
					if (cont == 3) {
						System.out.println("Que pongas un número.");
					}
				}	
			}while(error == true);
		}
	}
	
	//método que suma todos los números:
	private int suma() {
		int suma = 0;
		int i;
		//esto suma todos los valores del array y los guarda en la variable "suma":
		for(i = 0; i < numeros.length; i++) {
			suma += numeros[i];
		}
		//System.out.println("La suma de los números es: " + suma);	//por si quisiera mostrar por pantalla la suma.
		return suma;
		
	/*
	 * P:¿Este método debe tener parámetros formales (de entrada)?
	 * R: No, coge los parámetros de la misma clase. No necesita recibir nada desde el main.
	 */
	}
	
	//método que calcule la media de los números introducidos por teclado
	private int media() {
		int media = suma()/numeros.length;										//para poder hacer esto, suma() tiene que devolver algo, no puedo usarlo si es void.
		return media;
		
	/* El método media debe coger todos los valores del array (numeros[i]), sumarlos y dividirlos entre su .length (o 10 o 5, porque sabemos cuántos números hay).*/
	}
	
	//método que muestre los que están por encima de la media
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
	/*Si los valores están por encima de media(), mostrarlos con un Syso.*/
	}
	
	//método que muestre los números que están por debajo de la media
	
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
		
	//método mostrar:
	private void mostrar() {
		System.out.println("Tu array es: " + Arrays.toString(numeros));
		sc.close();
	}
//****************************************************************************************
	public static void main(String[] args) {
		//Scanner sc = new Scanner(System.in);						//ya lo declaro en la clase porque la entrada por teclado se gestiona desde allí (en un método)
		Estadistica entrada = new Estadistica();
		entrada.mostrar();
		//entrada.suma(); 											//como no hay Syso en este método no devuelve nada en el main.
		System.out.println("La media de este array es: " + entrada.media());
		System.out.println("Los números mayores que la media son: ");
		entrada.muestraMayor();
		System.out.println("Los números menores que la media son: ");
		entrada.muestraMenor();
	}
}

/****
 * P: ¿dónde declaro el array si los valores que van dentro los va a decidir el usuario? ¿En la clase o en el main?
 * R: Puedo declararlo en el main o hacerlo en el constructor. Si lo declaro en el main, allí tendre tanto la interacción con el usuario como un bucle for, y si lo hago en el constructor tendré ahí dentro los Syso y el bucle. Haciéndolo de esta manera, en el main luego bastará con crear un objeto y llamar al constructor para que pida los números por teclado y los muestre.
 ****
 *
 * 
 * */
