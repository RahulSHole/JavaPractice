package multi_level_inheritance;

public class RajivGandhi extends IndiraGandhi {
	
	public void computers()
	{
		System.out.println("started import and use of computers");
	}

	public static void main(String[] args) {
		
		RajivGandhi obj=new RajivGandhi();
		
		obj.emergency();
		obj.computers();

		
	}

}
