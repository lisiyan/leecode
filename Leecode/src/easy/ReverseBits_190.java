package easy;

public class ReverseBits_190 {
	public static int reverseBits(int n) {
		int result=0;
		for(int i=31;i>=0;i--){
			int temp=(n>>i)&1;
			result=result+(temp<<(31-i));
		}
		return result;
    }
	public static void main(String argv[]){
		System.out.println(Integer.toBinaryString(2));
		System.out.println(Integer.toBinaryString(reverseBits(2)));
	}
}
