package easy;

import java.util.HashSet;

public class HappyNumber_202 {
	public static boolean isHappy(int n) {
		HashSet<Integer> set = new HashSet<Integer>();
        set.add(n);
		while(n!=1){
			int sum=0;
			while(n!=0){
				int digit=(int)(n%10);
				//System.out.print("n:"+n+" "+digit+" ");
				sum+=digit*digit;
				n=n/10;
			}
			//System.out.println("sum:"+sum);
			if(set.contains(sum)){
				return false;
			}
			set.add(sum);
			n=sum;
		}
		return true;
        
    }
	public static void main(String argv[]){
		System.out.println(isHappy(19));
	}
}
