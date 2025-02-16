package controller;

public class SomaController {

	public int SomaSemMais(int n1, int n2) {

		//Caso o n2, que está passando seu valor 1 por 1 para n1 chegar a 0, não tem mais nada
		//para somar, logo retornamos o resultado da soma acumulado em n1
		if (n2 == 0) {

			return n1;

		}
		
		//A cada recursão, tiramos 1 de "n2" para colocar 1 em "n1"

		return SomaSemMais(n1 + 1, n2 - 1);

	}

}
