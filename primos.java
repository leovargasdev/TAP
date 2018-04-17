// Problema da URI número 1926
import java.util.*;
import java.io.IOException;;
class Main{
	public static void main(String [] args) throws IOException{
		Scanner ler = new Scanner(System.in);
		int q = ler.nextInt();
		int tam = 100000;
		int[][] primo = new int[tam][2];
		primo[0][0] = primo[1][0] = 123;
		for(int i = 2; i < tam; i++)
			if(primo[i][0] != 123)
				for(int j = i+i; j < tam; j+=i)
					primo[j][0] = 123;// significa que não é primo
		primo[0][1] = primo[1][1] = 0;
		for(int i = 2; i < tam-2; i++)
			if(primo[i][0] != 123){
				if(primo[i-2][0] != 123 || primo[i+2][0] != 123)
					primo[i][1] = primo[i-1][1] + 1;
				else
					primo[i][1] = primo[i-1][1];
			} else {
				primo[i][1] = primo[i-1][1];
			}
		while(q != 0){
			int x = ler.nextInt(), y = ler.nextInt();
			if(x < y)
				System.out.println(primo[y][1] - primo[x-1][1]);
			else
				System.out.println(primo[x][1] - primo[y-1][1]);
			q--;
		}
	}
}
