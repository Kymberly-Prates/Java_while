package whilelista;

public class potencia_05 {

	public static void main(String[] args) {
		
		int valor = 3;
		int i = 0;
		int resultado = 0;
		
		while (i<16) {
			resultado *= valor;
			
			if (resultado == 0) 
			{
				resultado = 1;
				System.out.println(valor + "^" + i + " =" + resultado);
				i++;
			}	
			if (resultado == 1) 
			{
				resultado = 3;
				System.out.println(valor + "^" + i + " =" + resultado);
				i++;
			}   
			else {
				System.out.println(valor + "^" + i + " =" + resultado);
				i++;
			}
			
		}

	}

}
