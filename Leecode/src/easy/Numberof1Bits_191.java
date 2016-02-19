package easy;

public class Numberof1Bits_191 {
	public static int hammingWeight(int n) {
        int count=0;
        while(n!=0){
        	count+=(n&1);
        	n=n>>>1;
        }
        return count;
    }
	public static void main(String argv[]){
		System.out.println(hammingWeight(1));
	}
}
