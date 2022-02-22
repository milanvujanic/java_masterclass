package scope;

public class ScopeCheck {

    public int publicVar = 0;
    private int var1 = 1;

    public ScopeCheck() {
        System.out.println("ScopeCheck created." +
                "\npublicVar: " + publicVar +
                "\nprivateVar: " + var1);
    }

    public int getVar1() {
        return var1;
    }

    public void timesTwo() {
        int var2 = 2;
        for (int i = 0; i < 10; i++) {
            System.out.println(i + " times 2 is: " + i * var2);
        }
    }

    public void useInner() {
        InnerClass innerClass = new InnerClass();
        System.out.println("Var3 from innerClass = " + innerClass.var3);
    }

    public class InnerClass {
        private int var3 = 3;

        public InnerClass() {
            System.out.println("Inside ScopeCheck.InnerClass constructor. Var3 is " + var3);
        }

        public void timesTwo() {
            ScopeCheck.this.timesTwo();
            for (int i = 0; i < 10; i++) {
                System.out.println(i + " times 2 is: " + i * var3);
            }
        }
    }
}
