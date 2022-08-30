package ejercicio17;

//se introducen 30 notas una a una.
//el programa debe decir cuántos suspensos y cuántos aprobados hay.
//sólo pueden ser notas de 1 a 10.
import java.util.Scanner;

public class Notas {
	private static Scanner sc = new Scanner(System.in);
	int aprobados;
	int alumnos;
	
	public Notas(int alumnos) {
		this.alumnos = alumnos;
	}
	
	//getters y setters
	public int getAprobados() {
		return aprobados;
	}
	
	public int getSuspensos() {
		int suspensos = alumnos - aprobados;
		return suspensos;
	}
	
	//método que lee las notas
	public void leerNotas() {
		int nota = 0;
		for (int i = 1; i <= alumnos; i++) {
			do {
				System.out.println("Introduce la nota: ");
				try {
					nota = Integer.parseInt(sc.nextLine());
					if (nota < 0 || nota > 10) {
						System.out.println("La nota debe estar entre 0 y 10.");
						nota = 0;
					}
				}catch (Exception e) {
					System.out.println("La nota debe ser un número.");
					nota = 0;
				}				
				
			}while (nota == 0);
			
			if (nota > 4) {
				aprobados++;
			}
		}
		
		
	}
		
	public static void main(String[] args) {
		Notas n = new Notas(5);
		
		n.leerNotas();
		System.out.println("Han aprobado " + n.getAprobados() + " alumnos.");
		System.out.println("Han suspendido " + n.getSuspensos() + " alumnos.");
		
	}
}
	

/*
 * 
 * public void leerNotas() {
		int nota = 0;
		
		for (int i = 1; i <= alumnos; i++) {
			do {
				System.out.println("Introduce la nota: ");
				try {
					nota = Integer.parseInt(sc.nextLine());
					//nota = sc.nextInt();
					if(nota < 0 || nota > 10) {
						System.out.println("La nota debe estar entre 0 y 10.");
						nota = 0;
					}
				}catch(Exception e) {
					System.out.println("La nota debe ser un número.");
					nota = 0;
				}
				
				}while(nota == 0);
			
			if(nota > 4) {
				aprobados++;
			}
		}
	}*/