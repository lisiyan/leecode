package medium;

import java.util.ArrayList;
import java.util.List;

public class CombinationSumIII_216 {
	public List<List<Integer>> combinationSum3(int k, int n) {
		if(n>9*k)
			return null;
        List<List<Integer>> lists=new ArrayList<List<Integer>>();
        combination(lists, new ArrayList<Integer>(), k, 1, n);
        return lists;
    }
	private void combination(List<List<Integer>> ans, List<Integer> comb, int k,  int start, int n) {
	    if (comb.size() == k && n == 0) {
	        List<Integer> li = new ArrayList<Integer>(comb);
	        ans.add(li);
	        return;
	    }
	    for (int i = start; i <= 9; i++) {
	        comb.add(i);
	        combination(ans, comb, k, i+1, n-i);
	        comb.remove(comb.size() - 1);
	    }
	}
}
