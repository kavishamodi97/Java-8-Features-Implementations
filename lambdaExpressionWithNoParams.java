@FunctionalInterface //it is optional
interface Hello {
    public String sayHello();
}

public class lambdaExpressionWithNoParams {

    public static void main(String args[]) {

        //No Parameter
        Hello h = () -> {
            return "Hello World!!";
        };
        System.out.println(h.sayHello());
    }
}
