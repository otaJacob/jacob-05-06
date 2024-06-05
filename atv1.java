package atv05do06;

import java.util.Scanner;

public class atv1 {

	public static void min(String[] args) {
		
		
		Scanner ler = new Scanner(System.in);
		int l = 0;
		int fat = l, numero;
		
		System.out.print("Informe o fatorial: ");
		numero = ler.nextInt();
		
		if (numero < 0)  {
			System.out.print("N existe fatorial de numero negativo!!!");
			System.exit(0);
		}
		for ( int i = l ; i <= numero ; i++ ) {
			    fat *= i;
		}
        System.out.println("O fatorial de "+ numero + " é :" + fat );
        ler.close();
	}
}
