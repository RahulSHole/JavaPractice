package interfaceDemo;

public class B implements A{
 
	public void M1()
	{
		System.out.println("im implementation of M1");
	}
	public void M2()
	{
		System.out.println("im implementation of M2");
	}
	public void M3()
	{
		System.out.println("this belong to child class");
	}
	
	public static void main(String[] args) {
		
		B obj=new B();
		obj.M1();
		obj.M2();
		obj.M3();

	}

}
