package src;

import java.io.*;
import java.util.Scanner;
//import java.util.Random;

public class Exer8 {

	public static double fat() {
		File arq = new File("C:\\Users\\joojp\\Desktop\\texto\\exer8.txt");
		//chamar o arquivo
		double valo = 0;
		try {
			int som = 0, res = 0;
			String valor;
			Scanner ent = new Scanner(arq);
			while (ent.hasNextLine()) {
			//ler linha a linha
				valor = ent.nextLine();
				if (valor.contains("Valor")) {
				//se contem a palavra valor, então é true
					String[] part = valor.split(" ");
					//separa a palavra valor do valor número
					String val = part[1];
					//salva o valor número em uma string
					som = Integer.parseInt(val);
					//converte a string para int 
					res += som;
					//salvar todos os valores em uma variavel
				}
			}

			valo = res * 0.33;
			valo *= 12;
			//realizar os cálculos de faturamento
			ent.close();
		} catch (FileNotFoundException e) {
			System.out.println("Inválido");
			e.printStackTrace();
		}

		try {
			FileWriter resultado = new FileWriter("C:\\Users\\joojp\\Desktop\\texto\\resultado.txt");
			resultado.write("O valor de aluguel anual é: " + valo + "\n");
			//salvar no txt o valor do faturamento
			resultado.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

		return valo;
	}

	public static double juros() {
		File arq = new File("C:\\Users\\joojp\\Desktop\\texto\\exer8.txt");
		//chamar o arquivo
		double valo = 0, juros;
		try {
			int som = 0, res = 0;
			String valor;
			Scanner ent = new Scanner(arq);
			while (ent.hasNextLine()) {
			//ler linha por linha do arquivo
				valor = ent.nextLine();
				//salvar cada linha na string
				if (valor.contains("Valor")) {
				//se contem a palavra valor, então é true
					String[] part = valor.split(" ");
					//separa a palavra valor do valor número
					String val = part[1];
					//salva o valor número em uma string
					som = Integer.parseInt(val);
					//converte a string para int 
					res += som;
					//salvar todos os valores em uma variavel
				}
			}

			valo = res * 0.1;
			juros = valo * 0.2;
			valo *= juros;
			ent.close();
		} catch (FileNotFoundException e) {
			System.out.println("Inválido");
			e.printStackTrace();
		}
		
		try {
			FileWriter resultado = new FileWriter("C:\\Users\\joojp\\Desktop\\texto\\resultado.txt",true);
			resultado.write("O valor de atrasos mensais é: " + valo + "\n");
			//salvar no arquivo txt o resultado dos juros
			resultado.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return valo;
	}

	public static double man() {
		File arq = new File("C:\\Users\\joojp\\Desktop\\texto\\exer8.txt");
		//chamar o arquivo
		double cont = 0;
		try {
			String str;
			Scanner ent = new Scanner(arq);
			while (ent.hasNextLine()) {
			//ler linha por linha
				str = ent.nextLine();
				//salvar em uma string
				if (str.contains("Carro")) {
				//se a linha contem carro, então true
					cont++;
					//contar a quantidade de carros
				}
			}
			cont *= 600;
			cont *= 0.02;
			//fazer as contas para calcular a manutenção anual
			ent.close();
		} catch (FileNotFoundException e) {
			System.out.println("Inválido");
			e.printStackTrace();
		}
		
		try {
			FileWriter resultado = new FileWriter("C:\\Users\\joojp\\Desktop\\texto\\resultado.txt",true);
			resultado.write("O valor de atrasos mensais é: " + cont + "\n");
			//salvar o valor da manutenção no txt
			resultado.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return cont;
	}

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		// Random rn = new Random();
		try {
			int qt, vl, j = 1;
			FileWriter arqes = new FileWriter("C:\\Users\\joojp\\Desktop\\texto\\Exer8.txt");
			System.out.println("Digite a quantidade de carros:");
			qt = ent.nextInt();
			for (int i = 0; i < qt; i++) {
			//For para poder repetir para inserir o valor	
				System.out.println("Digite o valor de aluguel do carro");
				vl = ent.nextInt();
				arqes.write("Carro " + j + "\n");
				//gravar o carro no arquivo
				arqes.write("Valor " + vl + "\n" + "\n");
				//gravar na linha de baixo o valor do carro

				j++;
			}
			arqes.close();
		} catch (IOException e) {
			System.out.println("Inválido.");
		}
		System.out.printf("O valor das vendas anual é: %.2f", fat());
		System.out.println();
		System.out.printf("O valor recebido dos atrasos mensais é: %.2f", juros());
		System.out.println();
		System.out.printf("O valor de manutenção anual é de: %.2f", man());

		ent.close();
	}
 }
