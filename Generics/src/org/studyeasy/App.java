package org.studyeasy;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

class Data<T> {
    private T myVariable;

    public Data(T myVariable) {
        this.myVariable = myVariable;
    }

    public T getMyVariable() {
        return myVariable;
    }

    public void setMyVariable(T myVariable) {
        this.myVariable = myVariable;
    }

    @Override
    public String toString() {
        return "Data{" +
                "myVariable=" + myVariable +
                '}';
    }
}
/*
class GenericClass<T> {
    private T data;

    public GenericClass(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "GenericClass{" +
                "data=" + data +
                '}';
    }
}
*/
public class App {

    /*
    public static void main(String[] args) {

        Data data = new Data("Some String");
        String variable = (String) data.getObj();
        System.out.println(variable);


        /*
        GenericClass<String> genericData = new GenericClass("Some Data");
        String data = genericData.getData();
        System.out.println(data);
        */
    public static void main(String[] args) {
        List<Data<String>> elements = new LinkedList<>();
        elements.add(new Data<String>("Some text"));
        elements.add(new Data<String>("One"));
        elements.add(new Data<String>("Two"));
        elements.add(new Data<String>("Some text"));
        elements.add(new Data<String>("5.0f"));

        App app = new App();
        app.printList(elements);

    }
    private void printList(List<Data<String>> list) {
        ListIterator<Data<String>> iterator = list.listIterator();
        while (iterator.hasNext()) {
            System.out.println("ELement: " + iterator.next().getMyVariable());
        }
    }


}
