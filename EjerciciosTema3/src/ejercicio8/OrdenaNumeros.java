package ejercicio8;

//Que el programa determine cuál de los tres números es el mayor, el mediano y el menor.

public class OrdenaNumeros {
	private int num1,
				num2,
				num3;
	
	//constructor a 0
	public OrdenaNumeros() {
		
	}
	
	//getters
	public int getNum1() {
		return num1;
	}
	
	public int getNum2() {
		return num2;
	}
	
	public int getNum3() {
		return num3;
	}
	
	//setters
	public void setNum(int valor1, int valor2, int valor3) {
		num1 = valor1;
		num2 = valor2;
		num3 = valor3;
	}
	
	//método que dice qué valor es el mayor, mediano y menor.
	public void ordenaNumeros(int valor1, int valor2, int valor3) {
		//valor1:
		if ((valor1 > valor2) && (valor1 > valor2)) {
			System.out.println("El número " + valor1 + " es el mayor.");
		}
		if ((valor1 > valor2) && (valor1 < valor2)){
			System.out.println("El número " + valor1 + " es el mediano.");
		}
		if ((valor1 < valor2) && (valor1 < valor2)) {
			System.out.println("El número " + valor1 + " es el menor.");
		}
		//valor2:
		if ((valor2 > valor1) && (valor2 > valor3)) {
			System.out.println("El número " + valor2 + " es el mayor.");
		}
		if ((valor2 > valor1) && (valor2 < valor3)){
			System.out.println("El número " + valor2 + " es el mediano.");
		}
		if ((valor2 < valor1) && (valor2 < valor3)) {
			System.out.println("El número " + valor2 + " es el menor.");
		}
		//valor3:
		if ((valor3 > valor1) && (valor3 > valor2)) {
			System.out.println("El número " + valor3 + " es el mayor.");
		}
		if ((valor3 > valor1) && (valor3 < valor2)){
			System.out.println("El número " + valor3 + " es el mediano.");
		}
		if ((valor3 < valor1) && (valor3 < valor2)) {
			System.out.println("El número " + valor3 + " es el menor.");
		}
	

	}
}
/*Van a introducir tres números, el programa debe decir cuál es el mayor, el mediano y el 
 * menor.
 * A, B y C. 
 * si A > B && A > C, A es el mayor.
 * Si A > B && A < C, A es el mediano.
 * Si A < B && A < C, A es el menor. 
 * Lo mismo con B y con C
 * 
 * 
 * método getMayor, getMediano y getMenor:
 *
 *hacer tres variables int
 *tres getters
 *tres setters
 *
 en el setMayor, mayor = al mayor de ambos.
 en el setMediano, mediano = el mediano.
 en el setMenor, menor = el menor de ambos.
 
 Luego se le llama desde el getter.
 * 
 */
