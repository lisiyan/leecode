package easy;

import java.util.HashSet;


public class ContainsDuplicate_217 {
	public static boolean containsDuplicate(int[] nums) {
		HashSet<Integer> set = new HashSet<Integer>();
        for(int i : nums){
            if(!set.add(i)){
                return true;
            }
        }
        return false;
    }
	public static void main(String argv[]){
		System.out.println(containsDuplicate(new int[]{1,2,3,4}));
	}
}
