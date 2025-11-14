# 🍕 Moe’s Pizza Parlor 

#### A POS application designed to mimic an actual ordering system in a pizza restaurant. The goal of this project was to practice Java fundamentals, object-oriented programming, file handling, conditional logic, and user-driven menus.


### Project Goals:
* Practice Object-Oriented Programming (OOP)

* Understand how classes communicate and depend on each other

* Learn menu-driven programs using loops and switch statements

* Use methods to organize code and reduce duplication

* Build a system using realistic restaurant logic

###  Users can:

* Start a new order

* Add pizzas, drinks, and sides

* Customize pizza size, crust type, and toppings

* Add extra meats or extra cheese

* View total price

* Checkout and generate a receipt

* Cancel or restart orders

## MoesPOSApp (Userinterface)

**This is the “brain” of the entire system.**

### Responsibilities:

* Displays the Home Screen

* Runs the main program loop

* Contains menus the user interacts with

* Calls the methods to add pizzas, drinks, sides

* Sends items into the Order class

* Handles checkout and canceling an order

* This class controls the flow of the program.

 ### Interesting Lines of Code 

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


### Explanation:
#### First Version-

* The user can only pick ONE meat topping at a time.

* The user types letters (P, S, H, etc.).

* You immediately create one Topping object and return it.

* There is no loop, no ability to select multiple toppings.

* Works well for simple input but not scalable.
#### Second Version-
* Supports multiple toppings in ONE input.

* Uses indexes, which makes input cleaner and easier to validate.

* You can loop through all selections and create multiple topping objects.

* This is much more like what a real pizza order system would do.



 
### Challenges I Faced/ What I Learned:

#### Planning the Project Structure:

* What screens I needed

* What menus the customer would see

* How the user flows through the system

* What classes I should create

* How data should be passed between methods

* This required sketching diagrams and rewriting the structure multiple times.

#### Understanding How Classes Connect:

* How the Order class talks to the Pizza class

* How objects are passed into lists

* How the main POS class manages screens

* Why certain methods must be public vs private

* How one menu method calls another

* Getting the logic to flow smoothly was one of the biggest learning experiences.