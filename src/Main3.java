import java.util.Arrays;
import java.util.Scanner;

/**
 * @Author:hanxiao
 * @Description:
 * @Modified By:
 * Created by Administrator on 2017/3/25.
 */
public class Main3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        char[] test = input.toCharArray();
        System.out.println(Math.min(sort(test,true),sort(test,false)));
    }
    public static int sort(char[] array,boolean flag){
        int sortTime = array.length - 1;
        char tmp;
        int count = 0;
        if(flag) {
            for (int i = sortTime; i > 0; i--) {
                for (int j = 0; j < i; j++) {
                    if (array[j] < array[j + 1]) {
                        count++;
                        tmp = array[j];
                        array[j] = array[j+1];
                        array[j+1] = tmp;
                    }
                }
            }
        }else{
            for (int i = sortTime; i > 0; i--) {
                for (int j = 0; j < i; j++) {
                    if (array[j] > array[j + 1]) {
                        count++;
                        tmp = array[j];
                        array[j] = array[j+1];
                        array[j+1] = tmp;
                    }
                }
            }
        }
        return count;
    }
}
