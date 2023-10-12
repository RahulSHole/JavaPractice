package allVeriables;

public class Global {
	
	static int x=40;                //Global variable
	
	public void M1()
	{
		System.out.println(x);
	}

	public static void main(String[] args) {
		
		Global obj=new Global();
		
		    obj.M1();
		    System.out.println(x);
			System.out.println(obj.x);
			System.out.println(Global.x);	
	}

}
