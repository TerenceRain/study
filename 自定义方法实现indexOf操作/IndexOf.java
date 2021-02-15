package Study0213;

public class IndexOf {
    public static void main(String[] args) {
        myIndexOf("明月松间照","间照");
    }

    private static void myIndexOf(String str, String a) {
        char[] chStr = str.toCharArray();
        char[] chA = a.toCharArray();
        for (int i = 0; i < chStr.length; i++) {
            for (int j = 0; j < chA.length; j++) {
                if(chStr[i] == chA[j]){
                    System.out.println(i);
                }
                break;
            }

        }
    }
}
