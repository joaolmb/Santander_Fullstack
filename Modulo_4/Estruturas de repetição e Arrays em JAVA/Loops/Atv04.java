package loops_arrays;

import java.util.Scanner;

/*
Fa�a um programa que pe�a N n�meros inteiros,
calcule e mostre a quantidade de n�meros pares
e a quantidade de n�meros impares.
*/
public class Atv04 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int quantNumeros, numero, quantPar=0, quantImpar=0;
		
		System.out.println("Quantidade de n�meros: ");
		quantNumeros = input.nextInt();
		
		int count = 0;
		do {
			System.out.println("N�mero: ");
			numero = input.nextInt();
			
			if(numero%2 == 0) {
				quantPar++;
			} else { 
				quantImpar++;
			}
			count++;
		} while(count < quantNumeros);
		
		System.out.println("Quantidade de pares: "+quantPar);
		System.out.println("Quantidade de �mpares: "+quantImpar);

	}

}
