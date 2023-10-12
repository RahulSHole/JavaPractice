package multi_level_inheritance;

public class RahulGandhi extends RajivGandhi {
	
	public void mp()
	{
		System.out.println("bharat jodo yatra");
	}

	public static void main(String[] args) {
		
		RahulGandhi obj=new RahulGandhi();
		
		obj.emergency();
		obj.computers();
		obj.mp();

	}

}
