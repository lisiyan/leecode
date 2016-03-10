package easy;

public class ImplementstrStr_28 {
	public int strStr(String haystack, String needle) {
        int hayLen=haystack.length();
        int needLen=needle.length();
        for(int i=0;i<hayLen-needLen;i++){
        	String value=haystack.substring(i, i+needLen);
        	if(value.equals(needle))
        		return i;
        }
        return -1;
        
    }
}
