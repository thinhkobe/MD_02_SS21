package baitap.bai8;

import java.util.concurrent.atomic.AtomicInteger;

public class Main {
    public static void main(String[] args) {
        SharedVariable sharedVariable=new SharedVariable();
        IncreeThread increeThread=new IncreeThread(sharedVariable);
        DecreeThread decreeThread=new DecreeThread(sharedVariable);
        increeThread.start();
        decreeThread.start();
    }
}
