package co4;
import java.util.*;
class passex extends Exception
{
	passex (String msg) {
	           super(msg);
	}
}
public class q3 {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the  username");
		String un= sc.nextLine();
		System.out.println("enter the password");
		String pw= sc.nextLine();
		try {
			if((un.length())<8)
			{
				throw new passex ("username should contain atleast 8 chars");
			}
			else if(pw.length()<8)
			{
				throw new passex ("password length doesnot match");
				
			}
			else {
				System.out.println(" successfull");
			}
			
		}catch(passex e) 
		{
		   System.out.println(e.getMessage());	
		}
		
	}

}
