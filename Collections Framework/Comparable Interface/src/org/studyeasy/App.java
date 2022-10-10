package org.studyeasy;

import java.util.*;

class Names {
    private String name;

    public Names(String names) {
        this.name = names;
    }

    @Override
    public String toString() {
        return name;
    }
}

public class App {
    public static void main(String[] args) {
        /*
        List<String> countries = new LinkedList<>();
        countries.add("India");
        countries.add("USA");
        countries.add("Poland");
        countries.add("Egypt");
        countries.add("Thailand");
        countries.add("Russia");
        App app = new App();
        app.printList(countries);
        System.out.println("************");
        Collections.sort(countries);
        app.printList(countries);
         */

        /*
        String x = "a";
        String y = "b";
        x.compareTo(y);
         */

        List<Object> elements = new LinkedList<>();
        elements.add(new Names("Chaand"));
        elements.add(new Names("Ed"));
        elements.add(new Names("John"));
        elements.add(new Names("Mia"));
        elements.add("Some String");
        elements.add(1);
        elements.add(2.0);
        elements.add('0');


        App app = new App();
        app.printList(elements);
        /*
        Collections.sort(elements);
        System.out.println("************");
        app.printList(elements);
         */
    }

    void printList(List<Object> list) {

        ListIterator<Object> iterator = list.listIterator();
        while (iterator.hasNext()) {
            System.out.println("Element: " + iterator.next());
        }
    }
}
