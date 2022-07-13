package co4;
import java.util.*;
class negex extends Exception
{
	negex (String msg){
		super(msg);
	}
}
public class q4 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int avg, a,sum=0;
		int i=0;
		System.out.println("enter the number of digits");
		int n= sc.nextInt();
		sc.nextLine();
		System.out.println("enter the digits");
		while(i<n) {
			
			try
			{
			 a=sc.nextInt();
			 if (a<0)
			 {
				 throw new negex ("number is negative");
			 }
			 else {
				 sum=sum+a;
				 i++;
			 }
				 
			     
			}catch(negex e)
			{
			System.out.println(e.getMessage());	
			}
		}
		avg = sum/n;
		System.out.println("the average is "+avg);
		
		
	}

}
