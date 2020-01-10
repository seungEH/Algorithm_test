package Math;

import java.util.Scanner;

public class no2839_SugarDelivery {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int count = 0;
		int input = sc.nextInt();
		
		while(true) {
			if(input % 5 == 0) {
				count += input/5;
				break;
			} else if(input <= 0) {
				count = -1;
				break;
			}
			input = input - 3;
			count++;
		}
		
		System.out.println(count);
		
	}
}
