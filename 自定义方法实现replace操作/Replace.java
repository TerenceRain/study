package Study0213;

public class Replace {
    public static void main(String[] args) {
        toReplace("i am a girl","girl","boy");
    }

    private static void toReplace(String str, String oldStr, String newStr) {
        if(str.contains(oldStr)){//如果当前字符串包含要替换的字符串
            String str2 = str.substring(0,str.indexOf(oldStr));//就把要替换之前的字符串截取出来
            System.out.println(str2 + newStr);//再把替换内容加上
        }else{//否则，输出原来的字符串
            System.out.println(str);
        }
    }
}
