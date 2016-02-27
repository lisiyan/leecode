package medium;

public class MaximumProductofWordLengths_318 {
	public int maxProduct(String[] words) {
		if (words == null || words.length == 0)
	        return 0;
		int len=words.length;
        long digits[]=new long[len];
        for(int i=0;i<len;i++){
        	int tempLen=words[i].length();
        	for(int j=0;j<tempLen;j++){
        		digits[i]|=1<<(words[i].charAt(j)-'a');
        	}
        }
        int max=0;
        for(int i=0;i<len;i++){
        	for(int j=i+1;j<len;j++){
        		if ((digits[i] & digits[j]) == 0 && 
        				(words[i].length() * words[j].length() > max))
                    max = words[i].length() * words[j].length();
        	}
        }
        return max;
    }
}
