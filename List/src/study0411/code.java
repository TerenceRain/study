package study0411;

import java.util.LinkedList;
import java.util.Queue;
import java.util.*;
public class code {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = null;
        String b = null;
        while (sc.hasNextLine()) {
            a = sc.nextLine();
            b = sc.nextLine();
        }
        if (a == null) {
            System.out.println(b);
        }
        if (b == null) {
            System.out.println(a);
        }
        Queue<String> queue1 = new LinkedList<>();
        Queue<String> queue2 = new LinkedList<>();

        for (int i = 0; i < a.length(); i++) {
            char ch1 = a.charAt(i);
            queue1.offer(Character.toString(ch1));
        }
        for (int i = 0; i < b.length(); i++) {
            char ch2 = b.charAt(i);
            queue2.offer(Character.toString(ch2));
        }
        while (!queue2.isEmpty()) {
            if (queue1.element().equals(queue2.element())) {
                queue1.poll();
                continue;
            } else {
                String str = queue1.poll();
                System.out.print(str);
            }
        }

        System.out.println();
    }

}



