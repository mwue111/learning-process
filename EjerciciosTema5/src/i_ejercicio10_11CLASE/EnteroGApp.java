package i_ejercicio10_11CLASE;

public class EnteroGApp {
	
		public static void main(String[] args) {
			EnteroGrande e1 = new EnteroGrande();
			EnteroGrande e2 = new EnteroGrande();
			EnteroGrande e3 = new EnteroGrande();
			
			e1.setValor("22301");
			e2.setValor("5");
			e3 = EnteroGrande.suma(e1, e2);
			System.out.println("valor suma: " + e3.getValor());
			e3 = EnteroGrande.resta(e1, e2);
			System.out.println("valor resta positiva: " + e3.getValor());
			e3 = EnteroGrande.producto(e1, e2);
			System.out.println("valor multiplicacion: " + e3.getValor());
			e3 = EnteroGrande.division(e1, e2);
			System.out.println("valor division entera: " + e3.getValor());
			e3 = EnteroGrande.potencia(e1, e2);
			System.out.println("valor potencia: " + e3.getValor());
			e3 = EnteroGrande.raiz(e1);
			System.out.println("valor raiz entera: " + e3.getValor());
		}
	}

			