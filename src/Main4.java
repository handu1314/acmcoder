import java.util.Scanner;

/**
 * @Author:hanxiao
 * @Description:
 * @Modified By:
 * Created by Administrator on 2017/3/25.
 */
public class Main4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
    }
    public static int find(int num){
        int count = 0;
        for (int i = 1; i < num; i++) {
            if(!isPrem(i)){
                continue;
            }
            for (int j = i; j < num; j++) {
                if(!isPrem(j)){
                    continue;
                }
                if(i+j == num){
                    count++;
                }
            }
        }
        return count;
    }
    public static boolean isPrem(int n){
        for (int i = 2; i < n; i++) {
            if(n%i == 0)
                return false;
        }
        return true;
    }
}
