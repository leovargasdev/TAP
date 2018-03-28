// Problema da URI número 1487
import java.util.*;
import java.io.IOException;;
class Main{
	public static int tam = 1000000;
	public static long[] primo = new long[tam];
	public static void main(String [] args) throws IOException {
		Scanner ler = new Scanner(System.in);
		int q = ler.nextInt();
		primo[0] = 123;
		for(int i = 2; i < tam-5; i++)
			if(primo[i] != 123)
				for(int j = i; i*j < tam-5; j++)
					primo[j] = 123;
		while(q != 0){
			int x = ler.nextInt(), y = ler.nextInt(), maior = 0, menor = 0, gemeos = 0;
			if(x < y){
				maior = y;
				menor = x;
			} else {
				maior = x;
				menor = y;
			}
			for(int n = menor; n <= maior; n++)
				if(primo[n] != 123 && n > 1)
					if(primo[n+2] != 123 || primo[n-2] != 123){
						System.out.println("gemeo: " + n);
						gemeos++;
					}
			System.out.println(gemeos);
			q--;
		}
	}
}
