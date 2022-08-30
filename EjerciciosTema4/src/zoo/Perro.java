package zoo;

public class Perro extends Animal {
	private String raza;
	
	public Perro(String nom, int edad, String raza) {
		super(nom, edad);
		this.raza = raza;
	}
	
	public String getRaza() {
		return raza;
	}
	
	public void setRaza(String raza) {
		this.raza = raza;
	}
	
	public boolean equals(Perro o) {
		boolean result;
		result = this.getRaza().equals(o.getRaza()) && this.getNom().equals(o.getNom()) && this.getEdad() == o.getEdad();
		return result; 
	}
}

/*public boolean equals(Animal b) {
		boolean result;
		result = getNom().equals(b.getNom()) && getEdad() == b.getEdad();
		return result;
		
		return this.edad == b.getEdad() && this.nom.equals(b.getNom());
		*/