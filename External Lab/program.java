package exam;
import java.util.*;
interface inter{
	
	void area();
}
class rectangle  implements inter{
	int l,b;
	rectangle(int l,int b){
		this.l=l;
		this.b=b;
	}
	public void area(){
		
		System.out.println("the area of the rectangle is "+(l*b));
	}
}
public class program {
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the length of the rectangle");
		int l=sc.nextInt();
		sc.nextLine();
		System.out.println("enter the breadth of the rectangle");
		int b=sc.nextInt();
		sc.nextLine();
		rectangle obj=new rectangle(l,b);
		obj.area();
		
	}

}
