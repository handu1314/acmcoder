package jd;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * @Author:hanxiao
 * @Description:
 * @Modified By:
 * Created by Administrator on 2017/4/7.
 */
public class Main2 {
    static int count = 0;
    static String input = "";
    static Set<Integer> set = new HashSet<>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        input = sc.nextLine();
        int len = input.length();
        int k = 0;
        for (int i = 0; i < len; i++) {
            if(Character.isDigit(input.charAt(i))){
                int num = input.charAt(i) - 48;
                find(i-num<k?k:i-num,i+num+1 > len-1?len-1:i+num+1);
            }
        }

        System.out.println(set.size());
    }
    public static void find(int start,int end){
        for (int i = start; i < end; i++) {
            if(input.charAt(i) == 'X')
                set.add(i);
        }
    }
}
