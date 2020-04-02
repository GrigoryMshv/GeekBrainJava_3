package Lesson1;
//
public class Arr <T> {

    private T a, b;
    private T[] arr;
    private int i;

    public Arr(T[] arr) {
        this.arr = arr;
    }

    public void showArr(int k, int m) {
        System.out.println("Изначальный массив:");
        for (i = 0; i < arr.length; i++) {
            System.out.println("arr [" + i + "] = " + arr[i]);
        }

        a = arr[k];
        b = arr[m];
        arr[k] = b;
        arr[m] = a;

        System.out.println("Конечный массив:");
        for (i = 0; i < arr.length; i++) {
            System.out.println("arr [" + i + "] = " + arr[i]);
        }
    }
}
