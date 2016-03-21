package medium;
import java.util.ArrayList;
import java.util.List;

public class Combinations_77 {
	public List<List<Integer>> combine(int n, int k) {
		List<List<Integer>> lists=new ArrayList<List<Integer>>();
		combine(lists, new ArrayList<Integer>(), 1, n, k);
        return lists;
    }
	public static void combine(List<List<Integer>> combs, List<Integer> comb, int start, int n, int k) {
        if(k==0) {
            combs.add(new ArrayList<Integer>(comb));
            return;
        }
        for(int i=start;i<=n;i++) {
            comb.add(i);
            combine(combs, comb, i+1, n, k-1);
            comb.remove(comb.size()-1);
        }
    }
}
