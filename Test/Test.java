package Test;

public class Test {
    public static void main(String[] args) {
        Maths m = new Maths();
        int add = m.add(2, 3);
        if (add == 5) {
            System.out.println("Test Passed");
        } else {
            System.out.println("Test Failed");
        }
    }
}




// javac Test\Test.java Test\Maths.java
// java Test.Test
