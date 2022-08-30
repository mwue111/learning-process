package zoo;

import java.util.Scanner;

public class AnimalApp {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Pulsa 1 para empezar el programa.");
		int menu = sc.nextInt();
		
		while(menu == 1) {
	
			System.out.println("Escribe un nombre y una edad para este animalico del Señor: ");
			String nom = sc.next();
			int edad = sc.nextInt();
			
			//Programa que demuestra que el método clone y equals funciona:
			//se hacen clones llamando al método clon
			Animal a = new Animal(nom, edad);
			Animal b = a.clone();
			Animal c = a.clone();
			
			System.out.println("Escribe un nombre y edad para otro animal: ");
			nom = sc.next();
			edad = sc.nextInt();
			Animal nuevo = new Animal(nom, edad);
			
			//se compara llamando al método equals
			System.out.println("El animal se llama " + a.getNom() + " y tiene " + a.getEdad() + " años. "
					+ "Es igual a los otros animales: " + b.equals(c));
			
			//nuevo objeto
			System.out.println("El nuevo animal se llama " + nuevo.getNom() + " y tiene "
					+ nuevo.getEdad() + " años.");
			
			//comprobación de que el contador funciona
			System.out.println("Se han creado " + a.getNumAnimales() + " animales.");
			
			//llamada al constructor copia
			Animal d = new Animal(a);
			
			System.out.println("El nombre del animal a es " + a.getNom() + " y tiene " + a.getEdad());
			System.out.println("El nombre del animal d es " + d.getNom() + " y tiene " + d.getEdad());
			
			//llamando a perro
			System.out.println("Ponle un nombre, edad y raza al perro. ");
			nom = sc.next();
			edad = sc.nextInt();
			String raza = sc.next();
			
			Perro animalPerro = new Perro(nom, edad, raza);
			System.out.println("El perro se llama " + animalPerro.getNom() + ", tiene " + animalPerro.getEdad() + " años y su raza es " + animalPerro.getRaza());
			
			//Después de crear el método equals en perro, mirar si lo hace bien: 
			//estos dos perros tienen que ser distintos y dar false.
			Perro x = new Perro("Ana", 4, "Pastor Alemán");
			Perro z = new Perro("Ana", 4, "Pastor Belga");
			
			System.out.println(x.equals(z));
			
			//llamando a gato
			
			System.out.println("Ponle un nombre y edad al gato: ");
			nom = sc.next();
			edad = sc.nextInt();
			
			Gato animalGato = new Gato(nom, edad);
			
			System.out.println("El gato se llama " + animalGato.getNom() + " y tiene " + animalGato.getEdad() + " años. Le quedan " + animalGato.getVidas() + " vidas.");
			animalGato.restaVidas();
			System.out.println("Al gato le quedan " + animalGato.getVidas() + " vidas. :(");
			
			Gato r = new Gato("Zoe", 2);
			r.restaVidas();
			Gato w = new Gato("Zoe", 2);
			System.out.println(r.equals(w));
			
			//menu
			System.out.println("Pulsa 0 para finalizar el programa.");
			menu = sc.nextInt();
		}
		
		System.out.println("Programa finalizado.");
		
		sc.close();
	}

}

