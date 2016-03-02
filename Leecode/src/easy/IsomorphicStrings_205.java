package easy;

import java.util.HashMap;

public class IsomorphicStrings_205 {
	public boolean isIsomorphic(String s, String t) {
		if(s==null||t==null)
			return false;
        int lenS=s.length();
        int lenT=t.length();
        if(lenS!=lenT)
        	return false;
        HashMap<Character, Character> map = new HashMap<Character, Character>();
        for(int i = 0 ; i< s.length(); i++){
            char a = s.charAt(i);
            char b = t.charAt(i);
            if(map.containsKey(a)){
                 if(map.get(a).equals(b))
                continue;
                else
                return false;
            }else{
                if(!map.containsValue(b))
                map.put(a,b);
                else return false;

            }
        }
        return true;
        
    }
}
