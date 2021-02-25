package Study0224;

public class Demo1 {
    public String toLowerCase(String str) {
        StringBuilder sb = new StringBuilder();
        char[] ch = str.toCharArray();
        char[] ch2 = new char[str.length()];
        for(int i = 0;i < ch.length;i++){
            if(ch[i] >= 'A' && ch[i] <= 'Z'){
                ch2[i] = (char)(ch[i] - ('A' - 'a'));
                sb.append(ch2[i]);
            }else{
                sb.append(ch[i]);
            }
        }
        return sb.toString();
    }
}
