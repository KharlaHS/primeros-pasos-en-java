import java.util.Scanner;

public class EstructuraDeControlIf {
	
	public static void main(String[] args) {
		//Estructuras de control de flujo
	//Nos sirven para la toma de decisiones
	
	//Estructuras de control de flujo nos sirve para 
	//cambiar el flujo de nuestro programa
	//evaluando una condici�n a partir de la evaluaci�n
	//se rea�oza una acci�n u otra.
		
	/* if (condicion) {
		codigo
	} else {
		codigo
	}*/
		System.out.println("introduce tu edad: ");
		Scanner sc = new Scanner(System.in); //pide inf al usuario
		int edad = sc.nextInt();//devuelve el tipo de dato, en este caso es int
		
		if(edad >= 18) {
			System.out.println("Eres mayor de edad");
		}else {
			System.out.println("Eres menor de edad");
		}
		
	}
}