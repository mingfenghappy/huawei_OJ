package arraystest;

import java.util.Arrays;
public class arraystest {
	public static void main(String[] args)
	{
		int[] a={1,4,3,5,2,6};
		int[] b= new int[]{1,1,3,6,3};
		System.out.println("�Ƿ����"+Arrays.equals(a,b));
		
		int[] c= Arrays.copyOf(b,5);
		System.out.println("�Ƿ����"+Arrays.equals(c,b));
		
		Arrays.sort(c);
		System.out.println("c������"+ Arrays.toString(c));
		
	}

}
