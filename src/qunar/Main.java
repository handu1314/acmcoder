
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

/**
 * @Author:hanxiao
 * @Description:
 * @Modified By:
 * Created by Administrator on 2017/4/1.
 */
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        int[] pre = new int[n];
        int[] inner = new int[n];
        for (int i = 0; i < n; i++) {
            pre[i] = sc.nextInt();
        }
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            inner[i] = sc.nextInt();
        }
        TreeNode root = reConstructBinaryTree(pre,inner);
        levelSearch(root);
    }
    public static void levelSearch(TreeNode root)
    {
        if(root == null)
        {
            return ;
        }
        LinkedList<TreeNode> queue = new LinkedList<TreeNode>();
        TreeNode current = null;
        queue.offer(root);//将根节点入队
        while(!queue.isEmpty())
        {
            current = queue.poll();//出队队头元素并访问
            System.out.print(current.val + " ");
            if(current.left != null)//如果当前节点的左节点不为空入队
            {
                queue.offer(current.left);
            }
            if(current.right != null)//如果当前节点的右节点不为空，把右节点入队
            {
                queue.offer(current.right);
            }
        }
    }
    public static TreeNode reConstructBinaryTree(int [] pre,int [] in) {
        if(pre.length == 0 || in.length == 0)
            return null;
        TreeNode root = new TreeNode(pre[0]);
        for(int i=0;i<in.length;i++){
            if(pre[0] == in[i]){
                root.left = reConstructBinaryTree(Arrays.copyOfRange(pre,1,i+1),Arrays.copyOfRange(in,0,i));
                root.right = reConstructBinaryTree(Arrays.copyOfRange(pre,i+1,pre.length),Arrays.copyOfRange(in,i+1,in.length));
            }
        }
        return root;
    }
}
