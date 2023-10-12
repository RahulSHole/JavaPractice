package wrapperClass;

public class C {

	public static void main(String[] args) {

		int i=30;
		Integer I=Integer.valueOf(i);
		System.out.println(I.intValue());
		
		Character C=Character.valueOf('R');
		System.out.println(C.charValue());
		
		Double D=Double.valueOf(20.30);
		System.out.println(D.doubleValue());
	}

}
