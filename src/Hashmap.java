import java.util.*;
import java.io.*;

public class Hashmap implements iMapas {
	HashMap hash = new HashMap();
	Scanner teclado = new Scanner(System.in);
	
	@Override
	public void agregar(String a, String b) {
		hash.put("a", b);
		
	}


	
	public void mostrar(String a) {
		
		System.out.println(hash.get(a));
	}

	

}
