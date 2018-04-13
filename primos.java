// Problema da URI número 1926
import java.util.*;
import java.io.IOException;;
class Main{
	public static void main(String [] args) throws IOException {
		Scanner ler = new Scanner(System.in);
		int q = ler.nextInt();
		int tam = 100;
		long[] primo = new long[tam];
		primo[0] = 123;
		primo[1] = 123;
		for(int i = 2; i < tam; i++)
			if(primo[i] != 123)
				for(int j = i*i; j < tam; j+=i)
					primo[j] = 123;
		for(int a = 0; a < tam; a++){
			if(primo[a] != 123)
				System.out.print(a + " - ");
			//else
			//	System.out.print(a + " x-x ");
		}
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
					if(primo[n+2] != 123 || primo[n-2] != 123)
						gemeos++;
			System.out.println(gemeos);
			q--;
		}
	}
}
