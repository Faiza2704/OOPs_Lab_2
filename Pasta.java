package PizzaPasta;

import java.util.Scanner;
public class Pasta implements Entity {

    enum Types{Penne, Ditalini}
    enum Flavour { RedSauce, WhiteSauce}

    private Flavour flavour;
    private Types types;
///
//Pasta(){
//
//}
public Pasta(int types, int flavour) {
    switch (types) {
        case 1:
            this.types = Types.Penne;
            break;
        case 2:
            this.types = Types.Ditalini;
            break;
    }
    switch (flavour) {
        case 1:
            this.flavour = Flavour.RedSauce;
            break;
        case 2:
            this.flavour = Flavour.WhiteSauce;
            break;
    }
}

@Override
    public float Pricing(){
    float amount = 0.0f;
    if (this.flavour == Flavour.RedSauce){
        if (this.types == Types.Penne){
            amount = 80f;
        }
        else if (this.types == Types.Ditalini) {
            amount = 120f;
        }
    }
    if (this.flavour == Flavour.WhiteSauce)
    {
        if (this.types == Types.Penne){
            amount = 100f;
        }
        else if (this.types == Types.Ditalini) {
            amount = 150f;
        }
    }
    return amount;
}

@Override
    public void DisplayCustomerOrder() {
    System.out.println("");
}


    @Override
    public void displayList(){
    System.out.println("*The Pasta Menu is Here*");
    System.out.println  ("Types are as follows:");
    System.out.println(java.util.Arrays.asList(types.values())+"n");
    System.out.println("Flavour are as follows:");
    System.out.println(java.util.Arrays.asList(flavour.values())+"n");
        System.out.println(java.util.Arrays.asList(Pizza.Size.values())+"n");
}

}
