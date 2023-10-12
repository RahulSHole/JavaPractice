package arraysNdcollection;

import java.util.Arrays;

public class ArrayDemo {

	public static void main(String[] args) {
		
		
		double a[]= {10.5, 20.5,30.5,40.5};   //this i called array
		
		System.out.println(a.length);  //to calculate this size/lenght of arrray
		
		       System.out.println(a[1]);
		       System.out.println(a[3]);
		       
		   	System.out.println(Arrays.toString(a));     //to print antire arrray
			
		       
		         a[1]=50.5;
		
		System.out.println(Arrays.toString(a));
		
		     //   a[4]=88.5;
   //		    System.out.println(Arrays.toString(a));
		 
		  System.out.println('\n');        
		    
             for(int i=0; i<a.length; i++)              //second approach
             {
            	 System.out.println(a[i]+" ");
             }
             
             System.out.println();
             
             
             for(double k:a)                        // third approach
             {
              System.out.println(k);
             }
	}
}
