package ejercicio20;

import java.util.Scanner;

/*
 El usuario escribe una fecha de nacimiento DD-MM-AAAA y hay que sumar
 todas las cifras hasta quedar un un número.
 */

public class NumeroSuerte {
	private int dia;
	private int mes;
	private int anyo;
	
	public NumeroSuerte (){
	}
	
	public void setDia(int dia) {
		this.dia = dia;
	}
	
	public void setMes(int mes) {
		this.mes = mes;
	}
	
	public void setAnyo(int anyo) {
		this.anyo = anyo;
	}
	
	public int getDia() {
		return dia;
	}
	
	public int getMes() {
		return mes;
	}
	
	public int getAnyo() {
		return anyo;
	}
	
	private void sumaCifras(int d, int m, int a){
		int cifraDia;
		int cifraMes;
		int cifraAnyo;
		int acum; 
		
		dia = 0;
		mes = 0;
		anyo = 0;
		acum = 0;
		
		//dia
		while (dia <= d){
			cifraDia = d % 10;
			//System.out.println(cifraDia);
			d /= 10;
			//System.out.println(d);
			dia = cifraDia + d;
			//System.out.println(dia);
		}
		
		//mes
		while(mes <= m) {
			cifraMes = m % 10;
			m /= 10;
			mes = cifraMes + m;
		}
		
		//año
		while(anyo <= a) {										//1234			
			cifraAnyo = a % 1000;
			System.out.println("cifraAnyo es " + cifraAnyo);	//234
			a /= 1000;
			System.out.println("a2 vale " + a);					//1
			acum = a;											//acum vale a (1)
			System.out.println("acum es " + acum);
			anyo = cifraAnyo;									
			System.out.println("anyo vale " + anyo);			//anyo vale 234
			anyo = cifraAnyo + a;
			System.out.println(anyo);							//235
			a = cifraAnyo;
			System.out.println("a es " + a);
		}
		
		/*
		 * 
		 * tengo que guardar a
		 * usar anyo para seguir el bucle
		 * 
		 * 
		 * 
		cifraAnyo = a % 1000;
		System.out.println(cifraAnyo);
		a /= 1000;
		System.out.println(a);
		cifraAnyo /= 100;
		System.out.println(cifraAnyo);
		anyo = a + cifraAnyo;
		System.out.println(anyo);
		
		mientras que "anyo" sea menor o igual a "a" 
		 *(no puedo inicializarlas al mismo valor entonces)
		 *tengo que hacer módulos y divisiones sucesivas 
		 *ir sumando esos módulos y divisiones
		 *(como con mes y día)
		 *guardarlo en la variable "anyo"
		 *
		 *while (anyo <= a){
		 *	cifraAnyo = a % 1000;
		 *	a /= 1000;
		 *	anyo = cifraAnyo + a;
		 *}
		 */
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		NumeroSuerte ns = new NumeroSuerte();
		
		System.out.println("Escribe un día (dd), un mes (mm) y un año (aaaa): ");
		int dia = sc.nextInt();
		int mes = sc.nextInt();
		int anyo = sc.nextInt();
		
		ns.sumaCifras(dia, mes, anyo);
		
		System.out.println("La suma de las cifras de los días es " + ns.getDia() +
				"\nLa suma de las cifras de los meses es " + ns.getMes() + 
				"\nY la suma de las cifras del año es " + ns.getAnyo() + ".");
		
		
	}
}

/*
 * Primero el método para sumar cifras:
 * El usuario introduce el día 12
 * El método debe saber separar decimales de unidades y sumarlas
 *  
 * %10 del número 10 va a dar 2 --> quito el 2
 * 12/10 = 1 va a dar uno
 * sumar el resto y el resultado de la división
 * 
 * con el mes puedo hacer lo mismo
 * 
 * con el año son cuatro cifras
 * 1990
 * primero %1000 -- quito 990
 * luego resultado /1000 -- me quedo con 1
 * luego %100 -- quito 90
 * resultado /100 -- 9
 *  
 * 
 */

/*
cifraDia = d % 10;
//System.out.println(cifraDia);
d /= 10;
//System.out.println(d);
dia = cifraDia + d;
//System.out.println(dia);
*/


/*
cifraMes = m % 10;
//System.out.println(cifraMes);
m /= 10;
//System.out.println(m);
mes = cifraMes + m;
//System.out.println(mes);
*/

/****************INTENTOS AÑO***********************
 * 1. 
 * 			cifraAnyo = a % 1000;
			acum = cifraAnyo;
			System.out.println(cifraAnyo);	//234
			a /= 1000;
			System.out.println(a);			//1
			anyo = cifraAnyo + a;
			System.out.println(anyo);		//235
			acum = a;

*****************************************************
*2.
*			int a2 = a;
			
			cifraAnyo = a2 % 1000;
			System.out.println("cifraAnyo es " + cifraAnyo);	//234
			a2 /= 1000;
			System.out.println("a2 vale " + a2);			//1
			acum = a2;						//acum vale a (1)
			System.out.println("acum es " + acum);
			anyo = cifraAnyo;				//anyo vale 234
			System.out.println("anyo vale " + anyo);	
			anyo = cifraAnyo + a2;
			System.out.println(anyo);		//235
			
********************************************************
 * */