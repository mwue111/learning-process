package j_ejercicio29;

import java.util.ArrayList;
import java.util.Collections;

//programa que empareje diez chicos con diez chicas de manera aleatoria y los muestre por pantalla con un formato concreto.

public class Baile {
	static String[] hogChico = {"Astrix Alixan", "Malcom Baddock", "Damocles Delby", "Phineas Black", "Ritchie Coote", "Colin Creevey", "Dennis Aldermaston", "Dominic Maestro", "Fergus Cowley", "Denison Frisby"};
	static String[] beauxChico = {"Nicolas Flamel", "Bastien Janver", "Luc Millefeuille", "Davet Durmont", "Vincent Duc de Trefle-Picques", "Jean-Pierre Michel", "André Amadou", "Antoine Dubois", "Renèe Durand", "Ambre Petit"};
	static String[] durmChico = {"Igor Karkarov", "Vasily Dimitrov", "Gellert Grindelwald", "Viktor Krum", "Jasha Kusnetov", "Boris Vulchanov", "Pyotr Vulchanov", "Ivan Vólkov", "Lev Zograf", "Poliakov Oblansk"};
	
	static String[] hogChica = {"Katie Bell", "Lucretia Black", "Walburga Black", "Susan Bones", "Ella Jo", "Hestia Carrow", "Penélope Clearwater", "Jennifer Dawn", "Lily Evans", "Heidi Macavoy"};
	static String[] beauxChica = {"Fleur Delacour", "Sendelina de la Felino", "Gabrielle Delacour", "Perenelle Flamel", "Emma Moreau", "Jade Laurent", "Léa Simon", "Manon Michel", "Chloé Lefebvre", "Inès Leroy"};
	static String[] durmChica = {"Agata Ivanova", "Annika Kuznetsova", "Darya Smirnova", "Bela Volkova", "Deniska Popova", "Ekaterina Novikova", "Franka Magomedova", "Gala Petrova", "Sarka Morozova", "Viera Sokolova"};
	ArrayList<String> chicos = new ArrayList<String>();
	ArrayList<String> chicas = new ArrayList<String>();

	
	//método que añade el nombre del colegio y junta todos los chicos en un array y las chicas en otro:
	public void colegio() {
		for(int i = 0; i < hogChico.length; i++) {
			hogChico[i] += "(Hogwarts)";
			hogChica[i] += "(Hogwarts)";
			chicos.add(hogChico[i]);
			chicas.add(hogChica[i]);
		}
		
		for(int i = 0; i < beauxChico.length; i++) {
			beauxChico[i] += "(Beauxbatons)";
			beauxChica[i] += "(Beauxbatons)";
			chicos.add(beauxChico[i]);
			chicas.add(beauxChica[i]);
		}
		
		for(int i = 0; i < durmChico.length; i++) {
			durmChico[i] += "(Durmstang)";
			durmChica[i] += "(Durmstang)";
			chicos.add(durmChico[i]);
			chicas.add(durmChica[i]);
		}
		
		mezcla(chicos, chicas);
	}
	//método que desordena los arrays
	public void mezcla(ArrayList<String> chicos, ArrayList<String> chicas) {
		/*Este método puede ser simplemente el shuffle de Collections: 
			
			Collections.shuffle(chicos);
			Collections.shuffle(chicas);
		 */
		
		int indice = (int)(Math.random() * chicos.size());
	
		//intercambiar el índice actual por un índice al azar
		for(int i = 0; i < chicos.size(); i++) {
			Collections.swap(chicos, indice, i);
			Collections.swap(chicas, indice, i);
		}	
		parejas();
	}
	
	//método que los une de manera aleatoria
	public void parejas() {
		int len = chicos.size();
		int randomChico;
		int randomChica;
		int cont = 0;
		String alumno;
		String alumna;
		ArrayList<String> parejas = new ArrayList<String>();
		
		while(cont < len) {
			for(int i = 0; i < len; i++) {
				randomChico = (int)(Math.random() * chicos.size());
				alumno = chicos.get(randomChico);
				randomChica = (int)(Math.random() * chicas.size());
				alumna = chicas.get(randomChica);
				String pareja = alumno + " - " + alumna; 
						
				if(!parejas.contains(alumno) && !parejas.contains(alumna)) {
					parejas.add(alumno);
					parejas.add(alumna);
					cont++;
					System.out.println("Pareja " + cont + ": " + pareja);
				}
			}
		}
	}
	
	public static void main(String[] args) {
		Baile b = new Baile();

		b.colegio();
	}
}