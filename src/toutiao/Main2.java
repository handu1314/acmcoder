package toutiao;

import java.util.*;

/**
 * @Author:hanxiao
 * @Description:
 * @Modified By:
 * Created by Administrator on 2017/3/30.
 */
public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        sc.nextLine();
        String []strM2 = new String[N];
        List<Set<String>> strN = new ArrayList<Set<String>>();
        for (int i = 0; i < N; i++) {
            strM2[i] = sc.nextLine();
            String[] s = strM2[i].split(" ");
            Set<String> set = new HashSet<>();
            for (int j = 0; j < s.length; j++) {
                set.add(s[j].toLowerCase());
            }
            strN.add(set);
        }
        while (sc.hasNext()){
            String strM = sc.nextLine();
            int count[] = new int[N];
            int maxIndex = 0;
            for (int i = 0; i < N; i++) {
                count[i] = find(strM,strN.get(i));
            }

            for (int i = 0; i < N; i++) {
                boolean flag = true;
                for (int j = i; j < N; j++) {
                    if(count[i] < count[j]){
                        flag = false;
                        break;
                    }
                }
                if (!flag)
                    continue;
                else {
                    System.out.println(strM2[i]);
                    break;
                }
            }
        }

    }
    public static int find(String str1,Set<String> set){
        int count = 0;
        String[] s1 = str1.split(" ");
        for (int i = 0; i < s1.length; i++) {
            if(!set.add(s1[i].toLowerCase())){
                count++;
            }
        }
        return count;
    }
}
