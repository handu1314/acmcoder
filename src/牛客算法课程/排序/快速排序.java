package 牛客算法课程.排序;

import java.util.Random;

/**
 * @Author:hanxiao
 * @Description:
 * @Modified By:
 * Created by Administrator on 2017/5/4.
 */
public class 快速排序 {
    public int[] quickSort(int[] A, int n) {
        // write code here
        sort(A,0,n-1);
        return A;
    }
    public void swap(int[] arr,int a,int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
    /*
    递归处理整个序列
    1、根据依次划分求出中枢元素的位置
    2、递归处理左右两个子数组
     */
    public void sort(int[] arr,int left,int right){
        if(left >= right)
            return;
        int pivotPos = partition(arr,left,right);
        sort(arr,left,pivotPos);
        sort(arr,pivotPos+1,right);
    }
    /*
    快速排序的一次划分
    1、随机选取一个数字作为中枢
    2、将中枢位置的数字与第一个元素交换
    3、遍历数组，将小于中枢数字的元素依次交换到前边
    4、交换完毕后将第一个数字（中枢元素）交换到小于中枢元素序列的下一个位置
     */
    public int partition(int[] arr,int left,int right){
        Random random = new Random();
        int pivotPointer = left + random.nextInt(right-left+1);
        swap(arr,left,pivotPointer);
        int j = left;
        for(int i=left;i<=right;i++){
            if(arr[i] < arr[left]){
                swap(arr,i,++j);
            }
        }
        swap(arr,left,j);
        return j;
    }
}
