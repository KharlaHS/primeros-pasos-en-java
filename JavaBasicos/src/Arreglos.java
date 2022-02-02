
public class Arreglos {
	
	//Sólo un tipo de dato
	//especificar el tamaño o la cantidad de elementos que va a contener
	public static void main(String[] args) {
		
	// 1 manera
	int numeros[]; //creamos la variable	
	numeros = new int[4]; //creando el arreglo
	
	// 2 manera
	String[] nombres = new String[4]; //basado en 0 [0, 1, 2, 3]
	
	// 3 manera Array Literal
	String []nombreFrutas = new String[]{ "Manzana", "Platano", "Uva", "Pera"};
	
	numeros[0] = 10;
	numeros[1] = 8;
	numeros[2] = 100;
	numeros[3] = 200;
	//numeros[4] = 200;
	
	nombres[0] = "Juan";
	nombres[1] = "Pedro";
	nombres[2] = "Antonio";
	nombres[3] = "Felipe";
	
	
	System.out.println(numeros[0]);
	System.out.println(numeros[1]);
	System.out.println(numeros);
	
	for(int i=0;i < numeros.length; i++ ) {//en arrays, length es una propiedad y no necesitan parentesis
		System.out.println("Elemento de números " + numeros[i]);//la i es el contador y va a ir cambiando desde la posicion [0],[1]
		System.out.println("Elemento de nombres " + nombres[i]);
		System.out.println("Elemento de frutas " + nombreFrutas[i]);
		System.out.println("---------------------------------");
		}
	}
}
