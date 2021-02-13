package Study0213;
public class Split {
    public static void main(String[] args) {
        toSplit("i am a boy", " ");
    }

    private static String toSplit(String str, String ch) {
        if (str.contains(ch)) {//如果字符串中包含“ ”
            System.out.println(str.substring(0, str.indexOf(ch)));//截取字符串，从0开始，到“ ”结束
            return toSplit(str.substring(str.indexOf(ch) + 1), ch);//递归，每次从上一次的“ ”下一位开始，到“ ”
        } else {//找不到，就打印剩下的字符串
            System.out.println(str);
        }
        return str;
    }
}