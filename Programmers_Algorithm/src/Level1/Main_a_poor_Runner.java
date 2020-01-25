package Level1;

import java.util.Arrays;

public class Main_a_poor_Runner {

	public static void main(String[] args) {
		
		String[] participant = {"mislav", "stanko", "mislav", "ana"}; 
		String[] completion = {"stanko", "ana", "mislav"}; 
		
		A_poor_Runner s = new A_poor_Runner();
		
		System.out.println(s.solution(participant, completion));
		
	}
}
