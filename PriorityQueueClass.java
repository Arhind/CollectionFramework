/*	Collection Framework
 * 	Queue interface -> PriorityQueue class
 * 	Methods : 
*/
package collectionFramework;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueClass {

	public static void main(String[] args) {

		Queue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
		
		pq.add(40);		//Add Element in priority queue
		pq.add(12);
		pq.add(24);
		pq.add(36);
		
		System.out.println(pq);
		
		pq.poll();		//Remove
		pq.peek();		//Next element
		
		
		
		
		
		
		
		
		
		
		
		PriorityQueue<Integer> pqr = new PriorityQueue<>();
		
		pqr.add(100);
		pqr.offer(200);
		System.out.println("PQR queue : "+pqr);
		
		pqr.element();		//Next element
		pqr.peek(); 		//Next element
	}
}