package ejercicio10;

//escribir todos los impares entre dos números introducidos por teclado.
//Cualquiera puede ser mayor.
//comprobar cuál es mayor para empezar a mostrar números.

public class Impares {
	
	
	//método que escribe todos los impares si se introduce primero el pequeño
	public void impar(int num1, int num2) {
		if (num1 <= num2) {
			while(num1 <= num2) {
				if(num1 % 2 != 0) {
					System.out.println(num1);
				}
				num1++;
			}
		}
		else {
			while(num2 <= num1) {
				if (num2 % 2!= 0) {
					System.out.println(num2);
				}
				num2++;
			}	
		}	
	}
}


/****DIVAGACIONES***
 * 
 * Si se introduce primero el mayor, habrá que tomarlo como num2 en lugar de como num1.
 * if num1 > num2 then if num2 % 2 != 0 print num2 num2++
 *  
 * */