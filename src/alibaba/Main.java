package alibaba;

import java.util.*;

/**
 * @Author:hanxiao
 * @Description:
 * @Modified By:
 * Created by Administrator on 2017/4/26.
 */
public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> inputs = new ArrayList<Integer>();
        Scanner in = new Scanner(System.in);
        String line = in.nextLine();
        if(line != null && !line.isEmpty()) {
            int res = resolve(line.trim());
            System.out.println(String.valueOf(res));
        }
    }
    // write your code here
    public static int resolve(String expr) {
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < expr.length(); i++) {
            Character c = expr.charAt(i);
            if(c == ' ')
                continue;
            if(Character.isDigit(c)){
                if(stack.size() == 16){
                    return -2;
                }else{
                    stack.push(Integer.parseInt(c.toString()));
                }
            }else if(c == '^'){
                if(stack.size() == 0){
                    return -1;
                }
                else{
                    int n1 = stack.pop();
                    n1++;
                    if(stack.size() == 16){
                        return -2;
                    }else{
                        stack.push(n1);
                    }
                }
            }else if(c == '+'){
                if(stack.size() < 2) {
                    return -1;
                }else{
                    int n1 = stack.pop();
                    int n2 = stack.pop();

                    if(stack.size() == 16){
                        return -2;
                    }else{
                        stack.push(n1 + n2);
                    }
                }
            }
            else if(c == '*'){
                if(stack.size() < 2) {
                    return -1;
                }else{
                    int n1 = stack.pop();
                    int n2 = stack.pop();

                    if(stack.size() == 16){
                        return -2;
                    }else{
                        stack.push(n1*n2);
                    }
                }
            }
        }
        return stack.pop();
    }
}
