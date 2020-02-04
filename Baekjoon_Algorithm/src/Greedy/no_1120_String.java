package Greedy;

import java.util.Scanner;

public class no_1120_String {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		String b = sc.next();
		int ans = a.length();
		
		//앞뒤로 문자를 추가 할 수 있기에.. 차이가 적은 최소값만 찾아 출력 
		for(int i=0;i<=b.length()-a.length();i++) {
			int cnt = 0;
			for(int j=0;j<a.length();j++) {
				if(a.charAt(j) != b.charAt(i+j)) {
					cnt++;
				}
			}
			ans = Math.min(cnt, ans);
		}
		System.out.println(ans);
	}
}
