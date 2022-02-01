
public class Ciclos {
	public static void main(String[] args) {
		//While
		/*
		int control = 0;
		
		while(control < 10) {
			System.out.println("control = " + control);
			control++;
		}*/
		
		
		//do while
		/*
		int control = 3;
		
		do {
			//codigo a ejecutar
			System.out.println("control = " + control);
			//modificador de la variable control
			control++;
		}while(control < 3);*/
		
		//for 
		
		/*
		for(int i=0;i < 3;i++) {
			System.out.println("control = " + i);
		}*/
		
		//break & continue permiten mdificar más el comportamiento de un ciclo
		/*for(int i=0;i < 10; i++) {
			if(i % 2 == 0) {//solo se ejecuta cuando el valor de i sea numero par
			System.out.println("control = " + i);
			break;//termina el ciclo
			//solo deja que se ejecute una vez lo que esta antes
		}
			System.out.println("control = " + i);
			}*/
		
		for(int i=0;i < 10; i++) {
			if(i % 2 == 0) { //solo se ejecuta cuando el valor de i sea numero par
				
				continue;//permite saltarnos una ejecucion del ciclo
				//deja que cpntinue el ciclo
			}
			System.out.println("control = " + i);
		}
		
		for(int i=0;i < 3; i++) {
			System.out.println("control2 = " + i);
			continue;
		}
	}
}
