package ArrayPrograms;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {

		ArrayList<String> obj=new ArrayList<String>();
		
		obj.add("Rahul");
		
		obj.add("Manoj");
		
		obj.add("Gaurav");
		
		obj.add("prashant");
		
		obj.add("Girish");
		
		System.out.println(obj);
		
		System.out.println(obj.size());        //to calculate lenght
		
		System.out.println(obj.get(2));       //to retrieve the value at specific index
		
		obj.add("bittu");
		obj.add("kamal");
		
		System.out.println(obj);
		
		obj.remove(4);
		obj.remove(5);
		System.out.println(obj);
		
		obj.add(3,"mayur");                 //to insert new value at specific index
		
		System.out.println(obj);
		
		obj.set(4,"yogesh");               //replace the value at specific index
		System.out.println(obj);
		
    //		obj.clear();                       //to remove all value from arraylist
  		System.out.println(obj);
		
		System.out.println(obj.contains("yogesh"));          //  boolean value
		
		
		//for loop                  // second approach
		
	for(int i=0; i<obj.size(); i++)
	{
		System.out.println(obj.get(i));
	}
	
	     // for each loop                //3rd approach
	
	   System.out.println('\n');
	
	for(String k:obj)
	{
		System.out.println(k+" ");
	}
	
	}

}
