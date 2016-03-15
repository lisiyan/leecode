package medium;

import java.util.ArrayList;
import java.util.List;

public class GrayCode_89 {
	public List<Integer> grayCode(int n) {
		List<Integer> list=new ArrayList<Integer>();
		list.add(0);
		if(n==0)
			return list;
		list.add(1);
		for(int i=1;i<n;i++){
			int len=list.size();
			int num=(int)Math.pow(2, i);
			for(int k=len-1;k>=0;k--){
				list.add(num+list.get(k));
			}
		}
        return list;
    }
}
