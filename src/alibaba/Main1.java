package alibaba;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @Author:hanxiao
 * @Description:
 * @Modified By:
 * Created by Administrator on 2017/4/26.
 */
public class Main1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        String pattern = in.nextLine();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < pattern.length(); i++) {
            if(pattern.charAt(i) == '?') {
                sb.append("\\w{1}");
            }else if(pattern.charAt(i) == '*'){
                sb.append("\\w+");
            }else {
                sb.append(pattern.charAt(i));
            }
        }

        String regEx = sb.toString();
        Pattern p = Pattern.compile(regEx);
        Matcher matcher = p.matcher(str);
        if(matcher.matches()){
            System.out.println(1);
        }else {
            System.out.println(0);
        }
    }
}
