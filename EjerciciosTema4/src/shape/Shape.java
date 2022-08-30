package shape;

/*SUPERCLASE SHAPE
 * dos atrinutos de instancia: color(string) y filled (boolean)
 * dos constructors: uno sin argumentos que inicia el color a "verde" y filled = true
 * y otro que recibirá dos argumentos para inicializar los atributos.
 * getters y setters
 * sobreescritura del método toString() de Object para devolver la cadena
 * 
 * */

public class Shape {
	private String color;
	private boolean relleno;
	
	//constructores
	public Shape() {
		color = "verde";
		relleno = true;
	}
	
	public Shape(String color, boolean relleno) {
		this.color = color;
		this.relleno = relleno;
	}
	
	//getter
	public String getColor() {
		return color;
	}
	
	//setter
	public void setColor(String color) {
		this.color = color;
	}
	
	//isFilled
	public boolean estaRelleno() {
		return relleno;
	}
	
	//setFilled
	public void setRelleno(boolean relleno) {
		this.relleno = relleno;
	}
	
	@Override
	public String toString() {
		return "Soy una figura de color " + getColor() + " y rellena: " + estaRelleno();
	}
}


/*Otra forma de escvribir toString:
 * 
 * @override String toString(){
 * 	String cad = "Soy una figura de color " + getColor() + "y "
 * 
 * 		if(estaRelleno()){
 * 			cad += "rellena";
 * 		}
 * 			else{
 * 			cad += "no relleno"
 * 			}
 * 
 * 		return cad;
 * }
 * 
 * 
 * */