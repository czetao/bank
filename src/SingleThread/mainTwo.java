package SingleThread;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/***
 * 模拟多线程执行，看懒汉式线程安全的问题
 * 输出结果是多个实例都会创造多个实例，线程安全性问题
 */
public class mainTwo {
    public static void main(String[] args) {


    //创立线程池
    ExecutorService ex = Executors.newFixedThreadPool(20);

    for(int i=0;i<20;i++){
        ex.execute(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName()+":"+SingleLazy.getInstance());
            }
        });
    }

    ex.shutdown();
    }

}
