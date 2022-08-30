package ejercicio2;

//Dos arrays: uno con números pares y otro con impares.
//array pares: inicia en 2 y tiene todos los números pares hasta 100.
//array impares: inicia en 1 y tiene todos los números impares hasta 100.
//Imprimir por pantalla.

public class ParImpar {

	public void parImpar(int p[], int imp[]) {
		int i;
		int j;
		
		for (i = 2; i < p.length; i += 2) {
			p[i] = i;			
			System.out.println(p[i]);
		}
		
		
		for (j = 1; j < imp.length; j += 2) {
			imp[j] = j;
			System.out.println(imp[j]);
		}
	}
	
	
	
//*****************************************************************************************************************
	//parImparApp

	public static void main(String[] args) {
		int[] par = new int[100];
		int[] impar = new int[100];
		ParImpar nuevo = new ParImpar();
		
		//nuevo.parImpar(par);
		nuevo.parImpar(par, impar);
	}
}
