package easy;

public class LengthofLastWord_58 {
	public int lengthOfLastWord(String s) {
        //String []array=s.split(" ");
        //return array[array.length-1].length();
		s = s.trim();
	    int lastIndex = s.lastIndexOf(' ') + 1;
	    return s.length() - lastIndex;  
    }
}
