package baitap.bai8;

public class IncreeThread extends Thread{
    private SharedVariable sharedVariable;

    public IncreeThread(SharedVariable sharedVariable) {
        this.sharedVariable = sharedVariable;
    }
    @Override
    public void run() {
        while (true) {
            sharedVariable.increment();
            System.out.println("Incremented: " + sharedVariable.getVariable());
            try {
                Thread.sleep(1000); // Sleep for a short period
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
