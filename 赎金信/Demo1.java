package Study0225;

public class Demo1 {
    public static boolean canConstruct(String ransomNote, String magazine) {
        StringBuilder sb = new StringBuilder(magazine);
        int index;
        for (char ch : ransomNote.toCharArray()){
            index = sb.indexOf(String.valueOf(ch));
            if(index >= 0){
                sb.deleteCharAt(index);
            }else{
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(canConstruct("aa" , "abra"));
    }
}
