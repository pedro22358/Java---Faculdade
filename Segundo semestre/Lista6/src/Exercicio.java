import java.util.Scanner;
public class Exercicio {

	public static void main(String[] args) {
		/*Homem k = new Homem("Pedro");
		System.out.println(k.getName());
		k.setName("Julia");
		System.out.println(k.getName());
		System.out.println(x.getFala());
		Cachorro y = new Cachorro("Toto");
		System.out.println(y.getName());
		System.out.println(y.getFala());
		Gato z = new Gato("Serafina");
		System.out.println((z.getName()));
		System.out.println(z.getFala());*/
		
		Scanner ent = new Scanner(System.in);
		Homem [] x = new Homem[5];
		Cachorro [] y = new Cachorro[5];
		Gato [] z = new Gato[5];
		String nome;
		
		//Homem
		for(int i=0;i<5;i++) {
			System.out.println("Digite um nome (Pessoa):");
			nome = ent.nextLine();
			x[i] = new Homem(nome);
		}
		for(int i=0;i<5;i++) {
			System.out.print(x[i].getName() + " " + x[i].getFala() + "\n");
		}
		
		//Cachorro
		for(int i=0;i<5;i++) {
			System.out.println("Digite um nome (Cachorro):");
			nome = ent.nextLine();
			y[i].setName(nome);
		}
		for(int i=0;i<5;i++) {
			System.out.printf(y[i].getName() +" " + x[i].getFala() + "\n");
		}
		
		//Gato
		for(int i=0;i<5;i++) {
			System.out.println("Digite um nome (Gato):");
			nome = ent.nextLine();
			z[i].setName(nome);
		}
		for(int i=0;i<5;i++) {
			System.out.print(z[i].getName() + " " + x[i].getFala() + "\n");
		}
		ent.close();
	}
}
