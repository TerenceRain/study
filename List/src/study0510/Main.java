package study0510;

    import java.util.*;
    public class Main{
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            while(sc.hasNext()){
                Queue<Character> queue1 = new PriorityQueue<>();
                Queue<Character> queue2 = new PriorityQueue<>();
                String str1 = sc.nextLine();
                String str2 = sc.nextLine();
                char[] ch1 = str1.toCharArray();
                char[] ch2 = str2.toCharArray();
                int lengthLong = ch1.length > ch2.length ? ch1.length : ch2.length;
                int lengthShort = ch1.length <= ch2.length ? ch1.length : ch2.length;

                for(int i = 0; i < ch1.length; i++){
                    queue1.offer(ch1[i]);
                }
                int count = 0;
                char[] ch3 = new char[lengthLong];
                for(int i = 0; i < lengthShort; i++){

                    count = queue2.size();

                    for(int j = 0; j < count; j++){
                        ch3[j] = queue2.remove();
                    }
                    if(ch2[i] == queue1.remove()){
                        queue2.offer(ch2[i]);
                    }
                    if(ch2[i] != queue1.remove()){
                        queue2.clear();
                    }
                }
                String str3 = new String();
                if(count > queue2.size()){
                    for (int i = 0; i < count; i++) {
                        System.out.print(ch3[i]);
                    }

                }else{
                    for(int i = 0; i < queue2.size(); i++){
                        System.out.print(ch3[i]);
                    }
                }
            }
        }
    }

