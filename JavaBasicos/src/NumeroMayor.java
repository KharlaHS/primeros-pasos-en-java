import java.util.Scanner;
public class NumeroMayor {
	public static void main(String[] args) {
		/*
		 * Pedir 3 números al usuario y mostrar un mensaje con el
		 * número mayor
		 * */
		
		Scanner nu = new Scanner(System.in);
		int u, d, t;
		
		System.out.println("Escribe un número");
		u = nu.nextInt();
		System.out.println("Escribe otro número");
		d = nu.nextInt();
		System.out.println("Escribe un ultimo número");
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
