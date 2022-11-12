package src;

import java.util.Scanner;
public class Calculadora {

    public static void proced(double[] altura) { //procedimento que consta qual altura é a maior
        double maiorAltura = 0;

        for (int i=0; i <= 10; i++) {
            if (altura[i] > maiorAltura) {
                maiorAltura = altura[i];
            }
        }
        System.out.println("A maior altura é: " + maiorAltura);
    }

    public static double func(double[] altura) {
        double medias = 0;

        for (int i=0; i < 10; i++) {
            medias = medias + altura[i];
        }
        medias = medias/10;

        return medias;
    }

    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);

        double[] altura = new double [10]; //vetor é um conjunto de variaveis (apenas uma linha e varias colunas)

        for (int i=0; i < 10; i++) {
            System.out.println("Digite a altura: ");
            altura[i] = ent.nextDouble();
        }

        proced(altura);

        System.out.println("A médias das alturas é: " + func(altura));
ent.close();
    }

}