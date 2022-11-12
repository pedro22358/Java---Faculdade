package src;

import java.util.Scanner;
import java.lang.Math;

public class Calculadora {

	public static int soma(int x, int y) {
		int z;
		z = x + y;
		return (z);
	}

	public static int subtração(int x, int y) {
		int z;
		z = x - y;
		return (z);
	}

	public static int multiplicação(int x, int y) {
		int z;
		z = x * y;
		return (z);
	}

	public static double divisão(double x, double y) {
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
		            return "Equilátero";
		        }

		        else if(x == y || x == z || y == z)
		        {
		        	return "Isóceles";
		        }

		        else
		        {
		        	return "Escaleno";
		        }

		        else
		        {
		            return "Não forma triângulo";
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
			System.out.println("Qual operação deseja fazer?");
			System.out.println("1-Soma");
			System.out.println("2-Subtração");
			System.out.println("3-Multiplicação");
			System.out.println("4-Divisão");
			System.out.println("5-Raiz Quadrada");
			System.out.println("6-Potênciação");
			System.out.println("7-Juros Simples");
			System.out.println("8-Decimal para Binário");
			System.out.println("9-Definir o tipo de Triângulo");
			System.out.println("10-Área de um Retângulo");
			System.out.println("0-Parar");
			i = ent.nextInt();

			switch (i) {
			case 1:
				System.out.println("Digite o primeiro número:");
				x = ent.nextInt();
				System.out.println("Digite o segundo número:");
				y = ent.nextInt();
				System.out.println("O resultado da soma é: " + soma(x, y));
				System.out.println("\n");
				break;

			case 2:
				System.out.println("Digite o primeiro número:");
				x = ent.nextInt();
				System.out.println("Digite o segundo número:");
				y = ent.nextInt();
				System.out.println("O resultado da subtração é: " + subtração(x, y));
				System.out.println("\n");
				break;

			case 3:
				System.out.println("Digite o primeiro número:");
				x = ent.nextInt();
				System.out.println("Digite o segundo número:");
				y = ent.nextInt();
				System.out.println("O resultado da multiplicação é: " + multiplicação(x, y));
				System.out.println("\n");
				break;

			case 4:
				System.out.println("Digite o primeiro número:");
				x = ent.nextInt();
				System.out.println("Digite o segundo número:");
				y = ent.nextInt();
				System.out.println("O resultado da subtração é: " + divisão(x, y));
				System.out.println("\n");
				break;

			case 5:
				System.out.println("Digite o número:");
				x = ent.nextInt();
				System.out.println("O resultado da subtração é: " + raizquadrada(x));
				System.out.println("\n");
				break;

			case 6:
				System.out.println("Digite o número:");
				x = ent.nextInt();
				System.out.println("Digite a quantidade de vezes:");
				y = ent.nextInt();
				System.out.println("O resultado da subtração é: " + potencia(x, y));
				System.out.println("\n");
				break;

			case 7:
				System.out.println("Digite o montante:");
				z = ent.nextDouble();
				System.out.println("Digite a taxa de juros: (Com casa decimal)");
				w = ent.nextDouble();
				System.out.println("O periodo de tempo:");
				x = ent.nextInt();
				System.out.println("O resultado dos juros é: " + juros(z, w, x));
				System.out.println("\n");
				break;

			case 8:
				System.out.println("Digite o numeral: ");
				x = ent.nextInt();
				bin(x);
				System.out.println("\n");
				break;

			case 9:
				System.out.println("Digite os lados do triângulo:");
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
				System.out.println("A área do retângulo é: " + area(x,y));
				break;
			}

		}
		ent.close();
	}

}
