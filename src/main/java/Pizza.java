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
        public Pizza(String size, String crustType, boolean stuffedCrust,  String sauce) {
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

//    public String getCrustType() {
//        return crustType;
//    }

    public boolean hasStuffedCrust() {
        return stuffedCrust;
    }

    public String getSauce() {
        return sauce;
    }
}
//addToppings() method in M
//        return total;
//    }

    // adds a topping to the pizza
//        public void addTopping(Topping topping) {
//            toppings.add(topping);
//        }

        //adds a sauce to the pizza
//        public void addSauce(String sauce) {
//            sauces.add(sauce);
//        }

////    // calculates total price for pizza and gets method from product class
//@Override
//    public double getPrice() {
//        double total = basePrice;
//        return total;
//
//    // add toppings price
//    private double getToppingCost(Topping topping) {
//        String category = topping.getName().equ1
//        alsIgnoreCase();
//        boolean extra = topping.isExtra();
//        // stores base price of toppings
//        double cost = 0.0;
//        // stores additional cost if its extra
//        double extraCost = 0.0;
//
//
//        if (category.equalsIgnoreCase("Steak") || category.equalsIgnoreCase("Ham")) {
//
//
////        switch (category) {
////            case "Meat":
////                switch (size) {
////                    case"8":
////                        cost = 1.00;
////                        extraCost = 0.50;
////                        break;
//        }
//
//
//        return 0;
//    }
//
//    private String pizzaTopping(String toppings) {
//        //Meat
//        if (toppings.equalsIgnoreCase("pepperoni") ||
//                toppings.equalsIgnoreCase("sausage") ||
//                toppings.equalsIgnoreCase("ham") ||
//                toppings.equalsIgnoreCase("bacon") ||
//                toppings.equalsIgnoreCase("chicken") ||
//                toppings.equalsIgnoreCase("meatball")) {
//            return "Meat";
//        }
//        //Cheese
//        else if (toppings.equalsIgnoreCase("mozzarella") ||
//                toppings.equalsIgnoreCase("parmesan") ||
//                toppings.equalsIgnoreCase("ricotta") ||
//                toppings.equalsIgnoreCase("goat cheese") ||
//                toppings.equalsIgnoreCase("buffalo cheese")) {
//            return "Cheese";
//            // Regular Toppings
//        } else if (toppings.equalsIgnoreCase("onions") ||
//                toppings.equalsIgnoreCase("mushrooms") ||
//                toppings.equalsIgnoreCase("bell peppers") ||
//                toppings.equalsIgnoreCase("olives") ||
//                toppings.equalsIgnoreCase("tomatoes") ||
//                toppings.equalsIgnoreCase("spinach") ||
//                toppings.equalsIgnoreCase("basil") ||
//                toppings.equalsIgnoreCase("pineapple") ||
//                toppings.equalsIgnoreCase("anchovies")) {
//            return "Regular Toppings";
//            //Sauce
//        } else if (toppings.equalsIgnoreCase("marinara") ||
//                toppings.equalsIgnoreCase("alfredo") ||
//                toppings.equalsIgnoreCase("pesto") ||
//                toppings.equalsIgnoreCase("bbq") ||
//                toppings.equalsIgnoreCase("buffalo sauce") ||
//                toppings.equalsIgnoreCase("olive oil")) {
//            return "Sauce";
//        }
//        // Sides
//        else if (toppings.equalsIgnoreCase("red pepper") ||
//                toppings.equalsIgnoreCase("side parmesan")) {
//            return "Sides";
//        }
//        return toppings;
//    }

