package ejercicio9;

//Escribir un programa que muestre todos los n�meros pares entre dos n�meros introducidos por 
//teclado. 
//el primer n�mero debe ser menor que el segundo.
//si no, el programa debe avisar.

public class Pares {
	private int par;
	private int acum;
	
	//getters:
	public int getPares() {
		return par;
	}
	
	//m�todo que dice si est�n bien metidos los datos o no
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
			System.out.println("El primer n�mero debe ser menor que el segundo.");
		}
		
	}
	
	//m�todo que devuelve los pares: copiado directamente en validacion (se puede borrar)
	/*public void pares(int num1, int num2) { 	//entran n�mero 1 y n�mero 2
		while(num1 <= num2) { 					//mientras n�mero 1 sea igual o menor que n�mero 2
			if(num1 % 2 == 0) {					//si es par
				System.out.println(num1);		//imprimirlo y salir del bucle
							
			}
			num1++;								//sumar 1 al n�mero 1 y comprobar si vuelve al while
			
		}
	}*/
	
	//m�todo que devuelve el acumulador 
	public int sumaPares(int num1, int num2) {
		System.out.println("Entre " + num1 + " y " + num2 + " hay " + acum + " n�meros pares.");
		return acum;
	}
}



/***DIVAGACIONES***
 * 
 *el usuario va a escribir dos n�meros
 *yo recibo un n�mero
 *lo guardo
 *recibo otro n�mero
 *veo qu� n�meros hay entre el primero y el segundo
 *devuelvo los pares
 *
 *hasta que num1 = num2, imprimir todos los numeros divisibles entre dos
 *for valor = num1, valor = num2, valor++
 *empezando con valor = num1, hasta que sea igual que num2, aumentando valor
 *valor tiene que imprimir todos los n�meros pares entre ambos
 *pero valor s�lo guarda un numero
 *quiero guardar un n�mero indeterminado de n�meros
 *if n % 2 = 0, guardar en acum
 * pero acum va a ir sumando valores, no va a imprimrilso todos, igual que har�a valor
 * pues que lo escriba
 * if n % 2 = 0, escribir n
 * 
 * 
 * crear un metodo pares aparte y que el void lo llame
 * */
 