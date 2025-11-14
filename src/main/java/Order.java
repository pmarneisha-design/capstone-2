import java.util.ArrayList;

public class Order {
    private ArrayList<Product> orderItems = new ArrayList<>();

    public void addOrderItem(Product item) {
        this.orderItems.add(item);
    }

    public void addPizza(PizzaItem pizza) {
    }
}
