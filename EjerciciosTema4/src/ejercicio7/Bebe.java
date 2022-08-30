package ejercicio7;

public class Bebe {
	Bebe (int i){
		this("Soy un bebé");
		System.out.println("Hola, tengo " + i + " meses");
	}
	
	Bebe (String s){
		System.out.println(s);
	}
	
	void llora() {
		System.out.println("¡¡Buaaaaaaaa!!");
	}
	
	public static void main (String[] args) {
		new Bebe(8).llora();
	}
		
}

/*La clase tiene varios métodos.
 * un método Bebe que recibe un entero como parámetro formal.
 * el método llama al propio objeto que está ejecutando el código,
 * es decir, a la clase en la que está, con la frase "soy un bebé".
 * Está llamando al constructor que hay en la propia clase y que
 * debe devolver un mensaje que dice soy un bebé.
 * 
 * Imprime por pantalla Hola, tengo [parámetro de entrada] meses.
 * 
 * El siguiente método recibe un String s que se imprimirá en pantalla.
 * Es el constructor.
 * 
 * El siguiente método llamado llora imprime una línea con el llanto.
 * 
 * Soy un bebé
 * Hola, tengo 8meses
 * Buaaaa
 * 
 * */
 