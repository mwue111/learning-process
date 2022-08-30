package shape.rectangulo;

import shape.CalculosGeo;
import shape.Shape; //esto me lo pide porque no lo he puesto en el mismo paquete de shape.

public class Rectangulo extends Shape implements CalculosGeo{
	private double ancho;
	private double largo;
	
	//constructores
	public Rectangulo() {
		super(); //no es necesario, se sobreentiende.
		ancho = 1.0;
		largo = 1.0;
	}
	
	public Rectangulo(double ancho, double largo) {
		this.ancho = ancho;
		this.largo = largo;
	}
	
	public Rectangulo(double ancho, double largo, String color, boolean relleno) {
		super(color, relleno);
		this.ancho = ancho;
		this.largo = largo;
	}
	
	public double getAncho() {
		return ancho;
	}
	
	public void setAncho(double ancho) {
		this.ancho = ancho;
	}
	
	public double getLargo() {
		return largo;
	}
	
	public void setLargo(double largo) {
		this.largo = largo;
	}
	
	public double getArea() {
		double area = ancho * largo;
		return area;
		//return ancho * largo; puedo ponerlo así 
	}
	
	public double getPerimetro() {
		/*double perimetro = (2 * largo) + (2 * ancho);
		return perimetro;*/
		return (2 * largo) + (2 * ancho);
	}
	
	public String toString() {
		return "Soy un rectángulo de área " + getArea() + " y de perímetro " 
		+ getPerimetro() + ".\nEsta es mi superclase: " + super.toString();
	}
}
