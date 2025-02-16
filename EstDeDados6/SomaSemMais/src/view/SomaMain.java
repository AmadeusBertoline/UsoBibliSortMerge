package view;

import controller.SomaController;
import java.util.Scanner;

public class SomaMain {

	public static void main(String[] args) {

		SomaController soma = new SomaController();
		Scanner scanner = new Scanner(System.in);
		
		int res, n1, n2;
		
		System.out.println("Digite o primeiro valor: ");
 		n1 = scanner.nextInt();

 		System.out.println("Digite o segundo valor: ");
		n2 = scanner.nextInt();
		
		res = soma.SomaSemMais(n1, n2);
		
		System.out.println("Soma: "+res);
		
		scanner.close();
	}

}
