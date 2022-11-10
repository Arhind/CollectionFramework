/*	Collection Framework
 * 	List interface -> ArrayList class
 * 	Iterator interface -> Iterator class
 * 	Methods in ArrayList Class are : add(), add(index, element), sort(null), addAll(NewList), remove(index), clear(), contains(element), get(index)
 *	Methods in Iterator Class are : hasNext(), next()
 */

package collectionFramework;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListClass {

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<>();		// ArrayList Definition
		
		// Add elements in Array
		list.add(1);
		list.add(3);
		list.add(4);
		list.add(2);

		list.add(1, 50); 	//Adding element at mid

		list.sort(null);	//Sorting an array
		
		ArrayList<Integer> newList = new ArrayList<>();		// List 2
		newList.add(300);
		newList.add(200);
		
		list.addAll(newList);
		
		// For Each Loop
		for(Integer i : list)
			System.out.print(i+" ");
				
		System.out.println("\nget(5) : "+list.get(5));	//Getting index element from list 
		
		list.remove(0);		//Remove element at i index
//		list.clear();		//Empty the list
		list.set(1, 1000);	//Update the element at 1 index with 1000
		list.contains(50);	//True or False
		
		System.out.println(list.contains(50));
		
		list.remove(Integer.valueOf(50));			
		
		//For Loop
		for(int i=0; i<list.size(); i++)
			System.out.print(list.get(i)+" ");
		
		System.out.println();
		// Iterator
		Iterator<Integer> it = list.iterator();
		while(it.hasNext())
			System.out.print(it.next()+" ");
	}
}