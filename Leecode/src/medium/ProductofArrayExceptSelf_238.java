package medium;

public class ProductofArrayExceptSelf_238 {
	public static int[] productExceptSelf(int[] nums) {
		int len=nums.length;
        int [] results=new int[len];
        results[0]=1;
        for(int i=1;i<len;i++){
        	results[i]=results[i-1]*nums[i-1];
        	//System.out.print(results[i]+" ");
        }
        int []reverses=new int[len];
        reverses[len-1]=1;
        for(int i=len-2;i>=0;i--){
        	reverses[i]=reverses[i+1]*nums[i+1];
        	//System.out.print(reverses[i]+" ");
        }
        for(int i=0;i<len;i++){
        	results[i]*=reverses[i];
        	//System.out.print(results[i]+" ");
        }
        return results;
    }
	public static void main(String argv[]){
		System.out.println(productExceptSelf(new int[]{1,2,3,4}));
	}
}
