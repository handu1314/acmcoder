package 牛客算法课程.排序;

/**
 * @Author:hanxiao
 * @Description:
 * 两两比较，大的元素向后移动
 * 时间复杂度为O（n²）
 * @Modified By:
 * Created by Administrator on 2017/5/4.
 */
public class 冒泡排序 {
    public int[] bubbleSort(int[] A, int n) {
        // write code here
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < n; j++) {
                if (A[j - 1] > A[j]) {
                    int temp = A[j];
                    A[j] = A[j - 1];
                    A[j - 1] = temp;
                }
            }
        }
        return A;
    }
}
