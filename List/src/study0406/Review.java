package study0406;

import java.util.List;

public class Review {
    static class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

    public static void main(String[] args) {
        ListNode a = new ListNode(1);
        ListNode b = new ListNode(1);
        a.next = b;
        ListNode head = a;
    }

    public static void deleteNode(ListNode head, int val){
        if (head == null){
            return;
        }
        
    }


}
