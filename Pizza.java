package PizzaPasta;

public class Pizza implements Entity {

    enum Size {Small, Medium, Large}

    enum Flavour {Vegetarian, Non_Veg, Vegan}

    enum Topping {Cheese, Mushroom, Tomato, Jalapeno, Spanish}

    enum Crust {Thin, Thick}

    private int OrderId;
    private Crust crust;
    private Size size;
    private Flavour flavour;
    private Topping topping;

    //  Choosing each element

    Pizza() {

    }

    public Pizza(int crust, int size, int flavour, int topping) {
        if (crust == 1) {
            this.crust = Crust.Thin;
        } else if (crust == 2) {
            this.crust = Crust.Thick;
        }

        if (flavour == 1) {
            this.flavour = Flavour.Non_Veg;
        } else if (flavour == 2) {
            this.flavour = Flavour.Vegetarian;
        } else if (flavour == 3) {
            this.flavour = Flavour.Vegan;
        }

        if (size == 1) {
            this.size = Size.Large;
        } else if (size == 2) {
            this.size = Size.Medium;
        } else if (size == 3) {
            this.size = Size.Small;
        }

        if (topping == 1) {
            this.topping = Topping.Cheese;
        } else if (topping == 2) {
            this.topping = Topping.Mushroom;
        } else if (topping == 3) {
            this.topping = Topping.Tomato;
        } else if (topping == 4) {
            this.topping = Topping.Jalapeno;
        } else if (topping == 5) {
            this.topping = Topping.Spanish;
        }
    }
        // Size & Flavour Amount

        private float sizeFlavourAmount() {
        float amount = 0.0f;

        if (this.flavour == Flavour.Vegan) {
            if (this.size == Size.Small) {
                amount = 15f;
            } else if (this.size == Size.Medium) {
                amount = 30f;
            } else if (this.size == Size.Large) {
                amount = 45f;
            }
        }

        else if (this.flavour == Flavour.Non_Veg) {
            if (this.size == Size.Small) {
                amount = 25f;
            } else if (this.size == Size.Medium) {
                amount = 50f;
            } else if (this.size == Size.Large) {
                amount = 75f;
            }
        }
        else if (this.flavour == Flavour.Vegan) {
            if (this.size == Size.Small) {
                amount = 20f;
            } else if (this.size == Size.Medium) {
                amount = 40f;
            } else if (this.size == Size.Large) {
                amount = 60f;
            }
        }
            return amount;

    }

        // If toppings will be included

        private float toppingAmount(){
        float amount = 0.0f;
            if(this.topping == Topping.Cheese)
            {
                amount = 30f;
            }
            else if (this.topping == Topping.Mushroom)
            {
                amount = 20f;
            }
            else if (this.topping == Topping.Tomato)
            {
                amount = 8f;
            }
            else if (this.topping == Topping.Jalapeno)
            {
                amount = 10f;
            }
            else if (this.topping == Topping.Spanish)
            {
                amount = 15f;
            }
            return amount;
        }

        @Override

                public float Pricing()
        {
            float totalAmount = 0.0f;
            totalAmount = totalAmount + sizeFlavourAmount();
            totalAmount = totalAmount + toppingAmount();
            return totalAmount;
        }

        @Override
    public void DisplayCustomerOrder() {
            System.out.println("");
    }


        @Override
                public void displayList(){
            System.out.println("*The Pizza Menu is Here*");
            System.out.println("The Crusts are as follows:");
            System.out.println(java.util.Arrays.asList(Crust.values())+"n");
            System.out.println("The Flavour are as follows:");
            System.out.println(java.util.Arrays.asList(Flavour.values())+"n");
            System.out.println("The Topping are as follows:");
            System.out.println(java.util.Arrays.asList(Topping.values())+"n");
            System.out.println("The Size are as follows:");
            System.out.println(java.util.Arrays.asList(Size.values())+"n");
        }
    }