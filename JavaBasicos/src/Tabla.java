/*Utilizando un bucle while

1.- Crea una nueva clase llamada Tabla
2.- Copia el siguiente codigo y verifica que funcione

	
	import java.util.Scanner;

	public class Table
	{
	    public static void main(String[] args)
	    {
	        Scanner console = new Scanner(System.in);
	        int num;
	        
	        System.out.print("Ingresa cualquier n�mero positivo: ");
	        num = console.nextInt();
	                
	        System.out.println("Tabla de multiplicar de  " + num);
	        
	       //Implementa un bucle while que imprima el resultado
	    }
	}	
	 for (int x = 1; x <= 10; x++) {
            String formato = "%d x %d = %d";
            String linea = String.format(formato, numeroDeTabla, x, numeroDeTabla * x);
            System.out.println(linea);

3.- Debe imprimir la tabla de multiplicar del n�mero en cuesti�n (solo los primeros 10 n�meros)
*/
import java.util.Scanner;
public class Tabla {
	public static void main(String[] args) {
		
		Scanner console = new Scanner(System.in);
        int num;
        
        System.out.print("Ingresa cualquier n�mero positivo: ");
        num = console.nextInt();
                
        System.out.println("Tabla de multiplicar de  " + num);
        
		int contador = 1, tabla;
		while(contador <= 10) {
			tabla = num * contador;
			System.out.println("la multiplicaci�n es: " + num + " X " + contador + " = " + tabla);
			contador++;
		}
	}
}
