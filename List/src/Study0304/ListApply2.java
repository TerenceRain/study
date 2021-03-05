package Study0304;


class ListIsNullException extends RuntimeException{
    public ListIsNullException(String message){
        super(message);

    }
}
class ListNode {//定义节点
    int val;
    ListNode next;
    public ListNode(int val){
        this.val = val;
        this.next = null;
    }
    @Override//重写toString方法
    public String toString(){
        return "[" + val + "]";
    }
}
public class ListApply2 {
    public static void main(String[] args) {
        //手动向链表中插入数据
        ListNode n1 = new ListNode(1);
        n1.next = null;
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(3);
        ListNode n4 = new ListNode(4);
        ListNode n5 = new ListNode(5);
        ListNode n6 = new ListNode(6);

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = n6;
        n6.next = null;

        ListNode head = n1;

//        head = pushFront(head, 10);
//        head = popFront(head, 12);
//        head = pushBack(head);
//        head = popBack(head);

//        head = reverse(head);
        head = remove(head,1);
        while (head != null){
            System.out.println(head);
            head = head.next;
        }


}

    public boolean chkPalindrome(ListNode A) {
        // write code here
        if(A == null){
            return true;
        }
        if (A.next == null){
            return true;
        }
        ListNode newHead = reverse(A);
        for(; A != null; A = A.next, newHead = newHead.next){
            if(A.val != newHead.val){
                return false;
            }
        }
        return true;
    }
   

    public boolean hasCycle(ListNode head) {//判断链表是否有环
        if(head == null){
            return false;
        }
        ListNode fast = head;//快慢指针
        ListNode slow = head;
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow){
                return true;
            }
        }
        return false;
    }
        public ListNode getIntersectionNode(ListNode headA, ListNode headB) {//链表相交
            if(headA == null || headB == null){
                return null;
            }
            int lengthA = calcuLength(headA);
            int lengthB = calcuLength(headB);
            int i = lengthA - lengthB;
            int k = lengthB - lengthA;
            ListNode cur1 = headA;
            ListNode cur2 = headB;
            if(i > 0){
                for(int j = 0; j < i; j++){
                    cur1 = cur1.next;
                }
            }else{
                for(int j = 0; j < k; j++){
                    cur2 = cur2.next;
                }
            }
            while(cur1 != null && cur2 != null){
                if(cur1 == cur2){
                    return cur1;
                }
                cur1 = cur1.next;
                cur2 = cur2.next;
            }
            return null;
        }
        public int calcuLength(ListNode head){
            int i = 0;
            for(; head != null; head = head.next){
                i++;
            }
            return i;
        }


        public ListNode deleteDuplication(ListNode pHead) {//删除相同元素的节点
            if(pHead == null){
                return null;
            }
            if(pHead.next == null){
                return pHead;
            }
            ListNode newNode = new ListNode(0);
            ListNode newLast = newNode;
            ListNode cur = pHead;
            while(cur != null){
                if(cur.next != null && cur.val == cur.next.val){
                    while( cur.next != null && cur.val == cur.next.val){
                        cur = cur.next;
                    }
                }else{
                    newLast.next = new ListNode(cur.val);
                    newLast = newLast.next;
                }
                cur = cur.next;
            }
            return newNode.next;
        }

    private static ListNode remove(ListNode head, int i) {//给定值删除元素
        ListNode prev = head;
        ListNode cur = head.next;
        if (head.next == null){//如果是空链表
            return head;
        }
        for (; cur != null; ){
            if (cur.val == i){//如果值相同
                prev.next = cur.next;
                cur = prev.next;

            }else{//否则更新指针
                prev = prev.next;
                cur = cur.next;
            }
        }
        if (head.val == i){//如果给定的值是头结点
            head = head.next;
        }
        return head;
    }

    private static ListNode reverse(ListNode head) {//链表逆置
        if(head == null){
            return null;
        }
        if (head.next == null){
            return head;
        }
        ListNode curListNode = head;
        ListNode prevListNode = null;
        ListNode newHead = null;
        while (curListNode != null){
            ListNode nextListNode = curListNode.next;
            if (nextListNode == null){
                newHead = curListNode;
            }
            curListNode.next = prevListNode;//掰道岔
            prevListNode = curListNode;//更新指针
            curListNode = nextListNode;
        }
        return newHead;
    }

    private static ListNode popBack(ListNode head) {//尾删
        if (head == null){
            throw new ListIsNullException("链表为空！");
        }
        if (head.next == null){
            head = null;
        }else{
            ListNode last2 = head;
            while(last2.next.next != null){
                last2 = last2.next;
            }
            last2.next = null;
        }

        return head;
    }

    private static ListNode pushBack(ListNode head) {//头删
        if (head == null){
            throw new ListIsNullException("链表为空！");
        }
        head = head.next;
        return head;
    }

    private static ListNode popFront(ListNode head, int i) {//尾插
        if (head == null){
            ListNode newListNode = new ListNode(i);
            return newListNode;
        }
        ListNode lastListNode = head;
        while(lastListNode.next != null){
            lastListNode = lastListNode.next;
        }
        ListNode newListNode = new ListNode(i);
        lastListNode.next = newListNode;
        newListNode.next = null;
        return head;
    }

    private static ListNode pushFront(ListNode head, int i) {//头插
        ListNode newListNode = new ListNode(i);
        newListNode.next = head;
        head = newListNode;
        return head;
    }
}
