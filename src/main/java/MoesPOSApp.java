import java.util.Scanner;

//import static sun.jvm.hotspot.debugger.win32.coff.DebugVC50X86RegisterEnums.BL;

public class MoesPOSApp {
    Scanner scanner = new Scanner(System.in);
    private Order order;
    private Pizza currentPizza;

    public void createorderMenu() {
        boolean running = true;
        int userInput;
        do {
            System.out.println("================================");
            System.out.println("Welcome to Moe's Pizza Parlor!");
            System.out.println("================================");
            System.out.println("1 - New Order");
            System.out.println("2 - Exit Application");
            System.out.println("Enter your choice: ");

            userInput = scanner.nextInt();
            switch (userInput) {
                case 1:
                    createNewOrder();
                    break;
                case 2:
                    System.out.println("Thank you for visiting! Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again!");
            }
            // program keeps running as long as input is not 2
            scanner.nextLine();
        } while (userInput != 2);

    }

    // Order Screen
    private void createNewOrder() {
        int userInput;
        order = new Order(); // resets order
        do {
            System.out.println("================================");
            System.out.println("Order Screen");
            System.out.println("================================");
            System.out.println("What would you like to order?");
            System.out.println("1 - Add Pizza");
            System.out.println("2 - Add Drink");
            System.out.println("3 - Add Garlic Knots");
            System.out.println("4 - Checkout");
            System.out.println("5 - Cancel Order");
            System.out.println("6 - Return to Homepage");
            userInput = scanner.nextInt();
            switch (userInput) {
                case 1:
                    addPizza();
                    break;
                case 2:
                    addDrink();
                    break;
                case 3:
                    addGarlicknots();
                    break;
                case 4:
                    checkOut();
                    break;
                case 5:
                    cancelOrder();
                    break;
                case 6:
                    createorderMenu();
                    break;
                default:
                    System.out.println("Invalid choice. Please try again!");
                    createNewOrder();
            }
            scanner.nextLine();
            // program keeps running as long as input is not 5
        } while (userInput != 5);

    }

    private void addPizza() {
        Scanner scannerPizza = new Scanner(System.in);
        //Pizza Size
        System.out.println("Select Pizza Size: ");
        System.out.println("Options: Small, Medium, Large");
        String pizzaSize = scannerPizza.nextLine();

        if (pizzaSize.equalsIgnoreCase("small")) {
            System.out.println("You've selected an 8in Pizza!");
        } else if (pizzaSize.equalsIgnoreCase("medium")) {
            System.out.println("You've selected a 12in Pizza!");
        } else if (pizzaSize.equalsIgnoreCase("large")) {
            System.out.println("You selected a 16in Pizza!");
        }

        //Pizza Crust Type
        System.out.println("What kind of crust would you like on your pizza?");
        System.out.println("Options: Thin, Thick, Regular, or Cauliflower");
        String pizzaCrust = scannerPizza.nextLine();

        if (pizzaCrust.equalsIgnoreCase("thin")) {
            System.out.println("You've selected Thin crust!");
        } else if (pizzaCrust.equalsIgnoreCase("thick")) {
            System.out.println("You've selected Thick crust!");
        } else if (pizzaCrust.equalsIgnoreCase("regular")) {
            System.out.println("You've selected Regular crust!");
        } else if (pizzaCrust.equalsIgnoreCase("cauliflower")) {
            System.out.println("You've selected Cauliflower crust!");
        }

        // Stuffed Crust Option
        boolean stuffedInput = false;
        System.out.println("Would you like Stuffed Crust? Yes or No");
        String userInput = scannerPizza.nextLine();
        if (userInput.equalsIgnoreCase("yes")) {
            stuffedInput = true;
            System.out.println("You've selected Stuffed Crust!");
        } else if (userInput.equalsIgnoreCase("no")) {
//                stuffedInput = false;
            System.out.println(" No Stuffed Crust!");
        }
        //Add Toppings
        //  List<Topping> pizzaToppings = addToppings();
        // create pizza object
        Topping topping = addToppings();
        // add sauce
        System.out.println("What type of sauce would you like? Marinara, Alfredo, Pesto:");
        String sauceChoice = scannerPizza.nextLine();

        Pizza pizza = new Pizza(pizzaSize, pizzaCrust, stuffedInput, sauceChoice);
        order.addPizza(pizza);
    }

