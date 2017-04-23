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
public class Main3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        if(n <= 2){
            System.out.println(1);
        }else {
            int i =1;
            if(k!=1){
                while ((i*k<n)&&((n-i*k)>=(i-1))) {
                    i++;
                }
                System.out.println(i-1);
            }else{
                k = 2;
                while ((i*k<n)&&((n-i*k)>=(i-1))) {
                    i++;
                }
                System.out.println(i + 1);
            }

        }
    }
}
