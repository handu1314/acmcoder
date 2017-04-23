package acmcoder;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @Author:hanxiao
 * @Description:
 * @Modified By:
 * Created by Administrator on 2017/4/18.
 */
public class EX3 {
    static AtomicInteger item = new AtomicInteger();
    static class producer extends Thread{
        @Override
        public void run() {
            try {
                Thread.sleep(1000);
                item = new AtomicInteger(1);
                System.out.print(item.get());
                synchronized (item){
                    item.notify();
                }
            } catch (Exception e) {
                System.out.print(2);
                System.exit(-1);
            }
        }
    }
    static class consumer extends Thread{
        @Override
        public void run() {
            try{
                synchronized (item){
                    item.wait();
                }
                System.out.print(item.get() + 3);
            }catch (Exception e){
                System.out.print(4);
                System.exit(-1);
            }
        }
    }

    public static void main(String[] args) {
        try {
            new producer().start();
            new consumer().start();
            Thread.sleep(10000);
            System.out.print(5);
            System.exit(0);
        }catch (Exception e){
            System.out.println(6);
            System.exit(-1);
        }
    }
}
