package ejercicio1;

//leer un numero por teclado mediante un método 
//decir si es positivo o negativo con otro método
//salida por consola: "el número X es positivo".

public class PositivoNegativo {
	private int valor;
	
	//getter
	public int getNumero() {
		return valor;
	}
	
	//setter
	public void setNumero() {
		valor = 0;
	}
	
	//método para leer por teclado
	public void leerNumero(int num) {
		//System.out.println("TRAZA - num es " + num);
		//System.out.println("TRAZA - valor es " + valor);
		valor = num; 
		
	}
	
	//método para decir si es positivo o negativo
	public void positivoNegativo() {
		if (valor >= 0) {
			System.out.println("El número " + valor + " es positivo.");
		}
		else{
			System.out.println("El número " + valor + " es negativo.");
		}
	}
	
	//metodo fin en el que equipare valor a un numero como 0000 para acabar
	//o crear una variable String o char S/N 
	//en el main tener un while que mientras valor != 0000 siga preguntando numeros
	
}
