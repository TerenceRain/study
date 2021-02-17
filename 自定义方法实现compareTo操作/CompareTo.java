package Study0213;

public class CompareTo {
    public static void main(String[] args) {
        myCompareTo("a","b");
    }

    private static void myCompareTo(String str1, String str2) {
        int len1 = str1.length();
        int len2 = str2.length();
        int shortLen = Math.min(len1,len2);
        int i = 0;
        int i1 = str1.charAt(i) - str2.charAt(i);
        for (; i < shortLen; i++) {
            if(i1 < 0){
                System.out.println("小");
            }else if(i1 > 0){
                System.out.println("大");
            }else{
                System.out.println("相同");
            }

        }

    }
}
