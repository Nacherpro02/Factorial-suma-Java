package Factorial2;

import java.util.Scanner;
/*Realiza un programa en java que dado un numero N me devuelva los factoriales del 0 al N y la suma de los mismos
 Por ejemplo, si introduzco 3 (N=3), la salida seria:
 0!=1
 1!=1
 2!=2
 3!=6
 Suma seria = 6 + 2 + 1 + 1 = 10
 
 6 = 1*2*3*4*5*6
 
 
 
	 0 --- 1   --- 1
	 1 --- 1-1 --- 1
	 2 --- 1-2 --- 1*2
	 3 --- 1-3 --- 1*2*3
EjeX 4 --- 1-4 --- 1*2*3*4
	 5 --- 1-5 --- 1*2*3*4*5
	 6 --- 1-6 --- 1*2*3*4*5*6
 	 7 --- 1-7 --- 1*2*3*4*5*6*7
				EjeI
 
 */


public class PrincipalFactorial2 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		System.out.print("Escribe el valor de N: ");
		int N = entrada.nextInt();
		int suma = 0;
		for (int x=0;x<=N;x++) {
			int factorial = 1;
			for (int i=1; i<=x; i++) {
				factorial *= i;
			}
			System.out.println(x+"! = "+factorial);
			suma += factorial;
	}
	System.out.print("Suma: "+suma);

}

}
