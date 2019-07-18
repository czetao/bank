package ThreadSuoAgain;

/***
 * 锁重入的例子
 * 从a方法中可以进入有synchronized关键字的b方法
 */
public class Demo1 {

    public synchronized void a(){
        System.out.println("a");
    }

    public synchronized void b(){
        System.out.println("b");
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Demo1 d = new Demo1();
        new Thread(new Runnable() {
            @Override
            public void run() {
                d.a();
            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                d.b();
            }
        }).start();
    }
}
