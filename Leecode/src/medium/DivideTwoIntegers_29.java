package medium;

public class DivideTwoIntegers_29 {
	public static int divide(int dividend, int divisor) {
		if(divisor==0)
            return Integer.MAX_VALUE;
        boolean isNegative=false;
		if(dividend<0^divisor<0){
			isNegative=true;
		}
		//System.out.println(isNegative);
		if(dividend<0)
			dividend=-dividend;
		if(divisor<0)
			divisor=-divisor;
		int result=0;
		int len1=0;
		for(int i=31;i>=0;i--){
			if((dividend&(1<<i))!=0){
				len1=i+1;
				break;
			}
		}
		int len2=0;
		for(int i=31;i>=0;i--){
			if((divisor&(1<<i))!=0){
				len2=i+1;
				break;
			}
		}
		for(int i=len1-len2;i>=0;i--){
			int temp=divisor<<i;
			//System.out.println(dividend+" "+temp);
			if(dividend-temp>=0){
				dividend=dividend-temp;
				result=(result<<1)+1;
				//System.out.println(result);
			}
			else {
				result=(result<<1)+0;
			}
		}
		if(isNegative)
			return -result;
		else{
		    if(result<0)
		        return result^-1;
		    else
		        return result;
		}
    }
	public static void main(String argv[]){
		int i=-2147483648;
		int j=-1;
		System.out.println(i/j);
	}
}
