package testEjercicio2;

import ejercicio2.matematicas.*;

public class Test {
	public static void main(String[] args) {
		Sumar s = new Sumar(); //porque no es estático
		Potenciar p = new Potenciar();
		
		//System.out.println(sumar.suma(4.7, 3)); //si los métodos son static: admite tanto reales como enteros porque el método está sobrecargado
		System.out.println("La suma de los valores 1 y 2 es " + s.Suma(1,2) + "\nY entre 1.2 y 2.5 es " + s.Suma(1.2, 2.5) + ".");
		System.out.println("La potencia de dos elevado a tres es " + p.Potencia(2, 3) + "\nY de 2.5 elevado a dos es " + p.potenciaDouble(2.5, 2) + ".");
	
	}
	
}
