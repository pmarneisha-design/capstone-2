public class Topping {
    private String name;
    private String type;
    private boolean extra;

    public Topping(String name, String type, boolean extra){
        super();
        this.name = name;
        this.type = type;
        this.extra = extra;
    }

    public String getName(){
        return name;
    }

    public String getType(){
        return type;
    }

    public boolean isExtra(){
        return extra;
    }

//  if ( name.equalsIgnoreCase("Meat")) {
//      if (size.equals("8"))  price = 1.00;
//     else if (size.equals("12")) price = 2.00;
//      else if (size.equals("16")) price = 3.00;
//       if (extra) price += (size.equals("8")) ? 0.50 :
////    public void add(Topping topping) {
////    }

}
