package j_ejercicio20;

import java.util.Scanner;

//programa que lea una cadena por teclado y la escriba por pantalla sustituyendo las vocales por asteriscos.

public class Asteriscos {
	static Scanner sc = new Scanner(System.in);
	
	String cad;
	String salida = "";		//si no lo inicializo, devuelve null
	
	
	private void sustituye() {
		System.out.println("¡Escribe algo!");
		cad = sc.nextLine();
		
		for(int i = 0; i < cad.length(); i++) {					//for que recorre todo el string y...
			char letra = cad.toLowerCase().charAt(i);			//... guarda el string letra por letra.
			
			switch(letra) {										//si letra contiene... 
				case 'a': 
				case 'e':
				case 'i': 
				case 'o':
				case 'u': salida += '*'; break;					//...entonces se va sumando * a cadena. Si no se pone el break, NO SUSTITUYE.
				default: salida += cad.charAt(i); 				//por último se devuelve la suma de todo lo anterior con charAt(i), que devuelve el string que hay en cada posición (i) de la cadena introducida, todo eso se suma a la salida. Sin default, sólo devuelve asteriscos.
			}
			
		}
		System.out.println(salida);
		
	}
	
	
	public static void main(String[] args) {
		Asteriscos n = new Asteriscos();
		
		n.sustituye();
	}

}
