import java.util.HashSet;
import java.util.Set;

public class Colecciones {
	
	public static void main(String[] args) {
		
		
		//las colecciones nos sirven para almacenar 
		//un conjunto de objetos
		//la diferencia de las colecciones y los objetos
		//es que las colecciones son din�micas, pueden cambiar
		//el n�mero de objetos agregados
		
		//Set tiene 3 implementaciones
		//no puede contener elementos repetidos
		
		//HashSet
		//los elementos no mantienen un orden
		//Es la implementaci�n m�s r�pida
		/*
		Set<String> frutas = new HashSet<String>();
		frutas.add("mango");
		frutas.add("granada");
		frutas.add("pi�a");
		frutas.add("sandia");
		frutas.add("mamey");
		frutas.add("fresa");
		*/
		//foreach, puede recorrer una coleccion y en cada
		//recorrido recupera el valor y lo podemos almacenar 
		//En una variable
		//Syntaxis
		//for(tipoDeDatoElemento variable : elementoARecorrer)
		/*for( String fruta: frutas) {
			System.out.println(fruta);
		}*/
		
		//TreeSet
		
		Set<String> frutas = new HashSet<String>();
		frutas.add("mango");
		frutas.add("granada");
		frutas.add("pi�a");
		frutas.add("sandia");
		frutas.add("mamey");
		frutas.add("fresa");
		
		for( String fruta: frutas) {
			System.out.println(fruta);
		}
		//LinkedHashSet
		
	}
}
