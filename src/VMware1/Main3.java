package VMware1;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main3 {
    public static void generateParenthesis(List<String> result,int n) {
        generate(result,0,0,"",n);
    }
    public static void generate(List<String> ls,int left,int right,String s,int n){
        if(right == n){
            ls.add(s);
        }
        else{
            if(left < n){
                generate(ls,left+1,right,s+"(",n);
            }
            if(right < left){
                generate(ls,left,right+1,s+")",n);
            }
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        char[] a = sc.nextLine().toCharArray();
        char[] b = sc.nextLine().toCharArray();
        List<String> res = new ArrayList<String>();
        generateParenthesis(res,n);
        int maxValue = -1;
        for(int i = 0;i < res.size();i++){
            int value = 0;
            String str = res.get(i);
            for(int index = 0;index < str.length();index++){
                if(str.charAt(index) == '(')
                    value += a[index] - 48;
                else if(str.charAt(index) == ')')
                    value += b[index] - 48;
            }
            maxValue = Math.max(maxValue,value);
        }
        System.out.println(maxValue);
    }

}