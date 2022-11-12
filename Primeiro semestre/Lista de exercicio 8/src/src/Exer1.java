package src;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

class Pessoa {	//Cria��o da classe pessoa
	private int codigo;
	private String nome;
	private int idade;
	private int n�mero;
	private String complemento;

	public Pessoa(int cod, String no, int id, int num, String comp) {
		codigo = cod;
		nome = no;
		idade = id;
		n�mero = num;
		complemento = comp;
	}

	public int getCod() {
		return codigo;
	}

	public String getNome() {
		return nome;
	}

	public int getIdade() {
		return idade;
	}
	public int getNumero() {
		return n�mero;
	}
	public String getComplemento() {
		return complemento;
	}

}

public class Exer1 {

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		int n;
		
		System.out.println("Digite a quantidade de pessoas:");
		n = ent.nextInt();
		
		Pessoa [] vet = new Pessoa [n];
		
		for(int i=0;i<n;i++) {
			System.out.println("Digite o c�digo:");
			int cod = ent.nextInt();
			ent.nextLine();
			System.out.println("Digite o nome:");
			String no = ent.nextLine();
			System.out.println("Digite a idade:");
			int id = ent.nextInt();
			System.out.println("Digite o n�mero: (XXXXXXXXX)");
			int num = ent.nextInt();
			ent.nextLine();
			System.out.println("Digite o complemento:");
			String comp = ent.nextLine();
			vet[i] = new Pessoa(cod,no,id,num,comp);
		}
		
		System.out.println("Digite o nome do arquivo para grava��o: (Exemplo: atividade.txt)");
		String loc = ent.nextLine();
		
			try {
				FileWriter arq = new FileWriter("C:\\Users\\joojp\\Desktop\\texto\\lista8\\" + loc);
				for(int j=0;j<n;j++) {
				 arq.write(Integer.toString(vet[j].getCod())+" "+vet[j].getNome() + " " + Integer.toString(vet[j].getIdade())+" "+Integer.toString(vet[j].getNumero())+" "+vet[j].getComplemento()+"\n");
				}
				arq.close();
			} 
			catch (IOException e) {
				e.printStackTrace();
			}
			ent.close();
		}

	
}
