package jd;

import java.util.Scanner;

/**
 * @Author:hanxiao
 * @Description:
 * @Modified By:
 * Created by Administrator on 2017/4/7.
 */
public class Main {
    static int count = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String input = sc.nextLine();
        int len = input.length();
        int k = 0;
        for (int i = 0; i < len; i++) {
            if(Character.isDigit(input.charAt(i))){
                int num = input.charAt(i) - 48;
                find(input.substring(i-num<k?k:i-num,i+num+1 > len-1?len-1:i+num+1));
                i = i + num + 1;
                k = i;
            }
        }
        System.out.println(count);
    }
    public static void find(String str){
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == 'X')
                count++;
        }
    }
}
