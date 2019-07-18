package SingleThread;
/**
 * 单例模式
 * 饿汉式  没有线程安全*/
public class SingleThread {
    //私有化构造方法
    private SingleThread(){};

    //不管用没用。就已经实例化了
    private static SingleThread instance = new SingleThread();

    public static SingleThread getInstance(){
        return instance;
    }



}
