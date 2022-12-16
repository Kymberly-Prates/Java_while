package whilelista;

public class impar_4 {

	public static void main(String[] args) {
		
		int numero = 1;
		
		while(numero<=20)
		{
			if (numero % 2 == 0)
			{
				numero += 1;
			} else {
				System.out.println(numero + " valor digitado é impar");
				numero += 1;
			}
		}
	}

}
