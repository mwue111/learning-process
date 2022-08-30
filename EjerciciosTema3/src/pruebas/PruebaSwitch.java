package pruebas;

public class PruebaSwitch {
	
	public void semana(int dia) {
		switch(dia) {
		case 1: System.out.println("Lunes"); break;
		case 2: System.out.println("Martes"); break;
		case 3: System.out.println("Miércoles");break;
		case 4: System.out.println("Jueves"); break;
		case 5: System.out.println("Viernes"); break;
		case 6: System.out.println("Sábado"); break;
		case 7: System.out.println("Domingo"); break;
		default: System.out.println("Número incorrecto");
		}
	}
	
	public void mientras() {
		int cont = 0;
		while (cont <= 10) {
			System.out.println(cont);
			cont++;
		}
	}
	
	public void hacerMientras() {
		int cont = 0;
		do {
			cont++;
			System.out.println(cont);
		}while(cont < 10);
	}
	
	public void buclePara() {
		for(int cont = 1; cont <= 10; cont++) {
			System.out.println(cont);
		}
	}

	public int multiplicar(int n) {
		int i = 1;
		while(i <= 10) {
			System.out.println(n * i);
			i++;
		}
		return i;
	}
	
	public void suma(int n) {
		int i, suma;
		suma = 0;
		for (i = 1; i <= 10; i++) {
			suma += n;
		}
		System.out.println(suma);	
		
	}
}
