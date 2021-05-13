package study0510;
//思路不对
    import java.util.*;
    public class Main{


        public static void main(String[] args){

//参数解析
            Scanner sc = new Scanner(System.in);
            String str = sc.nextLine();
            int count = 0;
            //下面整个for循环都是处理参数个数
            for(int i = 0; i < str.length(); i++){
                if(str.charAt(i) == '"'){//因为双引号内的空格不需要计数
                    do{
                        i++;
                    }while(str.charAt(i) != '"');
                }
                if(str.charAt(i) == ' '){
                    count++;
                }


            }
            System.out.println(count + 1);//输出第一行参数的个数
            int flag = 1;
            for(int i = 0; i < str.length(); i++){
                if(str.charAt(i) == '"'){
                    flag ^= 1;//这是当前是否在双引号中的标志位，进入引号，置0，出引号，置1
                }
                if(str.charAt(i) != ' ' && str.charAt(i) != '"'){//除过双引号和空格剩下的都输出（双引号之外）
                    System.out.print(str.charAt(i));
                }
                if(str.charAt(i) == ' ' && flag != 0){//遇到空格就换行（双引号之外）
                    System.out.println();
                }
                if(str.charAt(i) == ' ' && flag == 0){//双引号之内的空格需要输出
                    System.out.print(str.charAt(i));
                }
            }



//            Scanner sc = new Scanner(System.in);
//            while(sc.hasNext()){
//                Queue<Character> queue1 = new PriorityQueue<>();
//                Queue<Character> queue2 = new PriorityQueue<>();
//                String str1 = sc.nextLine();
//                String str2 = sc.nextLine();
//                char[] ch1 = str1.toCharArray();
//                char[] ch2 = str2.toCharArray();
//                int lengthLong = ch1.length > ch2.length ? ch1.length : ch2.length;
//                int lengthShort = ch1.length <= ch2.length ? ch1.length : ch2.length;
//
//                for(int i = 0; i < ch1.length; i++){
//                    queue1.offer(ch1[i]);
//                }
//                int count = 0;
//                char[] ch3 = new char[lengthLong];
//                for(int i = 0; i < lengthShort; i++){
//
//                    count = queue2.size();
//
//                    for(int j = 0; j < count; j++){
//                        ch3[j] = queue2.remove();
//                    }
//                    if(ch2[i] == queue1.remove()){
//                        queue2.offer(ch2[i]);
//                    }
//                    if(ch2[i] != queue1.remove()){
//                        queue2.clear();
//                    }
//                }
//                String str3 = new String();
//                if(count > queue2.size()){
//                    for (int i = 0; i < count; i++) {
//                        System.out.print(ch3[i]);
//                    }
//
//                }else{
//                    for(int i = 0; i < queue2.size(); i++){
//                        System.out.print(ch3[i]);
//                    }
//                }
//            }
        }
    }

