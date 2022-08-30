package ejercicio19;

//Fibonacci: cada número se calcula sumando los dos números anteriores.
//Los primeros son siempre 0 y 1.
//El usuario introducirá un número y habrá que calcular la sucesión de fibonacci de ese número.

import java.util.Scanner;

public class Fibonacci {
	
	public void fibonacci(int num) {
		int fibo = 1;		//necesitamos que haya un uno para empezar
		int suma = 0;		//necesitamos un cero inicial y acumulará las sumas
		int acum;			//acumulará las sumas para volcarlas en suma 
		do {	//0, 1, 1, 2, 3, 5
			acum = suma;	//acum será la variable en la que se guarde la suma previa	//a=0	/1		/1		/2		/3		/5
			System.out.println(suma);	//imprime la suma								//0		/1		/1		/2		/3		/5
			suma += fibo;				//suma fibo y suma							//s:0+1=1	/1+0=1	/1+1=2	/1+2=3	/3+2=5	//
			fibo = acum;				//se guarda el valor de acum en fibo			//f=0	/1		/1		/2		/3
		} 
		while (suma <= num);
	}

public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	Fibonacci valor = new Fibonacci();
	
	System.out.println("Escribe un número:");
	int num = sc.nextInt();
	
	valor.fibonacci(num);
	sc.close();
}	
	
}