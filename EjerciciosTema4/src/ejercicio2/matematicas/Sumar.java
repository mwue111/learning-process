package ejercicio2.matematicas;

public class Sumar {
	
	//m�todo sobrecargado para sumar int y double
	//tal y como est� ahora, para el main habr�a que crear ibjeto Suma s = new Suma();
	//Si lo ponemos static, podemos llamarlo como la clase Math: sumar.suma()
	public /*static*/ int Suma(int a, int b) {
		int suma = a + b;
		return suma;
	}
	
	public /*static*/ double Suma(double a, double b) {
		double suma = a + b;
		return suma;
	}
}
