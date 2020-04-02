package Lesson1;

import java.util.ArrayList;
import java.util.Collections;

public class ToDoList<T>{

    public void doList(T arr[]) {

        ArrayList<T> toDoList = new ArrayList<>();
        Collections.addAll(toDoList, arr);
        System.out.println("Массив записанный в ArrayList: " + toDoList);
        System.out.println();
    }
}
