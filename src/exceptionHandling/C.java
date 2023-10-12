package exceptionHandling;

public class C {

	public static void main(String[] args) {

		String s = "Rahul";
	    try
		{
	    	System.out.println(s.charAt(6));
		}
	    catch(StringIndexOutOfBoundsException e)
	    {
	    	System.out.println("the index value is excedding");
	    }
		
	}

}
