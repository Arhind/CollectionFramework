//https://www.hackerrank.com/challenges/java-iterator/problem?h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen
/*
Input
2 2
42
10
hello
java

Output
hello
java 
 */

package collectionFramework;
import java.util.*;

public class JavaIterator {
	
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();	
		int b = sc.nextInt();	
		
		@SuppressWarnings("rawtypes")
		ArrayList list = new ArrayList();
		
		for(int i=0; i<a+b; i++)	
		{
			list.add(sc.next());
		}
		
		for(int i=a; i<a+b; i++)	
		{
			System.out.println(list.get(i));
		}
		sc.close();
	}
}