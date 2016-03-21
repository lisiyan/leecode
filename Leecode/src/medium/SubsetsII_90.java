package medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubsetsII_90 {
	public List<List<Integer>> subsetsWithDup(int[] num) {
		List<List<Integer>> res = new ArrayList<List<Integer>>();  
	    res.add(new ArrayList<Integer>());  
	    if(num==null || num.length==0)  
	        return res;  
	    Arrays.sort(num);  
	    int start = 0;  
	    for(int i=0;i<num.length;i++)  
	    {  
	        int size = res.size();  
	        for(int j=start;j<size;j++)  
	        {  
	            ArrayList<Integer> newItem = new ArrayList<Integer>(res.get(j));  
	            newItem.add(num[i]);  
	            res.add(newItem);  
	        }  
	        if(i<num.length-1 && num[i]==num[i+1])  
	        {  
	            start = size;  
	        }  
	        else  
	        {  
	            start = 0;  
	        }  
	    }  
	    return res;  
    }
}
