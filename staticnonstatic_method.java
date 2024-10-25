package KP1;

public class staticnonstatic_method {
	static void call_1()
	{
	int a=10;
	int b=30;
	int add= a+b;
	
	System.out.println(add);
	}
	
	void call_2()
	{
		int c= 1;
		int d= 2;
		int sub= 2-1;
		System.out.println(sub);
	}
public static void main(String[] args)
	{
	
		staticnonstatic_method P1= new staticnonstatic_method();
		P1.call_2();
		call_1();
		
	}

}
