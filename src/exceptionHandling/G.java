package exceptionHandling;

public class G {

	public static void main(String[] args) {

		try
		{
	       System.out.println(10/10);
		}
		catch(Exception e)
		{
			System.out.println("handling code");
		}
		finally
		{
			System.out.println("this code is always going to execute");
		}
	}

}
