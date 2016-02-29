package medium;

public class IntegertoRoman_12 {
	public String intToRoman(int num) {
        //I£¨1£©¡¢V£¨5£©¡¢X£¨10£©¡¢L£¨50£©¡¢C£¨100£©¡¢D£¨500£©ºÍM£¨1000£©
        String M[] = {"", "M", "MM", "MMM"};
        String C[] = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
        String X[] = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
        String I[] = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
        return M[num/1000] + C[(num%1000)/100] + X[(num%100)/10] + I[num%10];
    }
}
