package ejercicio4;

//determinar si un año es o no es bisiesto.
//año bisiesto: múltiplos de 4 (bisiesto: %4 = 0)
//los años múltiplos de 100 NO son bisiestos (bisiesto: %100 != 0) aunque sean múltiplos de 4. 
//Los múltiplos de 400 son bisiestos (bisiesto: %400 = 0)
//bisiesto: %4 = 0 && %100 != 0 && %400 = 0

public class AñoBisiesto {
	int valor;
	
	public int getValor() {
		return valor;
	}
	
	public void setValor(int entrada) {
		valor = entrada;
	}
	
	//método que determina si el año introducido es bisiesto
	public boolean esBisiesto() {
		boolean entrada;
	
			if ((valor % 4 == 0 && valor % 100 != 0) || (valor % 100 == 0 && valor % 400 == 0)){
				entrada = true;
			}
			
			else {
				entrada = false;
			}
			return entrada;
	}
	
}
