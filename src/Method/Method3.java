package Method;

public class Method3 {
	
	public void M1()
	{
		System.out.println("i am normal method");
	}
	public void add(int x, int y)
	{
		System.out.println(x*y);
	}
	public void add(String s)
	{
		System.out.println("this is string argument method");
	}
	public void add(double d, double e)
	{
		System.out.println("this is double argument methiod");
	}

	public static void main(String[] args) {
		
		Method3 obj=new Method3();
	      obj.M1();
	      obj.add(10,20);
	      obj.add("rahul");
	      obj.add(10.5,20.5);
		

	}

}
