/*	Collection Framework
 * 
 * 	Queue interface -> LinkedList class
 * 	Methods in LinkedList Class are : offer(element),add(element),			 poll(),remove(), 		 peek(), element() 
 * 
 *  List interface -> LinkedList class
 * 	Methods in ArrayList Class are : add(), add(index, element), sort(null), addAll(NewList), remove(index), clear(), contains(element), get(index) 
 * 	
 *  Methods in Iterator Class are : hasNext(), next()
 */
package collectionFramework;
import java.util.Queue;
import java.util.LinkedList;
import java.util.List;

public class LinkedListQueueClass {

	public static void main(String[] args) {
		
		Queue<Integer> queue = new LinkedList<>();	
// OR	LinkedList<Integer> list = new LinkedList<>();
		
		queue.offer(100);		// Add element in queue		
// OR 	queue.add(100);			//Throws exception if element not added successfully
		
		queue.offer(50);
		queue.offer(200);
		System.out.println("LinkedList using Queue interface : "+queue);

//		queue.poll()	To remove element. When queue is empty, it returns null
// OR 	queue.remove()	When queue is empty, it throws exception
		System.out.println("Removing from front : "+queue.poll());		//Remove element

//		queue.peek()	To find front element
// OR 	queue.element()	Throws exception if queue is empty
		System.out.println("Top element in queue : "+queue.peek());		//Front element of queue		
	
	
	
		System.out.println();
	
	
	
		List<Integer> list = new LinkedList<>();
		
		list.add(1000);
		list.add(500);
		list.add(2000);
		System.out.println("LinkedList using List interface : "+list);
// We can use all function defined in ArrayList in this scenario
	}
}