package Study0225;

public class Demo2 {
    public static boolean isPalindrome(int x) {
        String str = String.valueOf(x);
        char[] ch = str.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            if(ch[i] != ch[ch.length - 1 - i]){
              return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(123321));
    }
}
