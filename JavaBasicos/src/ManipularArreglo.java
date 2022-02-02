/*Crea una clase llamara ManipularArreglo
crea un array con los siguientes n�meros enteros:

1, 6, 45, 53, 80, 102, 145, 326, 450, 892
Crea un programa que use un ciclo que tome los n�meros de arreglo y devuelva la suma total, la suma de los n�meros pares y la suma de los n�meros impares.
*/
public class ManipularArreglo {
	public static void main(String[] args) {
		
		int []numeros = new int[]{1, 6, 45, 53, 80, 102, 145, 326, 450, 892 };
		int[] suma = new int[] {0,0, 0};
		
		for(int i=0;i < numeros.length; i++) {
			suma[0] += numeros[i];
			suma[1] += (numeros[i] % 2 == 0) ? numeros[i] : 0;
			suma[2] += (numeros[i] % 2 != 0) ? numeros[i] : 0;
		}
		System.out.println("suma total = " + suma[0]);
		System.out.println("suma numeros pares = " + suma[1]);
		System.out.println("suma numeros impares = " + suma[2]);
	}
	
	}
	
	
	

