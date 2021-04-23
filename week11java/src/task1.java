public class task1 {
    public static void main(String[] args) {
        ListNode l1 = makeList(new ListNode(1));
        ListNode l2=makeList(new ListNode(2),l1);
        ListNode l3=makeList(new ListNode(3),l2);
        ListNode l4=makeList(new ListNode(4),l3);
        ListNode l5=makeList(new ListNode(5),l4);

        ListNode LN_last=l1;
        while (LN_last.next!=null){
            LN_last=LN_last.next;
        }
        ListNode LN_first=l1;
        while (LN_first.previous!=null){
            LN_first=LN_first.previous;
        }
        reversList(l1);
    }
    public static void reversList(ListNode LN_first){
        ListNode LN=LN_first;
        while (LN.next!=null){
            LN=LN.next;
        }
        do{
            System.out.println(LN.val);
            LN=LN.previous;
        }while (LN!=null);

    }

    public static ListNode makeList(ListNode listNode){

        return listNode;
    }
    public static ListNode makeList(ListNode listNode,ListNode pre){
        listNode.previous=pre;
        pre.next=listNode;
        return listNode;
    }
}
