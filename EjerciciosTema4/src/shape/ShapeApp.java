package shape;

public class ShapeApp {
	public static void main(String[] args) {
		Shape nuevo = new Shape();
		
		System.out.println(nuevo.toString());
		/*Es b�sicamente como escribir esto:
		 * 
		 * System.out.println("La figura nueva es de color " + nuevo.getColor() + 
		" y est� rellena: " + nuevo.estaRelleno());*/
		
	}

}
