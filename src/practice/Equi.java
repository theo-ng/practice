package practice;

public class Equi {
	public int solution(int[] A) {
        // write your code in Java SE 8
		int n = A.length;
        if(n==0) {
        	return -1;
        }
        long sum_left = 0;
        long sum_right = 0;
        long sum = 0;
        
        for(int i=0;i<n;i++) {
        sum += A[i];	
        }
        for(int j=0;j<n;j++) {
        	sum_right = sum - sum_left - A[j];
        	if (sum_right == sum_left) {
        		return j;
        	}
        	sum_left += A[j];
        }
        //no equilibrium index
        return -1;
    }
}