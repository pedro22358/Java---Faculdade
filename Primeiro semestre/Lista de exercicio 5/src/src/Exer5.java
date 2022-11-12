package src;

import java.util.Scanner;

public class Exer5 {
	public static void preenc(int [][] matA,int [][]matB) {	//procedimento para preencher duas matrizes
		Scanner ent = new Scanner(System.in);
		for(int ln=0;ln<matA.length;ln++) {
			for(int col=0;col<matA[0].length;col++) {
				System.out.println("Digite um número (Matriz A):");
				matA [ln][col]=ent.nextInt();
			}
		}
		for(int ln=0;ln<matB.length;ln++) {
			for(int col=0;col<matB[0].length;col++) {
				System.out.println("Digite um número (Matriz B):");
				matB [ln][col]=ent.nextInt();
			}
		}
	}
	public static int [][] soma(int [][]matA,int[][]matB,int [][]soma){	//função para somar uma matriz a outra e salvar em outra matriz
		for(int ln=0;ln<matA.length;ln++) {
			for(int col=0;col<matA[0].length;col++) {
			soma[ln][col]=matA[ln][col]+matB[ln][col];
			}
		}
		return soma;
	}
	public static int [][] dif(int [][]matA,int[][]matB,int [][] dif){	//função para subtrair uma matriz a outra e salvar em outra matriz
		for(int ln=0;ln<matA.length;ln++) {
			for(int col=0;col<matA[0].length;col++) {
			dif[ln][col]=matA[ln][col]-matB[ln][col];
			}
		}
		return dif;
	}
	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		int [][] matA = new int [4][6];
		int [][] matB = new int [4][6];
		int [][] S = new int [4][6];
		int [][] Sd = new int [4][6];
		preenc(matA,matB);
		soma(matA,matB,S);
		soma(matA,matB,Sd);
		for(int ln=0;ln<matB.length;ln++) {	//percorrer todos os elementos de uma matriz e printar todos os elementos dela
			for(int col=0;col<matB[0].length;col++) {
		System.out.println("A soma das duas matrizes é:" + S[ln][col]);
			}
		}
		for(int ln=0;ln<matB.length;ln++) {	//percorrer todos os elementos de uma matriz e printar todos os elementos dela
			for(int col=0;col<matB[0].length;col++) {
		System.out.println("A soma das duas matrizes é:" + Sd[ln][col]);
			}
		};
	}

}
