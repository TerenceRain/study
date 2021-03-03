package Study0302;

public class Demo1 {
    public static void main(String[] args) {
        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
    }

    private static boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder();
        for (char ch : s.toCharArray()){
            if (Character.isLetterOrDigit(ch)){
                sb.append(Character.toLowerCase(ch));
            }
        }
        StringBuilder sbRev = new StringBuilder(sb).reverse();
        return sb.toString().equals(sbRev.toString());
    }
}
