package nukeTest;

import java.util.ArrayList;
import java.util.List;

public class Test3 {

    public ListNode head = null;
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {

        ListNode temp = listNode;
        List<Integer> array = new ArrayList<>();

        while (temp!=null){
            array.add(temp.val);
            temp = temp.next;
        }
        for (int i=array.size()-1;i>=0;i--){
            System.out.print(array.get(i)+" ");
        }
        return (ArrayList<Integer>) array;

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
        Test3 test3= new Test3();
        test3.addNode(67);
        test3.addNode(0);
        test3.addNode(24);
        test3.addNode(58);

        test3.printListFromTailToHead(test3.head);
    }
}
