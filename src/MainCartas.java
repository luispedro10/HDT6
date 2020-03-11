/*
 * Authors
 * @Luis Pedro Garcia 19344
 * @Christian Perez 19
 */

import java.io.*;
import java.util.*;

public class MainCartas {

	public static void main(String[] args) {
// variables de instancia		
		int op;
		int ciclo = 1;
		
// Se crean instancias del factory y el lector para leer el archivo de texto.	
	leerTxt lector = new leerTxt();
	FactoryMap factory = new FactoryMap();
	Scanner scanOpcion = new Scanner(System.in);
	
//Se crea la coleccion del usuario, representada por 3 arraylists.
	ArrayList<String> ColeccionM = new ArrayList<String>();
	ArrayList<String> ColeccionH = new ArrayList<String>();
	ArrayList<String> ColeccionT = new ArrayList<String>();

// El usuario decide como trabajar el programa, y el factory lo instancia. 	
	System.out.println("De que manera desea archivar el mazo de cartas?\n1. TreeMap \n2. HashMap\n3. LinkedHashMap");
	op = scanOpcion.nextInt();
	iMapas mapa = factory.getType(op);
	
// Abre el archivo, siempre se debe de hacer.
	lector.abrirArchivo();

//Ciclo para guardar el texto en el Mapa
	while(lector.getScan().hasNextLine()) {
		String a= (lector.getScan().nextLine());
		String[] parts = a.split("\\|");
		mapa.agregar(parts[0], parts[1]);
	}
	//Ciclo principal
	while(ciclo == 1) {
	System.out.println("Que desea hacer?\n1. Agregar una carta a su propia coleccion\n2. Ver el tipo de una carta\n3. Ver las cartas de su coleccion\n4. Mostrar las cartas de su coleccion, ordenadas por tipo\n5. Mostrar el nombre y el tipo de todas las cartas del mazo\n6. Mostrar el nombre de todo, ordenado por tipo\n7. Salir");
	int segundaDe = scanOpcion.nextInt();
	
	 if(segundaDe== 1) {
		System.out.println("Ingresar nombre de la carta exacta para agregar a su coleccion");
		String nombreAgregar = scanOpcion.nextLine();
		nombreAgregar = scanOpcion.nextLine();    //bug de java
		try {
		if(mapa.mostrar(nombreAgregar).contentEquals("Trampa")) {
			
			ColeccionT.add(nombreAgregar + "| Trampa");
		}
		
		if(mapa.mostrar(nombreAgregar).contentEquals("Monstruo")) {
			
			ColeccionM.add(nombreAgregar + "| Monstruo");
		}
		
		if(mapa.mostrar(nombreAgregar).contentEquals("Hechizo")) {
			
			ColeccionH.add(nombreAgregar + "| Hechizo");
		}
		
		System.out.println("Carta Agregada!");
	 }
		catch (Exception E) {
			System.out.println("Ingreso el nombre de la carta mal, o esta no existe");
		}
	}
	
	else if(segundaDe == 2) {
		
	}
	
	else if(segundaDe == 3) {
		System.out.println("En su coleccion se encuentran las siguientes cartas");
		System.out.println(" ");
		for(int i = 0;i<ColeccionM.size(); i++) {
			System.out.println(ColeccionM.get(i));
		}
		
		System.out.println(" ");
		
		for(int i = 0;i<ColeccionH.size(); i++) {
			System.out.println(ColeccionH.get(i));
		}
		System.out.println(" ");
		for(int i = 0;i<ColeccionT.size(); i++) {
			System.out.println(ColeccionT.get(i));
		}
	}
	
	else if(segundaDe == 4) {
		
		System.out.println("En su coleccion se encuentran las siguientes cartas");
		System.out.println(" ");
		System.out.println("Cartas Monstruo:");
		if(ColeccionM.size()==0) {
			System.out.println("No tienes monstruos");
		}
		else {
		for(int i = 0;i<ColeccionM.size(); i++) {
			System.out.println(ColeccionM.get(i));
		}
		}
		
		System.out.println(" ");
		System.out.println("Cartas Hechizo:");
		if(ColeccionH.size()==0) {
			System.out.println("No tienes monstruos");
		}
		else {
			for(int i = 0;i<ColeccionH.size(); i++) {
			System.out.println(ColeccionH.get(i));
		}
		}
		
		System.out.println(" ");
		System.out.println("Cartas Trampa:");
		if(ColeccionT.size()==0) {
			System.out.println("No tienes trampas");
		}
		else { 
			for(int i = 0;i<ColeccionT.size(); i++) {
			System.out.println(ColeccionT.get(i));
		}
		}
		
	}
	 
	else if (segundaDe == 5) {
		
		lector.abrirArchivo();
		
		while(lector.getScan().hasNextLine()) {
			String a= (lector.getScan().nextLine());
			String[] parts = a.split("\\|");
			System.out.println("Nombre:");
			System.out.println(parts[0]);
			System.out.println("Tipo:");
			System.out.println(parts[1]);
			System.out.println(" ");
			System.out.println(" ");
		}
	}
	 
	else if (segundaDe ==6) {
		
	}
	 
	else if (segundaDe == 7) {
		System.out.println("Adios");
		ciclo = 2;
	}

	}
	
	

	
		
		
		
		
		
		

	}

}
