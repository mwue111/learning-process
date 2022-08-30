package ejercicio7;

import ejercicio6.*;
import java.util.Scanner;

//En el array del ejercicio 6, pedir al usuario que introduzca un número entre 0 y 2000000.
//el programa debe buscar ese número en el array.
//debe comunicar al usuario la posición que ocupa ese número, si es que está.
//si no está, debe lanzar un mensaje de error.
//usar: array convencional y ArrayList para comparar tiempos de ejecución.

public class Busca {
	static Ordena nuevo = new Ordena();
	//static para que se pueda llamar desde el main (ya que está dentro de la misma clase)
	
	//static por lo mismo que se ha hecho el objeto nuevo estático: para poder llamarlo desde main.
	public static void busca(int valor) {
		nuevo.getArray();
		int i;
		int pos = -1;										//inicializo a -1 para poder establecer una condición en la cual 
		for(i = 0; i < nuevo.getArray().length; i++) {
			if(nuevo.getArray()[i] == valor) {
				pos = i;
			}
		}
			if (pos != -1) {
				System.out.println("El número " + valor + " se encuentra en el array.");
				System.out.println("\nSu posición es " + pos);
			}
			else {
					System.out.println("El número " + valor + " no se encuentra en el array.");
			}
	}
	
//***********************************************************************************
	
	public static void main(String[] args) {
		//Ordena nuevo = new Ordena();
		//comentado porque el objeto se ha creado en la clase ya, si se deja vuelve a llamar al constructor.
		Scanner sc = new Scanner(System.in);
		
		//nuevo.ordenaNumeros();	//no me reconoce la búsqueda con ordenaNumeros();
		
		System.out.println("Introduzca un número del 1 al 2000 para buscarlo en el array:");
		boolean error = true;
		int cont = 0;
		
		do {
			if (cont == 3) {
				System.out.println("Un núuuuumeeeroooooooo");
			}
			try{
				int entrada = Integer.parseInt(sc.next());
				busca(entrada);
				error = false;
			}
			catch(Exception e) {
				System.out.println("Debes introducir un número.");
				cont++;
			}
		}while (error == true);
		
		
		//al estar dentro de la misma clase no es necesario crear objeto.
		sc.close();
	}

}
