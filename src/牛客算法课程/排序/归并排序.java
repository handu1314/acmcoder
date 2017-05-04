package 牛客算法课程.排序;

/**
 * @Author:hanxiao
 * @Description:
 * 归并排序是另一种不同的排序方法，
 * 因为归并排序使用了递归分治的思想，
 * 所以理解起来比较容易。
 * 其基本思想是，先递归划分子问题，然后合并结果。
 * 把待排序列看成由两个有序的子序列，然后合并两个子序列，
 * 然后把子序列看成由两个有序序列。。。。。
 * 倒着来看，其实就是先两两合并，然后四四合并。。。最终形成有序序列。
 * 空间复杂度为O(n)，时间复杂度为O(nlogn)。
 * @Modified By:
 * Created by Administrator on 2017/5/4.
 */
public class 归并排序 {
    public int[] mergeSort(int[] A, int n) {
        // write code here
        sort(A,0,n-1);
        return A;
    }
    public void sort(int[] arr,int left,int right){
        if(left >= right)
            return;
        int mid = (left + right) / 2;
        sort(arr,left,mid);
        sort(arr,mid+1,right);
        merg(arr,left,mid,right);
    }
    public void merg(int[] arr,int left,int mid,int right){
        int[] temp = new int[right-left+1];
        int i = left;
        int j = mid + 1;
        int k = 0;
        while(i <= mid && j <= right){
            if(arr[i] <= arr[j]){
                temp[k++] = arr[i++];
            }else{
                temp[k++] = arr[j++];
            }
        }
        while(i <= mid){
            temp[k++] = arr[i++];
        }
        while(j <= right){
            temp[k++] = arr[j++];
        }
        for(int m = 0;m<temp.length;m++){
            arr[left+m] = temp[m];
        }
    }
}