    private Topping addToppings() {
        Scanner scannerTopping = new Scanner(System.in);
        boolean addToppings = true;
        int toppingChoice;

        System.out.println("================================");
        System.out.println("Toppings Menu");
        System.out.println("================================");
        System.out.println("Choose a Topping Category: ");
        System.out.println("1 - Add Meat");
        System.out.println("2 - Add Cheese");
        System.out.println("3 - Add Regular Toppings");
//                System.out.println("4 - Done Adding Toppings");
        toppingChoice = scannerTopping.nextInt();
        scannerTopping.nextLine();

        switch (toppingChoice) {
            case 1:
                String[] meats = {" pepperoni", " sausage", " ham", " bacon", " chicken", " meatball"};

                System.out.println("""
                        1 - pepperoni
                        2 - sausage
                        3 - ham 
                        4 - bacon
                        5 - chicken
                        6 - meatball                      
                        """);
                System.out.println("What kind of Meats would you like to add?");
                String meatChoice = scannerTopping.nextLine();

                String[] chosenTopps = meatChoice.split("\\/");

                for (String c : chosenTopps) {
                    int index = Integer.parseInt(c.trim());

                    if (index >= 1 && index <= 6) {
                        Topping t = new Topping(meats[index - 1], "meat", false);
                        System.out.println("Added" + t.getName());

                        System.out.println("Would you like extra Meat? true or false");
                        boolean userMeatInput = Boolean.parseBoolean(scannerTopping.nextLine());
                        return new Topping(meatChoice, "meat", userMeatInput);
                    }
                }
                break;

            case 2: {
                String[] cheeseToppings = {" mozzarella", " parmesan", " ricotta", " goat cheese", " buffalo cheese"};
                System.out.println("""
                        1 - mozzarella
                        2 - parmesan
                        3 - ricotta 
                        4 - olives
                        5 - goat cheese
                        6 - buffalo cheese
                        """);
                System.out.println("What kind of Cheese would you like to add?");
                String cheeseChoice = scannerTopping.nextLine();
                String[] cheeseChosenTopps = cheeseChoice.split("\\/");
                for (String c : cheeseChosenTopps) {
                    int index = Integer.parseInt(c.trim());
                    if (index >= 1 && index <= 6) {
                        Topping t = new Topping(cheeseToppings[index - 1], "Regular", false);
                        System.out.println("Added" + t.getName());
                    }
                }
                break;
            }
            case 3:

                String[] veggies = {" onions", " mushrooms", " bell peppers", " olives", " tomatoes", " spinach", " basil ", " pineapples ", " achovies"};

                System.out.println("""
                        1 - onions
                        2 - mushrooms
                        3 - bell peppers 
                        4 - olives
                        5 - tomatoes
                        6 - spinach
                        7 - basil
                        8 - pineapples
                        9 - achovies
                        """);
                System.out.println("What kind of Regular Toppings would you like to add?");
                String veggiesChoice = scannerTopping.nextLine();
                String[] chosenveggieTopps = veggiesChoice.split("\\/");
                for (String v : chosenveggieTopps) {
                    int index = Integer.parseInt(v.trim());
                    if (index >= 1 && index <= 9) {
                        Topping t = new Topping(veggies[index - 1], "Regular", false);
                        System.out.println("Added" + t.getName());

                        System.out.println("Would you like extra Toppings? true or false");
                        boolean userVeggiesInput = Boolean.parseBoolean(scannerTopping.nextLine());
                        return new Topping(veggiesChoice, "veggies", userVeggiesInput);
                    }
                }
                System.out.println("Invalid choice. Please Try Again!");
                break;
        } return null;
        }



// Add a drink to the current order
private void addDrink() {
    System.out.println("================================");
    System.out.println("Drinks Menu");
    System.out.println("================================");
    System.out.println("1 - Coke");
    System.out.println("2 - Sprite");
    System.out.println("3 - Lemonade");
    System.out.println("4 - Water");
    System.out.println("Enter your choice:");

    int drinkChoice = scanner.nextInt();
    scanner.nextLine(); // clear buffer

    String drinkName;
    double price;

    switch (drinkChoice) {
        case 1: {
            drinkName = "Coke";
            price = 1.50;
        }
        case 2: {
            drinkName = "Sprite";
            price = 1.50;
        }
        case 3: {
            drinkName = "Lemonade";
            price = 2.00;
        }
        case 4: {
            drinkName = "Water";
            price = 1.00;
        }
        default: {
            System.out.println("Invalid choice.");
            return;
        }
    }

//        Drink drink = new Drink(); // assuming DrinkItem extends Product
//        System.out.println(drinkName + " added to your order!");
}

// Add Garlic Knots to the current order
private void addGarlicknots() {
    System.out.println("================================");
    System.out.println("Garlic Knots");
    System.out.println("================================");
    System.out.println("How many Garlic Knots would you like to add?");
    int quantity = scanner.nextInt();
    scanner.nextLine();

    if (quantity <= 0) {
        System.out.println("Invalid quantity.");

    }

    GarlicKnot knots = new GarlicKnot(quantity);
    System.out.println(quantity + " Garlic Knots added to your order!");
}

// Checkout: display the order summary and total
private void checkOut() {
    System.out.println("================================");
    System.out.println("Checkout");
    System.out.println("================================");

    if (order.isEmpty()) {
        System.out.println("Your order is empty!");
        return;
    }

    order.printReceipt(); // assuming Order has printReceipt method
    System.out.println("Thank you for your order!");
    order = new Order(); // reset order after checkout
}

// Cancel the current order
private void cancelOrder() {
    System.out.println("Are you sure you want to cancel the order? Yes/No");
    String input = scanner.nextLine();

    if (input.equalsIgnoreCase("yes")) {
        order = new Order(); // reset order
        System.out.println("Order canceled!");
    } else {
        System.out.println("Continuing current order.");
    }
}
}
