package KP1;

public class staticparameterizedmethod {

	static void add(int a, int b)

	{
		int add = a + b;
		System.out.println(add);
	}

	static void login(String un, String password) {
		System.out.println("Login to LinkedIn");
	}

	static void signup(String Firstname, String Lastname, long mobile) {
		System.out.println("Loged in");
		

	}

	public static void main(String[] args) {
		add(10, 20);
		login("komalpawar700@gmail.com", "Linked786");
		signup("Komal", "Pawar", 7030363489l);
	}

}
