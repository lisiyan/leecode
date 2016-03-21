package medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSumII_40 {
	public List<List<Integer>> combinationSum2(int[] candidates, int target) {
		if(candidates.length==0||target<0)
			return null;
		Arrays.sort(candidates);
        List<List<Integer>> lists=new ArrayList<List<Integer>>();
        dfs(candidates, 0, target, new ArrayList<Integer>(), lists);
        return lists;
    }
	public void dfs(int[] cand, int cur, int target, List<Integer> path, List<List<Integer>> res) {
	    if (target == 0) {
	        res.add(new ArrayList<Integer>(path));
	        return ;
	    }
	    if (target < 0) return;
	    for (int i = cur; i < cand.length; i++){
	        if (i > cur && cand[i] == cand[i-1]) 
	        	continue;
	        path.add(path.size(), cand[i]);
	        dfs(cand, i+1, target - cand[i], path, res);
	        path.remove(path.size()-1);
	    }
	}
}
