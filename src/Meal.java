import java.util.ArrayList;

public class Meal {
    private ArrayList<Item> items = new ArrayList<>();

    public void addItem(Item item) {
        items.add(item);
    }

    public float getCost() {
        float cost = 0.0f;

        for (Item item : items) {
            cost += item.price();

        }
        return cost;
    }

    public  void showItems() {
        for (Item item : items) {
            System.out.println("Item.name: " + item.name());
            System.out.println("Item.packing: " + item.packing().pack());
            System.out.println("Item.price: " + item.price() + "\n");
        }
    }

}
