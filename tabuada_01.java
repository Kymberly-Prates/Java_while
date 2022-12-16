package whilelista;

import java.util.Scanner;

public class tabuada_01 {
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Digite um umero patra mostrar a tabuada do mesmo");
		int numero = sc.nextInt();
		int X = 1;

		while (X>=11) {
			int resultado = numero * X;
			System.out.println(X + " ° " + numero + " = " + resultado);
			X++;
		}
		
	}


}
