package Explore;

import java.util.Arrays;
import java.util.Scanner;

public class no_1026_Treasure {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] A = new int[N];
		int[] B = new int[N];
		int sum = 0;
		
		for(int i=0;i<N;i++) {
			A[i] = sc.nextInt();
		}
		for(int i=0;i<N;i++) {
			B[i] = sc.nextInt();
		}
		
		Arrays.sort(A);
		Arrays.sort(B);
		for(int i=0;i<N;i++) {
			sum += A[i] * B[N-1-i]; //서로 역방향으로 만들어서 곱하면 최소값이 된다.
		}							//A[i]는 오름차순, B[N-i-i] 내림차순 정렬
		
		System.out.println(sum);
	}
}

//5
//1 1 1 6 0
//2 7 8 3 1
//18

