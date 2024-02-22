package baitap.bai1;

public class Main {
    public static void main(String[] args) {
        Mythread mythread=new Mythread();
        mythread.start();
        Runnable thread1=()->{
            System.out.println("aaa");
        };
       thread1.run();
    }
}
