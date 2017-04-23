package microsorft;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @Author:hanxiao
 * @Description:
 * @Modified By:
 * Created by Administrator on 2017/3/31.
 */
class Node{
    int data;
    double percentage;
    boolean isFind = false;
    int deep = 0;
    Node left;
    Node right;
    Node(int data,double percentage,boolean isFind,int deep){
        this.data = data;
        this.percentage = percentage;
        this.isFind = isFind;
        this.deep = deep;
        left = null;
        right = null;
    }
}
public class Main {
    static Node root = new Node(0,0,false,0);
    static int P = 0;
    static int Q = 0;
    static int N = 0;
    static double result = 0;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        P = in.nextInt();
        Q = in.nextInt();
        N = in.nextInt();
        Node left = new Node(1,P,true,1);
        root.left = left;
        createTree(root.left);
        Node right = new Node(0,100-P,false,1);
        root.right = right;
        createTree(root.right);
        search(root.left);
        list.clear();
        search(root.right);
        DecimalFormat df = new DecimalFormat("#.00");
        System.out.println(df.format(result));
    }
    public static void createTree(Node node){
        if(node.data < N){
            if(node.percentage <= 100){
                double p = 0;
                if(node.isFind){
                    p = Math.floor(node.percentage/Math.pow(2,node.data));
                }else{
                    p = node.percentage + Q > 100 ?100:node.percentage + Q;
                }
                Node left = new Node(node.data+1,p,true,node.deep+1);
                node.left = left;
                createTree(node.left);
                if(p < 100){
                    Node right = new Node(node.data,100-p,false,node.deep+1);
                    node.right = right;
                    createTree(node.right);
                }
            }
        }
    }
    static List<Double> list = new ArrayList<>();
    public static void search(Node node){
        list.add(node.percentage/100);
        if(node.left != null){
            search(node.left);
            if(node.right != null){
                search(node.right);
            }
        }else{
            double d = 1;
            for (int i = 0; i < list.size(); i++) {
                d *= list.get(i);
            }
            result += node.deep * d;
            list.remove(node.percentage/100);
        }
    }
}
