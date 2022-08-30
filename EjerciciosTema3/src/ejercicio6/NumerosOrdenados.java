package ejercicio6;

//leer tres n�meros por teclado.
//decidir si est�n ordenados de menor a mayor.
//informar si los n�meros, adem�s de estar ordenados, son consecutivos.

public class NumerosOrdenados {
	private int num1;
	private int num2;
	private int num3;
	
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
	
	//setter
	public void setNum(int valor1, int valor2, int valor3) {
		num1 = valor1;
		num2 = valor2; 
		num3 = valor3;
	}
	
	//m�todo que dice si est�n ordenados
	public boolean ordenados(int valor1, int valor2, int valor3) {
		boolean ordenados;
		if ((valor1 < valor2) && (valor2 < valor3)) {
			ordenados = true;
		}
		else {
			ordenados = false;
		}
		return ordenados;
	}
	
	//m�todo que indica si los n�meros son consecutivos
	public boolean consecutivos(int valor1, int valor2, int valor3) {
		boolean consecutivos;
		if ((valor3 == valor2 + 1) && (valor2 == valor1 + 1)) {
			consecutivos = true;
			System.out.println("Los n�meros son consecutivos.");
		}
		else {
			consecutivos = false;
			System.out.println("Los n�meros no son consecutivos.");
		}
		return consecutivos;	
	}
}