package zoo;

//clase con atributos nombre (String) y edad (int) con getters y setters.
//constructor que permita asignar valores a ambos atributos durante la creaci�n del objeto.
//Implementar m�todo clone() y m�todo equals() heredados de Object
//para: copiar y comparar.
//Escribir un programa que lo demuestre.

public class Animal {
	private String nom;
	private int edad;
	public static int numAnimales; //que cuente cu�ntos objetos de la clase animal se han creado
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
		/*tambi�n se puede escribir as�: 
		 * setNom(copia.getNom()); 
		 * setEdad(copia.getEdad());*/
	}
	
	//con este m�todo solo, no se puede preguntar a la clase. A�adir Static para poder preguntar a la clase:
	public /*static*/ int getNumAnimales() {
		return numAnimales;
	}
	
	/*
	Seg�n mis apuntes, para el contador pod�a crear este m�todo, pero no veo
	c�mo hacer que funcione: 
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
		
	//m�todo clone()
	@Override //para estar segura de que se est� sobreescribiendo la clase heredada clone
	public Animal clone() { //tiene que devolver un animal igual que el que est� clonando: con las mismas caracter�sticas
		Animal clon = new Animal(nom, edad); //(getNom(), getEdad()); tambi�n vale
		return clon;
	}	
	
	//m�todo equals() dice si los dos objetos son el mismo en memoria.
	//@Override comentado porque se queja: el animal que comparar deber�a ser un Object 
	public boolean equals(Animal b) {
		boolean result;
		result = getNom().equals(b.getNom()) && getEdad() == b.getEdad();
		return result;
		//o se puede hacer en una sola l�nea:
		//return this.edad == b.getEdad() && this.nom.equals(b.getNom());
	}
}
