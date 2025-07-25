package String;

import java.util.HashMap;

public class IsoMorphicString {

    public static void main(String[] args) {

        HashMap<Character,Integer> str=new HashMap<>();
        str.put('a',1);
        str.put('b',2);
        HashMap<Character,Integer> comb=new HashMap<>();
        comb.put('b',1);
        comb.put('a',2);
    }
}
