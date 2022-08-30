package ejercicio11;

//programa que pregunte al usuario si desea ver pares o impares.
//dependiendo de la respuesta, muestre pares o impares entre dos números introducidos.
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
 * Primero que introduzca dos números que irán a los métodos pares o impares.
 * Se le preguntará si quiere pares o impares.
 * Meterá por teclado la palabra par o impar (String)
 * Esa palabra será la que active un método u otro
 * 
 * método string par que devuelva los pares independientemente del orden
 * 
 * */
 