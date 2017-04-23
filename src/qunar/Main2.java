package qunar;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * @Author:hanxiao
 * @Description:
 * @Modified By:
 * Created by Administrator on 2017/4/1.
 */
public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            String input = sc.nextLine();
            double num = 0;
            int len = input.length();
            for (int i = 0; i < len; i++) {
                int n = (input.charAt(i)-97);
                num += n * Math.pow(26,len-i-1);
            }
            java.text.DecimalFormat df = new DecimalFormat("#0");
            System.out.println(df.format(num));
        }
    }
}
