package ejercicio9;

import java.util.Arrays;

//Programa que defina un array de 10 enteros
//lo rellena con n�meros crecientes entre 1 y 100: i++ es n++
//
//pedir al usuario un n�mero entre 1 y el mayor n�mero que exista en el array
//ese n�mero se insertar� en la posici�n que le corresponda, desplazando los dem�s elementos a la derecha (se pierde el �ltimo n�mero)
//el array se muestra por pantalla
//repetir hasta que el usuario introduzca un n�mero negativo

public class Creciente {
	private int[] creciente = new int[10];
	
	//hace el c�digo en el constructor directamente
	public Creciente() {
		int min = 1; 
		int max = 100;
		int valor;
		for (int i = 0; i < creciente.length; i++) {
			valor = azar(min, max);
			creciente[i] = valor;
			min = valor;
		}
	}
	
	private void crecienteRango() {
		int min = 1;
		int max = 10;
		int valor;
		for (int i = 0; i < creciente.length; i++) {
			valor = azar(min, max);
			creciente[i] = valor;
			min = valor;
			max += 10;
			
		}
		System.out.println("El array con rangos es " + Arrays.toString(creciente));
	}
	
	private void muestra() {
		System.out.println("El array generado es " + Arrays.toString(creciente));
	}
	
	//m�todo que genera n�meros entre un m�nimo y un m�xomo definido desde el constructor
	private int azar(int min, int max) {
		return (int)(Math.random() * (max - min + 1) + min);
		//devuelve un random 0><1 * (100 - 1 + 1) + 1 [101] <-- entre 1 y 100
	}
	
	
//********************************************************************************************************************************************
	public static void main(String[] args) {
		Creciente entrada = new Creciente();
		entrada.muestra();
		entrada.crecienteRango();
		
	}
}


//*********************************************************
/*Primer m�todo que pens� para asignar n�meros ordenados al array:
 * 
 *public void asignaNumeros(){
 * int i;
		for ( i = 0; i < creciente.length - 1; i++) {			//esto no funciona: si creciente[0] es 100 rellena con n�meros menores 
			creciente[0] = (int)(Math.random() * 100 + 1);		//establece la primera posici�n como gu�a
			
			for (int j = 1; j < creciente.length; j++) {		//recorro el resto de las posiciones
				if (creciente[j] < creciente[0]) {				//si son menores que la primera posici�n... 
					creciente[j] = creciente[0]++;				//...les asigno la primera posici�n + 1
				}
				if(creciente[j] > 100) {						//si el valor generado es mayor que 100...
					creciente[j] = 100;							//... que se quede como 100 (el tope)
				}
				
				
			}
			
		}
		System.out.println("El array generado es " + Arrays.toString(creciente));
		
*}
*
*Segunda forma: me hice un l�o con la prueba de clase porque se me olvid� que lo que buscaba era que el array fuera creciendo xd
*private int menorMayor(int min, int max) {		//recibe posiciones: la idea es que genere n�meros aleatorios entre la posici�n 0-1, 1-2...
		int rango = max - min + 1;
		return (int)(Math.random() * rango ) + min;		
	}
	
	private void asignaNumeros() {
		for (int i = 0; i < creciente.length; i++) {
			creciente [i] = (int)(Math.random() * 100 + 1);
			
			for (int j = 1; j < creciente.length - 1; j++) {
				creciente[j] = menorMayor(creciente[j - 1], creciente[j + 1]);
			}
		}
		System.out.println(Arrays.toString(creciente));
		
Lo que ten�a desde un principio (que he descartado):
private int[] asignaNumeros() {
		int min = 1;
		int max = 100;
		int valor;
		for (int i = 0; i < creciente.length; i++) {
			creciente[i] = (int)(Math.random() * 100 + 1);		//asigno valores aleatorios, sin condiciones
			min = creciente[i];
			
		}
		System.out.println(Arrays.toString(creciente));
		return creciente;		
	}
*/