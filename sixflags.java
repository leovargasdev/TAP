// Problema da URI número 2463
import java.util.Scanner;
import java.io.IOException;
class Main{
	public static int n = 1; // numero de brinquedos
	public static int t = 1	; // tempo limite no parque
	public static int[] duracao;
	public static int[] pontuacao;

	public static int colecao(int a, int tempo){
		int j = 0;
		if (a >= n || tempo < 0)
			return -12345647;
		if (tempo == 0)
			return 0;
		if(tempo >= duracao[a])
			j = pontuacao[a] + colecao(a, tempo-duracao[a]);
		int y = colecao(a+1, tempo);
		if(j >= y)
			return j;
		return y;
	}

	public static void main( String [] args ) throws IOException {
		Scanner scanner = new Scanner(System.in);
		int r = 0;
		do{
			r++;
			n = scanner.nextInt(); // numero de brinquedos
		    t = scanner.nextInt(); // tempo limite no parque
			if(n == 0 && t == 0) break;
			duracao = new int[n];
			pontuacao = new int[n];
			for(int w = 0; w < n; w++){
				duracao[w] = scanner.nextInt(); // duração brinquedo
				pontuacao[w] = scanner.nextInt(); // pontuação brinquedo
			}
			System.out.println("Instancia " + r);
			System.out.println(colecao(0, t));
		}while(true);
	}
}
