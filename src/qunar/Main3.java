package qunar;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * @Author:hanxiao
 * @Description:
 * @Modified By:
 * Created by Administrator on 2017/4/1.
 */
public class Main3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder prim = new StringBuilder(sc.nextLine());
        StringBuilder fina = new StringBuilder(sc.nextLine());
        if(prim.equals(fina)){
            System.out.println(0);
        }else {
            int len = prim.length();
            String[] list = sc.nextLine().split(" ");
            Set<String> set = new HashSet<>();
            for (int i = 0; i < list.length; i++) {
                set.add(list[i]);
            }
            int count = 1;

            int i=0;
            while (!prim.toString().equals(fina.toString())){
                char indexP = prim.charAt(i);
                char indexF = fina.charAt(i);
                if(indexF == indexP){
                    continue;
                }
                if (indexF != indexP) {
                    prim.setCharAt(i,indexF);
                    if(set.contains(prim.toString())){
                        count++;
                        set.remove(prim.toString());
                    }else {
                        prim.setCharAt(i,indexP);
                    }
                }
                if(i==len-1){
                    i = 0;
                }else {
                    i++;
                }
            }
            System.out.println(count);
        }
    }
}
