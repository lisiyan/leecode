package easy;

public class PowerofThree_326 {
	public boolean isPowerOfThree(int n) {
		/*if(n>1)
	        while(n%3==0) n /= 3;
	    return n==1;*/
		return n > 0 && (1162261467 % n == 0);
    }
}
