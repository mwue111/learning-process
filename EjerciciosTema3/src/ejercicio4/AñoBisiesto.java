package ejercicio4;

//determinar si un a�o es o no es bisiesto.
//a�o bisiesto: m�ltiplos de 4 (bisiesto: %4 = 0)
//los a�os m�ltiplos de 100 NO son bisiestos (bisiesto: %100 != 0) aunque sean m�ltiplos de 4. 
//Los m�ltiplos de 400 son bisiestos (bisiesto: %400 = 0)
//bisiesto: %4 = 0 && %100 != 0 && %400 = 0

public class A�oBisiesto {
	int valor;
	
	public int getValor() {
		return valor;
	}
	
	public void setValor(int entrada) {
		valor = entrada;
	}
	
	//m�todo que determina si el a�o introducido es bisiesto
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
