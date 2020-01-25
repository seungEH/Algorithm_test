package Level1;

import java.util.*;

public class A_poor_Runner{

    public String solution(String[] participant, String[] completion) {
        String answer = "";
        
        Arrays.sort(participant);
        Arrays.sort(completion);
        
//		ana, mislav, mislav , stanko
//		ana, mislav, stanko

        for(int i=0;i<completion.length;i++){
            if(!participant[i].equals(completion[i]))
                answer = participant[i];
            	System.out.print("p=" + participant[i] +",");
            	System.out.print("c=" +completion[i] +",");
            	System.out.println();
            	System.out.println(answer);
        }
        System.out.println();
        System.out.print("answer ==");
        return answer;

    }
}
