package practice;

public class Solution {
	public int solution(int[] A) {
        // write your code in Java SE 8
        int size = A.length;
        if (size==2)
        	return Math.abs(A[0]-A[1]);
        else {
        	int head = A[0];
        	int tail = 0;
        	for(int i=1;i<size-1;i++){
        		tail += A[i];
        	}
        	int min_diff = Math.abs(head - tail);
        	for(int i=1;i<size-1;i++) {
        		head += A[i];
        		tail -= A[i];
        		if(Math.abs(head-tail)<min_diff)
        			min_diff = Math.abs(head-tail);
        	}
        	return min_diff;
        }
    }
}