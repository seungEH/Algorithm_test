package Greedy;

import java.util.Arrays;
import java.util.Scanner;

public class no_11399_ATM {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int sum = 0;
		int[] list = new int[num];
		
		for(int i=0;i<num;i++) {
			list[i] = sc.nextInt();
		}
		
		Arrays.sort(list);
		System.out.println(Arrays.toString(list));
		int temp = 0;
		for(int i=0;i<list.length;i++) {
			temp +=list[i];
			sum += temp;
		}
		System.out.println(sum);	
	}
}

