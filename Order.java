package PizzaPasta;

public class Order {

        private int orderId;
        private int customerId;
        private float paymentAmount;
        private boolean orderStatus;

    public Order (int orderId, int customerId, float paymentAmount, boolean orderStatus)
        {
            this.orderId = orderId;
            this.paymentAmount = paymentAmount;
            this.customerId = customerId;
            this.orderStatus = orderStatus;
        }

        public int getCustomerId(){
            return customerId;
        }
    public int getOrderId(){
        return orderId;
    }

        public float getPaymentAmount()
        {
        return paymentAmount;
        }


        public boolean isOrderStatus(boolean b){
            return orderStatus;
        }

}


