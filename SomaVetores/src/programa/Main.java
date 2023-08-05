package programa;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Quantos números deseja digitar por vetor? ");
		int quant = sc.nextInt();
		
		int[] vetor1 = new int[quant];
		int[] vetor2 = new int[quant];
		
		System.out.println("\nVetor A");
		for(int i = 0; i < quant; i++) {
			System.out.printf("Digite o %d° número: ", i + 1);
			vetor1[i] = sc.nextInt();
		}
		
		System.out.println("\nVetor B");
		for(int i = 0; i < quant; i++) {
			System.out.printf("Digite o %d° número: ", i + 1);
			vetor2[i] = sc.nextInt();
		}
		
		System.out.println("\nSoma dos valores por indice: ");
		for(int i = 0; i < quant;  i++) {
			System.out.println(vetor1[i] + vetor2[i]);
		}
		
		
		

		sc.close();
	}

}
