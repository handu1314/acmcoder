package VMware1;

import java.util.Scanner;

/**
 * @Author:hanxiao
 * @Description:
 * @Modified By:
 * Created by Administrator on 2017/3/29.
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            int x = Integer.parseInt(sc.nextLine());
            g(x);
        }
    }

    public static void g(int x){
        int result = 5*x;
        boolean falg = false;
        for (int i = 1; i <=5*x ; i++) {
            int n = i;
            int sum = 0;
            while(n != 0)
            {
                sum += n/5;
                n /= 5;
            }
            if(sum == x){
                System.out.println(i);
                falg = true;
            }
        }
        if(!falg){
            System.out.println("-1");
        }
    }
}
