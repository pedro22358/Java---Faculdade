package src;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

class Eletrodomesticos {
	private String nome;
	private double pre�o;
	private String numero;

	public Eletrodomesticos(String[] lin) {
		nome = lin[0];
		double pre� = Double.parseDouble(lin[1]);
		pre�o = pre�;
		numero = lin[2];
	}

	public double getPre�o() {
		return pre�o;
	}

	public String getNome() {
		return nome;
	}

	public String getNumero() {
		return numero;
	}

}

public class Exer3 {

	public static double media(double med, Eletrodomesticos[] vet) {
		double pre�o;
		for (int i = 0; i < 15; i++) {
			pre�o = vet[i].getPre�o();
			med += pre�o;
		}
		med /= 15;
		return med;
	}

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		int i = 0;
		double med = 0;
		System.out.println("Digite o nome do arquivo:");
		String arqui = ent.nextLine();
		Eletrodomesticos[] vet = new Eletrodomesticos[15];
		File arq = new File("C:\\Users\\joojp\\Desktop\\texto\\lista8\\" + arqui);
		try {
			Scanner ent1 = new Scanner(arq);
			while (ent1.hasNextLine()) {
				String n = ent1.nextLine();
				String[] lin = n.split(" ");
				vet[i] = new Eletrodomesticos(lin);
				i++;
			}
			ent1.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}


		System.out.println("Digite o nome do arquivo para grava��o: (Exemplo: Atividade.txt)");
		String arquiv = ent.nextLine();
		try {
			FileWriter arq2 = new FileWriter("C:\\Users\\joojp\\Desktop\\texto\\lista8\\" + arquiv);
			for (int j = 0; j < 15; j++) {
				if (vet[j].getPre�o() < media(med,vet)) {
					arq2.write(vet[j].getNome() + " " + Double.toString(vet[j].getPre�o()) + " " + vet[j].getNumero() + "\n");
				}
			}
			System.out.println("Arquivo modificado");
			arq2.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		ent.close();
	}

}
