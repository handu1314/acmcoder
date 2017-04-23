package acmcoder;

import java.util.Scanner;

/**
 * @Author:hanxiao
 * @Description:
 * 题目描述
果园里有堆苹果，N（1＜N＜9）只熊来分。第一只熊把这堆苹果平均分为N份，多了一个，它把多的一个扔了，拿走了一份。第二只熊把剩下的苹果又平均分成N份，又多了一个，它同样把多的一个扔了，拿走了一份，第三、第四直到第N只熊都是这么做的，问果园里原来最少有多少个苹果？
输入
输入1个整数，表示熊的个数。它的值大于1并且小于9。
样例输入
5
输出
为1个数字，表示果园里原来有的苹果个数。
样例输出
3121
 * @Modified By:
 * Created by Administrator on 2017/3/29.
 */
public class 分苹果 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int num = N + 1;
        for (int i = N-1; i > 0; i--) {
            num = ((num+1)*N - 1)/(N - 1);
        }
        System.out.println(num);
    }
}
