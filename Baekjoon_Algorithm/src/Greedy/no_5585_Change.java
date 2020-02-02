package Greedy;

import java.util.Scanner;

public class no_5585_Change {
	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int ch = 1000 - sc.nextInt();
		int count = 0;
		int mok = 0;
		
		while(true) {
			if(ch>=500) {
				mok=ch/500;
				ch=ch-500;
				count += mok;
			} if(ch>=100){
				mok=ch/100;
				ch=ch-(mok*100);
				count += mok;
			} if(ch>=50) {
				mok=ch/50;
				ch=ch-(mok*50);
				count += mok;
			} if(ch>=10) {
				mok=ch/10;
				ch=ch-(mok*10);
				count += mok;
			} if(ch>=5) {
				mok=ch/5;
				ch=ch-(mok*5);
				count += mok;
			} if(ch<=4) {
				count += ch;
			}
			break;
		}
		System.out.println(count);
	}
}
