import java.util.List;

public class Pizza extends Product {
    //Small, Medium, Large
    private final String size;
    // stuffed or not
    private boolean stuffedCrust;
    //regular toppings
    private List<Topping> toppings;
    //        private Topping toppings;
    //sauces
//        private List<String> sauces = new ArrayList<>();
    private String sauce;

    //base price of pizza
    private double basePrice;

    //Constructor, sets instance variables
    //Initialize list for toppings,meats, and cheese
    //Calls methods
    public Pizza(String size, String crustType, boolean stuffedCrust, String sauce) {
        this.size = size;
        //thin, regular, thick, cauliflower
        this.stuffedCrust = stuffedCrust;
//            this.toppings = toppings;
        this.sauce = sauce;
        //sets base price based on size
//        basePrice = setBasePrice();
    }

    // base prices according to size
    private void setBasePrice() {
        if (size.equalsIgnoreCase("small")) {
            basePrice = 8.50;
        } else if (size.equalsIgnoreCase("medium")) {
            basePrice = 12.00;
        } else if (size.equalsIgnoreCase("large")) {
            basePrice = 16.50;
        } else {
            basePrice = 0.0;
            System.out.println("Invalid pizza size.");
        }
        if (stuffedCrust) {
            basePrice += 2.00;
        }
    }

    public double calculateTotalPrice() {
        double total = basePrice;
        for (Topping t : toppings) {
            total += t.getPrice(size.equalsIgnoreCase("small") ? "8" :
                    size.equalsIgnoreCase("medium") ? "12" : "16");
        }
        for (Topping t : toppings) {
            total += t.getPrice(size);
        }
        return total;
    }

    public List<Topping> getToppings() {
        return toppings;
    }

    public String getSize() {
        return size;
    }


    public boolean hasStuffedCrust() {
        return stuffedCrust;
    }

    public String getSauce() {
        return sauce;
    }

}
