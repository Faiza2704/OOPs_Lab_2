package PizzaPasta;

public class Customer {

    private int CustomerId;
    private String Name;
    private long PhoneNumber;

    public Customer (int CustomerId, String Name, String PhoneNumber){
        CustomerId = CustomerId;
        Name = Name;
        PhoneNumber = PhoneNumber;
    }

    public int getCustomerId(){
        return CustomerId;
    }

        public long getPhoneNumber(){
        return PhoneNumber;
    }

    public String getName() {
        return Name;
    }

    }
