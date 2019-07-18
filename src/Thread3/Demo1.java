package Thread3;

import java.util.concurrent.atomic.AtomicInteger;

/***
 * 使用原子类实现数字序列生成器AtomicInteger
 * 对数值转换成原子性操作，不存在原子性问题
 */
public class Demo1 {

    //原子类封装
    private AtomicInteger value = new AtomicInteger(0);

    //value++
    public int getNext(){
        return value.getAndIncrement();
    }

    public static void main(String[] args) {
        Demo1 de = new Demo1();
        new Thread(new Runnable() {
            @Override
            public void run() {
                while (true){
                    System.out.println(Thread.currentThread().getName()+":"+de.getNext());
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }}
            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    System.out.println(Thread.currentThread().getName() + ":" + de.getNext());
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }}
        }).start();
    }
}
