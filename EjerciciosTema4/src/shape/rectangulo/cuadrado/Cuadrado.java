package shape.rectangulo.cuadrado;

import shape.rectangulo.Rectangulo;

public class Cuadrado extends Rectangulo{
	
	//constructores
	public Cuadrado() {
		super();
	}
	
	public Cuadrado(double lado) {
		super(lado, lado); 
	}
	
	public Cuadrado(double lado, String color, boolean relleno) {
		super(lado, lado, color, relleno); //correspondencia ancho y largo con lado
	}
	
	public double getLado() {
		return getLargo();
	}
	
	public void setAncho(double lado) {
		super.setLargo(lado); //se llama al set de super y se le pasa el lado
		super.setAncho(lado);
	}
	
	public void setLargo(double lado) {
		super.setLargo(lado);
	}
	
	public String toString() {
		return "Soy un cuadrado de lado " + getLado() + ", de área " + getArea() + 
				" y de perímetro " + getPerimetro() +
				".\nMi superclase es: " + super.toString();
	}
	
}

/*	Aparecen en el UML pero según el enunciado no hay que ponerlos:
 *	public Cuadrado() {
		
	}
	public Cuadrado(double lado, String color, boolean relleno) {
		super();
	}
	
	public double getLado() {
		return setLargo();	
	}
	
	public void setLado(double lado) {
		lado = super.getLargo();
	}
	
	
	 
 * */
