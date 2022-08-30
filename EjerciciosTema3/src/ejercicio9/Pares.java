package ejercicio9;

//Escribir un programa que muestre todos los números pares entre dos números introducidos por 
//teclado. 
//el primer número debe ser menor que el segundo.
//si no, el programa debe avisar.

public class Pares {
	private int par;
	private int acum;
	
	//getters:
	public int getPares() {
		return par;
	}
	
	//método que dice si están bien metidos los datos o no
	public void validacion(int num1, int num2) {
		if(num1 < num2) {
			while(num1 <= num2) {
				if (num1 % 2 == 0) {
					System.out.println(num1);
					acum++;						//acumulador para saber el total de pares
				}
				num1++;
			}
		}
		else {
			System.out.println("El primer número debe ser menor que el segundo.");
		}
		
	}
	
	//método que devuelve los pares: copiado directamente en validacion (se puede borrar)
	/*public void pares(int num1, int num2) { 	//entran número 1 y número 2
		while(num1 <= num2) { 					//mientras número 1 sea igual o menor que número 2
			if(num1 % 2 == 0) {					//si es par
				System.out.println(num1);		//imprimirlo y salir del bucle
							
			}
			num1++;								//sumar 1 al número 1 y comprobar si vuelve al while
			
		}
	}*/
	
	//método que devuelve el acumulador 
	public int sumaPares(int num1, int num2) {
		System.out.println("Entre " + num1 + " y " + num2 + " hay " + acum + " números pares.");
		return acum;
	}
}



/***DIVAGACIONES***
 * 
 *el usuario va a escribir dos números
 *yo recibo un número
 *lo guardo
 *recibo otro número
 *veo qué números hay entre el primero y el segundo
 *devuelvo los pares
 *
 *hasta que num1 = num2, imprimir todos los numeros divisibles entre dos
 *for valor = num1, valor = num2, valor++
 *empezando con valor = num1, hasta que sea igual que num2, aumentando valor
 *valor tiene que imprimir todos los números pares entre ambos
 *pero valor sólo guarda un numero
 *quiero guardar un número indeterminado de números
 *if n % 2 = 0, guardar en acum
 * pero acum va a ir sumando valores, no va a imprimrilso todos, igual que haría valor
 * pues que lo escriba
 * if n % 2 = 0, escribir n
 * 
 * 
 * crear un metodo pares aparte y que el void lo llame
 * */
 