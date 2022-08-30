package ejercicio2;

//Calcular la ra�z cuadrada de un n�mero introducido por teclado.
//s�lo n�meros positivos.

public class RaizCuadrada {
	int num;
	
	//getter para tener acceso a la variable:
	public int getNum() {
		return num;
	}
	
	//m�todo para calcular la ra�z cuadrada
	public void raizCuadrada(int valor) {
		if (valor > 0) {
			num = (int)Math.sqrt(valor);
		}
		else {
			System.out.println("Debes introducir un n�mero positivo distinto de 0.");
			num = 0;
		}
		
	}
}
