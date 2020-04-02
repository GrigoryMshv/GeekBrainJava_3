package Lesson1;

public class Less_3_1 {
    public static void main(String[] args) {

        ToDoList newList = new ToDoList();

        String[] sArr = {"1*", "2*", "3*", "4*", "5*", "6*"};
        Arr<String> sOb = new Arr<>(sArr);
        sOb.showArr(3,1); // в аргументах метода номера элементов массива которые меняем местами
        newList.doList(sArr);

        Integer[] iArr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        Arr<Integer> iOb = new Arr<>(iArr);
        iOb.showArr(0,9);
        newList.doList(iArr);


        Box<Apple> appleBox1 = new Box<>();
        Box<Apple> appleBox2 = new Box<>();
        Box<Orange> orangeBox = new Box<>();

        appleBox1.add(new Apple());
        appleBox1.add(new Apple());

        orangeBox.add(new Orange());
        orangeBox.add(new Orange());

        System.out.println("Вес ящика N1 с яблоками: " + appleBox1.getWeight());

        appleBox2.add(new Apple());
        System.out.println("Вес ящика N2 с яблоками: " + appleBox2.getWeight());

        appleBox1.moveFruit(appleBox2); // пересыпаем яблоки

        System.out.println("Вес ящика N1 с яблоками после пересыпания : " + appleBox1.getWeight());
        System.out.println("Вес ящика N2 с яблоками после пересыпания: " + appleBox2.getWeight());

        System.out.println("Сранения ящика N1 с яблоками с ящиком апельсинов: " + appleBox1.compare(orangeBox));
        System.out.println("Сранения ящика N2 с яблоками с ящиком апельсинов: " + appleBox2.compare(orangeBox));






    }
}