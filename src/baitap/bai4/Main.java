package baitap.bai4;

public class Main {
    public static void main(String[] args) {
            NumberGenerator generator1 = new NumberGenerator("luong 1");
            NumberGenerator generator2 = new NumberGenerator("luong 2");

            Thread thread1 = new Thread(generator1);
            Thread thread2 = new Thread(generator2);

            // Thay đổi priority của các thread
            thread1.setPriority(Thread.MIN_PRIORITY);
            thread2.setPriority(Thread.MAX_PRIORITY);

            // Khởi động các thread
            thread1.start();
            thread2.start();
        }
}
