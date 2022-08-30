package ejercicio16;

//Calcular el valor máximo de una serie de 10 números introducidos por teclado.

//Averiguar el valor mínimo.
//Averiguar la media.
//Averiguar la desviación típica.
//Averiguar la mediana.

import java.util.Scanner;

public class Estadistica {
	private static Scanner sc = new Scanner(System.in);
	private int mayor = Integer.MIN_VALUE;
	private int menor = Integer.MAX_VALUE;
	private double media;
	private int acum; //para la media
	private int valor1;
	private int valor2;
	private int valor3;
	private int valor4;
	private int valor5;
	private int valor6;
	private int valor7;
	private int valor8;
	private int valor9;
	private int valor10;
	
	public Estadistica() {
		int vuelta = 1;
		int entrada;
		
		while(vuelta <= 10) {
			System.out.println("Introduce un valor: ");
			entrada = sc.nextInt();
			
			//número mayor:
			if(entrada > mayor) {
				//System.out.println("entrada es " + entrada);
				//System.out.println("mayor es " + mayor);
				mayor = entrada;
			}
			
			//número menor:
			if(entrada < menor) {
				menor = entrada;
			}
			
			//media:
			acum += entrada;
				//System.out.println("acum es " + acum);
			media = acum / vuelta;
			
			switch(vuelta) {
				case 1: valor1 = entrada; break;
				case 2: valor2 = entrada; break;
				case 3: valor3 = entrada; break;
				case 4: valor4 = entrada; break;
				case 5: valor5 = entrada; break;
				case 6: valor6 = entrada; break;
				case 7: valor7 = entrada; break;
				case 8: valor8 = entrada; break;
				case 9: valor9 = entrada; break;
				case 10: valor10 = entrada; break;
			}
			vuelta++;
		}
		
	}
	
	public int getMayor() {
		return mayor;
	}
	
	public int getMenor() {
		return menor;
	}
	
	public double getMedia() {
		return media;
	}
	
	//desviación típica:
	public double dt() {
		double dt;
		media = getMedia();
		
		dt = Math.pow((valor1 - media), 2);
		dt += Math.pow((valor2 - media), 2);
		dt += Math.pow((valor3 - media), 2);
		dt += Math.pow((valor4 - media), 2);
		dt += Math.pow((valor5 - media), 2);
		dt += Math.pow((valor6 - media), 2);
		dt += Math.pow((valor7 - media), 2);
		dt += Math.pow((valor8 - media), 2);
		dt += Math.pow((valor9 - media), 2);
		dt += Math.pow((valor10 - media), 2);
		dt /= 10;
		dt = Math.sqrt(dt);
		return dt;
		
		/*forma menos práctica de hacer lo mismo (no va fuera del constructor) 
		double resta1 = Math.pow((valor1 - media), 2);
		double resta2 = Math.pow((valor2 - media), 2);
		double resta3 = Math.pow((valor3 - media), 2);
		double resta4 = Math.pow((valor4 - media), 2);
		double resta5 = Math.pow((valor5 - media), 2);
		double resta6 = Math.pow((valor6 - media), 2);
		double resta7 = Math.pow((valor7 - media), 2);
		double resta8 = Math.pow((valor8 - media), 2);
		double resta9 = Math.pow((valor9 - media), 2);
		double resta10 = Math.pow((valor10 - media), 2);
		
		double suma = resta1 + resta2 + resta3 + resta4 + resta5 + resta6 + resta7 + resta8 + resta9 + resta10;
		
		double division = suma / 10;
		
		dt = Math.sqrt(division);
		*/
	}
	
