package Math;

public class Math_Class {
	public static void main(String[] args) {
	
		System.out.println(Math.addExact(10, 10));
		System.out.println(Math.subtractExact(11, 12));
		System.out.println(Math.multiplyExact(2, 5));
		System.out.println(Math.max(100, 5));
		System.out.println(Math.min(3.14, 3.14));
		System.out.println(Math.abs(60));
		
		{
			for(int i=1; i<5; i++)
				System.out.println(Math.random());
		}
		
	}
}

