package hard;

public class FirstMissingPositive_41 {
	public static int firstMissingPositive(int[] nums) {
        int len=nums.length;
        int temp;
        for(int i=0;i<len;i++){
        	if(nums[i]<=0)
        		nums[i]=Integer.MIN_VALUE;
        	else{
        		if(nums[i]>len)
        			continue;
        		temp=nums[nums[i]-1];
        		nums[nums[i]-1]=Integer.MAX_VALUE;
        		if(temp==nums[i]){
        			continue;
        		}
        		while(temp>=1&&temp<=len){
        			int store=temp;
        			temp=nums[temp-1];
        			nums[store-1]=Integer.MAX_VALUE;
        		}
        	}
        }
        boolean contain=false;
        int first=0;
        for(int i=0;i<len;i++){
        	if(nums[i]!=Integer.MAX_VALUE){
        		first=i+1;
        		contain=true;
        		break;
        	}
        }
        if(!contain)
        	first=len+1;
        return first;
    }
	public static void main(String argv[]){
		System.out.println(firstMissingPositive(new int[]{1,4,2,0,3,4,2,4,2}));
	}
}
