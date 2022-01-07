package Assignments;

import java.util.ArrayList;
import java.util.List;

class Item {

    private String name;
    private int quantity;
    private double price;
    private double totalCost;

    public Item(String name, int quantity, double price) {
        this.name = name;
        this.quantity = quantity;
        this.price = price;
        this.totalCost = quantity * price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(double totalCost) {
        this.totalCost = totalCost;
    }

}

class Order {

    private int orderId;
    private String customer;
    private List<Item> items;
    private double netTotal;

    public Order(int orderId, String customer, List<Item> items) {
        this.orderId = orderId;
        this.customer = customer;
        this.items = items;
        this.netTotal = 0;
        for (Item item : items) {
            netTotal += item.getPrice();
        }
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    public double getNetTotal() {
        return netTotal;
    }

    public void setNetTotal(double netTotal) {
        this.netTotal = netTotal;
    }

    public void displayOrder() {
        System.out.printf("Order Id: %d  %50s %n", orderId, customer);
        System.out.printf("%50s %n", "Items");
        for (Item item : items) {
            System.out.printf("%20s %d %4.2f %4.2f %n",
                    item.getName(), item.getQuantity(), item.getPrice(), item.getTotalCost());
        }
        System.out.printf("*******************************************************************%n");
        System.out.printf("Net Total: %4.2f %n", netTotal);

    }

}

public class Orderprocessing {
    public static void main(String[] args) {
        List<Item> items = new ArrayList<>();

        items.add(new Item("Electronics -  philips Trimmer", 1, 1473.56));
        items.add(new Item("Book        -  DC comics ", 1, 2736.29));
        items.add(new Item("Pizza base  -  freshfresh", 5, 100.00));
        items.add(new Item("Softdrinks  -  sting", 1, 25.00));
        items.add(new Item("Mida        -  Ashirvad", 1, 74.54));

        Order order = new Order(1, "Rony", items);
        order.displayOrder();
    }
}
