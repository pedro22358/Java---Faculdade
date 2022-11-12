package lista3;

import java.util.Scanner;

public class Exercicio4 {
public static void menu(int x, int y, int z) {
	if (x < y+z && y < x+z && z < x+y) {	//Verificação de triângulo
		if ( x == y && x == z) {	//Definição do tipo de triângulo
			System.out.println("Equilátero");
		}
		else if (x != y && x != z && y != z){
			System.out.println("Escaleno");
		}
		else {
			System.out.println("Isóceles");
		}
	}
	else {
		System.out.println("Não é triângulo");
	}
}
	public static void main(String[] args) {
	Scanner ent = new Scanner(System.in);
	int x, y, z;
	System.out.println("Digite três lados de um triângulo: (Ou negativo)");
	x = ent.nextInt();
	y = ent.nextInt();
	z = ent.nextInt();
	while(x >= 0 && y >=0 && z >=0) {	//While para número indefinido de repetição
		menu(x,y,z);
		System.out.println("Digite três lados de um triângulo: (Ou negativo)");
		x = ent.nextInt();
		y = ent.nextInt();
		z = ent.nextInt();
	}
	ent.close();
	}

}
