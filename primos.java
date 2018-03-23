// Problema da URI número 1487
import java.util.*;
import java.io.IOException;;
class Main{
	public static void main( String [] args ) throws IOException {
		Scanner scanner = new Scanner(System.in);
		int q = scanner.nextInt(), tam = 0;
		while(q != 0){
			int x = scanner.nextInt(); // numero de brinquedos
			int y = scanner.nextInt(); // tempo limite no parque
			tam = y-x+2;
			int[] numeros = new int[tam], gemeos = new int[tam]; // tempo limite no parque
			ArrayList <Integer> primos = new ArrayList<Integer>();
			// Set<Integer> gemeos = new HashSet<Integer>(); // set não permite add elementos repetidos
			for(int i = x, k = 0; i <= y+1; i++, k++){
				gemeos[k] = -1;
				numeros[k] = i;
			}
			int contador, numero = 0;
			for (int i : numeros){
				contador = 0;
				for (int u = 1; u <= i; u++) {
					if (i % u == 0){
						contador++;
						numero = u;
					}
				}
				if (contador == 2)
					primos.add(numero);
			}
			contador = 0;
			for (Integer i : primos)
				for(int a = 0; a < primos.size(); a++)
					if(Math.abs(primos.get(a) - i) == 2 && i <= y)
						gemeos.add(i);
			System.out.println(gemeos.size());
			q--;
		}
	}
}
