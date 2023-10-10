// Example 1: Using an interface
interface MyInterface {
    int myVariable = 10; // Implicitly final, public, and static
}

class MyClass implements MyInterface {
    public void printVariable() {
        //myVariable = 20; // Not allow
        // You can access the interface variable directly
        System.out.println(myVariable);
    }
}

// Example 2: Using an abstract class
abstract class MyAbstractClass {
    int myVariable = 20; // Non-final variable

    public abstract void printVariable();
}

class MySubclass extends MyAbstractClass {
    // You can override the printVariable method
    public void printVariable() {
        // You can access and modify the abstract class variable
        System.out.println(myVariable);
        myVariable = 30; // This is allowed
        System.out.println(myVariable);
    }
}

public class Main {
    public static void main(String[] args) {
        // Example 1: Using an interface
        MyClass obj1 = new MyClass();
        obj1.printVariable(); // Prints 10

        // Example 2: Using an abstract class
        MySubclass obj2 = new MySubclass();
        obj2.printVariable(); // Prints 20 and then 30
    }
}
