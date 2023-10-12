package polymorphism;

public class A {
	
	public void add()
	{
		System.out.println("this is no org method");
	}
	public void add(int x)
	{
		System.out.println("this is int arg method");
	}
    public void add(int z, int y)
    {
    	System.out.println(y+z);
    }
    
    public static void main(String[] args) {
		
    	A obj=new A();
    	obj.add();
    	obj.add(100);
    	obj.add(10,20);
	}
}
