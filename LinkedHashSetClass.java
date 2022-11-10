/*	Collection Framework
 * 	LinkedHashSet interface -> LinkedHashSet class
 * 	Iterator interface -> Iterator class
 * 	Methods in LinkedHashSet Class are :  add(element), remove(element), contains(element), isEmpty(), size(), clear()
 *	Methods in Iterator Class are : hasNext(), next()
 */
package collectionFramework;
import java.util.LinkedHashSet;

public class LinkedHashSetClass {

	public static void main(String[] args) {

		LinkedHashSet<Integer> lset = new LinkedHashSet<>();
	
		lset.add(32);		// Add element
		lset.add(2);
		lset.add(54);
		lset.add(21);
		lset.add(65);
		System.out.println(lset);
		
		lset.remove(54);		//Remove element
		System.out.println(lset.contains(50));		//True or False
		System.out.println(lset.isEmpty());			//True or False
		System.out.println(lset.size());				//Size of set
		// lset.clear();								//Clear the set
		
		System.out.println(lset);
	}
}