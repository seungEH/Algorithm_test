package Explore;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class no_1302_BestSeller {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		HashMap<String,Integer> map = new HashMap<String,Integer>(); // {key, value}
		String str = new String();
		
		for(int i=0; i<N; i++) {
			str = br.readLine();
			if(map.containsKey(str)) { // 해당 문자열 있는지 확인 - key값 
				map.replace(str, map.get(str)+1); // value에 빈도수 올림
			}else {
				map.put(str, 1); //value에 빈도수 체크
			}
		}
		
		int max = 0;
		for(String a : map.keySet()) {  //중복제거한 key값 : 문자열 - value값 : 빈도수 
			max = Math.max(max, map.get(a));
		}
		
		ArrayList<String> al = new ArrayList<String>(map.keySet()); //중복제거한 key값 : 문자열 -> [ , ]에 입력
		Collections.sort(al); //문자열 정렬
		for(String a : al) { // al - 문자열
			if(map.get(a) == max) {  //map.get() - value값 출력
				System.out.println(a); // a - 문자열
				break;
				
			}
		}
	}
}
//5           ->  top
//top
//top
//top
//top
//kimtop
