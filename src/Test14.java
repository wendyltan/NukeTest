package nukeTest;
public class Test14 {
    /**
     * 输入一个链表，输出该链表中倒数第k个结点。
     * @param head
     * @param k
     * @return
     */
    ListNode head = null;
    public ListNode FindKthToTail(ListNode head,int k) {
        ListNode temp = head;
        int numbers = 1;
        while(temp!=null){
            temp = temp.next;
            numbers++;
        }
        temp = head;
        while (temp!=null){
            if (--numbers==k){
                System.out.println(temp.val);
                return temp;
            }
            temp = temp.next;
        }
        return null;
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
        Test14 test14 = new Test14();
        test14.addNode(13);
        test14.addNode(12);
        test14.addNode(10);
        test14.addNode(99);
        test14.FindKthToTail(test14.head,4);
    }
}
