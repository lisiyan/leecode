package easy;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle_118 {
	public List<List<Integer>> generate(int numRows) {
		List<List<Integer>> lists=new ArrayList<List<Integer>>();
		if(numRows==0)
			return lists;
		List<Integer> list=new ArrayList<Integer>();
		list.add(1);
		lists.add(list);
		while(numRows!=1){
			numRows--;
			list=generate(list);
			lists.add(list);
		}
		return lists;
    }
	public List<Integer> generate(List<Integer> last) {
		List<Integer> list=new ArrayList<Integer>();
		list.add(1);
		for(int i=0;i<last.size()-1;i++){
			list.add(last.get(i)+last.get(i+1));
		}
		list.add(1);
		return list;
	}
}
