package src;

import java.io.*;
import java.util.Scanner;

public class Exer3 {

	public static void main(String[] args) {
		File arq = new File("C:\\Users\\joojp\\Desktop\\texto\\Exer2.txt");
		//Chamar o arquivo txt
		try {
			Scanner entrada = new Scanner(arq);
			//Scanner para fazer a leitura do arquivo
			String l;
			int a = 0;
			while (entrada.hasNextLine()) {
				//While para fazer a leitura linha a linha
				l = entrada.nextLine();
				//string l para salvar o conteúdo de cada linha
				System.out.println(l);
				for (int i = 0; i < l.length(); i++) {
				//For para fazer a verificação dos caracteres da string
					if (l.charAt(i) == 'a' || l.charAt(i) == 'A') {
					//Verificar se o caracter é um "a"
						a++;
					}
				}
			}
			System.out.println(a);
			entrada.close();
		} catch (IOException e) {
			System.out.println("Inválido.");
		}

	}

}
