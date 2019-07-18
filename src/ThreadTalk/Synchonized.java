package ThreadTalk;

/**
 * 线程通信wait/notify，通过synchronize关键字实现同步，以此输出1212
 * wait 从
 */

class pirnt {
    private boolean a=true;
    synchronized public void printA(){
        while(!a) {

            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("1");
        a = false;
        //方法执行完，释放锁，线程2从同步队列中取得锁，获得调度
        this.notify();
    }
    synchronized public void printB(){
        while(a){
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("2");
        a= true;
        this.notify();
    }
}
public class Synchonized {


    public static void main(String[] args) {
        pirnt p = new pirnt();
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i=0;i<5;i++) {
                    p.printA();

                }
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i=0;i<5;i++) {
                    p.printB();
                }
            }
        }).start();
    }
}
