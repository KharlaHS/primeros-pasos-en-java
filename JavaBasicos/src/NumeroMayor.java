import java.util.Scanner;
public class NumeroMayor {
	public static void main(String[] args) {
		/*
		 * Pedir 3 n�meros al usuario y mostrar un mensaje con el
		 * n�mero mayor
		 * */
		
		Scanner nu = new Scanner(System.in);
		int u, d, t;
		
		System.out.println("Escribe un n�mero");
		u = nu.nextInt();
		System.out.println("Escribe otro n�mero");
		d = nu.nextInt();
		System.out.println("Escribe un ultimo n�mero");
		t = nu.nextInt();
		
		if(u > d && u > t) {
			System.out.println("El mayor es: " + u);
		}
		else if (d > u && d > t) {
			System.out.println("El mayor es: " + d);
		}
		else if (t > u && t > d) {
			System.out.println("El mayor es: " + t);
		}
			}
}
