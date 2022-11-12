package src;

import java.io.*;
import java.util.Scanner;

public class Exer7 {

	public static void vogais() {
		File arq = new File("C:\\Users\\joojp\\Desktop\\texto\\Exer7.txt");
		//chamar o arquivo
		try {
			String linha;
			int vog = 0,a=0,e=0,i=0,o=0,u=0;
			Scanner ent = new Scanner(arq);
			while (ent.hasNextLine()) {
			//pegar linha por linha do txt
				linha = ent.nextLine();
				linha = linha.toLowerCase();
				for (int j = 0; j < linha.length(); j++) {
				//verificar os caracteres da linha
					if (linha.charAt(j) == 'a') {	//verificar se o caracter é um a
						vog++;
						a++;
					}
					else if(linha.charAt(j) == 'e') {	//verificar se o caracter é um e
						vog++;
						e++;
					}
					else if(linha.charAt(j) == 'i') {	//verificar se o caracter é um i
						vog++;
						i++;
					}
					else if(linha.charAt(j) == 'o') {	//verificar se o caracter é um o
						vog++;
						o++;
					}
					else if(linha.charAt(j) == 'u'){	//verificar se o caracter é um u
						vog++;
						u++;
					}
				}

			}
			System.out.println("A quantidade de letras a é:" + a);
			System.out.println("A quantidade de letras e é:" + e);
			System.out.println("A quantidade de letras i é:" + i);
			System.out.println("A quantidade de letras o é:" + o);
			System.out.println("A quantidade de letras u é:" + u);
			System.out.println("A quantidade de vogais é: " + vog);
			ent.close();
		} catch (FileNotFoundException e) {
			System.out.println("Inválido");
			e.printStackTrace();
		}

	}

	public static void main(String[] args) {
		int n;
		Scanner ent = new Scanner(System.in);
		System.out.println("Digite a quantidade de letras:");
		n = ent.nextInt();

		try {
			FileWriter arq = new FileWriter("C:\\Users\\joojp\\Desktop\\texto\\Exer7.txt");
			//FileWriter para poder escrever em um arquivo
			char l;

			for (int i = 0; i < n; i++) {
			//for para poder gravar as letras 
				System.out.println("Digite uma letra:");
				l = ent.next().charAt(0);
				//salvar o caracter em um char
				arq.write(l);
				//salvar o char em um txt
			}
			arq.close();

		}
		catch (IOException e) {
			System.out.println("Inválido.");
		}

		vogais();
		
		ent.close();
	}
}
