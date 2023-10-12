package ArrayPrograms;

import java.util.HashSet;

public class HashSetDemo {

	public static void main(String[] args) {

	  HashSet<Integer> obj=new HashSet<Integer>();         // to declare the HashSet
	  obj.add(50);
	  
	  obj.add(100);
	  
	  obj.add(150);
	  
	  obj.add(200);
	  
	  obj.add(150);
	  
	  System.out.println(obj);
	  
	  System.out.println(obj.size());  //to calculate length
	  
//	  obj.get(1);           not applicable bcoz the concept of index value is not applicable here
	  
	  obj.remove(100);
	  
	  System.out.println(obj);
	  
	   obj.add(60);
	   
	   System.out.println(obj);
	   
	  // obj.clear();
	   System.out.println(obj);
	   
	   System.out.println(obj.contains(50));
	   
	   //2nd approach to print set
	   //for each loop
	   
	   System.out.println('\n');
	   
	   for(int k:obj)
	   {
		   System.out.println(k);
	   }
	         
	  
	  
	}

}
