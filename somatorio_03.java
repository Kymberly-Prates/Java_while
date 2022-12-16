package whilelista;

public class somatorio_03 {

	public static void main(String[] args) 
	{
		int numero = 1;
		int somatorio = 0;
		
		while (numero<=500) {
			if (numero % 4 ==0) 
			{
				somatorio += numero;
				numero++;
			} 
			
			else {
				numero++;
			}
		}
		System.out.println("O somatorio dos numeros de 1 a 500 é igual: " + somatorio);
	}

}
