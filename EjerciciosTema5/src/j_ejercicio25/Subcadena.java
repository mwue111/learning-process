package j_ejercicio25;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

//programa que lea dos cadenas: cad1 y cad2 
//buscar una ocurrencia de cad2 en cad1
//si la encuentra, sustituye esa ocurrencia por asteriscos

public class Subcadena {
	static Scanner sc = new Scanner(System.in);
	String texto = "";
	String busca = "";
	String salida = "";
	//private int[] posArr = new int[10]; //inicializarlo
	//private ArrayList<Integer> posArr = new ArrayList<Integer>();
		
	private void busca() {
		System.out.println("Introduce un texto: ");
		texto = sc.nextLine();
		System.out.println("Introduce una palabra para buscar en el texto: ");
		busca = sc.nextLine();
		
		remplaza2(texto, busca);
	}
	
	private void remplaza2(String texto, String busca) {
		ArrayList<String> txt = new ArrayList<String>();
		
	}
	
	private void remplaza(String texto, String busca) {
		String ast = "";
		String txt = "";
		texto = texto.toUpperCase();
		busca = busca.toUpperCase();
		
		if(texto.indexOf(busca) != -1) {
			//funciona pero quiero que lo haga si "busca" no tiene caracteres por delante ni por detrás (que sea una palabra, no parte de otra)
			for(int i = 0; i < busca.length(); i++) {
				ast += "*";
				
			}
			txt = texto.replace(busca, ast);
			System.out.println(txt.toLowerCase());	
		}
		else {
			System.out.println("La cadena no se encuentra en el texto.");
		}
		
	}
	
	
	public static void main(String[] args) {
		Subcadena n = new Subcadena();
		
		n.busca();
	}
}
