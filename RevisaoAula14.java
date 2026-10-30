package Aula14revisao;

import java.util.Scanner;

public class RevisaoAula14 {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in); //se idade maior que ou igual a 10 "infantil"
											   //se maior o igual 11 - 15 "juvenil"
											   // senão é " aspirante"
		
		System.out.print("Digite uma idade ");
		double x = ler.nextDouble();
		
		if (x <= 10) {
			System.out.println("Idade Infantil");
		}
		else if (x >= 11 && x <= 15 ) {
			System.out.println("Idade Juvenil");
		}
		
		else {
			System.out.println("Aspirante");
		}
		
		ler.close();
	}

}
