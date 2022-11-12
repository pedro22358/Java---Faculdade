package lista3;

import java.util.Scanner;

public class Exercicio4 {
public static void menu(int x, int y, int z) {
	if (x < y+z && y < x+z && z < x+y) {	//Verifica��o de tri�ngulo
		if ( x == y && x == z) {	//Defini��o do tipo de tri�ngulo
			System.out.println("Equil�tero");
		}
		else if (x != y && x != z && y != z){
			System.out.println("Escaleno");
		}
		else {
			System.out.println("Is�celes");
		}
	}
	else {
		System.out.println("N�o � tri�ngulo");
	}
}
	public static void main(String[] args) {
	Scanner ent = new Scanner(System.in);
	int x, y, z;
	System.out.println("Digite tr�s lados de um tri�ngulo: (Ou negativo)");
	x = ent.nextInt();
	y = ent.nextInt();
	z = ent.nextInt();
	while(x >= 0 && y >=0 && z >=0) {	//While para n�mero indefinido de repeti��o
		menu(x,y,z);
		System.out.println("Digite tr�s lados de um tri�ngulo: (Ou negativo)");
		x = ent.nextInt();
		y = ent.nextInt();
		z = ent.nextInt();
	}
	ent.close();
	}

}
