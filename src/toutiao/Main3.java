package toutiao;
import java.util.Scanner;

public class Main3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(num < 3)
            System.out.println("-1" + " " + "-1");
        int[] input = new int[num];
        for(int i = 0;i < num;i++){
            input[i] = sc.nextInt();
        }
        int begin = 0,end = 0;
        int max = 0;
        int head = 0;
        while(head < num - 1) {
            while (head < num - 1 && input[head] >= input[head + 1])
                head++;
            if(head >= num - 1)
                break;
            int up = 0,down = 0;
            int tempbegin = head;
            while(head < num - 1 && input[head] < input[head + 1]){
                head++;
                up++;
            }
            if(head >= num - 1)
                break;
            while(head < num - 1 && input[head] > input[head + 1]){
                head++;
                down++;
            }
            if(up + down > max){
                max = up + down;
                begin = tempbegin;
                end = head;
            }
        }
        if(max >= 2)
            System.out.println(begin + " " + end);
        else
            System.out.println("-1" + " " + "-1");

    }
}