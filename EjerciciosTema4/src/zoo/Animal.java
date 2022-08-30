package zoo;

//clase con atributos nombre (String) y edad (int) con getters y setters.
//constructor que permita asignar valores a ambos atributos durante la creación del objeto.
//Implementar método clone() y método equals() heredados de Object
//para: copiar y comparar.
//Escribir un programa que lo demuestre.

public class Animal {
	private String nom;
	private int edad;
	public static int numAnimales; //que cuente cuántos objetos de la clase animal se han creado
	//este es static porque quien lleva la cuenta de los animales es la clase.
	
	//constructor
	public Animal(String nom, int edad) {
		this.nom = nom;
		this.edad = edad;
		numAnimales++;
	}
	
	//constructor copia
	public Animal(Animal copia) {
		nom = copia.getNom();
		edad = copia.getEdad();
		/*también se puede escribir así: 
		 * setNom(copia.getNom()); 
		 * setEdad(copia.getEdad());*/
	}
	
	//con este método solo, no se puede preguntar a la clase. Añadir Static para poder preguntar a la clase:
	public /*static*/ int getNumAnimales() {
		return numAnimales;
	}
	
	/*
	Según mis apuntes, para el contador podía crear este método, pero no veo
	cómo hacer que funcione: 
	public static void numAnimales() {
		numAnimales++;
	}
	*/
		
	public String getNom() {
		return nom;
	}
	
	public int getEdad() {
		return edad;
	}
	
	public void setNom(String n) {
		nom = n;
	}
	
	public void setEdad(int e) {
		edad = e;
	}
		
	//método clone()
	@Override //para estar segura de que se está sobreescribiendo la clase heredada clone
	public Animal clone() { //tiene que devolver un animal igual que el que está clonando: con las mismas características
		Animal clon = new Animal(nom, edad); //(getNom(), getEdad()); también vale
		return clon;
	}	
	
	//método equals() dice si los dos objetos son el mismo en memoria.
	//@Override comentado porque se queja: el animal que comparar debería ser un Object 
	public boolean equals(Animal b) {
		boolean result;
		result = getNom().equals(b.getNom()) && getEdad() == b.getEdad();
		return result;
		//o se puede hacer en una sola línea:
		//return this.edad == b.getEdad() && this.nom.equals(b.getNom());
	}
}
