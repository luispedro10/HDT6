import java.io.*;
import java.util.*;

public class FactoryMap {
	
	public iMapas getType(int op) {
		
		if(op==1) {
			return new Treemap();
		}
		if(op == 2) {
			
			return new Hashmap();
		}
		
		else {
			return new LinkedHashmap();
		}
	
		
		
	}

}
