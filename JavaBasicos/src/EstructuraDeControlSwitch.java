import java.util.Scanner;

public class EstructuraDeControlSwitch {
	
	//Estructuras de control nos sirve para controlar el flujo de
	//comportamiento de un programa. 
	//Para la toma de decisiones
	
	/*
	 switch(condicion_a_evaluar) {
	 case "valor" :
	 	  //c�digo a ejecutar
	 	  //break;
	 ...
	 case "n" :
	  	  //codigo a ejecutar
	  	  //break;
	  default:
	  	  // codigo a ejecutar
	  }
	
	*/
	//Solicitarle al usuario un dia de la semana y mostrarle un mensaje
	
	public static void main(String[] args) {
	System.out.println("Introduce un d�a de la semana y recibe un bonito mensaje <3");
	Scanner sc = new Scanner(System.in);
	String dia = sc.nextLine();
		
	switch(dia.toLowerCase()) {
	case "lunes":
		System.out.println("Ya mero es viernes, toma un caf�");	
		break;
	case "martes":	
		System.out.println("Lunes chiquito, esto es cansado pero ya casi");
		break;
	case "miercoles":
		System.out.println("Mi�rcoles pero a que costo?");
		break;
	case "jueves":
		System.out.println("Juebebes de sed peligrosa");
		break;
	case "viernes":
		System.out.println("Viernes de fiesta hasta morir");
		break;
	case "sabado":
	case "domingo":
		System.out.println("Basta de trabajaci�n");
		break;	
	default:
		System.out.println("kh�?, ese no es un d�a >:|");	
		}
	
	}
}
