package Math;

import java.util.Scanner;

public class no2292_Honeycomb {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		int cnt = 1;
		int tmp = 1;
		int range =1;
		
		while(true) {
			if(range >= num) {
				break;
			}
			tmp = 6*(cnt++);
			range += tmp;
		}
		System.out.println(cnt);
	}
}
