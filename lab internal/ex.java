package Jes;
import java.util.*;


class excp extends  Exception{
	excp(String msg){
		super(msg);
	}
	
}
public class ex {
	public static void main()
	{
		int i=0;
		Scanner sc=new Scanner (System.in);
		System.out.println("enter the number of students.... ");
		int n=sc.nextInt();
		while (i<n)
		{
			System.out.println("enter the roll no ");
			int r=sc.nextInt();
			sc.nextLine();
			System.out.println("enter the name of student ");
			String name=sc.nextLine();
            System.out.println("enter the mark1 ");
			int m1=sc.nextInt();
			System.out.println("enter the mark2 ");
			int m2=sc.nextInt();
			System.out.println("enter the mark3 ");
			int m3=sc.nextInt();
			int total=m1+m2+m3;
			try {
				if((total/300*100)<40)
				{
					
					throw new excp("should be greater than 40 percent");
				}
			}catch(excp e)
			{
                System.out.println(e.getMessage());
			}
			}	
	}

}
