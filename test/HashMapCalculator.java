import java.util.HashMap;
import java.util.Iterator;

public class HashMapCalculator {
	public int commonKeyValuePairs(HashMap<String, String> hashmap1, HashMap<String, String> hashmap2){
		int matches = 0;
		for (String a : hashmap1.keySet()) {
			for (String b : hashmap2.keySet()) {
				if(a.equals(b)) {
					if(hashmap1.get(a).equals(hashmap2.get(b))) {
						matches+=1;
					}
				}
			}
		}
		return matches;
	}
}
