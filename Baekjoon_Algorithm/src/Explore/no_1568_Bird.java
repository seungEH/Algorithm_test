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
				System.out.println("if");
				System.out.println(bird);
				bird =1;
			} else {
				System.out.println("else");
				System.out.println("N= "+N);
				System.out.println("bird=" +bird);
				N -= bird;
				bird++;
				count++;
			}
		}
		System.out.println(count);
		

	}

}
