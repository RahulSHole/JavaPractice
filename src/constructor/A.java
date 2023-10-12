package constructor;

public class A {
      
	    A()                // no-argument constructor
	    {
	    	System.out.println("i am a constructor");
	    }
	    A(int x)           // parameterized constructor
	    {
	    	System.out.println(x);
	    }
        A(int y,int z)
        {
        	System.out.println(y+z);
        }
        A(int a,int b, int c)
        {
        	System.out.println(a+b+c);
        }
	public static void main(String[] args) {

		   A obj=new A();
		   A obj1=new A(100);
		   A obj2=new A('g');
		   A obj3=new A(100,200,300);
		   A obj4=new A(20,25);
		   A obj5=new A('h','j');
		 //  A obj6=new A("rahul");           // there is not such argument
		//   A obj7=new A(5.5);               // AP is not possible
	}

}
