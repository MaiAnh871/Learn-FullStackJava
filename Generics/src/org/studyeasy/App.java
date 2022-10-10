package org.studyeasy;

class Data {
    private Object obj;

    public Data(Object obj) {
        this.obj = obj;
    }

    public Object getObj() {
        return obj;
    }

    public void setObj(Object obj) {
        this.obj = obj;
    }

    @Override
    public String toString() {
        return "Data{" +
                "obj=" + obj +
                '}';
    }
}

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

public class App {

    public static void main(String[] args) {

        Data data = new Data("Some String");
        String variable = (String) data.getObj();
        System.out.println(variable);


        /*
        GenericClass<String> genericData = new GenericClass("Some Data");
        String data = genericData.getData();
        System.out.println(data);
        */
    }
}
