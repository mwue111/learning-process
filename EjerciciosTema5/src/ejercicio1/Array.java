package ejercicio1;

//Programa en el que se defina un array de 100 números enteros
//inicializarlos todos a -1
//Que se impriman por pantalla

public class Array {
	
	public void miArray(int v[]) {
		int i;
		for(i = 0; i < 100; i++) {
			v[i] = -1;
			System.out.println(v[i]);
		}
		
	}
	
//*****************************************************************************************************************
	//arrayApp
	
	public static void main(String[] args) {
		
		int[] primerArray = new int[100];
		Array nuevo = new Array();
		
		nuevo.miArray(primerArray);
		
	}
}
