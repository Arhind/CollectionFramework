package collectionFramework;
import java.util.Collections;
import java.util.*;

public class CollectionsClass {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(1);
		list.add(20);
		list.add(2);
		list.add(30);
		list.add(100);
		
		System.out.println("Min : "+Collections.min(list));		//Min method
		System.out.println("Min : "+Collections.max(list));		//Max method
		System.out.println("Frequency of element : "+Collections.frequency(list, 2)); 	//Frequency of element
		Collections.sort(list, Comparator.reverseOrder());			//Sorting
		Collections.sort(list, Comparator.naturalOrder());
		System.out.println(list);
		
	}
}