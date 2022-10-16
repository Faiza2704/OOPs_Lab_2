import PizzaPasta.*;

import java.util.*;

public class PizzaPastaDriver {
    static int globalCustomerId = 1;
    static int globalOrderId = 1;
    static List<Customer> customerList = new ArrayList<>();
    static List<Order> orderList = new ArrayList<>();

    static float takePizzaInputs() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your choice of Crust:  ");
        System.out.println("1. Thin 2. Thick");
        int choiceOfCrust = sc.nextInt();

        System.out.println("Enter your choice of Flavour:  ");
        System.out.println("1. Vegetarian\t 2. Non-Vegetarian\t 3. Vegan");
        int choiceOfFlavour = sc.nextInt();

        System.out.println("Enter your choice of Toppings:  ");
        System.out.println("1. Cheese   2. Mushroom    3. Tomato   4. Jalapeno   5.Spinach");
        int choiceOfTopping = sc.nextInt();

        System.out.println("Enter your choice of Sizes:  ");
        System.out.println("1. Large 2. Medium 3. Small");
        int choiceOfSize = sc.nextInt();

        Pizza p = new Pizza(choiceOfCrust, choiceOfFlavour, choiceOfTopping, choiceOfSize);
            return p.Pricing();
        }
        static float takePastaInputs() {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter your the Type of Pasta:  ");
            System.out.println("1. Penne 2. Ditalian");
            int choiceOfTypes = sc.nextInt();

            System.out.println("Enter your choice of Flavour:  ");
            System.out.println("1. White Sauce \t 2. Red Sauce");
            int choiceOfFlavour = sc.nextInt();

            Pasta p = new Pasta(choiceOfTypes, choiceOfFlavour);
            return p.Pricing();
        }

        static int getCustomerDetails() {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter Customer details below: ");
            System.out.println("Enter Phone Number: ");
            String choicePhoneNumber = sc.next();
//            if (!customerList.isEmpty()) {

            for (Customer c : customerList) {
                if (Objects.equals(c.getPhoneNumber(), choicePhoneNumber)) {
                    return c.getCustomerId();
                }
            }

//        }
            System.out.println("Enter the name of customer: ");
            String choiceName = sc.next();
            Customer c = new Customer(globalCustomerId++, choiceName, choicePhoneNumber);
            customerList.add(c);
            return globalCustomerId - 1;
        }


    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        for (;;)
        {
            boolean flag = true;
            float totalAmount = 0.0f;
            int timeInMinutes = 0;

            while (flag)
            {
                Menu.menuList();
                System.out.println("Would you like to order?");
                char ordering = sc.next().charAt(0);
                if(ordering == 'y' || ordering == 'Y')
                {
//                    System.out.println("would you like to order");
                    System.out.println("Choose '1' for Pizza and '2' for Pasta\n");
                    int temp = sc.nextInt();
                    if(temp == 1) {
                        totalAmount = totalAmount + takePizzaInputs();
                        timeInMinutes = timeInMinutes + 20;
                    }
                    else {
                        totalAmount = totalAmount + takePastaInputs();
                        timeInMinutes = timeInMinutes + 15;
                    }
                }

                System.out.println("Do you want to order another item?\nType y/n as per your choice.");
                char anotherOrder = sc.next().charAt(0);
                if(anotherOrder == 'n' || anotherOrder == 'N') {
                    int customerID = getCustomerDetails();
                    orderList.add(
                            new Order (globalOrderId++, customerID, totalAmount, false)
                    );
                    Kitchen pre = new Kitchen(globalOrderId - 1, timeInMinutes);
                    if(pre.notification()) {
                        int cust = 0;
                        System.out.println("\n\n***************************");
						System.out.println("The Order No. "+(globalOrderId-1)+" is ready.");
                        for(Order o: orderList) {
                            if(o.getOrderId() == globalOrderId - 1) {
                                cust = o.getCustomerId();
                                o.isOrderStatus(true);
                            }
                        }
                        for(Customer c: customerList) {
                            if(c.getCustomerId() == cust) {
                                System.out.println("Customer Name: "+c.getName());
                                                            }
                        }
                        System.out.println("\n Total Amount: "+totalAmount);
                        System.out.println("Procced to payment....");
                        System.out.println("Payment done!!");

                    }
                    System.out.println("Enter key 'Z' to end the pizza orders for the day!!!");

                }
            }

            System.out.println("Ending the process....");
            System.exit(0);
        }

    }
    }
