public class task2 {
    public static void main(String[] args) {
        ListNode l1=makeList(new ListNode(1));
        ListNode l2=makeList(new ListNode(2),l1);
        ListNode l3=makeList(new ListNode(3),l2);
        ListNode l4=makeList(new ListNode(2),l3);
        ListNode l5=makeList(new ListNode(1),l4);
        ListNode LN_last=l1;
        while (LN_last.next!=null){
            LN_last=LN_last.next;
        }
        ListNode LN_first=l1;
        while (LN_first.previous!=null){
            LN_first=LN_first.previous;
        }
        while (true){
            if(LN_first==LN_last|| LN_last.next==LN_first ){
                break;
            }
            if(LN_first.val==LN_last.val){
                LN_first=LN_first.next;
                LN_last=LN_last.previous;
            }else{
                System.out.println("NO");
                return;
            }
        }
        System.out.println("Yes");
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
