package ejercicio2.matematicas;

public class Potenciar {

	//m�todo potencia sobrecargado (int, int) y (double, int)
	//el primer par�metro ser� la base, el segundo el exponente
	public int Potencia(int a, int b) {
		return (int)Math.pow(a, b);
	}
	
	public double potenciaDouble(double a, int b) {
		return Math.pow(a, b);
	}
}


/*
 * public static int Potencia (int base, int exponente){
 * 	int res = 1;
 * 	for (i = 0; i < exponente, i++){
 * 		res *= base;
 * 	}
 * 	return base;
 * }
 * 
 * 
 * */
 