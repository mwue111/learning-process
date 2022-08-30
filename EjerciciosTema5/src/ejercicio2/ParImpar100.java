package ejercicio2;

//ejercicio 2 pero ya bien entendido: se pedían los 100 primeros pares y los 100 primeros impares, no los pares/impares que hay hasta 100.

import java.util.Arrays;

public class ParImpar100 {
	private static int[] par = new int[100];
	private static int[] impar = new int[100];
	
	public static void parImpar() {
		int p = 0;
		int imp = 1;
		
		for (int i = 0; i < impar.length; i++) {
			impar[i] += imp;
			imp += 2;
		}
		
		for (int i = 0; i < par.length; i++) {
			par[i] += p;
			p += 2;
		}
		
		System.out.println(Arrays.toString(impar));
		System.out.println("\n" + Arrays.toString(par));
		
	}
	
	public static void main(String[] args) {
		parImpar();
	}

}
