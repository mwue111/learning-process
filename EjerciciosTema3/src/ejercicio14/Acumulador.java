package ejercicio14;

//calcular la suma de todos los pares entre 1 y 1000.

public class Acumulador{
	
	public int suma() {
		int acum = 0;
		int num = 1;
		
		while(num <= 1000) {
			if (num % 2 == 0) {
				acum += num;	
			}
			num++;
		}
		
		return acum;
	}
	
	public static void main(String[] args) {
		Acumulador a = new Acumulador();
		
		System.out.println(a.suma());
	}
}


