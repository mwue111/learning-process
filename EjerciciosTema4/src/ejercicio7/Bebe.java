package ejercicio7;

public class Bebe {
	Bebe (int i){
		this("Soy un beb�");
		System.out.println("Hola, tengo " + i + " meses");
	}
	
	Bebe (String s){
		System.out.println(s);
	}
	
	void llora() {
		System.out.println("��Buaaaaaaaa!!");
	}
	
	public static void main (String[] args) {
		new Bebe(8).llora();
	}
		
}

/*La clase tiene varios m�todos.
 * un m�todo Bebe que recibe un entero como par�metro formal.
 * el m�todo llama al propio objeto que est� ejecutando el c�digo,
 * es decir, a la clase en la que est�, con la frase "soy un beb�".
 * Est� llamando al constructor que hay en la propia clase y que
 * debe devolver un mensaje que dice soy un beb�.
 * 
 * Imprime por pantalla Hola, tengo [par�metro de entrada] meses.
 * 
 * El siguiente m�todo recibe un String s que se imprimir� en pantalla.
 * Es el constructor.
 * 
 * El siguiente m�todo llamado llora imprime una l�nea con el llanto.
 * 
 * Soy un beb�
 * Hola, tengo 8meses
 * Buaaaa
 * 
 * */
 