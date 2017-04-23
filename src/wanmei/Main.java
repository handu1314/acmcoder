package wanmei;

import java.util.*;

/**
 * @Author:hanxiao
 * @Description:
 * @Modified By:
 * Created by Administrator on 2017/3/29.
 */
public class Main {
    static int price = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(",");
        price = Integer.parseInt(sc.nextLine());
        int[] test = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            test[i] = Integer.parseInt(input[i]);
        }
        Arrays.sort(test);
        if(price<test[0]){
            System.out.println("-1");
        }else {
            int min=getMinCount(price,test);
            System.out.println(min);
        }
    }
    public static int getMinCount (int price,int c[]){
        int a[]=new int[price+1];
        a [0]=0;
        for(int x=1;x<price+1;x++){
            if(x>=c[0]){
                a[x]=a[x-c[0]]+1;
            }
            for(int i=1;i<c.length;i++){
                if(x>=c[i]&&(a[x]>a[x-c[i]]+1)){
                    a[x]= a[ x- c[i]]+1;
                }
            }
        }
        return a[price];
    }
}
