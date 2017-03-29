package acmcoder;

import java.text.DecimalFormat;
import java.util.Scanner;
/**
 *@Author: hanxiao
 *@Description:
 *@Date: 15:22 2017/3/29
*/
public class Main5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        String[][] test = new String[n][];
        for (int i = 0; i < n; i++) {
            test[i] = sc.nextLine().split(" ");
        }
        double result = 0;
        for (int i = 0; i < n; i++) {
            double d1 = Double.parseDouble(test[i][0]);
            double d2 = Double.parseDouble(test[i][1])/100;
            result += d1 * d2;
        }
        DecimalFormat df = new DecimalFormat("#0.000");
        System.out.println(df.format(result));
    }
}
