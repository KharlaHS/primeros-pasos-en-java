package operadores;

public class Operadores {
	public static void main(String[] args) {
		//Operadores Aritm�ticos
		// +, -, /, *, %
		int a = 10;
		int b = 20;
		double c = 10.5;
		
		int suma = a + b;
		System.out.println(suma);
		
		String str1 = "El resultado de la suma es: ";
		System.out.println(str1 + suma);
		
		//Resta
		System.out.println("El resultado de la resta: " + (a - b));
		
		//Divisi�n
		int division = a / b;
		System.out.println("El resultado de la divisi�n es: " + division);
		
		//double division2 = (double) a / b;
		double division2 = c / b;
		//por lo menos uno de los datos debe ser de tipo double
		//los decimales correctamente
		//10.0 / 20 = 0.5
		System.out.println("El resultado de la divisi�n es: " + division2);
		
		//multiplicaci�n
		double multiplicacion = c * a;
		System.out.println("El resultado de la multiplicaci�n es: " + multiplicacion);
		
		//modulo
		int modulo = a % b;
		System.out.println("El resultado del modulo es: " + modulo);
		
		/*
		 * Operador de asignaci�n 
		 * =
		 */
		int d = 5, e; //inicializar las variables vac�as
		e = 6;
		System.out.println(d + " - " + e);
		
		//Operadores de declaraci�n compuesta
		//+=, -=, *=, /=, %=
		//una operaci�n simplificada
		
		int f = 0, g = 5;
		
		f += 5;
		//f = f + 5
		System.out.println(f);
		
		//operaadores relacionales
		/* <, >, <=, >=
		 * == igualdd
		 * != diferencia
		 * resultado un valor de tipo boolean/booleano (true,false)
		 * */
		
		int h = 15, i = 25;
		String j = "hola";
		
		System.out.println(h > i); //false
		System.out.println(i != h);
		//System.out.println(h != j); //son valores distintos y no se pueden comparar
		
		//operador unario
		/* ++, --
		 * preasignaci�n -- ++k se le asigna un valor antes de usarse
		 * postasignaci�n -- k++ primero lee el valor y despues le suma 1
		 */
		
		int k = 0, l = 0;
		k++;
		System.out.println(k);
		System.out.println(--l);
		
		//Precedencia de operadores
		
		int operacion = (4 + 5) * 6 / 3;// 14
		//5*6 = 30 
		//30 / 3 = 10
		//10 + 4 = 14
		
		System.out.println(operacion);
		
		int x = 0, y = 0;
		int operacion2 = ++x + y--;
		System.out.println(operacion2);//1
		
		//Operador ternario
		//es un if...else abreviado
		//s�lo nos permite tomar una decisi�n 
		
		int edad = 18;
		int valor = (edad <= 18) ? 2:1;
		
		/*int resultado = (edad <= 18) ? (valor1 = 2) : (valor1 = 3);*/
		//parentesis son opcionales
		/*System.out.println(resultado);*/
		
		//operadores l�gicos
		//and - &&
		//or - ||
		//not - !
		
		System.out.println(true && true); //true
		System.out.println(true && false);// false
		System.out.println(true || false);//true
		System.out.println(true && !false);//true
	}
}
