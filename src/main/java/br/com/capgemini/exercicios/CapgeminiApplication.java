package br.com.capgemini.exercicios;

import java.util.Scanner;

import br.com.capgemini.exercicios.questao01.ProgramMediana;
import br.com.capgemini.exercicios.questao02.ProgramPares;
import br.com.capgemini.exercicios.questao03.ProgramEncriptador;

public class CapgeminiApplication {

	public static void main(String[] args) {
		int op ;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("1-Questão01"+"\n"+"2-Questão02"+"\n"+"3-Questão03"+"\n");
		System.out.print("Escolha uma das Questões: "); 
		
		op = scan.nextInt();
		
		switch (op) {
		case 1:
			ProgramMediana.main(args);
			break;
			
		case 2:
			ProgramPares.main(args);
			break;
			
		case 3:
			ProgramEncriptador.main(args);
			break;

		default:
			System.out.println("Opção inválida!");
			break;
		}
		
		
		scan.close();
		
	}

}
