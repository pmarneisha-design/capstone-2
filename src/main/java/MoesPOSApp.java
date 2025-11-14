import java.util.Scanner;

public class MoesPOSApp {
    Scanner scanner = new Scanner(System.in);
    private Order order;

//    public MoesPOSApp() {
//        this.order = new Order();
//    }

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
//                case 2:
//                   addDrink();
//                    break;
//                case 3:
//                   addGarlicknots();
//                    break;
//                case 4:
//                    checkOut();
//                    break;
//                case 5:
//                    cancelOrder();
//                    break;
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
        //} else {
//            System.out.println("Invalid choice. Please try again!");
//            return;
//        }
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
//        } else {
//            System.out.println("Invalid choice. Please try again!");
//        }
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
//        } else {
//            System.out.println("Invalid choice. Please type Yes or No.");

            // create pizza object
//                addToppings(pizza);
            Topping topping = addToppings();
            // add sauce
            System.out.println("What type of sauce would you like? Marinara, Alfredo, Pesto:");
            String sauceChoice = scannerPizza.nextLine();

            PizzaItem pizza = new PizzaItem(pizzaSize, pizzaCrust, stuffedInput, topping, sauceChoice);
            order.addPizza(pizza);
        }

    private Topping addToppings() {
        Scanner scannerTopping = new Scanner(System.in);
        boolean addToppings = true;
        int toppingChoice;
//            do {
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
                System.out.println("""
                        P - pepperoni
                        S - sausage
                        H - ham 
                        B - bacon
                        C - chicken
                        M - meatball
                        """);
                System.out.println("What kind of Meat would you like to add?");
                String meatChoice = scannerTopping.nextLine();
                System.out.println("Would you like extra Meat? true or false");
                boolean userMeatInput = Boolean.parseBoolean(scannerTopping.nextLine());
                return new Topping(meatChoice, "meat", userMeatInput);
            case 2:
                System.out.println("""
                        M - mozzarella
                        P - parmesan
                        R - ricotta 
                        G - goat cheese
                        B - buffalo
                        """);
                System.out.println("What kind of Cheese would you like to add?");
                String cheeseChoice = scannerTopping.nextLine();
                System.out.println("Would you like extra Cheese? true or false");
                boolean userCheeseInput = Boolean.parseBoolean(scannerTopping.nextLine());
                return new Topping(cheeseChoice, "cheese", userCheeseInput);
            case 3:
                System.out.println("""
                        O - onions
                        M - mushrooms
                        B - bell peppers 
                        OV - olives
                        T - tomatoes
                        S - spinach
                        BL - basil
                        P - pineapples
                        A - achovies
                        """);
                System.out.println("What kind of Regular Toppings would you like to add?");
                String veggiesChoice = scannerTopping.nextLine();
                System.out.println("Would you like extra Toppings? true or false");
                boolean userVeggiesInput = Boolean.parseBoolean(scannerTopping.nextLine());
                return new Topping(veggiesChoice, "meat", userVeggiesInput);
        }
        return null;
    }
}
