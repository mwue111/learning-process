package ejercicio13;

//el usuario teclea un n�mero y el ptrograma muestra la tabla de multiplicar
//de ese n�mero.

import java.util.Scanner;

public class Multiplicar {
	
	public void multiplica(int num) {
		int res;
		res = num;
		for (int i = 1; i <= 10; i++) {
			res = num * i;
			System.out.println(num + " x " + i + " = " + res);
		
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Multiplicar entrada = new Multiplicar();
		System.out.println("Escribe un n�mero: ");
		int valor = sc.nextInt(); 
		
		entrada.multiplica(valor);
		sc.close();
	}
}
