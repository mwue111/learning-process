package shape.circulo;

import shape.CalculosGeo;
import shape.Shape;

public class Circulo extends Shape implements CalculosGeo{
	private double radio;
	
	//constructor
	public Circulo() {
		radio = 1.0;
	}
	
	public Circulo (double radio) {
		this.radio = radio;
	}
	
	public Circulo (double radio, String color, boolean relleno) {
		super(color, relleno); //la llamada al constructor padre tiene que ser la primera
		this.radio = radio;
	}
	
	public double getRadio() {
		return radio;
	}
	
	public void setRadio(double radio) {
		this.radio = radio;
	}
	
	public double getArea() {
		double area = Math.PI * Math.pow(radio, 2);
		return area;
	}
	
	public double getPerimetro() {
		double perimetro = (2 * Math.PI) * radio;
		return perimetro;
	}
	
	public String toString() {
		return "Soy un círculo con radio = " + getRadio() + ". \nEsta es mi superclase: \n" + 
				super.toString();  
	}
}
