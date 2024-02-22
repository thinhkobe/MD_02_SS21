package baitap.bai8;

public class DecreeThread extends Thread{
    private SharedVariable sharedVariable;

    public DecreeThread(SharedVariable sharedVariable) {
        this.sharedVariable = sharedVariable;
    }
    @Override
    public void run() {
        while (true) {
            sharedVariable.decrement();
            System.out.println("decrement: " + sharedVariable.getVariable());
            try {
                Thread.sleep(1000); // Sleep for a short period
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
