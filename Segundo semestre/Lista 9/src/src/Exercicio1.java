package src;

import java.util.Scanner;

public class Exercicio1 {
	
	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		System.out.println("Digite a quantidade de celulas de uma lista:");
		int n = ent.nextInt();
		
		Lista X = new Lista();
		
		for(int i=0;i<n;i++) {
			System.out.println("Digite um elemento inteiro:");
			X.queue(ent.nextInt());
		}
		X.mostrar();
		System.out.println("\nDequeue: " + X.dequeue());
		System.out.println("Após o dequeue:");
		X.mostrar();
		System.out.println();
		if(X.isEmpty()) {
			System.out.println("Vazio");
		}
		else {
			System.out.println("Não está vazio");
		}
		
		System.out.println("Tamanho da lista: " + X.getTam());
		ent.close();
	}

 }
