package br.com.capgemini.exercicios.questao02;


import java.util.Scanner;

public class ProgramPares {

	public static void main(String[] args) {

		int N, elementos,xInformado, X = 0 ;
		
		Scanner scan = new Scanner(System.in);

		System.out.print("Informe o número de elementos: ");
		elementos = scan.nextInt();
		
		int[] vetor = new int[elementos];

		//Carregando Array		
		for(int i = 0; i < vetor.length; i++) {
			System.out.print("Informe o elemento " +i+": ");
			N = scan.nextInt();
			vetor[i] = N;

		}
		
		System.out.println("Infome o valor de X: ");
		 xInformado = scan.nextInt();
		 
		 for(int x = 0 ; x < vetor.length; x++) {
			 for(int i = 1; i < vetor.length; i++) {
				 int diferenca = vetor[i] - vetor[x]; 
				 if(diferenca == xInformado) {
					 X++;
				 }
			 }
		 }


		//Impressão
		 
		System.out.println("Existem " + X + " pares.");

		scan.close();

	}
	
	


}
