package metodos;

public class Metodos {
	//M�todo es una funci�n
	
	//atributos de la clase
	int a,b;
	
	
	//M�todo void(Vac�o)
	
	public void sumar() {
		int resultado = a + b;
		System.out.println("El resultado de sumar " + a + "m�s" + b + "es" + resultado);
	}
	
	//m�todo con retorno de valores
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
	
	//M�todo est�tico funciona sin que estemos haciendo uso de un objeto
	//este m�todo es est�tico, void(no regresa datos), usa argumentos
	public static void imprimirNombre(String nombre) {
		System.out.println("Mi nombre es: " + nombre );
	}
}
