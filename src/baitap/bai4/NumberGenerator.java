package baitap.bai4;

public class NumberGenerator implements Runnable{
    String a;
    public NumberGenerator(String a) {
        this.a=a;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Number: " + i + ", Thread ID: " + Thread.currentThread().getId() +
                    ", HashCode: " + this.hashCode()+a);

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
