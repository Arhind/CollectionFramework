/*	Collection Framework
 * 	List interface -> Stack class
 * 	Methods in Stack Class are : push(),pop(), peek(), 
 *  Methods in Iterator Class are : hasNext(), next()
 */
package collectionFramework;
import java.util.Stack;

public class StackClass {

	public static void main(String[] args)
	{
		Stack<String> animal = new Stack<>();	//Stack DS definition
		
		// Add element in Stack
		animal.push("Lion");
		animal.push("Dog");
		animal.push("Horse");
		animal.push("Cat");
		animal.search("Lion");
		System.out.println("Stack Search : "+animal.search("Horse"));		//Search an element in Stack and get the index
		
		System.out.println("Top element of Stack : "+animal.peek());		// To get the element of Stack
		
		animal.pop();		// To remove the element from Stack
		
		System.out.println("Stack : "+animal);
		
	}
}