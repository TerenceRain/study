package study0415;

import java.util.*;
public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            String str1 = sc.nextLine();
            String str2 = sc.nextLine();
            HashMap<Character, Integer> map = new HashMap<>();
            for(int i = 0; i < str2.length(); i++){
                if(map.get(str2.charAt(i)) == null){
                    map.put(str2.charAt(i), 1);
                }else{
                    map.put(str2.charAt(i), map.get(str2.charAt(i) + 1));
                }
            }
            String ret = "";
            for(int i = 0; i < str1.length(); i++){
                if(map.get(str1.charAt(i)) == null){
                    ret += str1.charAt(i);
                }
            }
            System.out.println(ret);
        }
    }
}
