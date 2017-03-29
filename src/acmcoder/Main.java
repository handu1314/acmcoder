package acmcoder;//求百分数

import java.text.DecimalFormat;
//标准输入
import java.util.Arrays;
import java.util.Collection;
import java.util.Scanner;

/**
 * @Author:hanxiao
 * @Description:
 * @Modified By:
 * Created by Administrator on 2017/3/18.
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String input = sc.nextLine();
            String s1 = sc.nextLine();
            String s2 = sc.nextLine();
            boolean fwd = false;
            boolean back = false;
            int idx = input.indexOf(s1);
            if (idx != -1) {
                idx += s1.length();

                if (input.substring(idx, input.length()).contains(s2)) {
                    fwd = true;
                }
            }

            String inputR = new StringBuilder(input).reverse().toString();
            idx = inputR.indexOf(s1);
            if (idx != -1) {

                idx += s1.length();

                if (inputR.substring(idx, input.length()).contains(s2)) {
                    back = true;
                }
            }

            if(fwd){
                if(back){
                    System.out.println("both");
                }else {
                    System.out.println("forward");
                }
            }else{
                if(back){
                    System.out.println("backward");
                }else {
                    System.out.println("invalid");
                }
            }
        }
    }
}
