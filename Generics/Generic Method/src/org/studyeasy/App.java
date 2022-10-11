package org.studyeasy;

import java.util.ArrayList;
import java.util.List;

class Data {
    public <E> void printListData(List<E> list) {
        for (E element: list) {
            System.out.println(element);
        }
    }

    public <E> void printArrayData(E[] arrayData) {
        for (E element: arrayData) {
            System.out.println(element);
        }
    }
}

public class App {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        Data data = new Data();
        data.printListData(list);

        List<String> list2 = new ArrayList<>();
        list2.add("one");
        list2.add("two");
        list2.add("three");
        list2.add("four");
        data.printListData(list2);

        String[] stringArray = {"One", "Two", "Three"};
        Integer[] integerArray = {1,2,3,4};
        Data data2 = new Data();
        data2.printArrayData(stringArray);
        data2.printArrayData(integerArray);
    }
}
