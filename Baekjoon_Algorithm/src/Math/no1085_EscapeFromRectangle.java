package Math;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class no1085_EscapeFromRectangle {
//꼭지점 w,h 좌표의 꼭지점으로 직사각형을 만들어 그 안에 x,y를 놓고 상하 좌우 방향으로 거리가 가장 짧은 것 구하기.
	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<Integer>(); 
		
		Scanner sc = new Scanner(System.in);
		
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		int w = sc.nextInt();
		int h = sc.nextInt();
		
		list.add(x);
		list.add(y);
		list.add(w-x);
		list.add(h-y);
		
//		System.out.println(list);
		Collections.sort(list);
		System.out.println(list.get(0));

	}

}
