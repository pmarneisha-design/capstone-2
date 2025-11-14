public class Topping {
    private String name;
    private String type;
    private boolean extra;

    public Topping(String name, String type, boolean extra) {
        super();
        this.name = name;
        this.type = type;
        this.extra = extra;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public boolean isExtra() {
        return extra;
    }

    public double getPrice(String size) {
        double price = 0.0;

        // Meat toppings
        if (type.equalsIgnoreCase("Meat")) {
            if (size.equals("8")) price = 1.00;
            else if (size.equals("12")) price = 2.00;
            else if (size.equals("16")) price = 3.00;

            if (extra) {
                if (size.equals("8")) price += 0.50;
                else if (size.equals("12")) price += 1.00;
                else if (size.equals("16")) price += 1.50;
            }
        }

        // Cheese toppings
        else if (type.equalsIgnoreCase("Cheese")) {
            if (size.equals("8") || size.equals("12") || size.equals("16")) {
                if (size.equals("8")) price = 0.75;
                else if (size.equals("12")) price = 1.50;
                else if (size.equals("16")) price = 2.25;
            }

            if (extra) {
                if (size.equals("8") || size.equals("12") || size.equals("16")) {
                    if (size.equals("8")) price += 0.30;
                    else if (size.equals("12")) price += 0.60;
                    else if (size.equals("16")) price += 0.90;
                }
            }
        }

        // Regular toppings are included
        else if (type.equalsIgnoreCase("Regular Topping")) {
            price = 0.0;
        }

        return price;
    }
}