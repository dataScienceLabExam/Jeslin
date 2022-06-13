package Jes;
import java.util.*;
class stud{
	int st_id;
	String sname,branch;
	stud(int st_id,String sname,String branch){
		this.st_id=st_id;
		this.sname=sname;
		this.branch=branch;
	}
	void display() 
	{

		System.out.println("the student id-"+st_id);

		System.out.println("the student name-"+sname);

		System.out.println("the branch-"+branch);
		
	}
	
}
public class Pgm1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number of students");
		int n=sc.nextInt();
		stud[] s=new stud[n];
		for(int i=0;i<n;i++)
		{
			System.out.println("enter the student id");
			int st_id=sc.nextInt();
			sc.nextLine();

			System.out.println("enter the student name");
			String sname=sc.nextLine();

			System.out.println("enter the branch");
			String branch=sc.nextLine();
			
			s[i]=new stud(st_id,sname,branch);
			
			
		}
		
		for(int i=0;i<n;i++)
		{
			s[i].display();
			
		}
				
	}

}
