package baitap.bai3;

public class Main {
    public static void main(String[] args) {
        Runnable thread1=()->{
            for (int i = 0; i < 100; i++) {
                if (i%2==0){
                    System.out.println("so chan"+i);
                }
            }
        };
        Runnable thread2=()->{
            for (int i = 0; i < 100; i++) {
                if (i%2!=0){
                    System.out.println("so le"+i);
                }
            }
        };
        Thread thread=new Thread(thread2);
        thread1.run();
        thread.start();
        thread2.run();
    }
}
