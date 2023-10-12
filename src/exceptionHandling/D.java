package exceptionHandling;

public class D {

	public static void main(String[] args) {

		String s="Rahul";
		try
		{
			System.out.println(s.charAt(6));
		}
		catch(ArithmeticException e)
		{
			System.out.println("this index value is exceding");
		}
		catch(StringIndexOutOfBoundsException e)
		{
			System.out.println("SIOBE");
		}
	
	}

}
