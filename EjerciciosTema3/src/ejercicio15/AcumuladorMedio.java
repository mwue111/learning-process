package ejercicio15;

//acumular el valor medio de valores enteros positivos introducidos por teclado.
//para acabar el programa, el usuario debe teclear un número negativo.



//								******MEJORAR******

//hecho en main porque no sé cómo hacerlo con una clase y que el scanner no se quede únicamente con la primera entrada.
import java.util.Scanner;

public class AcumuladorMedio {

	public static void main(String[] args) {
			int valor;
			int acum = 0;
			int cont = 0;
			boolean terminar = false;
	
	//		AcumuladorMedio entrada = new AcumuladorMedio(); //no hace falta crear objeto
			Scanner sc = new Scanner(System.in);
		
			while (terminar == false) {
				System.out.println("Escriba un número para empezar.\nNúmero negativo finaliza el programa.");
				valor = sc.nextInt();
				if (valor >= 0) {
					acum += valor;
					cont++;
				}
				else {
					System.out.println("acum es " + acum);
					System.out.println("cont es " + cont);
					terminar = true;
					valor = acum / cont;
					System.out.println(valor);
				}
			}
			//System.out.println(valor);
	
	//	entrada.media(valor);
		sc.close();
	}
}

/*Fórmula media:
 * sumar todos los datos que tenemos y dividir el resultado entre el número total de esos datos.
 * 
 * acum (suma de todos los datos) / contador
 * acum += num;
 * cont++
 *
 * 			System.out.println("acum es " + acum);
			System.out.println("num es " + num);
			System.out.println("cont es " + cont);
 * */
