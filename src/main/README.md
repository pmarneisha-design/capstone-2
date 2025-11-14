//     case 1:
//                System.out.println("""
//                        P - pepperoni
//                        S - sausage
//                        H - ham
//                        B - bacon
//                        C - chicken
//                        M - meatball
//                        """);
//                System.out.println("What kind of Meat would you like to add?");
//                String meatChoice = scannerTopping.nextLine();
//                System.out.println("Would you like extra Meat? true or false");
//                boolean userMeatInput = Boolean.parseBoolean(scannerTopping.nextLine());
//                return new Topping(meatChoice, "meat", userMeatInput);

//switch (toppingChoice) {
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