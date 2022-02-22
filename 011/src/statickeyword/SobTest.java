package statickeyword;

public class SobTest {

    public static final String owner;

    static {
        owner = "Milan";
        System.out.println("SobTest -> static initialization block called.");
    }

    SobTest() {
        System.out.println("SobTest constructor called");
    }

    static {
        System.out.println("Second initialization block called.");
    }

    public void someMethod() {
        System.out.println("Some method called.");
    }
}
