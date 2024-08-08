package Day_2;

import java.util.Arrays;

public class Array_Test {

	public static void main(String[] args) {
		int a [] = {16,78,62,33,55,43};
		int count=0;
		Arrays.sort(a);

		System.out.println("Asending order of Array = ");
		for(int i =0; i<a.length;i++) {
			System.out.println(a[i]);	
		}
		
		for (int i = 0; i < a.length-1; i++) {
            if (a[i] > a[i + 1]) {
            	count++;
            	break;
            }
            if (count > 0) 
            {
                System.out.println("The array is not sorted.");
            } else 
            {
                System.out.println("The array is sorted.");
            }    
	}
	}
}
