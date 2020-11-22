@FunctionalInterface  //it is optional
interface Sum {
    public int sumOfTwoNumbers(int a, int b);
}

public class lambdaExpressionWithMultiParams {
    public static void main(String args[]) {

        Sum s1 = (a, b) -> {
            System.out.println("Sum of Two Numbers:-");
            return (a + b);
        };
        System.out.println(s1.sumOfTwoNumbers(50, 100));

    }
}
