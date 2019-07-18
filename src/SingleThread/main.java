package SingleThread;

public class main {

    public static void main(String[] args) {
        SingleLazy s1 = SingleLazy.getInstance();
        SingleLazy s2 = SingleLazy.getInstance();
        SingleLazy s3 = SingleLazy.getInstance();
        SingleLazy s4 = SingleLazy.getInstance();

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);
    }
}
