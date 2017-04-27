package nowcoder;


import java.util.ArrayList;

/**
 * Created by Administrator on 2017/4/27.
 */
public class 最小k个数 {
    public static void main(String[] args) {
        GetLeastNumbers_Solution(new int[]{4,5,1,6,2,7,3,8},4);
    }
    public static ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {

        ArrayList<Integer> result = new ArrayList<Integer>();
        if(k > input.length){
            return result;
        }
        //选择排序，一共k趟
        for (int i = 0; i < input.length; i++) {
            int temp = input[i];
            int flag = i;
            int j = i+1;
            for (; j < input.length; j++) {
                if(input[j] < temp){
                    temp = input[j];
                    flag = j;
                }
            }
            if(flag != i){
                input[flag] = input[i];
                input[i] = temp;
            }
            result.add(input[i]);
            if(result.size() == k)
                break;
        }
        return result;
    }
}
