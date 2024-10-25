package KP1;
public class nonstatic_method {
	void add()
	{
		int a= 10;
		int b= 20;
		int c= 30;
		int sum= a+b+c;
	System.out.println(sum);
	}
	void sub()
	{
		int a=10;
		int b=20;
		int sub= b-a;
		System.out.println(sub);
	}
public static void main(String[] args)
{
	nonstatic_method n1= new nonstatic_method();
	n1.add();
	n1.sub();
}

}
