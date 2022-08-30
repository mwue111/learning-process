package ejercicio19;

//Fibonacci: cada n�mero se calcula sumando los dos n�meros anteriores.
//Los primeros son siempre 0 y 1.
//El usuario introducir� un n�mero y habr� que calcular la sucesi�n de fibonacci de ese n�mero.

import java.util.Scanner;

public class Fibonacci {
	
	public void fibonacci(int num) {
		int fibo = 1;		//necesitamos que haya un uno para empezar
		int suma = 0;		//necesitamos un cero inicial y acumular� las sumas
		int acum;			//acumular� las sumas para volcarlas en suma 
		do {	//0, 1, 1, 2, 3, 5
			acum = suma;	//acum ser� la variable en la que se guarde la suma previa	//a=0	/1		/1		/2		/3		/5
			System.out.println(suma);	//imprime la suma								//0		/1		/1		/2		/3		/5
			suma += fibo;				//suma fibo y suma							//s:0+1=1	/1+0=1	/1+1=2	/1+2=3	/3+2=5	//
			fibo = acum;				//se guarda el valor de acum en fibo			//f=0	/1		/1		/2		/3
		} 
		while (suma <= num);
	}

public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	Fibonacci valor = new Fibonacci();
	
	System.out.println("Escribe un n�mero:");
	int num = sc.nextInt();
	
	valor.fibonacci(num);
	sc.close();
}	
	
}