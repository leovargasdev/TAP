// Problema da URI número 1926
import java.util.*;
import java.io.IOException;;
class Main{
	public static void main(String [] args) throws IOException {
		// Scanner ler = new Scanner(System.in);
		// int q = ler.nextInt();
		int tam = 100000;
		int[][] primo = new int[tam][2];
		primo[0] = primo[1] = 123;
		for(int i = 2; i < tam; i++){
			if(primo[i][0] != 123){
				for(int j = i+i; j < tam; j+=i)
					primo[j][0] = 123;

			}

		}

		// while(q != 0){
		// 	int x = ler.nextInt(), y = ler.nextInt(), maior = 0, menor = 0, gemeos = 0;
		// 	if(x < y){
		// 		maior = y;
		// 		menor = x;
		// 	} else {
		// 		maior = x;
		// 		menor = y;
		// 	}
		// 	for(int n = menor; n <= maior; n++)
		// 		if(primo[n] != 123 && n > 1)
		// 			if(primo[n+2] != 123 || primo[n-2] != 123)
		// 				gemeos++;
		// 	System.out.println(gemeos);
		// 	q--;
		// }
	}
}
