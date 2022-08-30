package j_ejercicio12;

import java.util.Arrays;

/*
 * El usuario tecleará una letra y el progama, utilizando los conjuntos, dirá si la letra tecleada es minúscula o mayúscula. 
 *  
 * */


//DUDAS: debo incluir las letras como atributos privados en la clase ConjuntoDeCaracteres? String?
//¿las letras se declaran en un constructor? 
//No, el conjunto no viene con su contenido definido.

public class ConjuntoDeCaracteres implements Conjunto{
	private char[] elementos;
	int size = 0;
	int pos;
	
	public ConjuntoDeCaracteres() {
		elementos = new char[5];
	}
	
	public void elementos() {
		System.out.println(Arrays.toString(elementos));
	}
	
	@Override
	public void insertarElemento(int e) {
		elementos[size] = (char)e;
		if(e >= 65 && e <= 90) {
			System.out.println("La letra introducida es mayúscula.");
		}
		else if(e >= 97 &&  e <= 122) {
			System.out.println("La letra introducida es minúscula");
		}
		else {
			System.out.println("No has introducido una letra.");
		}
		size++;
	}

	@Override
	public void borrarElemento(int e) {
		if(esta(e) == 1) {
			for (int i = 0; i < elementos.length - 1; i++) {
				elementos[i] = elementos[i + 1];
				}
			}
		size--;
	}

	@Override
	public void vaciarConjunto() {
		Arrays.fill(elementos,' ');
		size = 0;
	}

	@Override
	public int esta(int e) {
		int contiene = 0;
		for (int i = 0; i < elementos.length; i++) {
			if (elementos[i] == e) {
				contiene = 1;
				pos = i;
			}
		}
		System.out.println(contiene);
		return contiene;
	}
	
	public static void main(String[] args) {
		ConjuntoDeCaracteres n = new ConjuntoDeCaracteres();
		n.insertarElemento(88);
		n.insertarElemento(89);
		n.insertarElemento(90);
		n.insertarElemento(120);
		n.insertarElemento(5);
		n.elementos();
		n.borrarElemento(89);
		n.elementos();
		n.esta(90);
		n.esta(70);
		n.vaciarConjunto();
		n.elementos();
		
	}

}
