package ejercicio12;

//escribir una clase que genere, usando bucles, dise�os de asteriscos.

//m�todo que recibiendo la base escriba el resto
public class Asterisco {
	
	public void triangulo(int base) {
		
	}	
	public static void main(String[] args) {
		Asterisco a = new Asterisco();
		a.triangulo(7);
	}
}


/*Recibiendo la base escribe el resto:
 * la base de 7 son 7 asteriscos
 * la l�nea anterior ser� espacio + 5 asteriscos + espacio
 * la l�nea anterior ser� dos espacios + tres asteriscos + dos espacios
 * la l�nea anterior tendr� tres espacios + 1 asterisco + tres espacios
 * 
 *el m�todo tiene que restar dos asteriscos hasta llegar al primer piso (base = 1)
 *el m�todo tiene que introducir espacios: 0, 1, 2 y 3 hasta el primer piso.
 *
 *si pongo base 7, el m�todo tiene que poner 7 asteriscos.
 *     
 *base = 7
 *
 *altura = 4     
 *     
 *    *
 *   ***
 *  *****
 * *******
 * 
 * para esta figura, tener en cuenta:
 * - son cuatro pisos
 * - en el primer piso tiene un asterisco ("*") y tres espacios por cada lado
 * - en el segundo piso tiene tres asteriscos y dos espacios por cada lado
 * - en el tercer piso tiene cinco asteriscos y un espacio por cada lado
 * - en el cuarto piso tiene siete asteriscos y ning�n espacio
 * 
 * 
 * tiene que repetir el c�digo cuatro veces - for (i = 0, i <= 4, i++)
 * tiene que escribir la primera l�nea y hacer un salto - Syso("   " + "*" + "   ");
 * 
 * As� va a escribir cuatro veces lo primero:
 * 
 *    *   
 *    *
 *    *
 *    *
 *    
 * Un for un poco chusco que parece dar resultado:
 * 
 *for (int i = 0; i <= 0; i++) {
			System.out.println("   " + "*" + "   ");
		}
		
		for (int i = 1; i <= 1; i++) {
			System.out.println("  " + "***" + "  ");
		}
		
		for (int i = 2; i <= 2; i++) {
			System.out.println(" " + "*****" + " ");
		}
		for (int i = 3; i <= 3; i++) {
			System.out.println("*******");
		} 
		
	
 */
