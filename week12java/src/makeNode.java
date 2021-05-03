public class makeNode {
    //创建首个节点
    public static ListNode makeNode(ListNode listNode){

        return listNode;
    }
    //创建节点
    public static ListNode makeNode(ListNode listNode,ListNode pre){
        listNode.previous=pre;
        pre.next=listNode;
        return listNode;
    }
}
