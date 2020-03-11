import java.io.*;
import java.util.*;

public class LinkedHashmap implements iMapas{
	
	
	LinkedHashMap<String,String> linkedhash = new LinkedHashMap<String,String>();
	

	
	public void agregar(String a, String b) {
		linkedhash.put(a,b);
		
	}

	
	public String mostrar(String a) {
		
		return linkedhash.get(a);
	}

}
