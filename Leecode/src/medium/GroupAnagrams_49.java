package medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagrams_49 {
	public List<List<String>> groupAnagrams(String[] strs) {
        if (strs == null || strs.length == 0) 
            return new ArrayList<List<String>>();
        Map<String, List<String>> map = new HashMap<String, List<String>>();
        Arrays.sort(strs);
        for (String s : strs) {
            char[] characters = s.toCharArray();
            Arrays.sort(characters);
            String keyStr = new String(characters);
            if (!map.containsKey(keyStr)) 
                map.put(keyStr, new ArrayList<String>());
            map.get(keyStr).add(s);
        }
        return new ArrayList<List<String>>(map.values());
    }
}
