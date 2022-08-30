package j_ejercicio19;

import java.util.Arrays;
import java.util.Scanner;

//programa que genere al azar una matriz cuadrada de NxN (N se define en el mismo programa)
//que muestre un men� de opciones:
//1. Mostrar matriz
//2. Per�metro: muestra los elementos qeu ocupan el borde de la matriz DESDE 0,0
//3. Espiral: recorrido en espiral por la matriz desde 0,0 y mostrando todo el contenido

public class Menu {
	static private int TAM = 4;
	private int[][] matriz = new int[TAM][TAM];
	
	public void mostrar() {
		asignaNumeros();
		for (int i = 0; i < matriz.length; i++) {
			System.out.println(Arrays.toString(matriz[i]));
		}
	}
		
	private void asignaNumeros() {
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = (int)(Math.random() * 9 + 1);
			}
		}
	}
	
	private void perimetro() {
	//empezando en 0,0 va imprimiendo hasta 0,tam-1 (3) en i
		//luego la columna tam-1(3), 0 hasta tam-1, tam-1 (3,3)
			//luego desde 2,3 hasta 0,3
				//luego desde 0,2 hasta 0,1
		
	/*	i: fila
	 *	j: columna
	 * 	
	 * 	matriz[i].length = 4;
	 *	
	 *	[0,0][0,1][0,2][0,3] matriz[0].length = 4;
	 *	[1,0][1,1][1,2][1,3] matriz[1].length = 4;	
	 *	[2,0][2,1][2,2][2,3] matriz[2].length = 4;
	 *	[3,0][3,1][3,2][3,3] matriz[3].length = 4;
	 * 
	 *	matriz[j].length es TAM (4) (porque es cuadrado)
	 *
	 *	En el primer for tiene que recorrer todo i = 0
	 * 	[0,0][0,1][0,2][0,3]
		[1,3][2,3][3,3]
		[3,2][3,1][3,0]
		[2,0][1,0]
	 *	
	 * hay que ir fijando las columnas o filas que correspondan e ir imprimiendo de tres en tres. length ser� TAM.
	 */
		//primero fijar la fila a 0 y recorrer hasta la posici�n 2
		System.out.print("El per�metro de la matriz es ");
		int i = 0;
		int j;
		for (j = 0; j < matriz[i].length - 1; j++) {	//j, la columna, empieza en 0 y llega a 2 recorriendo toda la fila i.
			System.out.print(matriz[i][j] + ", ");
		}
		for(i = 0; i < matriz[j].length - 1; i++) {		//i, la fila, recorre toda la columna j, que est� fijada en la �ltima posici�n tras el primer for. Hasta 2.
			System.out.print(matriz[i][j] + ", ");
		}
		for (j = matriz[i].length - 1; j > 0; j--) {	//se fija la fila i, que est� en 3 y se empieza desde el final hasta 2
			System.out.print(matriz[i][j] + ", ");
		} 
		for (i = matriz[j].length - 1; i > 0; i--) {	//se fija la columna a 0 e i la recorre desde atr�s hacia adelante
			if(i == 1) {								//si la fila es 1 (ser�a la posici�n 1,0), que se imprima el n�mero solo
				System.out.print(matriz[i][j]);
			}
			else {										//hasta entonces, se imprime con comas.
				System.out.print(matriz[i][j] + ", ");
			}
		} 
	}
	
	//**HACER ESCALABLE**
	private void espiral() {
		//m�todo similar a per�metro pero va un poco m�s all�: muestra tambi�n lo de dentro.
		/*
		 * Muestra 111, 222, 3333, 444, 23 y 32
		 * 1 1 1 2
		 * 4 2 3 2
		 * 4 2 3 2
		 * 4 3 3 3
		 *
		 * */
		perimetro();
		
		int i = 1;
		int j;
		
		System.out.print(", ");									
		for (j = 1; j < matriz[i].length - 1; j++) {			//se fija la fila i y la recorre j hasta length - 2. 
			System.out.print(matriz[i][j] + ", ");
			//System.out.println("i: " + i);					//j = 3
		}
		i = matriz[j].length - 2;								//i++: chapuza, no es escalable. ARREGLAR.
		for(j = matriz[i].length - 2; j > 0; j--) {
			if(j == 1) {
				System.out.print(matriz[i][j]);
			}
			else {
				System.out.print(matriz[i][j] + ", ");
			}
		}
	}
	
	private void salir() {
		System.out.println("�Adi�s!");
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Menu n = new Menu();
		System.out.println("Elige una opci�n: ");
		System.out.println(">> Pulsa 1 para mostrar el array.");
		System.out.println(">> Pulsa 2 para mostrar el per�metro del array.");
		System.out.println(">> Pulsa 3 para mostrar la espiral del array.");
		System.out.println(">> Pulsa 4 para salir.");
		int menu = sc.nextInt();
	
		while(menu != -1) {
			switch(menu) {
				case 1: n.mostrar(); menu = sc.nextInt(); break;
				case 2: n.perimetro(); menu = sc.nextInt(); break;
				case 3: n.espiral();menu = sc.nextInt(); break;
				case 4: n.salir(); menu = -1; break;
				default: System.out.println("�Has pulsado un n�mero equivocado!"); menu = sc.nextInt();
			}
		}
		
	
		
		
	}
}


/*De clase (con explicaci�n):
 * 
 *  public void perimetro() {
    	System.out.print("\nPerímetro: ");		// 1 1 1 2 -- esto es lo que queremos recorrer en cada bucle: 111, 222, 333 y 444.
    	int f = 0,								// 4 2 3 2
    		c;  								// 4 2 3 2
    											// 4 3 3 3
    	
    //tener en cuenta que en el primer for c es menor estricto: est� recorriendo hasta length - 2 realmente. Como length es 4, est� recorriendo desde 0 hasta 2
    	
    	//esta es la versi�n flexible a TAM. En comentarios estar� en el caso de TAM = 4
    	  
    	for (c = 0; c < m[f].length - 1; c++) 	// [0][c] c-> 0..2 - fija la fila a 0 y hace un bucle en el que la columna c va desde 0 a 2. Esto ser�a como hacer c = 0; c < 3; c++: va de 0 a 2  
       	    System.out.print(m[f][c] + ", ");
        
    	for (f = 0; f < m.length - 1; f++)		// [f][3] f-> 0..2. Ser�a como f = 0; f < 3; f++
        	System.out.print(m[f][m[f].length-1]+", ");// [m[f].length-1] es 3: es como hacer m[f][3] 
        
    	for (c = m[f].length - 1; c > 0; c--)	// [3][c] c-> 3..1 - fija la �ltima fila (3) y la columna debe ir de 3 a 1. Es como c = 3; c > 0; c-- 
          System.out.print(m[m[f].length-1][c] + ", ");
        
    	for (f = m.length - 1; f > 0; f--)		// [f][0] f-> 3..1 - fija la columna a 0. Es como f = 3; f > 0; f--. Cambia el syso para que no ponga la coma al final  
        	if (f == 1)
        			System.out.println(m[f][0]);     
        		else
        			System.out.print(m[f][0] + ", ");
    }
 * 
 */
