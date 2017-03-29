package acmcoder;

import java.util.*;
/**
 *@Author: hanxiao
 *@Description:字符串偶串个数
 *@Date: 15:22 2017/3/29
*/
public class Main6 {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String test = sc.nextLine();
        int n = 0;
        StringBuilder sb = new StringBuilder();
        String chars = "abcdefghijklmnopqrstuvwxyz";
        System.out.println();
        while (n<450){
            n++;
            sb.append(chars.charAt((int)(Math.random() * 26)));
        }
        String test = sb.toString();
        int count = 0;
        long currentTime1 = System.currentTimeMillis();
        for (int i = 0; i < test.length(); i++) {
            for (int j = i+1; j <test.length() ; j+=2) {
                String s = test.substring(i,j+1);
                if(find(s)){
                    count++;
                }
            }
        }
        long currentTime2 = System.currentTimeMillis();
        System.out.println("程序总耗时："+String.valueOf(currentTime2-currentTime1)+"毫秒");
        System.out.println(count);
    }
    public static boolean find(String s){
        Map<Character,Integer> map = new HashMap();
        long currentTime = System.currentTimeMillis();

        for (int i = 0; i < s.length(); i++) {
            Integer value = map.get(s.charAt(i));
            map.put(s.charAt(i),value == null ? 1:value+1);
        }
        long currentTime2 = System.currentTimeMillis();
        System.out.println("当前子串长度为："+s.length()+"存入map耗时："+String.valueOf(currentTime2-currentTime));
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
           if((entry.getValue()&1)!=0){
               long currentTime3 = System.currentTimeMillis();
               System.out.println("当前子串长度为："+s.length()+"检查偶串耗时："+String.valueOf(currentTime3-currentTime2));
               return false;
           }
        }
        return true;
    }
}
