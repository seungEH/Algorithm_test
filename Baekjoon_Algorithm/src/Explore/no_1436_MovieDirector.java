package Explore;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class no_1436_MovieDirector {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int num = 0;
		
		while(N>0) {
			num++;
			String str = Integer.toString(num);
			if(str.contains("666")) {
				N--;
			}
		}
		System.out.println(num);
	}
}

//1666 2666 ... 5666 6666(X) 6660(O)
//6666 > 6660
