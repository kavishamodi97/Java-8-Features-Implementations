interface Calculate {

    //default methods
    default void calculateSum(int a, int b) {
        System.out.println("Sum of Two Numbers: " + (a + b));
    }

    //abstract methods
     int CalculateMulti(int a, int b);
}

public class defaultMethodsInsideInterface implements Calculate {

    @Override
    public int CalculateMulti(int a, int b) {
        int mul = (a * b);
        System.out.println("Multiplication of Two Numbers: " + mul);
        return mul;
    }

    public static void main(String args[]) {
        defaultMethodsInsideInterface dm = new defaultMethodsInsideInterface();
        //calling default methods
        dm.calculateSum(10, 20);
        //calling abstract methods
        dm.CalculateMulti(10, 20);
    }
}
