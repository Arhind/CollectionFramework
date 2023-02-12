/*	Custom class using HashSet 
 * 	2 classes will be implemented : LearnSet class(with main method), Student class(Without main method)
 * 	toString Method in Student class : To print values instead of object
 * 	hashCode Method in Student class : To generate hashcode based on some parameters like rollNo, name, etc
 * 	equals Method in Student class : To compare 2 objects in 
 */
package collectionFramework;
import java.util.HashSet;

public class CustomSetClass{
	
	public static void main(String[] args)
	{
		HashSet<Student> st = new HashSet<>();
		
		st.add(new Student(3, "Arhind"));	//obj1
		st.add(new Student(1, "Shubham"));	//obj2	
		st.add(new Student(2, "Ary"));		//obj3
		st.add(new Student(1, "Shubham"));	//obj4
		
		// Output before adding toString method in Student class : [collectionFramework.Student@3fee733d, collectionFramework.Student@4617c264, 
		//											collectionFramework.Student@2c7b84de, collectionFramework.Student@5acf9800]
		// To print values, add toString method in Student class
		// Output after adding toString method in Student class : [Student : 1 Name : Shubham, Student : 1 Name : Shubham, Student : 3 
		// Name : Arhind, Student : 2 Name : Ary]
		System.out.print(st);		
	}
}