package Explore;

import java.util.Scanner;

public class no_1145_Drainage {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] list = new int[5];
		
		for(int i=0;i<5;i++) {
			list[i] = sc.nextInt();
		}
		
		int count = 0;
		int val = 1; // val = 0을 나누면 안됨.
		
		while(true) {
			for(int i=0;i<5;i++) {
				if(val%list[i] == 0) {
					count++;
				}
			}
			if(count >= 3) {  //적어도 세 개로 나누어질때 -> 출력(val)
				System.out.println(val);
				return;
			}
			count = 0;
			val++; // 출력값 ( 세 개의 수로 나누어지는 배수값)
		}
	}
}
//30 42 70 35 90 -> 210(val)

