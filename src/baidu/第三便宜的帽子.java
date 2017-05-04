package baidu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * @Author:hanxiao
 * @Description:
 * @Modified By:
 * Created by Administrator on 2017/4/27.
 */
public class 第三便宜的帽子 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] prices = new int[N];
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < N; i++){
            prices[i] = sc.nextInt();
        }
        Arrays.sort(prices);
        list.add(prices[0]);
        for (int i = 1; i < N; i++) {
            if(prices[i] == prices[i-1]){
                continue;
            }else{
                list.add(prices[i]);
            }
        }
        if(list.size() < 3){
            System.out.println(-1);
        }else {
            System.out.println(list.get(2));
        }
    }
}
