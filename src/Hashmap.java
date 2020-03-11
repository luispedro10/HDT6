import java.util.*;
import java.io.*;

public class Hashmap implements iMapas {
	
	HashMap<String,String> hash = new HashMap<String,String>();
	
	
	@Override
	public void agregar(String a, String b) {
		hash.put(a , b);
		
	}


	
	public String mostrar(String a) {
		
		return hash.get(a);
	}

	

}
