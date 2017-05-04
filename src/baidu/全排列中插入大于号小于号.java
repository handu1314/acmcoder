package baidu;

import java.util.*;

/**
 * @Author:hanxiao
 * @Description:
 * @Modified By:
 * Created by Administrator on 2017/4/27.
 */
public class 全排列中插入大于号小于号 {
    static char[] chars = null;
    static int n = 0;
    static int k = 0;
    static Set<char[]> set = new HashSet<>();
    static int count = 0;
    static int lowCount = 0;
    static int upperCount = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        k = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            sb.append(i);
        }
        chars = sb.toString().toCharArray();
        //求全排列
        for (int i = 0; i < n; i++) {
            sort(i);
        }
        for (char[] c:set) {
            insert(c);
        }
        System.out.println(count);
    }
    static void insert(char[] c){
        for (int i = 1; i < c.length; i++) {
            if((c[i] - 48) > (c[i-1] - 48)){
                lowCount++;
                if(lowCount > k) {
                    lowCount = upperCount = 0;
                    return;
                }
            }else {
                upperCount++;
                if(upperCount > n-k-1) {
                    lowCount = upperCount = 0;
                    return;
                }
            }
        }
        if(lowCount == k && upperCount == n-k-1){
            count++;
        }
        lowCount = upperCount = 0;
    }
    static void swap(int arg1, int arg2){
        char temp;
        temp = chars[arg1];
        chars[arg1] = chars[arg2];
        chars[arg2] = temp;
    }
    static void  sort(int index){
        int i;
        if (index == n){
//            StringBuilder sb = new StringBuilder();
//            for (i = 0; i < n; i++){
//                sb.append(chars[i]);
//            }

            set.add(chars);
            return;
        }
        for (i = index; i < n; i++){
            swap(index,i);
            sort(index + 1);
            swap(index,i);
        }
    }
}
