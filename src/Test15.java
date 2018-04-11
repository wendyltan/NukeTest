package nukeTest;

public class Test15 {
    /**
     * 输入一个链表，反转链表后，输出链表的所有元素。
     */
    ListNode head = null;
    public ListNode ReverseList(ListNode head) {
        ListNode tempHead=head;
        int index=1;
        while(head!=null){
            if (index==1){
                tempHead = new ListNode(head.val);
            }else{
                ListNode temp = new ListNode(head.val);
                temp.next = tempHead;
                tempHead = temp;

            }
            head = head.next;
            index++;

        }
        head = tempHead;
        while (tempHead!=null){
            System.out.print(tempHead.val+" ");
            tempHead = tempHead.next;
        }
        return head;
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
        Test15 test15 = new Test15();
        test15.addNode(1);
        test15.addNode(2);
        test15.addNode(3);
        test15.addNode(4);
        test15.addNode(5);
        test15.ReverseList(test15.head);
    }
}
