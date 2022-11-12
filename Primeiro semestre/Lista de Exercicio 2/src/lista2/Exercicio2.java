import java.util.Scanner;
public class Exercicio2 {
	public static void main(String[] args) {
		Scanner  ent = new  Scanner ( System . in );
		double  a , M1 , m1 , z,t=0,pM,pz,pm ;
		char  escolha ;
		a = 0 ;
		escolha = 0 ;
		M1 = 0 ;
		m1 = 0 ;
		z = 0 ;
		while ( escolha != 'p' ) {
			System.out.println( "Digite um numero inteiro: " );
			a = ent . nextInt ();
			if ( a > 0 ) {
				M1 ++;
			}
			else  if ( a < 0 ) {
				m1 ++;
			}
			else {
				z ++;
			}
			System.out.println ( "Digite p para parar:" );
			escolha = ent.next().charAt(0);    
			t++;
		}
		pM=(M1*100)/t;
		pm=(m1*100)/t;
		pz=(z*100)/t;
		System.out.printf ("A porcentagem de números positivos é: %.0f \nA porcentagem de números negativos é: %.0f \nA porcentagens de zeros é: %.0f" , pM , pm , pz);
		ent.close();

	}
}
