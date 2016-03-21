package medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSum_39 {
	public List<List<Integer>> combinationSum(int[] candidates, int target) {
		if(candidates.length==0||target<0)
			return null;
		Arrays.sort(candidates);
        List<List<Integer>> lists=new ArrayList<List<Integer>>();
        combination(candidates, target, 0, new ArrayList<Integer>(), lists);
		return lists;
    }
	public void combination(int[] candidates,int target,int index,List<Integer> list,
			List<List<Integer>> all){
		if(target > 0){
            for(int i = index; i < candidates.length && target >= candidates[i]; i++){
                list.add(candidates[i]);
                combination(candidates, target - candidates[i], i,list,all);
                list.remove(list.size() - 1);
            }
        }
        else if(target == 0 ){
            all.add(new ArrayList<Integer>(list));
        }
		/*if(index>=candidates.length||target<0){
			return;
		}
		combination(candidates, target, index+1, 
					new ArrayList<Integer>(list), all);
		int temp=target-candidates[index];
		list.add(candidates[index]);
		if(temp==0){
			ArrayList<Integer> add=new ArrayList<Integer>(list);
			if(all.contains(add))
				return;
			all.add(add);
		}
		else if(temp<candidates[index]){
			return;
		}
		else{
			combination(candidates, temp, index, 
					new ArrayList<Integer>(list), all);
			combination(candidates, temp, index+1, 
					new ArrayList<Integer>(list), all);
		}*/
		
	}
}
