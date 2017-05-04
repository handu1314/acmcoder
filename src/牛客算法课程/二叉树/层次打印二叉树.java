package 牛客算法课程.二叉树;

import java.util.ArrayList;
import java.util.LinkedList;

class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;
    public TreeNode(int val) {
        this.val = val;
    }
}
/**
 * @Author:hanxiao
 * @Description:
 * @Modified By:
 * Created by Administrator on 2017/5/4.
 */
public class 层次打印二叉树 {
    public int[][] printTree(TreeNode root) {

        ArrayList<ArrayList<TreeNode>> values = new ArrayList<ArrayList<TreeNode>>();
        ArrayList<TreeNode> temp_value = new ArrayList<TreeNode>();
        LinkedList<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root);
        TreeNode temp = queue.pop();
        TreeNode last = root;
        TreeNode nlast = null;
        while(temp != null){
            if(temp.left != null){
                queue.add(temp.left);
                nlast = temp.left;
            }
            if(temp.right != null){
                queue.add(temp.right);
                nlast = temp.right;
            }
            temp_value.add(temp);
            if(temp == last){
                last = nlast;
                values.add(temp_value);
                temp_value = new ArrayList<TreeNode>();
            }
            temp = queue.pop();
        }
        int x = values.size();
        int result[][] = new int[x][];
        for(int i=0;i<x;i++){
            int y = values.get(i).size();
            for(int j=0;j<y;j++){
                result[i][j] = values.get(i).get(j).val;
            }
        }
        return result;
    }
}
