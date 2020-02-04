package Greedy;

import java.util.Scanner;

public class no_11047_Coin0 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int range = sc.nextInt();
		int total = sc.nextInt();
		int[] list = new int[range];
		int count = 0;
		int real = 0;
		
		for(int i=0;i<list.length;i++) {
			list[i] = sc.nextInt();
		}
		
		//방법1
		for(int i=range-1;i<list.length;i--) {
			if(list[i]<=total) {
				count=total/list[i];
				real += count;
				total=total-(list[i]*count);
				if(total==0) {
					break;
				}
			}
		}
		System.out.println(real);
		
		
		//방법2
		for(int i=range-1;i>=0;i--) {
			if(total>=list[i]) {
				count+=total/list[i];
				total=total%list[i];
			}
		}
		
		System.out.println(count);
	}
}
