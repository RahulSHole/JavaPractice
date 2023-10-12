
package allVeriables;

public class Instance {
	
	int x=50;
	
	public void M1()
	{
		System.out.println(x);
	}

	public static void main(String[] args) {
		
		Instance obj=new Instance();
		
	            obj.M1();
		System.out.println(obj.x);

	}

}
