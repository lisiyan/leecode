package easy;

public class BulbSwitcher_319 {
	public static int bulbSwitch(int n) {
        /*int count=0;
        boolean digits[]=new boolean[n];
        for(int i=1;i<=n;i++){
        	for(int j=1;j<=n;j++){
        		boolean temp=false;
        		if(j%i==0){
        			temp=true;
        		}
        		//System.out.println(i+":"+digits[j-1]+" "+temp);
        		digits[j-1]^=temp;
        	}
        }
        for(int i=0;i<n;i++){
        	if(digits[i])
        		count++;
        }
        return count;*/
		return (int)Math.sqrt(n);
    }
	public static void main(String argv[]){
		System.out.println(bulbSwitch(1000));
	}
}
