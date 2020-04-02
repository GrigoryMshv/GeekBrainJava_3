package Lesson1;
//
import java.util.ArrayList;
import java.util.List;

public class Box<E extends Fruit> {

    private List<E> fruits = new ArrayList<>(); // хранилище фруктов

    public void add(E fruit) {   // добавляем фрукт в хранилище
        fruits.add(fruit);
    }

    public void moveFruit(Box<E> newBox) { // пересыпаем фрукты в новый яшик
        for(E fruit : fruits) {
            newBox.add(fruit);
        }
        fruits.clear(); // очищаем хранилище
    }

    public boolean compare(Box<?> newBox) {   // сравниваем ящики по весу
        return Math.abs(this.getWeight() - newBox.getWeight()) == 0.0;
    }

    public double getWeight() {

        double sum = 0.0;
        for(E fruit : fruits) {
            sum += fruit.getWeight();
        }
        return  sum;
    }
}
