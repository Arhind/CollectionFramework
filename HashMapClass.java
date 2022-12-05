package collectionFramework;
import java.util.Map;
import java.util.HashMap;
//import java.util.TreeMap;

public class HashMapClass {

	public static void main(String[] args) {

		Map<String, Integer> number = new HashMap<>();
//		Map<String, Integer> number = new TreeMap<>();
		number.put("One", 1);
		number.put("Three", 3);
		number.put("Zero", 0);
		number.put("Two", 2);
		number.get("One");
		number.remove("One", 1);

		//Printing values by various methods
		for(Map.Entry<String, Integer> e : number.entrySet())
		{
			System.out.print("\n"+e+"\t");			//Printing entrySet
			System.out.print("Key:"+e.getKey());	//Printing keys only
			System.out.print(" Value:"+e.getValue());//Printing values only
		}
		
		System.out.print("\n\nKeySet : ");
		for(String key : number.keySet())
			System.out.print(key+" ");
		System.out.print("\nValue Set : ");
		for(int i : number.values())
			System.out.print(i+" ");
	}
}