package baitap.bai2;

public class Mythread2 implements Runnable{
    @Override
    public void run() {
        int total = 0;
        for (int i = 1; i < 100; i++) {
            total+=i;
        }
        System.out.println("tổng"+total);
    }
}
