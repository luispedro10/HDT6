import java.io.*;
import java.util.*;




public class leerTxt {
	
	private Scanner scan;
	FactoryMap factory = new FactoryMap();
	
	String nombre;
	String tipo;
	
	
	
	public void abrirArchivo() {
		try {
			scan = new Scanner(new File("cards_desc.txt"));
		}
		 
		catch(Exception e) {
			System.out.println("No estan las cartas para leer. ");
			
		}
	}
// Este metodo imprime todo el archivo de texto, separado por nombre y tipo

	public void  mostrar () {
		while(scan.hasNextLine()) {
		String a= (scan.nextLine());
		String[] parts = a.split("\\|");
		String part1= parts[0]; 
		String part2 = parts[1]; 
		System.out.println(part1);
		System.out.println(part2);
		}
		}
	
 
		public Scanner getScan() {
			return scan;
		}
	}
	

	
	
	
			
			
		
		
	
	
	
	

