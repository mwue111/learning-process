package zoo;

public class Gato extends Animal {
	private int vidas;
	
	public Gato(String nom, int edad) {
		super(nom, edad);
		vidas = 7;
	}
	
	public int getVidas() {
		return vidas;
	}
	
	public void restaVidas() {
		vidas--;
	}
	
	//con este, tienen que tener el mismo número de vidas para ser iguales
	public boolean equals(Gato g) {
		boolean result;
		result = getVidas() == g.getVidas()
				&& this.getNom().equals(g.getNom()) 
				&& this.getEdad() == g.getEdad();
		return result;
	}
}
