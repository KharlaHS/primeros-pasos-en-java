import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Colecciones {
	
	public static void main(String[] args) {
		
		
		//las colecciones nos sirven para almacenar 
		//un conjunto de objetos
		//la diferencia de las colecciones y los objetos
		//es que las colecciones son dinámicas, pueden cambiar
		//el número de objetos agregados
		
		//Set tiene 3 implementaciones
		//no puede contener elementos repetidos
		
		//>>HashSet<<
		//los elementos no mantienen un orden
		//Es la implementación más rápida
		/*
		Set<String> frutas = new HashSet<String>(); //si nuestros elementos se tienen que repeti no se implementa esta coleccion.
		frutas.add("mango");
		frutas.add("granada");
		frutas.add("piña");
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
		
		/*
		//>>TreeSet<<
		//esta implementacion ordena los elementos en funcion de sus valores
		//es la implementacion mas lenta
		//se utilza cuando queramos que nuestra coleccion de elemtos se ordene
		Set<String> frutas = new TreeSet<String>();
		frutas.add("mango");
		frutas.add("granada");
		frutas.add("piña");
		frutas.add("sandia");
		frutas.add("mamey");
		frutas.add("fresa");
		frutas.add("mango");
	
		
		for( String fruta: frutas) {
			System.out.println(fruta);
		}
		*/
		
		/*
		//>>LinkedHashSet<<
		//ordena los elementos en orden de inserción
		//es mas costoso que HashSet
		//respeta el orden en el que se escriban los elementos
		Set<String> frutas = new LinkedHashSet<String>();
		frutas.add("mango");
		frutas.add("granada");
		frutas.add("piña");
		frutas.add("sandia");
		frutas.add("mamey");
		frutas.add("fresa");
	
	
		
		for( String fruta: frutas) {
			System.out.println(fruta);
		}
		*/
		
		//List
		// Se permiten elementos duplicados
		// podemos acceder a elementos específicos
		// Buscar elementos
		
		
		//>>ArrayList<<
		
		List<String> pokemones = new ArrayList<String>();
		pokemones.add("Chicorita");
		pokemones.add("Eevee");
		pokemones.add("Psydick");
		pokemones.add("Dragonite");
		pokemones.add("Charizard");
		pokemones.add("Gengar");
		pokemones.add("Flygon");
		pokemones.add("Gengar");
		
		//add si agregamos un indice y un elemento, posiciona
		//el elemento en el indice y realiza un desplazamiento
		//es decir no borra el elemento en la posicion sino
		//que lo desplaza
		pokemones.add(2, "Pikachu");//inserta el elemento en la posicion y si hay uno lo recorre
		
		//remove remueve el elemento de la posicion especificada
		pokemones.remove(5);
		
		//set reemplaza el elemento de la posicion especificada
		pokemones.set(0, "Flareon");	
		
		for(String pokemon : pokemones) {
			System.out.println(pokemon);
		}
		
		System.out.println("***********");
		System.out.println(pokemones.get(4));//get devuelve el elemento que se encuentre en la posición que pongas dentro de los ( )
		
		//indexOf, nos va a devolver la posicion del elemento
		//y si el elemento no se encuentra nos devuelve -1
		
		System.out.println(pokemones.indexOf("Togepi"));
		
		System.out.println("***********");
		
		//>>LinkedList<<
		//Es una lista doblemente enlazada
		//Es mas rapido para insertar y remover elementos
		List<String> digimones = new LinkedList<String>();
		digimones.add("Aquamon");
		digimones.add("Patamon");
		digimones.add("Angemon");
		digimones.add("Andromon");
		digimones.add("Greymon");
		
		String digimon = digimones.get (0);
		System.out.println(digimon);
		
		//>>Map<<
		//Asocia claves a valores.
		//No puede contener claves duplicadas
		//sólo puede tener un valor asociado
		
		//>>HashMap<<
		//Tiene mejor rendimiento pero no garantiza un orden
		//a la hora de hacer iteraciones
		//no acepta claves duplicadas
		
		Map<Integer, String> usuarios = new HashMap<Integer, String>();
		usuarios.put(2510, "Karla Herrera");
		usuarios.put(6251, "Dyana Wentz");
		usuarios.put(1110, "Zafrina Scherbatsky");
		
		System.out.println("***********");
		System.out.println(usuarios.get(1110));
		
		//>>KeySet<<
		//Nos permite recuperar el nombre de las cleves
		System.out.println("***************");
		System.out.println(usuarios.keySet());//muestra las claves
		
		//>>Values<<
		//nos permite recuperar el valor directamente
		System.out.println("****************");
		System.out.println(usuarios.values());//muestra el valor de las claves
		
		//>>TreeMap<<
		Map<Integer, String> tamales = new TreeMap<Integer, String>();
		tamales.put(5, "Mole Rojo");
		tamales.put(9, "Mole Verde");
		tamales.put(160, "Gansito");
		tamales.put(1,"Cochinita");
		
		System.out.println("******************");
		System.out.println(tamales.keySet());
		System.out.println(tamales.values());
		
		System.out.println("******************");
		tamales.entrySet().forEach(elemento -> {//funcion lambda
			//System.out.println(elemento.getKey().toString() + elemento.getValue().toString());
			System.out.println(elemento.getKey());
			System.out.println(elemento.getValue());
		});
		
		//>>LinkedHashMap<<
		Map<Integer, String> carros = new LinkedHashMap<Integer, String>();
		//guarda los elementos segun el orden en que se inserten
		carros.put(1, "Volvo");
		carros.put(567, "Pointer");
		carros.put(8, "Mustang");
		
		System.out.println("******************");
		System.out.println(carros.keySet());
		System.out.println(carros.values());
	}
}
