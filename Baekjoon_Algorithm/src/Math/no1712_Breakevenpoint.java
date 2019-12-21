package Math;

import java.util.Scanner;

public class no1712_Breakevenpoint {
	
	public static void main(String[] args) {
		
	 Scanner sc = new Scanner(System.in);
	
	 int fix_cost = sc.nextInt();
	 int var_cost = sc.nextInt();
	 int sell_price = sc.nextInt();
	 int index = 0;
	
	 if(var_cost >= sell_price) {
		 System.out.println(-1);
	 }else {
		 index = fix_cost/(sell_price-var_cost);
		 System.out.println(index+1);
	 }
	}
}
