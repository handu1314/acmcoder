package nowcoder;

/**
 * Created by Administrator on 2017/4/27.
 * 遍历从0到n
 * 将数字转成字符串在转成字符数组
 * 遍历字符数组，碰到‘1’count加1
 */
public class 非负区间中1出现的次数 {
    public static void main(String[] args) {
        System.out.println(NumberOf1Between1AndN_Solution(13));
    }
    public static int NumberOf1Between1AndN_Solution(int n) {
        int count = 0;
        for (int i = 0; i <= n; i++) {
            char[] chars = String.valueOf(i).toCharArray();
            for (int j = 0; j < chars.length; j++) {
                if(chars[j] == '1'){
                    count++;
                }
            }
        }
        return count;
    }
}
