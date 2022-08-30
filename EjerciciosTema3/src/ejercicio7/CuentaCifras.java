package ejercicio7;

//determinar el n�mero de cifras de un n�mero entero.
//hasta 5 cifras
//incluyendo negativos

public class CuentaCifras {
	private int valor;
	private int acum;
	private int cont;
	
	//constructor que inicie todo a 0
	public CuentaCifras() {
	}
	
	//getter	
	public int getValor() {
		return valor;
	}
	
	public int getAcum() {
		return acum;
	}
	
	public int getCont() {
		System.out.println("Cont es " + cont);
		return cont;
	}
	
	//setter
	public void setValor(int num) {
		valor = num;
	}
	
	public void setCont(int num) {
		cont = 0;
	}
		
	//m�todo que cuente las cifras de un n�mero 
	public void cuentaCifras(int num) { //num: 12345, acum 0
		while(num % 10 != 0) {		//num 12345		/num 1234		/123	/12	/1
			acum = num % 10; 		//acum vale 5	/acum vale 4	/3		/2	/0
			num = num / 10;			//num vale 1234	/num vale 123	/12		/1	/0
			cont++;					//cont vale 1	/cont vale 2	/3		/4	/5
		}
		
	}
	
	
}


//necesito que lea un entero y que diga cu�ntas cifras tiene
//1 -> 1, 12 -> 2, 123 -> 3, 1234 -> 4, 12345 -> 5
//veo si en la primera posici�n hay un numero, lo sumo a la segunda.
//12345 % 10 si sale un n�mero distinto de 0, se acumula en una variable.
//12345/10, quito el 5.
//1234 % 10 y as�.
// num % 10 != 0 => acum++. num / 10 = valor. num % 10 != 0, acum++.
//hasta que valor % 10 = 0. devuelve res.