package study0513;


    import java.util.*;

    public class Same {
        public boolean checkSam(String stringA, String stringB) {
            // write code here
            boolean b =  med(stringA, stringB);
            if(b){
                return stringA.contains(stringB);
            }
            return stringB.contains(stringA);

        }
        public static boolean med(String str1, String str2){
            if(str1.length() > str2.length()){
                return true;
            }
            return false;
        }
    }

