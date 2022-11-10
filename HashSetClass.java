/*	Collection Framework
 * 	Set interface -> HashSet class
 * 	Iterator interface -> Iterator class
 * 	Methods in HashSet Class are : add(element), remove(element), contains(element), isEmpty(), size(), clear() 
 *	Methods in Iterator Class are : hasNext(), next()
 */
package collectionFramework;
import java.util.Set;
import java.util.HashSet;

public class HashSetClass {

	public static void main(String[] args) {

		Set<Integer> hashset = new HashSet<>();
// OR	HashSet<Integer> hst = new HashSet<>();
		
		hashset.add(32);		// Add element
		hashset.add(2);
		hashset.add(54);
		hashset.add(21);
		hashset.add(65);
		System.out.println(hashset);
		
		hashset.remove(54);		//Remove element
		System.out.println(hashset.contains(50));		//True or False
		System.out.println(hashset.isEmpty());			//True or False
		System.out.println(hashset.size());				//Size of set
		// hashset.clear();								//Clear the set
	}
}