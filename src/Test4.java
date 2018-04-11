package nukeTest;

public class Test4 {

    public int findIndexByValue(int compareValue, int[] a) {
        if (null == a || a.length == 0) {
            return -1;
        }
        for (int i = 0; i < a.length; i++) {
            if (a[i] == compareValue) {
                return i;
            }
        }
        return -1;
    }
    public TreeNode reConstructBinaryTree(int [] pre, int [] in) {
        if (pre.length==0|in.length==0){
            return null;
        }
        TreeNode root = new TreeNode(pre[0]);
        int rootIndexInInorder = findIndexByValue(pre[0], in);

        //分别将原前序和中序分割成两个子序列
        int lengthOfSubPreorder1 = rootIndexInInorder;
        int[] subPreorder1 = {};
        if (lengthOfSubPreorder1 > 0) {
            // generate subPreorder1 247
            subPreorder1 = new int[lengthOfSubPreorder1];
            System.arraycopy(pre, 1, subPreorder1, 0,
                            lengthOfSubPreorder1);
        }
        // remain subPreorder
        int lengthOfSubPreorder2 = pre.length - lengthOfSubPreorder1 - 1;
        int[] subPreorder2 = {};
        if (lengthOfSubPreorder2 > 0) {
            // generate subPreorder2 3568
            subPreorder2 = new int[lengthOfSubPreorder2];
            System.arraycopy(pre, pre.length
                    - lengthOfSubPreorder2, subPreorder2, 0, lengthOfSubPreorder2);
        }

        int lengthOfSubinorder1 = rootIndexInInorder;
        int[] subinorder1 = {};
        if (lengthOfSubinorder1 > 0) {
            subinorder1 = new int[lengthOfSubinorder1];
            // generate subInorder1 472
            System.arraycopy(in, 0, subinorder1, 0, lengthOfSubinorder1);
        }
        // remain subInorder
        int lengthOfSubInorder2 = pre.length - lengthOfSubinorder1 - 1;
        int[] subinorder2 = {};
        if (lengthOfSubInorder2 > 0) {
            subinorder2 = new int[lengthOfSubInorder2];
            // generate subInorder2 5386
            System.arraycopy(in, in.length
                    - lengthOfSubInorder2, subinorder2, 0, lengthOfSubPreorder2);
        }
        //递归还原二叉树
        root.left = reConstructBinaryTree(subPreorder1,subinorder1);
        root.right =reConstructBinaryTree(subPreorder2,subinorder2);
        return root;

    }
    public static void main(String[] args){
        Test4 test4 = new Test4();
        int[] pre = {1,2,4,7,3,5,6,8};
        int[] in = {4,7,2,1,5,3,8,6};
        test4.reConstructBinaryTree(pre,in);
    }
}
