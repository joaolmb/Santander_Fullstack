package loops_arrays;

import java.util.Scanner;

/*
Fa�a um programa que leia 5 n�meros
e informe o maior n�mero
e a m�dia desses n�meros.
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
		
		System.out.println("Maior n�mero: "+maior);
		System.out.println("Soma: "+soma);
		System.out.println("M�dia: "+soma/5);
		
	}

}
