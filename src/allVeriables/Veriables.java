package allVeriables;

public class Veriables {
	
	int i=10;
	static int j=20;
	
	public void add()
	{
		int k=30;
		System.out.println(k);
	}
	
       public static void main(String[] args) {
    	 
    	Veriables obj=new Veriables();
    	
    	    obj.add();
    	    
    	   System.out.println(obj.i);
    	   System.out.println(j);
    	 
       
		

	}

}
