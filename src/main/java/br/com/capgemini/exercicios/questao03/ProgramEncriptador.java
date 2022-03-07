package br.com.capgemini.exercicios.questao03;

import java.util.Scanner;

public class ProgramEncriptador {

	public static void main(String[] args) {

		String textoEntrada;
		String texto;
		int quantidadeCaracteres;
		int valorGrid;

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe o texto que deseja encriptar: ");
		textoEntrada = scan.nextLine();

		//remove os espaços
		texto = textoEntrada.replaceAll(" ", "");

		//contando os caracteres
		quantidadeCaracteres = texto.length();
		
		//Valor grid
		double raiz = Math.sqrt(quantidadeCaracteres);

		valorGrid = (int) Math.ceil(raiz); 		

		//carregando Matrix
		String[][] saida = new String[valorGrid][valorGrid];

		int i = 0;
		for (int linha = 0; linha < saida.length; linha++) {

			for (int coluna = 0; coluna < saida.length; coluna++) {

				if (i < quantidadeCaracteres) {
					String letra = String.valueOf(texto.charAt(i));
					saida[linha][coluna] = letra;
					i++;
				}
			}
		}

		
		
//		// Imprimindo a Matrix
//		for (String[] Linha : saida) {
//			for (String Coluna : Linha) {
//				if (Coluna != null)
//					System.out.print(Coluna);
//			}
//			System.out.println();
//		}
//		System.out.println();
		 
		
		
		//Imprimindo a saída
		
		for (int Linha = 0; Linha < saida.length; Linha++) {
			
			for (int Coluna = 0; Coluna < saida.length; Coluna++) {
				if((saida[Coluna][Linha])!= null)
					System.out.print(saida[Coluna][Linha]);
				
				
			}
			System.out.print(" ");
			
		}

		scan.close();
		
	}

}
