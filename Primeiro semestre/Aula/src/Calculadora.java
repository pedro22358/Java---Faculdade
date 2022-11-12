package src;

import java.util.Scanner;
import java.lang.Math;

public class Calculadora {

	public static int soma(int x, int y) {
		int z;
		z = x + y;
		return (z);
	}

	public static int subtra��o(int x, int y) {
		int z;
		z = x - y;
		return (z);
	}

	public static int multiplica��o(int x, int y) {
		int z;
		z = x * y;
		return (z);
	}

	public static double divis�o(double x, double y) {
		double z;
		z = x / y;
		return (z);
	}

	public static double raizquadrada(double x) {
		double z;
		z = Math.sqrt(x);
		return (z);
	}

	public static double potencia(double x, int y) {
		double z;
		z = Math.pow(x, y);
		return (z);
	}

	public static double juros(double x, double y, int z) {
		double w;
		w = x * y * z;
		return (w);
	}

	public static void bin(int n) {
		if (n / 2 != 0) {
			bin(n / 2);
			System.out.println("" + n % 2);
		} else {
			System.out.println("" + n % 2);
		}
	}
	
	public static String lados(int x,int y,int z) {
		 if(x > 0 && y > 0 && z > 0 &&(x < y + z)&&(y < x + z)&&(z < x + y))

		        if(x == y && x == z)

		        {
		            return "Equil�tero";
		        }

		        else if(x == y || x == z || y == z)
		        {
		        	return "Is�celes";
		        }

		        else
		        {
		        	return "Escaleno";
		        }

		        else
		        {
		            return "N�o forma tri�ngulo";
		        }
	}
	
	public static double area(double base, double altura) {
		 double areaRetangulo;
		 areaRetangulo = base * altura;
		 return(areaRetangulo);
	}

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		int i = 1, x, y, l;
		double z, w;
		while (i != 0) {
			System.out.println("Qual opera��o deseja fazer?");
			System.out.println("1-Soma");
			System.out.println("2-Subtra��o");
			System.out.println("3-Multiplica��o");
			System.out.println("4-Divis�o");
			System.out.println("5-Raiz Quadrada");
			System.out.println("6-Pot�ncia��o");
			System.out.println("7-Juros Simples");
			System.out.println("8-Decimal para Bin�rio");
			System.out.println("9-Definir o tipo de Tri�ngulo");
			System.out.println("10-�rea de um Ret�ngulo");
			System.out.println("0-Parar");
			i = ent.nextInt();

			switch (i) {
			case 1:
				System.out.println("Digite o primeiro n�mero:");
				x = ent.nextInt();
				System.out.println("Digite o segundo n�mero:");
				y = ent.nextInt();
				System.out.println("O resultado da soma �: " + soma(x, y));
				System.out.println("\n");
				break;

			case 2:
				System.out.println("Digite o primeiro n�mero:");
				x = ent.nextInt();
				System.out.println("Digite o segundo n�mero:");
				y = ent.nextInt();
				System.out.println("O resultado da subtra��o �: " + subtra��o(x, y));
				System.out.println("\n");
				break;

			case 3:
				System.out.println("Digite o primeiro n�mero:");
				x = ent.nextInt();
				System.out.println("Digite o segundo n�mero:");
				y = ent.nextInt();
				System.out.println("O resultado da multiplica��o �: " + multiplica��o(x, y));
				System.out.println("\n");
				break;

			case 4:
				System.out.println("Digite o primeiro n�mero:");
				x = ent.nextInt();
				System.out.println("Digite o segundo n�mero:");
				y = ent.nextInt();
				System.out.println("O resultado da subtra��o �: " + divis�o(x, y));
				System.out.println("\n");
				break;

			case 5:
				System.out.println("Digite o n�mero:");
				x = ent.nextInt();
				System.out.println("O resultado da subtra��o �: " + raizquadrada(x));
				System.out.println("\n");
				break;

			case 6:
				System.out.println("Digite o n�mero:");
				x = ent.nextInt();
				System.out.println("Digite a quantidade de vezes:");
				y = ent.nextInt();
				System.out.println("O resultado da subtra��o �: " + potencia(x, y));
				System.out.println("\n");
				break;

			case 7:
				System.out.println("Digite o montante:");
				z = ent.nextDouble();
				System.out.println("Digite a taxa de juros: (Com casa decimal)");
				w = ent.nextDouble();
				System.out.println("O periodo de tempo:");
				x = ent.nextInt();
				System.out.println("O resultado dos juros �: " + juros(z, w, x));
				System.out.println("\n");
				break;

			case 8:
				System.out.println("Digite o numeral: ");
				x = ent.nextInt();
				bin(x);
				System.out.println("\n");
				break;

			case 9:
				System.out.println("Digite os lados do tri�ngulo:");
				x = ent.nextInt();
				y = ent.nextInt();
				l = ent.nextInt();
				System.out.println(lados(x,y,l));
				break;
				
			case 10:
				System.out.println("Digite a base:");
				x=ent.nextInt();
				System.out.println("Digite a altura:");
				y=ent.nextInt();
				System.out.println("A �rea do ret�ngulo �: " + area(x,y));
				break;
			}

		}
		ent.close();
	}

}
