public class task2 {

    public static void main(String[] args) {
        ListNode l1= makeNode.makeNode(new ListNode(1));
        ListNode l2=makeNode.makeNode(new ListNode(1),l1);
        ListNode l3=makeNode.makeNode(new ListNode(2),l2);
        ListNode listNode=deleteDuplicates(l1);
        while (listNode!=null){
            System.out.println(listNode.val);
            listNode=listNode.next;
        }
    }
    public static ListNode deleteDuplicates(ListNode head) {
        ListNode listNode=head;
        ListNode cur=head.next;
        while (cur!=null){
            while (listNode!=null){
                if(cur.val== listNode.val&&cur!=listNode){
                    delete(cur);
                }
                    listNode=listNode.next;
            }
            cur=cur.next;
        }
        return head;
    }
    public static void delete(ListNode listNode){
        listNode.previous.next=listNode.next;
    }

}
