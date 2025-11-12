import java.util.ArrayList;
import java.util.List;

public class Pizza extends Product {
    //8", 12", or 16"
    private final int size;
    // stuffed or not
    private boolean stuffedCrust;
    //regular toppings
    private List<Topping> toppings;
    //sauces
    private List<String> sauces = new ArrayList<>();
    //base price of pizza
    private double basePrice;


    //Constructor, sets instance variables
    //Initialize list for toppings,meats, and cheese
    //Calls methods
    public Pizza(int size, String crustType, boolean stuffedCrust) {
        this.size = size;
        //thin, regular, thick, cauliflower
        this.stuffedCrust = stuffedCrust;
        this.toppings = new ArrayList<>();
        this.sauces = new ArrayList<>();
        //sets base price based on size
        setBasePrice();
    }

    // base prices according to size
    private void setBasePrice() {
        if (size == 8) {
            basePrice = 8.50;
        } else if (size == 12) {
            basePrice = 12.00;
        } else if (size == 16) {
            basePrice = 16.50;
        } else {
            basePrice = 0.0;
            System.out.println("Invalid pizza size.");
        }
//        if (stuffedCrust) {
//            basePrice += 2.00;
//        }
//    }
    }

    // adds a topping to the pizza
    public void addTopping(Topping topping) {
        topping.add(topping);
    }

    //adds a sauce to the pizza
    public void addSauce(String sauce) {
        sauces.add(sauce);
    }

    // calculates total price for pizza and gets method from product class
    @Override
    public double getPrice() {
        double total = basePrice;
        return total;
    }

    // add toppings price
    private double getToppingCost(Topping topping){
        String category = topping.getCategory().toLowerCase();
        boolean extra = topping.isExtra();
        // stores base price of toppings
        double cost = 0.0;
        // stores additional cost if its extra
        double extraCost = 0.0;


        if ( category.equalsIgnoreCase("Steak") || category.equalsIgnoreCase("Ham")) {


//        switch (category) {
//            case "Meat":
//                switch (size) {
//                    case"8":
//                        cost = 1.00;
//                        extraCost = 0.50;
//                        break;
                }


        return 0;
        }

}


