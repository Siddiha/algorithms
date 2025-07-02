import java.util.*;

class group_Anagrams{
    public ArrayList<ArrayList<String>> groupAnagrams(String[] strs){
        HashMap<String, ArrayList<String>> map = new HashMap<>();
        for (String s : strs){
            int[] count = new int[26];
            char[] chars = s.toCharArray();

            for (int i = 0 ;i < chars.length; i++){
                count[chars[i] - 'a']++;

            }

            String key = Arrays.toString(count);

            if (!map.containsKey(key)){
                map.put(key, new ArrayList<>());
 
            }

            map.get(key).add(s);

        }

        return new ArrayList<>(map.values());
        
    }
}