package scope;

public class Test {
    public static void main(String[] args) {
        String var4 = "This is private to Main";
        ScopeCheck scopeInstance = new ScopeCheck();
        System.out.println("ScopeInstance private var = " + scopeInstance.getVar1());
        System.out.println(var4);
        scopeInstance.timesTwo();

        ScopeCheck.InnerClass inner = scopeInstance.new InnerClass();
        inner.timesTwo();
    }

}
