package hw1;

import java.util.ArrayList;

public class Box {
    ArrayList<Fruit> fruits;

    public Box() {
        fruits = new ArrayList<>();
    }

    public float getWeight(Box box) {
        return box.fruits.size() * box.fruits.get(0).getWeight();
    }

    public boolean compare(Box another) {
        return Math.abs(this.fruits.size() * this.fruits.get(0).getWeight() - another.fruits.size() * another.fruits.get(0).getWeight()) < 0.0001;
    }

    public void shiftFruits(Box another) {
        if (this.fruits.get(0).getName().equals(another.fruits.get(0).getName())) {
            int l = this.fruits.size();
            for (int i = 0; i < l; i++) {
                another.fruits.add(this.fruits.get(0));
                this.fruits.remove(0);
            }
        }
    }
}
