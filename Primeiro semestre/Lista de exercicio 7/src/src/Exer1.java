package src;

import java.io.*;

public class Exer1 {

	public static void main(String[] args) {
		try {
			//FileWriter para poder escrever no arquivo
			FileWriter arqEscrita = new FileWriter("C:\\Users\\joojp\\Desktop\\texto\\Exer1.txt", true);
			int j = 1;
			//repetição para gravar os números no arquivo
			for (int i = 0; i < 10; i++) {
				arqEscrita.write(j + "\n");
				j++;
			}
			System.out.println("Arquivo Modificado.");
			arqEscrita.close();
		} catch (IOException e) {
			System.out.println("Inválido.");
		}

	}

}
