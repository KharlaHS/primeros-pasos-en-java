package metodos;

public class Metodos {
	//Método es una función
	
	//atributos de la clase
	int a,b;
	
	
	//Método void(Vacío)
	
	public void sumar() {
		int resultado = a + b;
		System.out.println("El resultado de sumar " + a + "más" + b + "es" + resultado);
	}
	
	//método con retorno de valores
	public int sumarConRetorno() {
		//int resultado = a + b;
		//return resultado;
		return a + b;
	}
	
	
	//Argumentos
	//suma(argumentos)
	
	public double multiplicarConArgumento(int arg1, double arg2) {
		int c = arg1;
		double d = arg2;
		return c * d;
	}
	
	//Método estático funciona sin que estemos haciendo uso de un objeto
	//este método es estático, void(no regresa datos), usa argumentos
	public static void imprimirNombre(String nombre) {
		System.out.println("Mi nombre es: " + nombre );
	}
}
