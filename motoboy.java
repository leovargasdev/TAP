// Problema da URI número 2463
import java.util.Scanner;
class Main{
	public static void meuprint(int tam){
		for(int w = 0; w < tam; w++){
			System.out.println(w);
			// System.out.println("tempo: " + v[w][0] +", pizzas: "+ v[w[1]]);
		}
	}
	public static void main( String args[] ){
		Scanner scanner = new Scanner(System.in);
	    int n = scanner.nextInt(); // numero de pedidos
	    int p = scanner.nextInt(); // numero de pizzas
		int[][] pedidos = new int[n][2];
		for(int w = 0; w < n; w++){
			pedidos[w][0] = scanner.nextInt(); //tempo
			pedidos[w][1] = scanner.nextInt(); // nº de pizzas
		}
		meuprint(n);
	}
}
