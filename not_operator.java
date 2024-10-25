package KP1;

public class not_operator {
	public static void main(String []args)
	{
		int a=11;
		int b=22;
		int c=30;
		
		if (!(a<10 && a<11))
	{
			System.out.println("nice");
	}
		if(!(a<c || a>b))
		{
			System.out.println("not nice");
		}
			
	
	
}
}
