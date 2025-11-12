import java.util.Scanner;

 class MainApp {

    public static void main(String[] args) {
        mainMenu();
    }

    // shows users home screen options until they press X to exit
    public static void mainMenu() {
        Scanner scanner = new Scanner(System.in);
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
//                 createorderMenu(scanner);
                    break;
                case 2:
                    System.out.println("Thank you for visiting! Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again!");
            }
            // program keeps running as long as input is not 2
        } while (userInput != 2);

        scanner.close();
    }
}






//        System.out.println("Would you like to add a drink?");
//
//    System.out.println("Select drink size: Small, Medium, Large");
//        System.out.println("""
//                1.Small
//                2.Medium
//                3.large""");
//    int selectedSize = scanner.nextInt();
//    String  size = "";
//    switch (selectedSize){
//        case 1:
//            size ="small";
//            break;
//        case 2:
//            size ="medium";
//            break;
//        case 3:
//            size ="large";
//            break;
//    }
//
//    System.out.println("Select drink flavor: 1.Pepsi, 2.Sprite, 3.Orange");
//        int selectedFlavor = scanner.nextInt();
//        String  flavor = "";
//        switch (selectedFlavor){
//            case 1:
//                flavor ="Pepsi";
//                break;
//            case 2:
//                flavor ="Sprite";
//                break;
//            case 3:
//                flavor ="Orange";
//                break;
//        }
//
//       // String selectedFlavor = scanner.nextLine();
//Drink drink = new Drink(size,flavor);
//        System.out.println("Drink added successfully!");
//    }
//}
