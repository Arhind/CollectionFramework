/*	Collection Framework
 * 	Queue interface -> ArrayDeque class
 * 	Iterator interface -> Iterator class
 * 	Methods in ArrayDeque Class are : offer(), offerFirst(), OfferLast(), peek(), peekFirst(), peekLast(), poll(), pollFirst(), pollLast() 
 *	Methods in Iterator Class are : hasNext(), next()
 */
package collectionFramework;
import java.util.ArrayDeque;
//import java.util.Queue;

public class ArrayDequeClass {

	public static void main(String[] args) {
		
		ArrayDeque<Integer> adq = new ArrayDeque<>();
// OR	Queue<Integer> adq = new ArrayDeque<>();
		
		adq.offer(100);			//Add element
		adq.offerFirst(25);		//Add element at head pos
		adq.offerLast(1001);	//Add element at last pos
		adq.offer(101);
		System.out.println(adq);
		
		adq.peek();				//Front
		adq.peekFirst();
		adq.peekLast();
		
		adq.poll();				//Remove
		adq.pollFirst();
		adq.pollLast();
		
		System.out.println(adq);
	}
}