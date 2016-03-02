package easy;

public class PalindromeNumber_9 {
	public static boolean isPalindrome(int x) {
		if(x < 0) return false;
        int y = x;
        int res = 0;
        while(y != 0) {
            res = res * 10 + y % 10;
            y /= 10;
        }
        return x == res;
		/*if(x<0)
			return false;
		int len=0;
		int r=x;
        while(r!=0){
        	r/=10;
        	len++;
        }
        System.out.println(len);
        for(int i=0;i<=len/2;i++){
        	int num1=(int)(x/Math.pow(10, i))%10;
        	int num2=(int)(x/Math.pow(10, len-i-1))%10;
        	System.out.println(num1+" "+num2);
        	if(num1!=num2)
        		return false;
        }
        return true;*/
    }
	public static void main(String argv[]){
		System.out.println(isPalindrome(122222221));
	}
}
