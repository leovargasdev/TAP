// Problema da URI número 2463
import java.util.Scanner;
class Main{
	public static void main( String [] args ){
		Scanner scanner = new Scanner(System.in);
	    int result = 0, soma = 0, n = scanner.nextInt();
		int[] v = new int[n];
		for(int w = 0; w < n; w++)
			v[w] = scanner.nextInt();
		for(int w = 0; w < n; w++){
			// caso essa conta seja 0 ou menor, deve-se tentar outro conjunto de portas
			int sub = soma + v[w];
			if(soma != 0 && sub < 0)
				soma = 0;
			if(v[w] > 0 || soma > 0){
				soma += v[w];
				if(soma > result)
					result = soma;
			}
		}
		System.out.println(result);
	}
}
