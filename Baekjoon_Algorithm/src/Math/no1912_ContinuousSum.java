package Math;

import java.util.Arrays;
import java.util.Scanner;

public class no1912_ContinuousSum {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int range = s.nextInt();
		int[] arr = new int[range];
		int[] dp = new int[range];
		
		for(int i=0;i<arr.length;i++) {
			arr[i] = s.nextInt();
		}
		
		dp[0] =arr[0];
		int max = dp[0];
		for(int i=1;i<arr.length;i++) {
			//if를 "-일때"를 -> dp[i-1]+arr[i] > arr[i] 으로 구분함.
			if(dp[i-1]+arr[i] > arr[i]) {
				dp[i]=dp[i-1]+arr[i];
			}
			else {
				dp[i]=arr[i];
			}
			
			max = Math.max(max, dp[i]);
		}
		
		System.out.println(Arrays.toString(dp));
		System.out.println(max);

	}
}
