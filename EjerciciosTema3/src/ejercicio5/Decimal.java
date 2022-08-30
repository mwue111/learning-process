package ejercicio5;

//averiguar si un n�mero real introducido por teclado tiene o no parte fraccionaria.
//usar math.round(): redondea a n�meros enteros

public class Decimal {
	private double num;
	
	//getter
	public double getNum() {
		return num;
	}
	
	//setter
	public void setNum(double valor) {
		num = valor;
	}
	
	//m�todo que averigua si el numero introducido tiene parte decimal o no
	public boolean esDecimal(double valor) {
		boolean esDecimal;
		if (valor / Math.round(valor) == 1) {
			 esDecimal = false;
		}
		else {
			esDecimal = true;
		}
		return esDecimal;
	}
}

//el usuario mete un numero real. el m�todo nos tiene que devolver si tiene parte decimal.
//c�mo s� que algo tiene parte decimal: si dividiendo ese numero entre math.round da 1 o no