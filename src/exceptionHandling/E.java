package exceptionHandling;

public class E {

	public static void main(String[] args) {

		try
		{
			System.out.println(10/0);
		}
		finally
		{
			System.out.println("this code is always going to execute");
		}
	}

}

