package Study0213;

public class Contains {
    public static void main(String[] args) {
        myContains("i am a girl", "am");
    }

    private static void myContains(String str, String a) {
        if (judge(str, a)) {//调用judge函数
            System.out.println(str + "包含" + a);
        } else {
            System.out.println(str + "不包含" + a);
        }
    }

    private static boolean judge(String str, String a) {
        int left = 0;//初始化left，left，right是下面截取字符串的左右边界
         for (; left < str.length(); left++) {//从左边第一位开始依次往右
              int right = left + a.length() ;//这么做是为了截取和a一样长的字符串
              String str2 = str.substring(left,right);//截取出来
              if(str2.equals(a)){//与a的内容作比较
             return true;
    }
}
    return false;
            }
}
