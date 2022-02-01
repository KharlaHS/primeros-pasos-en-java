import java.util.Scanner;

public class Calculadora {
	/*
	 * Pedir al usuario 2 numeros por consola y preguntarle que desea realizar
	 * 1) Suma
	 * 2) Resta
	 * 3) División
	 * 4) Multiplicación
	 * 
	 * y despues imprimir el resultado
	 * */
public static void main(String[] args) {
	System.out.println("Introduce un dos números");
	Scanner sc = new Scanner(System.in);
	int numero1 = sc.nextInt();
	int numero2 = sc.nextInt();
	System.out.println("Operación que desees realizar 1) suma, 2) resta, 3) multiplicación, 4) division ");
	int operacion = sc.nextInt();
	switch(operacion) {
	case 1:
		System.out.println(numero1 + numero2);	
		break;
	case 2:
		System.out.println(numero1 - numero2);	
		break;	
	case 3:
		System.out.println(numero1 * numero2);	
		break;
	case 4:
		System.out.println(numero1 / numero2);	
		break;
	default:
		System.out.println("Syntax error");
	}
}
}
