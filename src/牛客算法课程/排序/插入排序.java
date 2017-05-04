package 牛客算法课程.排序;

/**
 * @Author:hanxiao
 * @Description:
 * @Modified By:
 * Created by Administrator on 2017/5/4.
 */
public class 插入排序 {
    public int[] insertionSort(int[] A, int n) {
        // write code here
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j>0;j--){
                if(A[j] < A[j-1]){
                    int temp = A[j-1];
                    A[j-1] = A[j];
                    A[j] = temp;
                }
            }
        }
        return A;
    }
}
