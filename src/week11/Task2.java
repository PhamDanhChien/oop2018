package week11;

import java.util.Scanner;
import java.util.ArrayList;


public class Task2 {
  
  public static <T extends Comparable> T Max (ArrayList<T> arr) {
		int n = arr.size(), i;
		if (n == 0) return null;
		T max = arr.get(0);
    
		for(i=1;i<n;i++) {
			if(max.compareTo(arr.get(i)) < 0) max = arr.get(i);
		}
		return max;

	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		int n, i;
		System.out.print("Nhap vao so phan tu: "); 
		n = s.nextInt();
		
		ArrayList<Integer> arr = new ArrayList<Integer>();
		
		for(i=0;i<n;i++) {
			System.out.print("Nhap phan tu thu " + i + ": ");
			arr.add(s.nextInt());
		}
		
		System.out.print("Max cua List la: " + Task2.Max(arr)); 
		
	}
}
