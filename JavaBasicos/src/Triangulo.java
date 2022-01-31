import java.util.Scanner;

public class Triangulo {
	//Pedirle 3 ángulos a un usuario y decirle si es un triangulo válido
	public static void main(String[] args) {
		System.out.println("Introduce tres ángulos");
		
		Scanner angulo1 = new Scanner(System.in);
		Scanner angulo2 = new Scanner(System.in);
		Scanner angulo3 = new Scanner(System.in);
		int a= angulo1.nextInt();
		int b= angulo2.nextInt();
		int c= angulo3.nextInt();
		int suma = a+b+c;
		
		if(suma == 180) {
			System.out.println("La suma de los angulos es "  + suma + " Por lo tanto si es un triangulo");
		}
		else {
			System.out.println("Los angulos que ingresó no pertenecen a un triangulo :(");
		}
	}

}
