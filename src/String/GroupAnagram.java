package String;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupAnagram {

    public static void main(String[] args) {
        HashMap<String, List<String>> s = new HashMap<>();
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        List<String> keys = new ArrayList<>();
        for (String str : strs) {
            char[] ch = str.toCharArray();
            Arrays.sort(ch);
            String a=new String(ch);
            s.computeIfAbsent(a, k -> new ArrayList<>()).add(str);
        }
        for(List<String> str:s.values())
        {
            System.out.println(str);
        }
    }
}
