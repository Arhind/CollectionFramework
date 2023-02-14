//Java Priority Queue
//https://www.hackerrank.com/challenges/java-priority-queue/problem

package collectionFramework;
import java.util.*;

class Student1 implements Comparable<Student1>
{
 int token;
   String fname;
  double cgpa;
   public Student1(int id, String fname, double cgpa) {
      super();
      this.token = id;
      this.fname = fname;
      this.cgpa = cgpa;
   }
   public int getToken() {
      return token;
   }
   public String getFname() {
      return fname;
   }
   public double getCgpa() {
      return cgpa;
   }
    public int compareTo(Student1 s)
        {
        if(Double.compare(this.cgpa,s.cgpa)!=0)
            {
            return -Double.compare(this.cgpa,s.cgpa);
        }
        else if(this.fname.compareTo(s.fname)!=0)
            {
            if(this.fname.compareTo(s.fname)>0)
                return 1;
            else
                return -1;
        }
        else 
            return Integer.compare(this.token,s.token);
    }
}

public class JavaPriorityQueue {

    public static void main(String[] args) {
      
    	Scanner in = new Scanner(System.in);
    	int totalEvents = Integer.parseInt(in.nextLine());
        PriorityQueue<Student1>pq=new PriorityQueue<Student1>();
      
        while(totalEvents>0){
         String e = in.next();
            if(e.compareTo("SERVED")==0)
                {
                Student1 s=pq.poll();
                System.out.println(s.fname);
            }
          else
              {
                String n = in.next();
              double d=in.nextDouble();
              int t=in.nextInt();
              Student1 s=new Student1(t,n,d);
              pq.add(s);
          }
           //Complete your code
           
         totalEvents--;
      }
        if(pq.isEmpty())
            System.out.println("EMPTY");
            else
            {
            while(!pq.isEmpty())
                {
                 Student1 s=pq.poll();
                System.out.println(s.fname);
            }
        }
     in.close();
    }
}