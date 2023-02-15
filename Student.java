package collectionFramework;
import java.util.Objects;

public class Student{
	
	int rollNo;
	String name;
	
	public Student(int newrollNo, String newName)
	{
		rollNo = newrollNo;
		name = newName;
	}
	
	public String toString()
	{
		return "Student : ["+rollNo+", "+name+"]";
	}
	
	@Override
	public int hashCode() {		//Return integer value
		return Objects.hash(rollNo);		//Return values based on rollNo
	}
	
	@Override
	public boolean equals(Object obj) {		//Return boolean value	
		if (this == obj)					//Same object
			return true;
		if (obj == null)					//Object is null, means no object
			return false;
		if (getClass() != obj.getClass())	
			return false;
		Student student = (Student) obj;		
		return rollNo == student.rollNo;		//RollNo same, means equal
	}
}