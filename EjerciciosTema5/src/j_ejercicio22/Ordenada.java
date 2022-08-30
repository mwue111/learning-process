package j_ejercicio22;

import java.util.Scanner;

//programa que averigue si los caracteres introducidos por teclado están ordenados alfabéticamente.

public class Ordenada {
	static Scanner sc = new Scanner(System.in);
	String cad;
	
	private void ordena() {
		System.out.println("Introduce una cadena: ");
		cad = sc.nextLine();
		String aux = cad.toUpperCase();					//lo pasa a mayúscula antes de entrar en el for....
		
		for (int i = 0; i < aux.length() - 1; i++) {	//... porque el for recorre ese array auxiliar. Recuerda que es hasta length() - 1 (empieza en 0, acaba en 9 si son 10 en total).
			System.out.println(aux.charAt(i));
			if(aux.charAt(i) >= aux.charAt(i + 1)) {	//para operar con los valores en cada posición se usa charAt(i), el índice se puede sumar como en los arrays de enteros.
				
				System.out.println("No ordenada.");
			}
			else {
				System.out.println("Ordenada");
			}
			
			//yo estaba intentando hacerlo con int aux, pero así no tenía acceso al siguiente valor del array (para comparar sólo podía hacer aux >= aux + 1 y eso no es el siguiente valor, iba a dar como ordenado siempre. Por eso es mejor hacerlo con strings siempre y no pasar a enteros.
			
		}
		
		
	}

	public static void main(String[] args) {
		
		Ordenada n = new Ordenada();
		n.ordena();
	}
	
}
