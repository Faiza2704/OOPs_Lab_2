    package PizzaPasta;

import java.lang.Thread;

public class Kitchen {

    private int orderId;
    private int timeToPrepare;

    public Kitchen(int orderId, int timeToPrepare) {
        this.orderId = orderId;
        this.timeToPrepare = timeToPrepare;
    }

    public boolean notification() {
        cooking();
        System.out.println("Order no: " + this.orderId + " is ready!");
        return true;
    }

    public void cooking() {

        Thread CookingTime = new Thread();
        try {
            CookingTime.sleep(this.timeToPrepare);
        } catch(InterruptedException e) {
            e.printStackTrace();
        }

    }
}
