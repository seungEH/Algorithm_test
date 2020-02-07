package Explore;

import java.util.Scanner;

public class no_1100_WhiteBlank {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		char[][] chess = new char[8][8];
		int count = 0;
		
		for(int i=0;i<8;i++) {
			String A = sc.nextLine(); //for문 들어와 문자열 입력을 기다림. 8자리 입력하면
			for(int j=0;j<8;j++) {
				chess[i][j] = A.charAt(j); //문자열에 대해서 - 2차원배열에 하나씩 입렫됨.
				
				if(chess[i][j] == 'F' && (i+j) % 2 == 0) { //하얀칸은 (0,0),(0,2),(0,4)... 합이 짝수이다.
					count ++;
				}
			}
		}		
		System.out.println(count);
		sc.close();
	}
}

//.F.F...F
//F...F.F.
//...F.F.F
//F.F...F.
//.F...F..
//F...F.F.
//.F.F.F.F
//..FF..F.
//1