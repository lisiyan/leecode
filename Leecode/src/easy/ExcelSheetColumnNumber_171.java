package easy;

public class ExcelSheetColumnNumber_171 {
	public int titleToNumber(String s) {
		int result=0;
        int len=s.length();
        for(int i=0;i<len;i++){
        	result=result * 26 + (s.charAt(i) - 'A' + 1);
        }
        return result;
    }
}
