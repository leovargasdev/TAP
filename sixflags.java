// Problema da URI número 2463
import java.util.Scanner;
import java.io.IOException;
class Main{
	public static int n; // numero de brinquedos
	public static int t; // tempo limite no parque
	public static int[] duracao;
	public static int[] pontuacao;

	public static int colecao(int a, int tempo){
		if (a >= n || tempo < 0){

			for(int i = 0; i <= a+1; i++) System.out.print("\t");
			System.out.println("return: " + -1123410);

			return -12345647;
		}
		if (tempo == 0){
			return 0;
		}
		for(int i = 0; i <= a+1; i++) System.out.print("\t");
		System.out.println("j = " + pontuacao[a] + " + colecao(" + a + ", " + (tempo-duracao[a]) + ")");

		int j = pontuacao[a] + colecao(a, tempo-duracao[a]);

		for(int i = 0; i <= a+1; i++) System.out.print("\t");
		System.out.println("y = colecao(" + (a+1) + ", " + tempo + ")");

		int y = colecao(a+1, tempo);
		if(j >= y){

			for(int i = 0; i <= a+1; i++) System.out.print("\t");
			System.out.println("return(j): " + j);

			return j;
		}

		for(int i = 0; i <= a+1; i++) System.out.print("\t");
		System.out.println("return(y): " + y);

		return y;
	}

	public static void main( String [] args ) throws IOException {
		Scanner scanner = new Scanner(System.in);
		n = scanner.nextInt(); // numero de brinquedos
	    t = scanner.nextInt(); // tempo limite no parque
		duracao = new int[n];
		pontuacao = new int[n];

		for(int w = 0; w < n; w++){
			duracao[w] = scanner.nextInt(); // duração brinquedo
			pontuacao[w] = scanner.nextInt(); // pontuação brinquedo
		}
		int result = colecao(0, t);
		System.out.println("result: " + result);
	}
}
