import java.io.*;
import java.util.*;

public class Treemap implements iMapas {
	
	TreeMap <String, String> tree = new TreeMap<String,String>(); 
	
	public void agregar(String a, String b) {
		
		tree.put(a,b);
	}

	
	public String mostrar(String a) {
		
		return tree.get(a);
	}

}
