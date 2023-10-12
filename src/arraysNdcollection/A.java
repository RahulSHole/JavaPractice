package arraysNdcollection;

import java.util.Arrays;

public class A {

	public static void main(String[] args) {

		int a[]= {10,20,30,40};
		
		System.out.println(a[0]);
		
		System.out.println(a[2]);
		
		System.out.println(a.length);
		
		System.out.println(Arrays.toString(a));
		
		    a[0]=80;
		System.out.println(Arrays.toString(a));
		
		System.out.println('\n');
		
		for(int i=0; i<a.length; i++)
		 
		   System.out.println(a[i]);
		
		System.out.println();
		
		for(int r:a)
			System.out.println(r);
		
	}

}
