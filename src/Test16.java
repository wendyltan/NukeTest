package nukeTest;

public class Test16 {
    /**
     * 输入两个单调递增的链表，输出两个链表合成后的链表，当然我们需要合成后的链表满足单调不减规则。
     */
    ListNode head = null;
    public ListNode Merge(ListNode list1,ListNode list2) {
        //一个临时的头部
        ListNode ret = new ListNode(-1);
        ListNode tail = ret;
        while (list1!=null&&list2!=null){
            if (list1.val < list2.val)
            {
               tail.next = list1;
               tail = tail.next;
               list1 = list1.next;
            }
            else
            {
                tail.next = list2;
                tail = tail.next;
                list2 = list2.next;
            }

        }
        if (list1!=null)
            tail.next = list1;
        if (list2!=null)
            tail.next = list2;

        ret = ret.next ;

        return ret;
    }

    public void addNode(int val){

        ListNode newListNode = new ListNode(val);// 实例化一个节点
        if (head == null) {
            head = newListNode;
            return;
        }
        ListNode tmp = head;
        while (tmp.next != null) {
            tmp = tmp.next;
        }
        tmp.next = newListNode;

    }
    public static void main(String[] args){
        Test16 test16 = new Test16();
        test16.addNode(1);
        test16.addNode(2);
        test16.addNode(3);
        test16.addNode(4);
        test16.addNode(5);
        Test16 test161 = new Test16();
        test161.addNode(6);
        test161.addNode(7);
        test161.addNode(8);
        test161.addNode(9);
        test16.Merge(test16.head,test161.head);

    }
}
