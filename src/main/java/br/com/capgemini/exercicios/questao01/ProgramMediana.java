package br.com.capgemini.exercicios.questao01;

import java.util.Arrays;
import java.util.Scanner;

public class ProgramMediana {

	public static void main(String[] args) {
		
		int N;
	
		System.out.println("Informe a lista de números para a mediana: ");
		Scanner scan = new Scanner(System.in);
		
		int[] array = new int[5];
		
		//Carregando Array		
		for(int i = 0; i < array.length; i++) {
			N = scan.nextInt();
			array[i] = N;
		}
		
		//ordenação
		Arrays.sort(array);
		
		//saída
		int resultado = array.length / 2;
		System.out.println(array[resultado]);
		
		
		scan.close();
		

	}

}
