package easy;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangleII_119 {
	public List<Integer> getRow(int rowIndex) {
        List<Integer> list=new ArrayList<Integer>();
        list.add(1);
        if(rowIndex==0)
        	return list;
        list.add(1);
        for(int i=2;i<=rowIndex;i++){
        	generateNext(list, i);
        }
        return list;
    }
	public void generateNext(List<Integer> list,int index){
		int prev=0;
		for(int i=0;i<index;i++){
			int temp=list.get(i);
			list.set(i, prev+temp);
			prev=temp;
		}
		list.add(1);
	}
}
