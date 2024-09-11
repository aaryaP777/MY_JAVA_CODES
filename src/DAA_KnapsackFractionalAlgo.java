import java.util.*;

class Item {
    double weight, value, ratio;

    // constructor to initialize value, weight, and ratio
    Item(double weight, double value){
        this.weight = weight;
        this.value = value;
        this.ratio = value/weight;
    }
}
public class DAA_KnapsackFractionalAlgo {
    public static double MaxValue(Item[] items, double capacity){

        // sort items by their value-weight ratio in desc order
        Arrays.sort(items, new Comparator<Item>() {
            @Override
            public int compare(Item o1, Item o2) {
                return Double.compare(o2.ratio, o1.ratio);
            }
        });

        // variable to keep track of total value
        double totalValue = 0;

        // go through the sorted items
        for(Item item : items){
            if(capacity >= item.weight){

                //item can be added completely
                capacity -= item.weight;
                totalValue += item.value;
            }
            else{
                // item added partially
                totalValue += item.value * (capacity/item.weight);
                break;
            }
        }
        return totalValue;
    }

    public static void main(String[] args) {

        // array of items with values and weights
        Item[] items = {
                new Item(10, 60),
                new Item(20, 100),
                new Item(30, 120)
        };
        double capacity = 50;
        System.out.println(MaxValue(items, capacity));
    }
}
