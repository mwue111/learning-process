package j_ejercicio24;

import java.util.Scanner;

//Escribir un programa que lea una cadena por telcado y determine si es o no un palíndromo

public class Palindromo {
	static Scanner sc = new Scanner(System.in);
	
	private void palindromo() {
		System.out.println("Escribe una frase: ");
		String cad = sc.nextLine();
		int cont = 0;
		String aux = "";
		
		for (int i = 0, j = cad.length() - 1; i < cad.length(); i++, j--) {	//en lugar de hacer un bucle anidado hago un for con i y j porque eso hace que no ose compare i con todas las ocurrencias de j (sumaría el contador a mucho más que length).
//				System.out.println("j: " + cad.charAt(j)); 
//				System.out.println("i: " + cad.charAt(i));
		for (int j2 = 0; j2 < cad.length(); j2++) {
			if(cad.charAt(i) != ' ') {
				aux += cad.charAt(i);
			}
		}
	
			if(aux.charAt(i) == aux.charAt(j)){
					cont++;		
			}	
		}
		//System.out.println(aux);
		if(cont == cad.length()) {
			//System.out.println(cont);
			System.out.println("palíndromo.");
		}
		else {
			System.out.println(cont);
			System.out.println("no palíndromo.");
		}
	}
	
	public static void main(String[] args) {
		Palindromo n = new Palindromo();
		n.palindromo();
	}

}

//
////primer intento:
//		//un bucle for que recorra la frase y vea caracter a caracter si la primera y la última son iguales
//		for (int i = 0; i < cad.length(); i++) {
//			char letra = cad.toLowerCase().charAt(i);	//almacena cada caracter en una letra
//			//esto compara cada ocurrencia de i con la última letra
//			if(cad.charAt(i) == cad.charAt(cad.length() - 1)) {
//				System.out.println("Iguales.");
//			}
//			else
//				System.out.println("no iguales");
//			
//			
//		}