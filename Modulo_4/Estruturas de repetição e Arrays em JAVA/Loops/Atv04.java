package loops_arrays;

import java.util.Scanner;

/*
Faça um programa que peça N números inteiros,
calcule e mostre a quantidade de números pares
e a quantidade de números impares.
*/
public class Atv04 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int quantNumeros, numero, quantPar=0, quantImpar=0;
		
		System.out.println("Quantidade de números: ");
		quantNumeros = input.nextInt();
		
		int count = 0;
		do {
			System.out.println("Número: ");
			numero = input.nextInt();
			
			if(numero%2 == 0) {
				quantPar++;
			} else { 
				quantImpar++;
			}
			count++;
		} while(count < quantNumeros);
		
		System.out.println("Quantidade de pares: "+quantPar);
		System.out.println("Quantidade de ímpares: "+quantImpar);

	}

}
