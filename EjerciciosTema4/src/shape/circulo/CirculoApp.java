package shape.circulo;

public class CirculoApp {
	
	public static void main(String[] args) {
		Circulo circulo = new Circulo(5, "azul", false);
		System.out.println(circulo.toString() + "\nMi area es " + circulo.getArea() + "\nMi per�metro es " + circulo.getPerimetro());
	}

}
