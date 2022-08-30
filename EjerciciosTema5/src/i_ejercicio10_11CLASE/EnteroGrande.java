package i_ejercicio10_11CLASE;

import java.util.Arrays;

public class EnteroGrande {
	
	private static final int TAM = 30;
	private int[] lista = new int[TAM];
	
	public EnteroGrande() {
		Arrays.fill(lista, 0);
	}
	
	public EnteroGrande(String valor) {
		this.setValor(valor);
	}
	
	public String getValor() {
		String cadena = "";
		int pos = 0;
		while (pos < TAM && lista[pos] == 0)
			pos++;
		if (pos == TAM)
				cadena = "0";
			else
				for (int i = pos; i < lista.length; i++) 
					cadena += lista[i];
		return cadena;
	}
	
	public void setValor(String valor) { //[0][0][0][0][0]....[0][5][7][3][4][3]
										//			"234274657343"
		int pos = TAM - 1;			
								 
		Arrays.fill(lista, 0);
		for (int i = valor.length() - 1; i >= 0 ; i--) {
			lista[pos] = Integer.parseInt(Character.toString(valor.charAt(i)));
			pos--;
		}
	}
	
	public boolean esCero() {
		boolean cero = true;
		for (int i = 0; i < lista.length; i++) 
			if (lista[i] != 0)
				cero = false;
		return cero;
	}
	
	public int getPos(int p) {
		return lista[p];
	}
	
	public void setPos(int p, int valor) {
		lista[p] = valor;
	}
	
	
	public boolean equals(EnteroGrande o) {
		int i = 0;
		while(i < TAM && this.getPos(i) == o.getPos(i)){
			i++;
		}
		return i == TAM;
	}
	
	public static EnteroGrande suma(EnteroGrande a, EnteroGrande b) {
			//		"9877608" i = 0
			// 		[0,0,0,0......9,8,7,7,6,0,8] pos = 23
			// 		[0,0,0,0......0,1,8,5,6,9,1]
			//  acarreo 		  1	1 1 1

			//sum->	[0,0,0,0....1,0,0,6,3,2,9,9]
		
		EnteroGrande sum = new EnteroGrande();
		int acarreo = 0;
		int sumaPos;
		
		for (int i = TAM - 1; i >= 0 ; i--) {
			sumaPos = a.getPos(i) + b.getPos(i) + acarreo;
			
			if (sumaPos < 10) {
				sum.setPos(i, sumaPos);
				acarreo = 0;					
			}else {
				sum.setPos(i,  sumaPos % 10);
				acarreo = sumaPos / 10;
			}
		}
		
		return sum;
	}
		
	private static EnteroGrande restar(EnteroGrande a, EnteroGrande b){
		EnteroGrande res = new EnteroGrande();	
		int acarreo = 0;
		int restaPos;
		
		for (int i = TAM - 1; i >= 0; i--) {
			restaPos = a.getPos(i) - b.getPos(i) - acarreo;
		
			if (restaPos >= 0) {
				res.setPos(i, restaPos);
				acarreo = 0;
			}else {
				res.setPos(i, (a.getPos(i) + 10 - b.getPos(i) - acarreo) % 10);
				acarreo = 1;		
			}
		}
		return res;
	}
	
	public static boolean mayor(EnteroGrande a, EnteroGrande b){
		
        return mayorIgual(a, b) && !a.equals(b);
	}
	
	public static boolean mayorIgual(EnteroGrande a, EnteroGrande b){
		boolean esmayor = true;
		int pos = 0;
		
		while (a.getPos(pos) == 0) {		
			pos++;							
		}
		
		if (b.getPos(pos-1) > 0)
				esmayor = false;
		
			else for (int i = pos; i < TAM; i++) 
				if (a.getPos(i) < b.getPos(i)) {
					esmayor = false;
					i = TAM;
				}else if (a.getPos(i) > b.getPos(i)) 
					i = TAM;
        return esmayor;
	}
	
	public static EnteroGrande resta(EnteroGrande a, EnteroGrande b){
		EnteroGrande res = new EnteroGrande();
		
		if (mayorIgual(a, b)) 
			res = restar(a, b);
		  else 
			res = restar(b, a);
		return res;
	}
	
	public static EnteroGrande division(EnteroGrande a, EnteroGrande b){
		EnteroGrande acum = new EnteroGrande();
		int vueltas = 0;
		
		if (mayorIgual(a, b)) {
			acum = resta(a, b);
			vueltas = 1;
			while (!acum.esCero() &&  mayorIgual(acum, b)){
				acum = resta(acum, b);
				vueltas++;
			}
		}
		
 		return new EnteroGrande(Integer.toString(vueltas));
	}
	
	public static EnteroGrande producto(EnteroGrande a, EnteroGrande b){
		EnteroGrande acum = new EnteroGrande();
		long valor;
		
		if (mayor(a, b)) {
			valor = Long.parseLong(b.getValor());
			for (int j = 0; j < valor; j++)
				acum = suma(acum, a);
		}else {
			valor = Long.parseLong(b.getValor());
			for (int i = 0; i < valor; i++)
				acum = suma(acum, b);
		}
		
 		return acum;
	}
	
	public static EnteroGrande potencia(EnteroGrande a, EnteroGrande b){
		EnteroGrande acum = new EnteroGrande();
		long exp;
		
		acum.setValor("1");
		exp = Long.parseLong(b.getValor());
		
		for (int i = 0; i < exp; i++)
				acum = producto(acum, a);	
 		
		return acum;
	}
	
	public static EnteroGrande potencia2(EnteroGrande a, EnteroGrande b){
				
		double base = Double.parseDouble(a.getValor());
		double exp = Double.parseDouble(b.getValor());
		long pot = (long) Math.pow(base, exp);
		
		EnteroGrande acum = new EnteroGrande(Long.toString(pot));
		
		return acum;
	}
														//     ___
	public static EnteroGrande raiz(EnteroGrande a){  // m = \/n
		EnteroGrande r = new EnteroGrande();		
		EnteroGrande uno = new EnteroGrande();
		
		r.setValor("1");
		uno.setValor("1");
		
		while (mayorIgual(a, producto(r, r))) 
			r = suma(r, uno);
			
		if (mayor(producto(r, r), a)) 
			r = resta(r, uno);
 		return r;
	}

}

