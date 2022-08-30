package ejercicio2;

//Calcular la raíz cuadrada de un número introducido por teclado.
//sólo números positivos.

public class RaizCuadrada {
	int num;
	
	//getter para tener acceso a la variable:
	public int getNum() {
		return num;
	}
	
	//método para calcular la raíz cuadrada
	public void raizCuadrada(int valor) {
		if (valor > 0) {
			num = (int)Math.sqrt(valor);
		}
		else {
			System.out.println("Debes introducir un número positivo distinto de 0.");
			num = 0;
		}
		
	}
}
