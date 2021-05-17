package study0517;

import java.util.*;

public class Zipper {
    public static String zipString(String iniString) {
        // write code here
        char[] ch = iniString.toCharArray();
        HashMap<Character, Integer> hm = new HashMap<>();
        for (int i = 0; i < ch.length - 1; i++) {
            if (!hm.containsKey(ch[i])) {
                hm.put(ch[i], 1);
            } else {
                hm.put(ch[i], hm.get(ch[i]) + 1);
            }
        }
        StringBuilder sb = new StringBuilder();
        Iterator iter = hm.entrySet().iterator();
        Set keySet = hm.keySet();
        Iterator iterator2 = keySet.iterator();
        while(iterator2.hasNext()){
            Object key = iterator2.next();
            //用get(key)来获取value值
            Object value = hm.get(key);
            sb.append(key);
            sb.append(value);
            hm.remove(key, value);
        }
        
        if(sb.toString().length() >= iniString.length()){
            return iniString;
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(zipString("aabcccccaaa"));
    }
}
