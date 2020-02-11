package Explore;

import java.util.Scanner;

public class no_1568_Bird {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int bird = 1;
		int count = 0;
		
		while(N>=1) {
			if(bird>N) {
				bird =1;
			} else {
				N -= bird;
				bird++;
				count++;
			}
		}
		System.out.println(count);
	}
}

//14 -> 7

//1마리가 날아가면 13마리가 남는다.
//
//2마리가 날아가면 11마리가 남는다.
//
//3마리가 날아가면 8마리가 남는다.
//
//4마리가 날아가면 4마리가 남는다.
//
//1마리가 날아가면 3마리가 남는다. --> 여기서 조건이 걸리게 되므로 다시 날아가야할 마리수가 1로 초기화함.
//
//2마리가 날아가면 1마리가 남는다. 
//
//1마리가 날아가면 0마리가 남는다. 

