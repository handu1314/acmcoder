package acmcoder;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author:hanxiao
 * @Description:
 * @Modified By:
 * Created by Administrator on 2017/4/18.
 */
public class Ex2 {
    Map<String,Integer> scoreByName = new HashMap<>(3);

    public Ex2(String[] names,int[] scores) {
        try{
            for (int i = 0; i < names.length; i++) {
                scoreByName.put(names[i],scores[i]);
            }
        }catch (Exception e){
            System.out.println(scoreByName.size());
            System.exit(-1);
        }
    }

    void printPassed(){
        try{
            for (Map.Entry<String,Integer> entry : scoreByName.entrySet()){
                if(entry.getValue() < 60){
                    scoreByName.remove(entry.getKey());
                }
            }
            System.out.println(scoreByName.size());
        }catch (Exception e){
            System.out.println(scoreByName.size());
            System.exit(-1);
        }
    }

    public static void main(String[] args) {
        try{
            String[] names = {"Zhao","Qian","Sun","Li","Zhou"};
            int[] socres = {30,40,50,60,70};
            new Ex2(names,socres).printPassed();
            Thread.sleep(10000);
            System.out.println(6);
            System.exit(0);
        }catch (Exception e){
            System.out.println(0);
            System.exit(-1);
        }
    }
}
