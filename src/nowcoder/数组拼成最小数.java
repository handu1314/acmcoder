package nowcoder;

import java.util.*;

/**
 * Created by Administrator on 2017/4/27.
 * 题目描述：
 * 输入一个正整数数组，把数组里所有数字拼接起来排成一个数，
 * 打印能拼接出的所有数字中最小的一个。例如输入数组{3，32，321}，
 * 则打印出这三个数字能排成的最小数字为321323。
 *
 * 思路：
 * //实现了Comparator接口的compare方法，将集合元素按照compare方法的规则进行排序
 * 按字典序排序
 * 然后将排序号的集合逐个追加到result中
 */
public class 数组拼成最小数 {
    public static void main(String[] args) {
        System.out.println(PrintMinNumber(new int[]{3,5,1,4,2}));
    }
    public static String PrintMinNumber(int [] numbers) {
        StringBuilder result = new StringBuilder();
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < numbers.length; i++) {
            list.add(numbers[i]);
        }

        Collections.sort(list, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                String s1 = String.valueOf(o1) + String.valueOf(o2);
                String s2 = String.valueOf(o2) + String.valueOf(o1);
                return s1.compareTo(s2);
            }
        });
        for (int i = 0; i < list.size(); i++) {
            result.append(list.get(i));
        }
        return result.toString();
    }
}
