package whilelista;

import java.util.Scanner;

public class potencia_base_06 {

	public static void main(String[] args) {
		int i = 0;
		
		int resultado = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um valor para ficar de base:");
		int base = sc.nextInt();
		
		System.out.println("Digite o valor para ser elevado:");
		int expoente = sc.nextInt();
		
		while (i != (expoente + 1)) 
		{
		resultado*= base;
			if (resultado == 0) 
			{
				resultado++;
			}
			i++;
		}
		System.out.println("Resultado é: " + resultado);
	}

}
