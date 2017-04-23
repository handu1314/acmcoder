package toutiao;
import java.util.Scanner;
/**
 * @Author:hanxiao
 * @Description:
 * @Modified By:
 * Created by Administrator on 2017/3/30.
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int q = sc.nextInt();
        int A[] = new int[n];
        int B[] = new int[n];
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            A[i] = sc.nextInt();
        }
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            B[i] = sc.nextInt();
        }
        sc.nextLine();
        int count = 0;
        while (sc.hasNext()){
            int x = sc.nextInt();
            int y = sc.nextInt();
            sc.nextLine();
            for (int i = 0; i < n; i++) {
                if(A[i] >= x && B[i] >= y){
                    count++;
                }
            }
            System.out.println(count);
            count = 0;
        }
    }
}
