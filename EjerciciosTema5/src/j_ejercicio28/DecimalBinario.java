package j_ejercicio28;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

//Programa que lea en una cadena un número decimal y lo convierta a binario

public class DecimalBinario {
	static Scanner sc = new Scanner(System.in);
	String numero = "";
	
	public void inicio() {
		String entrada = "";	
		System.out.println("Escribe un número decimal: ");
		entrada = sc.nextLine();
		compruebaEntrada(entrada);
	}
	
	public void compruebaEntrada(String entrada) {
		String nuevaEntrada = "";
		nuevaEntrada = entrada.replace(',', '.');
		//System.out.println("La entrada es " + nuevaEntrada);
		//Comprobar si son números y cambiar la "," por el "."
		Double numero;
		try {
			numero = Double.parseDouble(nuevaEntrada);
			//System.out.println("El número parseado es " + numero);
			nuevaEntrada = "" + numero;
			nuevaEntrada = nuevaEntrada.replace('.', ',');
			separa(nuevaEntrada);
		}
		catch(Exception e) {
			System.out.println("No has introducido un número. " + "\nVuelve a intentarlo. ");
			inicio();
		}		
	}
	
	public void separa(String entrada) {
		String[] numero;
		String entero;
		String decimal;
		
		numero = entrada.split(",");
		entero = numero[0];
		decimal = numero[1];
			
		enteroBinario(entero);
		compruebaDecimal(decimal);
	}
	
	public void enteroBinario(String entero) {
		int ent = Integer.parseInt(entero);
		int rest;
		int result;
		boolean continua = true;
		ArrayList<Integer> resto = new ArrayList<Integer>();	//para almacenar los números binarios
		
		if(ent == 0) {
			resto.add(0);
		}
		else {
			//mientras que el módulo de e sea 0 hay que quedarse con él e ir haciendo divisiones por dos
			while(continua) {
				rest = (ent % 2);
				result = (ent / 2);
				resto.add(rest);
				ent = result;
				
				if(result == 1) {
					resto.add(result);
					continua = false;
				}
			}
		}
		Collections.reverse(resto);
	
		/*	
		Esto lo convierte en un string del tipo "[nnn]," que habría que convertir en string después
		String num = "" + resto;
		num += ",";	
		*/
		
		String num = "";
		for(int n: resto) {
			num += n;
		}
		num += ",";
	
		numero += num;
	}
	
	public void compruebaDecimal(String decimal) {	
		//System.out.println("el largo es " + decimal.length());
		if(decimal.length() < 2) {	//decimalFormat podría ser lo suyo
			decimal += "0";
			decimalBinario(decimal);
		}
		else {
			decimalBinario(decimal);	
		}
	}
	
	public void decimalBinario(String decimal) {
		ArrayList<Integer> mult = new ArrayList<Integer>();
		boolean continua = true;
		double	dec = Double.parseDouble(decimal) / 100;
		double result;
		int bin;
		int cont = 0;
		
		if(dec == 0) {
			mult.add(0);
		}
		else {		
			while(continua) {
				result = (dec * 2);
				bin = (int)result;
				mult.add(bin);
				if(bin == 1) {
					dec = result - 1;
				}
				else {
					dec = result;
				}
				cont++;
				if(cont == 4) {
					continua = false;
				}
			}		
			//System.out.println(mult);	
		}
		
		String num = "";
		for(int n: mult) {
			num += n;
		}
		
		juntaNumeros(num);
	}
	
	public void juntaNumeros(String entrada) {
		numero += entrada;
		System.out.println("Ese número se escribe " + numero + " en binario.");
	}
	
	public static void main(String[] args) {
		DecimalBinario d = new DecimalBinario();
		
		boolean continua = true;
		String entrada; 
		
		while(continua) {
			d.inicio();
			System.out.println("¿Quieres convertir otro número en binario? Escribe <<N>> para salir y <<S>> para continuar.");
			entrada = sc.nextLine().toUpperCase();
			if(entrada.equals("N")) {
				continua = false;
			}
		}
		System.out.println("¡Hasta luego!");
	}
}
