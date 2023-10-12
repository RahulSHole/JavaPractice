package polymorphism;

public class Child extends Parent{
	
	public void marry()
	{
		System.out.println("Dipika Padukon");
	}

	public static void main(String[] args) {
       
		Child obj=new Child();
		
		obj.property();
		obj.marry();
	}

}
