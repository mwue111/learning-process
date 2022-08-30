package j_ejercicio23;

import java.util.Scanner;

//programa que lea una cadena y cuente el número de vocales de cada tipo.

public class Vocales {
	static Scanner sc = new Scanner(System.in);
	String salida = "";
	String cad;
	
	//para contarlas necesito un for que reciba la cadena, ir leyendo cada letra de manera independiente con charat(i) y un switch con un contador para cada vocal
	private void cuenta() {
		System.out.println("Escribe algo: ");
		cad = sc.nextLine();
		//Dos formas: o con un contador para cada letra o con un array contador que en cada posición almacene la ocurrencia de las letras mediante el switch.
		//int contA = 0, contE = 0, contI = 0, contO = 0, contU = 0;
		int[] cont = new int[5];
		
		for (int i = 0; i < cad.length(); i++) {
			char letra = cad.toLowerCase().charAt(i);	//¡ojo al toLowerCase + switch!
			
			switch(letra) {
			case 'a': cont[0]++; break;//contA++; break;
			case 'e': cont[1]++; break;//contE++; break;
			case 'i': cont[2]++; break;//contI++; break;
			case 'o': cont[3]++; break;//contO++; break;
			case 'u': cont[4]++; //contU++;
			}
		}
		//System.out.println("a: "+ contA + "\ne: " + contE + "\ni: " + contI + "\no: " + contO + "\nu: " + contU);
		System.out.println("a: "+ cont[0] + "\ne: " + cont[1] + "\ni: " + cont[2] + "\no: " + cont[3] + "\nu: " + cont[4]);
	}
	
	public static void main(String[] args) {
		Vocales n = new Vocales();
		n.cuenta();
	}
	
}

//con String cont también se podría, almacenando en el switch charAt(0/1/2...)