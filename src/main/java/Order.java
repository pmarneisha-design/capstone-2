import java.util.ArrayList;

public class Order {
    private ArrayList<Product> orderItems = new ArrayList<>();

    public void addOrderItem(Product item) {
        this.orderItems.add(item);
    }

    public void addPizza(Product item) {
        orderItems.add(item);
    }

    public boolean isEmpty() {
        return false;
    }
    public double calculatePrice(){
        double total = 0.0;
        for(Product p: orderItems){
          total += p.getPrice();
        }
        return total;
    }
    public void printReceipt() {
    }
}
