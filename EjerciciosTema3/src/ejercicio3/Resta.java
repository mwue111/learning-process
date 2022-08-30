package ejercicio3;

//Restar dos números A y B que se introducen por teclado.
//El programa debe restar siempre el mayor al menor, independientemente de cómo se hayan 
//introducido por el usuario.

public class Resta {
	int A;
	int B;
	int resultado;
	
	//getters
	public int getA() {
		return A;
	}
	
	public int getB() {
		return B;
	}
	
	public int getResultado() {
		return resultado;
	}
	
	//setters 
	public void setA(int num1) {
		A = num1;
	}
	
	public void setB(int num2) {
		B = num2;
	}
	
	//método que ordena A y B y los resta
	public void resta(int num1, int num2) {
		if (num1 > num2) {
			resultado = num1 - num2;
		}
			//if (num1 < num2) {	funciona, pero es un poco enrevesado, con if puedo cambiar el orden sin más.
			//num1 -= (num1 + num1);
			//resultado = num1 + num2;
		else {
			resultado = num2 - num1;
			
			
			/*if (a>b)
				result = a – b;	
			else
				result = b – a;
			*/
		}
	}
}
