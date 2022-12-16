package whilelista;

public class soma_02 {

	public static void main(String[] args) {
		int inicial = 0;
		int soma = 0;
		
		while (inicial <= 100) 
		{
			soma += inicial;
			inicial++;
		}
		System.out.println("O resultado total é: " + soma);
	}


}
