package models.orders;

import java.util.*;;

// Singleton para registro de órdenes
public class OrderRegistry {
    private static OrderRegistry instance;
    private List<String> orders;

    private OrderRegistry() {
        orders = new ArrayList<>();
    }

    public static OrderRegistry getInstance() {
        if (instance == null) {
            instance = new OrderRegistry();
        }
        return instance;
    }

    public void addOrder(String order) {
        orders.add(order);
    }

    public void displayOrders() {
        System.out.println("Current orders:");
        for (String order : orders) {
            System.out.println(order);
        }
    }
}
