package loops_arrays;

import java.util.Scanner;

/*
Faça um programa que leia 5 números
e informe o maior número
e a média desses números.
*/
public class Atv03 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int numero, count = 0, maior=0, soma=0;

		do {
			System.out.println("Numero: ");
			numero = input.nextInt();
			soma+=numero;
			count++;
			if(numero>maior) maior = numero;
		} while (count < 5);
		
		System.out.println("Maior número: "+maior);
		System.out.println("Soma: "+soma);
		System.out.println("Média: "+soma/5);
		
	}

}
