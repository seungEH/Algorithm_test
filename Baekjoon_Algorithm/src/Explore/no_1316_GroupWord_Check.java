package Explore;

import java.util.Scanner;

public class no_1316_GroupWord_Check {
	public static void main(String[] ars) {
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int i = 0;
		int n = sc.nextInt();
		int answer = n;
		
		for(int test_case=0;test_case<n;test_case++) {
			String word = sc.next();
			boolean[] checker = new boolean[26]; //알파벳 소문자 26개에 대한 공간
			
			for(i =1; i<word.length();i++) {
				if(word.charAt(i-1) != word.charAt(i)) { //이전 문자와 현재문자 다르다면
					if(checker[word.charAt(i)-97] == true) { //word.charAt(i) 현재단어가 이전에 등장한 적이 있다면
						answer--;
						break;
					}
				}
				checker[word.charAt(i-1)-97] = true; ////이전 문자와 현재문자 다르다면 이전문자에 true, 나머진 false로 되어있음.
			}
		}
		System.out.println(answer);
	}
}
