package nowcoder;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 2017/4/27.
 * 利用一个HashMap，k是数组元素，value是出现的次数，
 * put时判断是否存在key，如果存在，取出当前的key对应的value，加1后重新put覆盖之前的记录
 * 如果不存在，直接put，value设置为1
 *
 * 然后遍历map，当entry.getValue()大于数组长度的一半时，返回当前的key。
 */
public class 数字出现次数大于数组长度一半 {
    public static void main(String[] args) {
        MoreThanHalfNum_Solution(new int[]{1,2,3,2,2,2,5,4,2});
    }
    public static int MoreThanHalfNum_Solution(int [] array) {
        int result = 0;
        Map<Integer,Integer> map = new HashMap();
        for(int i=0;i<array.length;i++){
            if(map.containsKey(array[i])){
                int value = Integer.parseInt(map.get(array[i]).toString()) + 1;
                map.put(array[i],value);
            }else{
                map.put(array[i],1);
            }
        }
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            if(entry.getValue() > array.length / 2){
                result = entry.getKey();
                break;
            }
        }
        return result;
    }
}
