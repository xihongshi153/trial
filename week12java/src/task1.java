
public class task1 {
    public static void main(String[] args) {
        ListNode l11=makeNode.makeNode(new ListNode(1));
        ListNode l12= makeNode.makeNode(new ListNode(2),l11);
        ListNode l13= makeNode.makeNode(new ListNode(4),l12);
        ListNode l14= makeNode.makeNode(new ListNode(5),l13);
        ListNode l15= makeNode.makeNode(new ListNode(6),l14);
        ListNode l16= makeNode.makeNode(new ListNode(7),l15);

        ListNode l21= makeNode.makeNode(new ListNode(1));
        ListNode l22= makeNode.makeNode(new ListNode(3),l21);
        ListNode l23= makeNode.makeNode(new ListNode(4),l22);
        ListNode newln=mergeTwoLists(l11,l21);

        while (newln!=null){
            System.out.print(newln.val+"-->");
            newln=newln.next;
        }
    }
    public static ListNode mergeTwoLists(ListNode l1,ListNode l2){
        ListNode l_1=l1.val>=l2.val?l1:l2;
        ListNode l_2=l1.val<l2.val?l1:l2;
        ListNode l_a=l_1;
        ListNode l_b=l_2;
        while (l_b!=null){
            ListNode l_bnext=l_b.next;
            for(;!(l_b.val>=l_a.val&&l_b.val<=l_a.next.val);){
                l_a=l_a.next;
                if(l_a.next==null){
                    l_a.next=l_b;
                    return l_1;
                }
            }
            insertList(l_b,l_a);
            l_a=l_1;
            l_b=l_bnext;
        }
        return l1;
    }

    //插入节点
    public static void insertList(ListNode listNode,ListNode pre){
        ListNode next=pre.next;

        listNode.previous=pre;
        listNode.next=next;
        pre.next=listNode;
        next.previous=listNode;
    }
}
