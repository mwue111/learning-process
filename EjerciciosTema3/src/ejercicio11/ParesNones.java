package ejercicio11;

//programa que pregunte al usuario si desea ver pares o impares.
//dependiendo de la respuesta, muestre pares o impares entre dos n�meros introducidos.
//cualquiera puede ser el mayor.

public class ParesNones {
	private int par;
	private int impar;
	
	public int getPar(){
		return par;
	}
	
	public int getImpar(){
		return impar;
	}
		
	public void paresNones(String eleccion, int num1, int num2) {
		if(eleccion.equals("PAR")) {
			pares(num1, num2);
		}
		else {
			impares(num1, num2);
		}
	}
	
	public void pares(int num1, int num2) {
		if(num1 <= num2) {
			while(num1 <= num2) {
				if(num1 % 2 == 0) {
					System.out.println(num1);				
				}
				num1++;
			}
		}
		else {
			while(num2 <= num1) {
				if(num2 % 2 == 0) {
					System.out.println(num2);
				}
				num2++;
			}
		}
	}
	
	public void impares(int num1, int num2) {
		if(num1 <= num2) {
			while (num1 <= num2) {
				if (num1 % 2 != 0) {
					System.out.println(num1);
				}
			num1++;
			}
		}
		else {
			while(num2 <= num1) {
				if(num2 % 2 != 0) {
					System.out.println(num2);
				}
			num2++;	
			}
		}
	}
	
}


/*****DIVAGACIONES***
 * 
 * Quiero que el usuario elija par o impar.
 * Primero que introduzca dos n�meros que ir�n a los m�todos pares o impares.
 * Se le preguntar� si quiere pares o impares.
 * Meter� por teclado la palabra par o impar (String)
 * Esa palabra ser� la que active un m�todo u otro
 * 
 * m�todo string par que devuelva los pares independientemente del orden
 * 
 * */
 