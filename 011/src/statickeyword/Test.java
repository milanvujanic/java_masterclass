package statickeyword;

public class Test {
    public static int multiplier = 7;
    public static void main(String[] args) {

        SobTest sobTest = new SobTest();
        sobTest.someMethod();
        System.out.println("Owner is " + SobTest.owner);

//        SomeClass one = new SomeClass("One");
//        System.out.println(one.instanceNumber);
//        SomeClass two = new SomeClass("Two");
//        System.out.println(two.instanceNumber);
//        SomeClass three = new SomeClass("Three");
//        System.out.println(three.instanceNumber);
//
//        System.out.println(Math.PI);
//
//        int pwd = 44534534;
//        Password password = new ExtendedPassword(pwd);
//        password.storePassword();
//        password.letMeIn(pwd);

//        StaticTest first = new StaticTest("First");
//        System.out.println(StaticTest.getNumOfInstances());
//
//        StaticTest second = new StaticTest("Second");
//        System.out.println(StaticTest.getNumOfInstances());
//        int answer = multiply(6);
//        System.out.println(answer);
    }

//    public static int multiply(int number) {
//        return number * multiplier;
//    }
}
