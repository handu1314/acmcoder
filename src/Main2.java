import java.util.Scanner;

/**
 * @Author:hanxiao
 * @Description:
 * @Modified By:
 * Created by Administrator on 2017/3/25.
 */
public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        String s1 = sc.nextLine();
        String[] tx = s1.split(" ");
        String s2 = sc.nextLine();
        String[] ty = s2.split(" ");
        int gx= sc.nextInt();
        int gy = sc.nextInt();
        int walkTime = sc.nextInt();
        int taxiTime = sc.nextInt();

        int minTimeWalk = walkTime*(Math.abs(gx) + Math.abs(gy));
        int minTimeTaxi = 1000000000;
        for (int i = 0; i < n; i++) {
            minTimeTaxi = Math.min(minTimeTaxi,walkTime*(Math.abs(Integer.parseInt(tx[i])) + Math.abs(Integer.parseInt(ty[i])))
                    + taxiTime*((Math.abs(gx - Integer.parseInt(tx[i])) + Math.abs(gy - Integer.parseInt(ty[i])))));
        }
        System.out.println(minTimeTaxi < minTimeWalk ? minTimeTaxi : minTimeWalk);
    }
}
