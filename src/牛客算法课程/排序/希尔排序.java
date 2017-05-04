package 牛客算法课程.排序;

/**
 * @Author:hanxiao
 * @Description:
 *
 * @Modified By:
 * Created by Administrator on 2017/5/4.
 */
public class 希尔排序 {
    public int[] shellSort(int[] A, int n) {
        // write code here
        return sort(A,n>>1);
    }
    public int[] sort(int[] arr,int d){
        if(d <= 0)
            return arr;
        for(int i=d;i<arr.length;i++){
            int index = i;
            while(index >= d){
                if(arr[index] < arr[index-d]){
                    int temp = arr[index];
                    arr[index] = arr[index-d];
                    arr[index-d] = temp;
                }else{
                    break;
                }
                index -= d;
            }
        }
        return sort(arr,d>>1);
    }
}
