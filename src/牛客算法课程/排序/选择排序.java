package 牛客算法课程.排序;

/**
 * @Author:hanxiao
 * @Description:、
 * 每次找出一个最小值放到数组前边
 * 时间复杂度为O（n²）
 * @Modified By:
 * Created by Administrator on 2017/5/4.
 */
public class 选择排序 {
    public int[] selectionSort(int[] A, int n) {
        // write code here
        for(int i=0;i<n;i++){
            int flag = i;
            int min = java.lang.Integer.MAX_VALUE;
            for(int j=i;j<n;j++){
                if(A[j] < min){
                    min = A[j];
                    flag = j;
                }
            }
            if(flag != i){
                int temp = A[flag];
                A[flag] = A[i];
                A[i] = temp;
            }
        }
        return A;
    }
}
