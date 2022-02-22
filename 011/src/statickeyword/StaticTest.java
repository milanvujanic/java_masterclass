package statickeyword;

public class StaticTest {
    private static int numOfInstances = 0;
    private String name;

    public StaticTest(String name) {
        this.name = name;
        numOfInstances++;
    }

    public static int getNumOfInstances() {
        return numOfInstances;
    }

    public String getName() {
        return name;
    }
}
