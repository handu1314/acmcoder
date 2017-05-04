package 牛客算法课程.排序;

/**
 * @Author:hanxiao
 * @Description:
 * @Modified By:
 * Created by Administrator on 2017/5/4.
 */
public class 堆排序 {
    public int[] heapSort(int[] A, int n) {
        // write code here
        for(int i=n;i>0;i--){
            heepAjust(A,i);
            swap(A,0,i-1);
        }
        return A;
    }
    public void swap(int[] arr,int a,int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
    //调整堆
    /*
    *i = n / 2 - 1 是堆中的最后一个非叶子节点
    * 2*i+1 为i节点的左孩子
    * 2*i+2 为i节点的右孩子
     */
    public void heepAjust(int[] arr,int n){
        for(int i=n/2-1;i>=0;i--){
            if(arr[2*i+1] > arr[i]){
                swap(arr,2*i+1,i);
            }
            if(2*i+2 < n){
                if(arr[2*i+2] > arr[i]){
                    swap(arr,2*i+2,i);
                }
            }
        }
    }
}
