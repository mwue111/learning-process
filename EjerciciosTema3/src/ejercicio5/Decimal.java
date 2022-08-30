package ejercicio5;

//averiguar si un número real introducido por teclado tiene o no parte fraccionaria.
//usar math.round(): redondea a números enteros

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
	
	//método que averigua si el numero introducido tiene parte decimal o no
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

//el usuario mete un numero real. el método nos tiene que devolver si tiene parte decimal.
//cómo sé que algo tiene parte decimal: si dividiendo ese numero entre math.round da 1 o no