	//para la mediana hay que ordenar los datos:
	public double mediana() {
		//el mayor y el menor ya lo tenemos con los getters. El mayor lo sabremos por descarte.
		double primero = getMenor();
		
		double segundo, 
			tercero, 
			cuarto, 
			quinto, 
			sexto;
		//segundo número:
		segundo = Integer.MAX_VALUE;
		if((valor1 > primero) && (valor1 < segundo)){
			segundo = valor1;
		}
		if((valor2 > primero) && (valor2 < segundo)) {
			segundo = valor2;
		}
		if((valor3 > primero) && (valor3 < segundo)) {
			segundo = valor3;
		}
		if((valor4 > primero) && (valor4 < segundo)) {
			segundo = valor4;
		}
		if((valor5 > primero) && (valor5 < segundo)) {
			segundo = valor5;
		}
		if((valor6 > primero) && (valor6 < segundo)) {
			segundo = valor6;
		}
		if((valor7 > primero) && (valor7 < segundo)) {
			segundo = valor7;
		}
		if((valor8 > primero) && (valor8 < segundo)) {
			segundo = valor8;
		}
		if((valor9 > primero) && (valor9 < segundo)) {
			segundo = valor9;
		}
		if((valor10 > primero) && (valor10 < segundo)) {
			segundo = valor10;
		}
		//tercer número:
		tercero = Integer.MAX_VALUE;
		if((valor1 > segundo) && (valor1 < tercero)){
			tercero = valor1;
		}
		if((valor2 > segundo) && (valor2 < tercero)) {
			tercero = valor2;
		}
		if((valor3 > segundo) && (valor3 < tercero)) {
			tercero = valor3;
		}
		if((valor4 > segundo) && (valor4 < tercero)) {
			tercero = valor4;
		}
		if((valor5 > segundo) && (valor5 < tercero)) {
			tercero = valor5;
		}
		if((valor6 > segundo) && (valor6 < tercero)) {
			tercero = valor6;
		}
		if((valor7 > segundo) && (valor7 < tercero)) {
			tercero = valor7;
		}
		if((valor8 > segundo) && (valor8 < tercero)) {
			tercero = valor8;
		}
		if((valor9 > segundo) && (valor9 < tercero)) {
			tercero = valor9;
		}
		if((valor10 > segundo) && (valor10 < tercero)) {
			tercero = valor10;
		}
		//cuarto número:
		cuarto = Integer.MAX_VALUE;
		if((valor1 > tercero) && (valor1 < cuarto)){
			cuarto = valor1;
		}
		if((valor2 > tercero) && (valor2 < cuarto)) {
			cuarto = valor2;
		}
		if((valor3 > tercero) && (valor3 < cuarto)) {
			cuarto = valor3;
		}
		if((valor4 > tercero) && (valor4 < cuarto)) {
			cuarto = valor4;
		}
		if((valor5 > tercero) && (valor5 < cuarto)) {
			cuarto = valor5;
		}
		if((valor6 > tercero) && (valor6 < cuarto)) {
			cuarto = valor6;
		}
		if((valor7 > tercero) && (valor7 < cuarto)) {
			cuarto = valor7;
		}
		if((valor8 > tercero) && (valor8 < cuarto)) {
			cuarto = valor8;
		}
		if((valor9 > tercero) && (valor9 < cuarto)) {
			cuarto = valor9;
		}
		if((valor10 > tercero) && (valor10 < cuarto)) {
			cuarto = valor10;
		}
		
		//quinto número:
		quinto = Integer.MAX_VALUE;
		if((valor1 > cuarto) && (valor1 < quinto)){
			quinto = valor1;
		}
		if((valor2 > cuarto) && (valor2 < quinto)) {
			quinto = valor2;
		}
		if((valor3 > cuarto) && (valor3 < quinto)) {
			quinto = valor3;
		}
		if((valor4 > cuarto) && (valor4 < quinto)) {
			quinto = valor4;
		}
		if((valor5 > cuarto) && (valor5 < quinto)) {
			quinto = valor5;
		}
		if((valor6 > cuarto) && (valor6 < quinto)) {
			quinto = valor6;
		}
		if((valor7 > cuarto) && (valor7 < quinto)) {
			quinto = valor7;
		}
		if((valor8 > cuarto) && (valor8 < quinto)) {
			quinto = valor8;
		}
		if((valor9 > cuarto) && (valor9 < quinto)) {
			quinto = valor9;
		}
		if((valor10 > cuarto) && (valor10 < quinto)) {
			quinto = valor10;
		}
		
		//sexto número
		sexto = Integer.MAX_VALUE;
		if((valor1 > quinto) && (valor1 < sexto)){
			sexto = valor1;
		}
		if((valor2 > quinto) && (valor2 < sexto)) {
			sexto = valor2;
		}
		if((valor3 > quinto) && (valor3 < sexto)) {
			sexto = valor3;
		}
		if((valor4 > quinto) && (valor4 < sexto)) {
			sexto = valor4;
		}
		if((valor5 > quinto) && (valor5 < sexto)) {
			sexto = valor5;
		}
		if((valor6 > quinto) && (valor6 < sexto)) {
			sexto = valor6;
		}
		if((valor7 > quinto) && (valor7 < sexto)) {
			sexto = valor7;
		}
		if((valor8 > quinto) && (valor8 < sexto)) {
			sexto = valor8;
		}
		if((valor9 > quinto) && (valor9 < sexto)) {
			sexto = valor9;
		}
		if((valor10 > quinto) && (valor10 < sexto)) {
			sexto = valor10;
		}
		return ((quinto + sexto) / 2);
		
	}
	
	public static void main(String[] args) {
		Estadistica e = new Estadistica();
		
		System.out.println("El valor mayor es " + e.getMayor());
		System.out.println("El valor menor es " + e.getMenor());
		System.out.println("El valor medio es " + e.getMedia());
		System.out.println("La desviación típica es " + e.dt());
		System.out.println("La mediana es " + e.mediana());
	}
}




/*el usuario va a introducir diez números
 * coger el mayor de ellos
 * 
 * 
 * Media: 
 * suma de todos los valores / el número de valores introducidos (10)
 * acum/cont(10)
 * en este caso, cont = vuelta
 *el acum = media.
 * 
 * Desviación típica:
 * se necesita la media.
 * se resta la media a cada valor introducido y se eleva esa resta al cuadrado
 * se suman todas esas restas y se dividen por el número de datos introducidos (10) 
 * se hace la raíz cuadrada de todo eso 
 * 
 * RAIZ CUADRADA DE [(n1 - media)^2 + (n2 - media)^2 +(n3 - media)^2 +(n4 - media)^2 +(n5 - media)^2] / 5
 * 
 * mediana: media entre los dos números centrales (el 5º y el 6º)
 * hay que organizar los datos de menor a mayor.
 * 
 * */
