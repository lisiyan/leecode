package hard;

import java.util.HashSet;

public class FindtheDuplicateNumber_287 {
	public int findDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<Integer>();
        for(int i : nums){
            if(!set.add(i)){
                return i;
            }
        }
        return -1;
    }
}
