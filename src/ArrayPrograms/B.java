package ArrayPrograms;

import java.util.Arrays;

public class B {

	public static void main(String[] args) {             // different approach

		String a[]=new String[4];
		
		a[0]="Rahul";
		a[1]="Gaurav";
		a[2]="Prashant";
		a[3]="manoj";
		
		System.out.println(Arrays.toString(a));
		
		System.out.println(a.length);
		
		System.out.println();
		
		for(int i=0; i<a.length; i++)
		{
			System.out.println(a[i]+" ");
		}
	}

}
