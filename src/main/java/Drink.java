import java.util.Scanner;

public class Drink extends Product {
    private String size;
    private String flavor;


    public Drink(String size, String flavor){
        this.size = size;
        this.flavor = flavor;
    }
    public String getSize() {
        return size;
    }

    public String getFlavor() {
        return flavor;
    }

    // overriding method from product class
    //calculates the price of the drink
    @Override
    public double getPrice() {
        // stores the price of the drink
        double price;

        if ( size.equalsIgnoreCase("Small")) {
            price = 2.00;
        } else if (size.equalsIgnoreCase("Medium")) {
            price = 2.50;
        } else if (size.equalsIgnoreCase("Large")) {
            price = 3.00;
        } else {
            price = 0.0;
            System.out.println("Invalid size");
        }

        return price;
    }


@Override
public String toString() {
    return "Drink{" + "size"+getSize() + '\'' + ", flavor=" +getFlavor()+ '\'' + '}';
}
}
//    Scanner scanner = new Scanner(System.in);
//
//    System.out.println("Select drink size: Small, Medium, Large");
//    String selectedSize = scanner.nextLine();
//
//    System.out.println("Select drink flavor: Pepsi, Sprite, Orange");
//    String selectedFlavor = scanner.nextLine();
//
//    return new Drink(selectedSize,selectedFlavor);
//}