package Study0301;

public class Demo2 {
    public static void main(String[] args) {
        System.out.println(isLongPressedName("saeed" , "ssaaedd"));
    }

    private static boolean isLongPressedName(String name, String typed) {
        if(typed == null){
            return false;
        }
        char[] c1 = name.toCharArray();
        char[] c2 = typed.toCharArray();
        if(c2.length < c1.length){
            return false;
        }
        int index1 = 0;
        int index2 = 0;
        while(index1 < c1.length && index2 < c2.length){
            int n = 0;
            char cur = c1[index1];
            while(index1 < c1.length && c1[index1] == cur){
                index1++;
                n++;
            }
            while(index2 < c2.length && c2[index2] == cur){
                index2++;
                n--;
            }
            if(n > 0){
                return false;
            }
        }
        if(index1 != c1.length || index2 != c2.length){
            return false;
        }
        return true;


        
    }
}