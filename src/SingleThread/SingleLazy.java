package SingleThread;

/***
 * 懒汉式
 * 模拟多线程执行，看懒汉式线程安全的问题
 * 输出结果是多个实例都会创造多个实例，线程安全性问题
 */
public class SingleLazy {

    private SingleLazy(){};

    private static SingleLazy instance = null;

    /***
     * 双重检查加锁
     * @return
     */
    public static SingleLazy getInstance(){
        //非原子性操作 通过synchronized关键字对代码块进行加锁
        if(instance ==null){
            synchronized (SingleLazy.class) {
                if(instance == null)
                    instance = new SingleLazy();
            }
        }
        return  instance;
    }
}
