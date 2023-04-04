package Test;

import java.util.Arrays;

public class Solution {
	//연속된 수의 합
	// num 에 3 을 받고 total 에 12 를 받으면 result 에는 숫자 3개를 이용해서 12를 뽑을 수 있는 숫자를 출력한다.
	// 오름차순으로 뽑으면 좋은데 일단 나는 위에 과제만 달성해보도록 한다.
	public static void main(String[] args) {
		Solution sol  = new Solution();
		sol.solution(3, 12);
	}
    public int[] solution(int num, int total) {
    	int a = 0;
    	int b = 0;
    	int c = 0;
    	int[] answer = new int[num];
    	for(int i =1; i<=num; i++) {
    		a=a+1;
        	for(int j=0;j<=0; j++) {
        		answer[i-1]=a;
        	} 		
    	}
    	for(int i =0; i<num; i++) {
    		c=c+answer[i];
    	}
    	b=total-c;
    	answer[num-1]=answer[num-1]+b;
    	System.out.println(Arrays.toString(answer));
    	System.out.println();
    	System.out.print("total: "+ total);
        return answer;
    }
}

